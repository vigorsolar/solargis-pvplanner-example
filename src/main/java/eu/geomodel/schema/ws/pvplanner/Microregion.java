
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Microregion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Microregion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="type" use="required" type="{http://geomodel.eu/schema/common/geo}DeltaTypeEnum" /&gt;
 *       &lt;attribute name="doubleDelta" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Microregion", namespace = "http://geomodel.eu/schema/common/geo")
public class Microregion {

    @XmlAttribute(name = "type", required = true)
    protected DeltaTypeEnum type;
    @XmlAttribute(name = "doubleDelta", required = true)
    protected double doubleDelta;

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link DeltaTypeEnum }
     *     
     */
    public DeltaTypeEnum getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link DeltaTypeEnum }
     *     
     */
    public void setType(DeltaTypeEnum value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad doubleDelta.
     * 
     */
    public double getDoubleDelta() {
        return doubleDelta;
    }

    /**
     * Define el valor de la propiedad doubleDelta.
     * 
     */
    public void setDoubleDelta(double value) {
        this.doubleDelta = value;
    }

}
