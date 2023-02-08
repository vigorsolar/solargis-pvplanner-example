
package eu.geomodel.schema.ws.pvplanner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BoundingPath complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BoundingPath"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://geomodel.eu/schema/common/geo}Boundary"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="point" type="{http://geomodel.eu/schema/common/geo}LatLng" maxOccurs="unbounded" minOccurs="3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoundingPath", namespace = "http://geomodel.eu/schema/common/geo", propOrder = {
    "point"
})
public class BoundingPath
    extends Boundary
{

    @XmlElement(required = true)
    protected List<LatLng> point;

    /**
     * Gets the value of the point property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the point property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LatLng }
     * 
     * 
     */
    public List<LatLng> getPoint() {
        if (point == null) {
            point = new ArrayList<LatLng>();
        }
        return this.point;
    }

}
