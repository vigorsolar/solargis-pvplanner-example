
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * PV systems topology configuration
 * 
 * <p>Clase Java para Topology complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Topology"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="type" type="{http://geomodel.eu/schema/common/pv}topologyTypeEnum" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Topology")
@XmlSeeAlso({
    TopologyRow.class,
    TopologyColumn.class,
    TopologyShadingAngle.class,
    TopologyExact.class
})
public abstract class Topology {

    @XmlAttribute(name = "type")
    protected TopologyTypeEnum type;

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link TopologyTypeEnum }
     *     
     */
    public TopologyTypeEnum getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link TopologyTypeEnum }
     *     
     */
    public void setType(TopologyTypeEnum value) {
        this.type = value;
    }

}
