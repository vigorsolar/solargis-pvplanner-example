
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Latitude longitude coordinates
 * 
 * <p>Clase Java para LatLng complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LatLng"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="lat" use="required" type="{http://geomodel.eu/schema/common/geo}latitude" /&gt;
 *       &lt;attribute name="lng" use="required" type="{http://geomodel.eu/schema/common/geo}longitude" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LatLng", namespace = "http://geomodel.eu/schema/common/geo")
@XmlSeeAlso({
    Location.class
})
public class LatLng {

    @XmlAttribute(name = "lat", required = true)
    protected double lat;
    @XmlAttribute(name = "lng", required = true)
    protected double lng;

    /**
     * Obtiene el valor de la propiedad lat.
     * 
     */
    public double getLat() {
        return lat;
    }

    /**
     * Define el valor de la propiedad lat.
     * 
     */
    public void setLat(double value) {
        this.lat = value;
    }

    /**
     * Obtiene el valor de la propiedad lng.
     * 
     */
    public double getLng() {
        return lng;
    }

    /**
     * Define el valor de la propiedad lng.
     * 
     */
    public void setLng(double value) {
        this.lng = value;
    }

}
