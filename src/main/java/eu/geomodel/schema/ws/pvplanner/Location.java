
package eu.geomodel.schema.ws.pvplanner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Location complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Location"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://geomodel.eu/schema/common/geo}LatLng"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="placemark" type="{http://geomodel.eu/schema/common/geo}Placemark" minOccurs="0"/&gt;
 *         &lt;element name="terrain" type="{http://geomodel.eu/schema/common/geo}Terrain" minOccurs="0"/&gt;
 *         &lt;element name="horizon" type="{http://geomodel.eu/schema/common/geo}horizonValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location", namespace = "http://geomodel.eu/schema/common/geo", propOrder = {
    "placemark",
    "terrain",
    "horizon"
})
@XmlSeeAlso({
    Site.class
})
public class Location
    extends LatLng
{

    protected Placemark placemark;
    protected Terrain terrain;
    @XmlList
    protected List<String> horizon;

    /**
     * Obtiene el valor de la propiedad placemark.
     * 
     * @return
     *     possible object is
     *     {@link Placemark }
     *     
     */
    public Placemark getPlacemark() {
        return placemark;
    }

    /**
     * Define el valor de la propiedad placemark.
     * 
     * @param value
     *     allowed object is
     *     {@link Placemark }
     *     
     */
    public void setPlacemark(Placemark value) {
        this.placemark = value;
    }

    /**
     * Obtiene el valor de la propiedad terrain.
     * 
     * @return
     *     possible object is
     *     {@link Terrain }
     *     
     */
    public Terrain getTerrain() {
        return terrain;
    }

    /**
     * Define el valor de la propiedad terrain.
     * 
     * @param value
     *     allowed object is
     *     {@link Terrain }
     *     
     */
    public void setTerrain(Terrain value) {
        this.terrain = value;
    }

    /**
     * Gets the value of the horizon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the horizon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHorizon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getHorizon() {
        if (horizon == null) {
            horizon = new ArrayList<String>();
        }
        return this.horizon;
    }

}
