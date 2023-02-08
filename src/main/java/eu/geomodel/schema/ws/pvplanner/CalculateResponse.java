
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="site" type="{http://geomodel.eu/schema/common/pv}Site"/&gt;
 *         &lt;element name="irradiation" type="{http://geomodel.eu/schema/ws/pvplanner}SolarRadiation"/&gt;
 *         &lt;element name="calculation" type="{http://geomodel.eu/schema/ws/pvplanner}PvCalculation"/&gt;
 *         &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "site",
    "irradiation",
    "calculation",
    "summary"
})
@XmlRootElement(name = "calculateResponse", namespace = "http://geomodel.eu/schema/ws/pvplanner")
public class CalculateResponse {

    @XmlElement(namespace = "http://geomodel.eu/schema/ws/pvplanner", required = true)
    protected Site site;
    @XmlElement(namespace = "http://geomodel.eu/schema/ws/pvplanner", required = true)
    protected SolarRadiation irradiation;
    @XmlElement(namespace = "http://geomodel.eu/schema/ws/pvplanner", required = true)
    protected PvCalculation calculation;
    @XmlElement(namespace = "http://geomodel.eu/schema/ws/pvplanner", required = true, nillable = true)
    protected String summary;

    /**
     * Obtiene el valor de la propiedad site.
     * 
     * @return
     *     possible object is
     *     {@link Site }
     *     
     */
    public Site getSite() {
        return site;
    }

    /**
     * Define el valor de la propiedad site.
     * 
     * @param value
     *     allowed object is
     *     {@link Site }
     *     
     */
    public void setSite(Site value) {
        this.site = value;
    }

    /**
     * Obtiene el valor de la propiedad irradiation.
     * 
     * @return
     *     possible object is
     *     {@link SolarRadiation }
     *     
     */
    public SolarRadiation getIrradiation() {
        return irradiation;
    }

    /**
     * Define el valor de la propiedad irradiation.
     * 
     * @param value
     *     allowed object is
     *     {@link SolarRadiation }
     *     
     */
    public void setIrradiation(SolarRadiation value) {
        this.irradiation = value;
    }

    /**
     * Obtiene el valor de la propiedad calculation.
     * 
     * @return
     *     possible object is
     *     {@link PvCalculation }
     *     
     */
    public PvCalculation getCalculation() {
        return calculation;
    }

    /**
     * Define el valor de la propiedad calculation.
     * 
     * @param value
     *     allowed object is
     *     {@link PvCalculation }
     *     
     */
    public void setCalculation(PvCalculation value) {
        this.calculation = value;
    }

    /**
     * Obtiene el valor de la propiedad summary.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Define el valor de la propiedad summary.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

}
