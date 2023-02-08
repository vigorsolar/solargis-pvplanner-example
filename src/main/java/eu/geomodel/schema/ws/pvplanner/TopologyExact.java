
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TopologyExact complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TopologyExact"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://geomodel.eu/schema/common/pv}Topology"&gt;
 *       &lt;attribute name="absoluteSpacing" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="tableWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopologyExact")
public class TopologyExact
    extends Topology
{

    @XmlAttribute(name = "absoluteSpacing", required = true)
    protected double absoluteSpacing;
    @XmlAttribute(name = "tableWidth", required = true)
    protected double tableWidth;

    /**
     * Obtiene el valor de la propiedad absoluteSpacing.
     * 
     */
    public double getAbsoluteSpacing() {
        return absoluteSpacing;
    }

    /**
     * Define el valor de la propiedad absoluteSpacing.
     * 
     */
    public void setAbsoluteSpacing(double value) {
        this.absoluteSpacing = value;
    }

    /**
     * Obtiene el valor de la propiedad tableWidth.
     * 
     */
    public double getTableWidth() {
        return tableWidth;
    }

    /**
     * Define el valor de la propiedad tableWidth.
     * 
     */
    public void setTableWidth(double value) {
        this.tableWidth = value;
    }

}
