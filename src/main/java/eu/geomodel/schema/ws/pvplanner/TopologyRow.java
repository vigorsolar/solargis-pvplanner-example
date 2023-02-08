
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The parameter has effect only if back-tracking is true in the case of tracking systems. It specifies the ratio between distance between the equivalent trackers legs (axis) and pv collector width. It has an effect for GeometryTwoAxisAstronomical tracker and GeometryOneAxisHorizontalEW tracker. For fixed mounting this parameter is used to calculate the impact of self shading.
 * 
 * 
 * <p>Clase Java para TopologyRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TopologyRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://geomodel.eu/schema/common/pv}Topology"&gt;
 *       &lt;attribute name="relativeSpacing" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopologyRow")
@XmlSeeAlso({
    TopologySimple.class
})
public class TopologyRow
    extends Topology
{

    @XmlAttribute(name = "relativeSpacing", required = true)
    protected double relativeSpacing;

    /**
     * Obtiene el valor de la propiedad relativeSpacing.
     * 
     */
    public double getRelativeSpacing() {
        return relativeSpacing;
    }

    /**
     * Define el valor de la propiedad relativeSpacing.
     * 
     */
    public void setRelativeSpacing(double value) {
        this.relativeSpacing = value;
    }

}
