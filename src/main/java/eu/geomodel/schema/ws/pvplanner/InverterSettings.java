
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InverterSettings complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InverterSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="startPower" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="limitationACPower" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="nominalDCPower" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="efficiency" type="{http://geomodel.eu/schema/common/pv}Efficiency" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="interconnection" type="{http://geomodel.eu/schema/common/pv}inverterInterconnectionEnum" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InverterSettings", propOrder = {

})
public class InverterSettings {

    protected Double startPower;
    protected Double limitationACPower;
    protected Double nominalDCPower;
    protected Efficiency efficiency;
    @XmlAttribute(name = "count")
    protected Integer count;
    @XmlAttribute(name = "interconnection")
    protected InverterInterconnectionEnum interconnection;

    /**
     * Obtiene el valor de la propiedad startPower.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStartPower() {
        return startPower;
    }

    /**
     * Define el valor de la propiedad startPower.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStartPower(Double value) {
        this.startPower = value;
    }

    /**
     * Obtiene el valor de la propiedad limitationACPower.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLimitationACPower() {
        return limitationACPower;
    }

    /**
     * Define el valor de la propiedad limitationACPower.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLimitationACPower(Double value) {
        this.limitationACPower = value;
    }

    /**
     * Obtiene el valor de la propiedad nominalDCPower.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNominalDCPower() {
        return nominalDCPower;
    }

    /**
     * Define el valor de la propiedad nominalDCPower.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNominalDCPower(Double value) {
        this.nominalDCPower = value;
    }

    /**
     * Obtiene el valor de la propiedad efficiency.
     * 
     * @return
     *     possible object is
     *     {@link Efficiency }
     *     
     */
    public Efficiency getEfficiency() {
        return efficiency;
    }

    /**
     * Define el valor de la propiedad efficiency.
     * 
     * @param value
     *     allowed object is
     *     {@link Efficiency }
     *     
     */
    public void setEfficiency(Efficiency value) {
        this.efficiency = value;
    }

    /**
     * Obtiene el valor de la propiedad count.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Define el valor de la propiedad count.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCount(Integer value) {
        this.count = value;
    }

    /**
     * Obtiene el valor de la propiedad interconnection.
     * 
     * @return
     *     possible object is
     *     {@link InverterInterconnectionEnum }
     *     
     */
    public InverterInterconnectionEnum getInterconnection() {
        return interconnection;
    }

    /**
     * Define el valor de la propiedad interconnection.
     * 
     * @param value
     *     allowed object is
     *     {@link InverterInterconnectionEnum }
     *     
     */
    public void setInterconnection(InverterInterconnectionEnum value) {
        this.interconnection = value;
    }

}
