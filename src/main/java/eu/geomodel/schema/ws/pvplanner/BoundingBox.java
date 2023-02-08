
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BoundingBox complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BoundingBox"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://geomodel.eu/schema/common/geo}Boundary"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="northWest" type="{http://geomodel.eu/schema/common/geo}LatLng"/&gt;
 *         &lt;element name="southEast" type="{http://geomodel.eu/schema/common/geo}LatLng"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoundingBox", namespace = "http://geomodel.eu/schema/common/geo", propOrder = {
    "northWest",
    "southEast"
})
public class BoundingBox
    extends Boundary
{

    @XmlElement(required = true)
    protected LatLng northWest;
    @XmlElement(required = true)
    protected LatLng southEast;

    /**
     * Obtiene el valor de la propiedad northWest.
     * 
     * @return
     *     possible object is
     *     {@link LatLng }
     *     
     */
    public LatLng getNorthWest() {
        return northWest;
    }

    /**
     * Define el valor de la propiedad northWest.
     * 
     * @param value
     *     allowed object is
     *     {@link LatLng }
     *     
     */
    public void setNorthWest(LatLng value) {
        this.northWest = value;
    }

    /**
     * Obtiene el valor de la propiedad southEast.
     * 
     * @return
     *     possible object is
     *     {@link LatLng }
     *     
     */
    public LatLng getSouthEast() {
        return southEast;
    }

    /**
     * Define el valor de la propiedad southEast.
     * 
     * @param value
     *     allowed object is
     *     {@link LatLng }
     *     
     */
    public void setSouthEast(LatLng value) {
        this.southEast = value;
    }

}
