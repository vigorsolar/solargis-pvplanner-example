
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BoundingMicroregion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BoundingMicroregion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://geomodel.eu/schema/common/geo}Boundary"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="center" type="{http://geomodel.eu/schema/common/geo}LatLng"/&gt;
 *         &lt;element name="microregion" type="{http://geomodel.eu/schema/common/geo}Microregion"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoundingMicroregion", namespace = "http://geomodel.eu/schema/common/geo", propOrder = {
    "center",
    "microregion"
})
public class BoundingMicroregion
    extends Boundary
{

    @XmlElement(required = true)
    protected LatLng center;
    @XmlElement(required = true)
    protected Microregion microregion;

    /**
     * Obtiene el valor de la propiedad center.
     * 
     * @return
     *     possible object is
     *     {@link LatLng }
     *     
     */
    public LatLng getCenter() {
        return center;
    }

    /**
     * Define el valor de la propiedad center.
     * 
     * @param value
     *     allowed object is
     *     {@link LatLng }
     *     
     */
    public void setCenter(LatLng value) {
        this.center = value;
    }

    /**
     * Obtiene el valor de la propiedad microregion.
     * 
     * @return
     *     possible object is
     *     {@link Microregion }
     *     
     */
    public Microregion getMicroregion() {
        return microregion;
    }

    /**
     * Define el valor de la propiedad microregion.
     * 
     * @param value
     *     allowed object is
     *     {@link Microregion }
     *     
     */
    public void setMicroregion(Microregion value) {
        this.microregion = value;
    }

}
