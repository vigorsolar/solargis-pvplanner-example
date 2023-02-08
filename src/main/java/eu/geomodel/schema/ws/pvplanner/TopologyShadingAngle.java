
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TopologyShadingAngle complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TopologyShadingAngle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://geomodel.eu/schema/common/pv}Topology"&gt;
 *       &lt;attribute name="shadingAngle" use="required" type="{http://geomodel.eu/schema/common/geo}inclination" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopologyShadingAngle")
public class TopologyShadingAngle
    extends Topology
{

    @XmlAttribute(name = "shadingAngle", required = true)
    protected double shadingAngle;

    /**
     * Obtiene el valor de la propiedad shadingAngle.
     * 
     */
    public double getShadingAngle() {
        return shadingAngle;
    }

    /**
     * Define el valor de la propiedad shadingAngle.
     * 
     */
    public void setShadingAngle(double value) {
        this.shadingAngle = value;
    }

}
