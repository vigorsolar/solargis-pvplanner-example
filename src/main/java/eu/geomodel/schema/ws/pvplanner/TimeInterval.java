
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TimeInterval complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TimeInterval"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="unit" use="required" type="{http://geomodel.eu/schema/common/types}timeUnitEnum" /&gt;
 *       &lt;attribute name="value" use="required" type="{http://geomodel.eu/schema/common/types}positiveInt" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeInterval", namespace = "http://geomodel.eu/schema/common/types")
public class TimeInterval {

    @XmlAttribute(name = "unit", required = true)
    protected TimeUnitEnum unit;
    @XmlAttribute(name = "value", required = true)
    protected int value;

    /**
     * Obtiene el valor de la propiedad unit.
     * 
     * @return
     *     possible object is
     *     {@link TimeUnitEnum }
     *     
     */
    public TimeUnitEnum getUnit() {
        return unit;
    }

    /**
     * Define el valor de la propiedad unit.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeUnitEnum }
     *     
     */
    public void setUnit(TimeUnitEnum value) {
        this.unit = value;
    }

    /**
     * Obtiene el valor de la propiedad value.
     * 
     */
    public int getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     */
    public void setValue(int value) {
        this.value = value;
    }

}
