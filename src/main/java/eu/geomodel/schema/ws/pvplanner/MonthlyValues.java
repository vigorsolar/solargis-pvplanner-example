
package eu.geomodel.schema.ws.pvplanner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MonthlyValues complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MonthlyValues"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="monthly" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://geomodel.eu/schema/common/types}stringValues"&gt;
 *             &lt;pattern value="[^ ]*( [^ ]*){11}"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="yearly" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonthlyValues", namespace = "http://geomodel.eu/schema/common/types")
public class MonthlyValues {

    @XmlAttribute(name = "monthly", required = true)
    protected List<String> monthly;
    @XmlAttribute(name = "yearly")
    protected String yearly;

    /**
     * Gets the value of the monthly property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monthly property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonthly().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMonthly() {
        if (monthly == null) {
            monthly = new ArrayList<String>();
        }
        return this.monthly;
    }

    /**
     * Obtiene el valor de la propiedad yearly.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearly() {
        return yearly;
    }

    /**
     * Define el valor de la propiedad yearly.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearly(String value) {
        this.yearly = value;
    }

}
