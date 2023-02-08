
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Terrain data corresponding to LatLng location
 * 
 * <p>Clase Java para Terrain complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Terrain"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="elevation" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="tilt" type="{http://geomodel.eu/schema/common/geo}inclination" /&gt;
 *       &lt;attribute name="azimuth" type="{http://geomodel.eu/schema/common/geo}azimuth" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Terrain", namespace = "http://geomodel.eu/schema/common/geo")
public class Terrain {

    @XmlAttribute(name = "elevation")
    protected Integer elevation;
    @XmlAttribute(name = "tilt")
    protected Double tilt;
    @XmlAttribute(name = "azimuth")
    protected Integer azimuth;

    /**
     * Obtiene el valor de la propiedad elevation.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getElevation() {
        return elevation;
    }

    /**
     * Define el valor de la propiedad elevation.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setElevation(Integer value) {
        this.elevation = value;
    }

    /**
     * Obtiene el valor de la propiedad tilt.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTilt() {
        return tilt;
    }

    /**
     * Define el valor de la propiedad tilt.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTilt(Double value) {
        this.tilt = value;
    }

    /**
     * Obtiene el valor de la propiedad azimuth.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAzimuth() {
        return azimuth;
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

}
