
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * False value for the backTracking attribute corresponds to a single tracker without neighbours (best possible option).
 * 
 * <p>Clase Java para GeometryTracker complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GeometryTracker"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://geomodel.eu/schema/common/pv}Geometry"&gt;
 *       &lt;attribute name="backTracking" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeometryTracker")
@XmlSeeAlso({
    GeometryOneAxisVertical.class,
    GeometryOneAxisInclinedNS.class,
    GeometryOneAxisHorizontalNS.class,
    GeometryTwoAxisAstronomical.class
})
public abstract class GeometryTracker
    extends Geometry
{

    @XmlAttribute(name = "backTracking")
    protected Boolean backTracking;

    /**
     * Obtiene el valor de la propiedad backTracking.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBackTracking() {
        return backTracking;
    }

    /**
     * Define el valor de la propiedad backTracking.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBackTracking(Boolean value) {
        this.backTracking = value;
    }

}
