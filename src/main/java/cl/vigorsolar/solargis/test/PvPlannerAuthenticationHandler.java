package cl.vigorsolar.solargis.test;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Set;
import java.util.UUID;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class PvPlannerAuthenticationHandler implements SOAPHandler<SOAPMessageContext> {
	private String username;
	private String password;
	private static final int WSS_TTL = 300;
	
	public PvPlannerAuthenticationHandler(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		// https://stackoverflow.com/questions/63414620/jax-ws-add-username-token-to-soap-header
		// https://extendit.us/jaxws-client-and-ws-security
		try {
			SOAPMessage soapMessage = context.getMessage();
			SOAPPart soapPart = soapMessage.getSOAPPart();
			SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
			SOAPHeader header = soapEnvelope.getHeader();

			Instant now = Instant.now().truncatedTo(ChronoUnit.SECONDS);
			XMLGregorianCalendar createdDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(now.toString());
			XMLGregorianCalendar expiresDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(now.plusSeconds(WSS_TTL).toString());
			
			// password & nonce
			final byte[] nonceBytes = generateNonce();
			byte[] passwordDigestBytes = constructPasswordDigest(nonceBytes, createdDate, this.password);
			String passwordDigestBase64Encoded = Base64.getEncoder().encodeToString(passwordDigestBytes);
			String nonceBase64Encoded = Base64.getEncoder().encodeToString(nonceBytes);
			
			// id
			String id = UUID.randomUUID().toString();

			SOAPElement security = header.addChildElement("Security", "wsse",
					"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
			security.addAttribute(new QName("xmlns:wsu"),
					"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");

			// wsse:Timestamp
			SOAPElement timestamp = security.addChildElement("Timestamp", "wsu");
			timestamp.addAttribute(new QName("wsu:Id"), String.format("TS-%s", id));
			SOAPElement created = timestamp.addChildElement("Created", "wsu");
			created.addTextNode(createdDate.toString());
			SOAPElement expires = timestamp.addChildElement("Expires", "wsu");
			expires.addTextNode(expiresDate.toString());

			// wsse:UsernameToken
			SOAPElement usernameToken = security.addChildElement("UsernameToken", "wsse");
			usernameToken.addAttribute(new QName("wsu:Id"), String.format("UsernameToken-%s", id));
			SOAPElement username = usernameToken.addChildElement("Username", "wsse");
			username.addTextNode(this.username);
			SOAPElement password = usernameToken.addChildElement("Password", "wsse");
			password.setAttribute("Type",
					"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordDigest");
			password.setTextContent(passwordDigestBase64Encoded);
			SOAPElement nonce = usernameToken.addChildElement("Nonce", "wsse");
			nonce.setAttribute("EncodingType",
					"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary");
			nonce.addTextNode(nonceBase64Encoded);
			SOAPElement created2 = usernameToken.addChildElement("Created", "wsu");
			created2.addTextNode(createdDate.toString());

			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		return true;
	}

	@Override
	public void close(MessageContext context) {

	}

	@Override
	public Set<QName> getHeaders() {
		return null;
	}

	private static byte[] constructPasswordDigest(byte[] nonceBytes, XMLGregorianCalendar createdDate,
			String password) {
		try {
			final var sha1MessageDigest = MessageDigest.getInstance("SHA-1");
			sha1MessageDigest.update(nonceBytes);
			final var createdDateAsString = createdDate.toString();
			sha1MessageDigest.update(createdDateAsString.getBytes(StandardCharsets.UTF_8));
			sha1MessageDigest.update(password.getBytes(StandardCharsets.UTF_8));
			return sha1MessageDigest.digest();
			
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}
	
	private static byte[] generateNonce() throws NoSuchAlgorithmException {
	    byte[] nonceBytes = new byte[16];
	    SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
	    random.setSeed(System.currentTimeMillis());
	    random.nextBytes(nonceBytes);
	    return nonceBytes;
	}

}