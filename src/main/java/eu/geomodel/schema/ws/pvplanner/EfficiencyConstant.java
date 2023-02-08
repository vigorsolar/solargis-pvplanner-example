
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EfficiencyConstant complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EfficiencyConstant"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://geomodel.eu/schema/common/pv}Efficiency"&gt;
 *       &lt;attribute name="percent" use="required" type="{http://geomodel.eu/schema/common/types}percent" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EfficiencyConstant")
public class EfficiencyConstant
    extends Efficiency
{

    @XmlAttribute(name = "percent", required = true)
    protected double percent;

    /**
     * Obtiene el valor de la propiedad percent.
     * 
     */
    public double getPercent() {
        return percent;
    }

    /**
     * Define el valor de la propiedad percent.
     * 
     */
    public void setPercent(double value) {
        this.percent = value;
    }

}
