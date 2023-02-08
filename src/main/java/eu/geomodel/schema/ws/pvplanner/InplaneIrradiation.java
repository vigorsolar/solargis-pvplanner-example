
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Global in-plane irradiation
 * 
 * <p>Clase Java para InplaneIrradiation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InplaneIrradiation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Gim" type="{http://geomodel.eu/schema/common/types}MonthlyValues"/&gt;
 *         &lt;element name="Gid" type="{http://geomodel.eu/schema/common/types}MonthlyValues"/&gt;
 *         &lt;element name="Did" type="{http://geomodel.eu/schema/common/types}MonthlyValues"/&gt;
 *         &lt;element name="Rid" type="{http://geomodel.eu/schema/common/types}MonthlyValues"/&gt;
 *         &lt;element name="ShLoss" type="{http://geomodel.eu/schema/common/types}MonthlyValues"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InplaneIrradiation", namespace = "http://geomodel.eu/schema/ws/pvplanner", propOrder = {
    "gim",
    "gid",
    "did",
    "rid",
    "shLoss"
})
public class InplaneIrradiation {

    @XmlElement(name = "Gim", required = true)
    protected MonthlyValues gim;
    @XmlElement(name = "Gid", required = true)
    protected MonthlyValues gid;
    @XmlElement(name = "Did", required = true)
    protected MonthlyValues did;
    @XmlElement(name = "Rid", required = true)
    protected MonthlyValues rid;
    @XmlElement(name = "ShLoss", required = true)
    protected MonthlyValues shLoss;

    /**
     * Obtiene el valor de la propiedad gim.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyValues }
     *     
     */
    public MonthlyValues getGim() {
        return gim;
    }

    /**
     * Define el valor de la propiedad gim.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyValues }
     *     
     */
    public void setGim(MonthlyValues value) {
        this.gim = value;
    }

    /**
     * Obtiene el valor de la propiedad gid.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyValues }
     *     
     */
    public MonthlyValues getGid() {
        return gid;
    }

    /**
     * Define el valor de la propiedad gid.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyValues }
     *     
     */
    public void setGid(MonthlyValues value) {
        this.gid = value;
    }

    /**
     * Obtiene el valor de la propiedad did.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyValues }
     *     
     */
    public MonthlyValues getDid() {
        return did;
    }

    /**
     * Define el valor de la propiedad did.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyValues }
     *     
     */
    public void setDid(MonthlyValues value) {
        this.did = value;
    }

    /**
     * Obtiene el valor de la propiedad rid.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyValues }
     *     
     */
    public MonthlyValues getRid() {
        return rid;
    }

    /**
     * Define el valor de la propiedad rid.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyValues }
     *     
     */
    public void setRid(MonthlyValues value) {
        this.rid = value;
    }

    /**
     * Obtiene el valor de la propiedad shLoss.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyValues }
     *     
     */
    public MonthlyValues getShLoss() {
        return shLoss;
    }

    /**
     * Define el valor de la propiedad shLoss.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyValues }
     *     
     */
    public void setShLoss(MonthlyValues value) {
        this.shLoss = value;
    }

}
