
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para inverterInterconnectionEnum.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="inverterInterconnectionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SERIAL"/&gt;
 *     &lt;enumeration value="PARALLEL"/&gt;
 *     &lt;enumeration value="SERIOPARALLEL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "inverterInterconnectionEnum")
@XmlEnum
public enum InverterInterconnectionEnum {

    SERIAL,
    PARALLEL,
    SERIOPARALLEL;

    public String value() {
        return name();
    }

    public static InverterInterconnectionEnum fromValue(String v) {
        return valueOf(v);
    }

}
