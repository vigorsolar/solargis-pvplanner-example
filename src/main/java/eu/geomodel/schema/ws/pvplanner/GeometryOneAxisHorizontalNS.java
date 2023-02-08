
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GeometryOneAxisHorizontalNS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GeometryOneAxisHorizontalNS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://geomodel.eu/schema/common/pv}GeometryTracker"&gt;
 *       &lt;attGroup ref="{http://geomodel.eu/schema/common/pv}rotationLimitEastWestAttributes"/&gt;
 *       &lt;attribute name="azimuth" type="{http://geomodel.eu/schema/common/pv}axisAzimuth" default="180" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeometryOneAxisHorizontalNS")
public class GeometryOneAxisHorizontalNS
    extends GeometryTracker
{

    @XmlAttribute(name = "azimuth")
    protected Integer azimuth;
    @XmlAttribute(name = "rotationLimitEast")
    protected Double rotationLimitEast;
    @XmlAttribute(name = "rotationLimitWest")
    protected Double rotationLimitWest;

    /**
     * Obtiene el valor de la propiedad azimuth.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getAzimuth() {
        if (azimuth == null) {
            return  180;
        } else {
            return azimuth;
        }
    }

    /**
     * Define el valor de la propiedad azimuth.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAzimuth(Integer value) {
        this.azimuth = value;
    }

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

}
