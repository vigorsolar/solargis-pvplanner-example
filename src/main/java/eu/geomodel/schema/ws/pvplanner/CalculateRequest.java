
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="site" type="{http://geomodel.eu/schema/common/pv}Site"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="optimize" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "site"
})
@XmlRootElement(name = "calculateRequest", namespace = "http://geomodel.eu/schema/ws/pvplanner")
public class CalculateRequest {

    @XmlElement(namespace = "http://geomodel.eu/schema/ws/pvplanner", required = true)
    protected Site site;
    @XmlAttribute(name = "optimize")
    protected Boolean optimize;

    /**
     * Obtiene el valor de la propiedad site.
     * 
     * @return
     *     possible object is
     *     {@link Site }
     *     
     */
    public Site getSite() {
        return site;
    }

    /**
     * Define el valor de la propiedad site.
     * 
     * @param value
     *     allowed object is
     *     {@link Site }
     *     
     */
    public void setSite(Site value) {
        this.site = value;
    }

    /**
     * Obtiene el valor de la propiedad optimize.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOptimize() {
        if (optimize == null) {
            return false;
        } else {
            return optimize;
        }
    }

    /**
     * Define el valor de la propiedad optimize.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptimize(Boolean value) {
        this.optimize = value;
    }

}
