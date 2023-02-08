
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GeometryTwoAxisAstronomical complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GeometryTwoAxisAstronomical"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://geomodel.eu/schema/common/pv}GeometryTracker"&gt;
 *       &lt;attGroup ref="{http://geomodel.eu/schema/common/pv}rotationLimitEastWestAttributes"/&gt;
 *       &lt;attGroup ref="{http://geomodel.eu/schema/common/pv}tiltLimitAttributes"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeometryTwoAxisAstronomical")
public class GeometryTwoAxisAstronomical
    extends GeometryTracker
{

    @XmlAttribute(name = "rotationLimitEast")
    protected Double rotationLimitEast;
    @XmlAttribute(name = "rotationLimitWest")
    protected Double rotationLimitWest;
    @XmlAttribute(name = "tiltLimitMin")
    protected Double tiltLimitMin;
    @XmlAttribute(name = "tiltLimitMax")
    protected Double tiltLimitMax;

    /**
     * Obtiene el valor de la propiedad rotationLimitEast.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRotationLimitEast() {
        return rotationLimitEast;
    }

    /**
     * Define el valor de la propiedad rotationLimitEast.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRotationLimitEast(Double value) {
        this.rotationLimitEast = value;
    }

    /**
     * Obtiene el valor de la propiedad rotationLimitWest.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRotationLimitWest() {
        return rotationLimitWest;
    }

    /**
     * Define el valor de la propiedad rotationLimitWest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRotationLimitWest(Double value) {
        this.rotationLimitWest = value;
    }

    /**
     * Obtiene el valor de la propiedad tiltLimitMin.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTiltLimitMin() {
        return tiltLimitMin;
    }

    /**
     * Define el valor de la propiedad tiltLimitMin.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTiltLimitMin(Double value) {
        this.tiltLimitMin = value;
    }

    /**
     * Obtiene el valor de la propiedad tiltLimitMax.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTiltLimitMax() {
        return tiltLimitMax;
    }

    /**
     * Define el valor de la propiedad tiltLimitMax.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTiltLimitMax(Double value) {
        this.tiltLimitMax = value;
    }

}
