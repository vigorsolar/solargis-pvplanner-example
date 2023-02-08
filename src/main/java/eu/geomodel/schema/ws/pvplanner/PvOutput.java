
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * PV electricity production in the start-up
 * 
 * <p>Clase Java para PvOutput complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PvOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Esm" type="{http://geomodel.eu/schema/common/types}MonthlyValues"/&gt;
 *         &lt;element name="Esd" type="{http://geomodel.eu/schema/common/types}MonthlyValues"/&gt;
 *         &lt;element name="Etm" type="{http://geomodel.eu/schema/common/types}MonthlyValues"/&gt;
 *         &lt;element name="Eshare" type="{http://geomodel.eu/schema/common/types}MonthlyValues"/&gt;
 *         &lt;element name="PR" type="{http://geomodel.eu/schema/common/types}MonthlyValues"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PvOutput", namespace = "http://geomodel.eu/schema/ws/pvplanner", propOrder = {
    "esm",
    "esd",
    "etm",
    "eshare",
    "pr"
})
public class PvOutput {

    @XmlElement(name = "Esm", required = true)
    protected MonthlyValues esm;
    @XmlElement(name = "Esd", required = true)
    protected MonthlyValues esd;
    @XmlElement(name = "Etm", required = true)
    protected MonthlyValues etm;
    @XmlElement(name = "Eshare", required = true)
    protected MonthlyValues eshare;
    @XmlElement(name = "PR", required = true)
    protected MonthlyValues pr;

    /**
     * Obtiene el valor de la propiedad esm.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyValues }
     *     
     */
    public MonthlyValues getEsm() {
        return esm;
    }

    /**
     * Define el valor de la propiedad esm.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyValues }
     *     
     */
    public void setEsm(MonthlyValues value) {
        this.esm = value;
    }

    /**
     * Obtiene el valor de la propiedad esd.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyValues }
     *     
     */
    public MonthlyValues getEsd() {
        return esd;
    }

    /**
     * Define el valor de la propiedad esd.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyValues }
     *     
     */
    public void setEsd(MonthlyValues value) {
        this.esd = value;
    }

    /**
     * Obtiene el valor de la propiedad etm.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyValues }
     *     
     */
    public MonthlyValues getEtm() {
        return etm;
    }

    /**
     * Define el valor de la propiedad etm.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyValues }
     *     
     */
    public void setEtm(MonthlyValues value) {
        this.etm = value;
    }

    /**
     * Obtiene el valor de la propiedad eshare.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyValues }
     *     
     */
    public MonthlyValues getEshare() {
        return eshare;
    }

    /**
     * Define el valor de la propiedad eshare.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyValues }
     *     
     */
    public void setEshare(MonthlyValues value) {
        this.eshare = value;
    }

    /**
     * Obtiene el valor de la propiedad pr.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyValues }
     *     
     */
    public MonthlyValues getPR() {
        return pr;
    }

    /**
     * Define el valor de la propiedad pr.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyValues }
     *     
     */
    public void setPR(MonthlyValues value) {
        this.pr = value;
    }

}
