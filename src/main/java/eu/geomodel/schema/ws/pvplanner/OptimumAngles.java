
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Optimum inclination angles for different mounting types
 * 
 * <p>Clase Java para OptimumAngles complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OptimumAngles"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="fixed" type="{http://geomodel.eu/schema/common/geo}inclination" /&gt;
 *       &lt;attribute name="winter" type="{http://geomodel.eu/schema/common/geo}inclination" /&gt;
 *       &lt;attribute name="summer" type="{http://geomodel.eu/schema/common/geo}inclination" /&gt;
 *       &lt;attribute name="tracker" type="{http://geomodel.eu/schema/common/geo}inclination" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptimumAngles", namespace = "http://geomodel.eu/schema/ws/pvplanner")
public class OptimumAngles {

    @XmlAttribute(name = "fixed")
    protected Double fixed;
    @XmlAttribute(name = "winter")
    protected Double winter;
    @XmlAttribute(name = "summer")
    protected Double summer;
    @XmlAttribute(name = "tracker")
    protected Double tracker;

    /**
     * Obtiene el valor de la propiedad fixed.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFixed() {
        return fixed;
    }

    /**
     * Define el valor de la propiedad fixed.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFixed(Double value) {
        this.fixed = value;
    }

    /**
     * Obtiene el valor de la propiedad winter.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWinter() {
        return winter;
    }

    /**
     * Define el valor de la propiedad winter.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWinter(Double value) {
        this.winter = value;
    }

    /**
     * Obtiene el valor de la propiedad summer.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSummer() {
        return summer;
    }

    /**
     * Define el valor de la propiedad summer.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSummer(Double value) {
        this.summer = value;
    }

    /**
     * Obtiene el valor de la propiedad tracker.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTracker() {
        return tracker;
    }

    /**
     * Define el valor de la propiedad tracker.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTracker(Double value) {
        this.tracker = value;
    }

}
