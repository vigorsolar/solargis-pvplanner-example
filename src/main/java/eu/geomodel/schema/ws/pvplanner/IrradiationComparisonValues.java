
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IrradiationComparisonValues complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IrradiationComparisonValues"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="yearlySum" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="percentOpt" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IrradiationComparisonValues", namespace = "http://geomodel.eu/schema/ws/pvplanner")
public class IrradiationComparisonValues {

    @XmlAttribute(name = "yearlySum", required = true)
    protected double yearlySum;
    @XmlAttribute(name = "percentOpt", required = true)
    protected double percentOpt;

    /**
     * Obtiene el valor de la propiedad yearlySum.
     * 
     */
    public double getYearlySum() {
        return yearlySum;
    }

    /**
     * Define el valor de la propiedad yearlySum.
     * 
     */
    public void setYearlySum(double value) {
        this.yearlySum = value;
    }

    /**
     * Obtiene el valor de la propiedad percentOpt.
     * 
     */
    public double getPercentOpt() {
        return percentOpt;
    }

    /**
     * Define el valor de la propiedad percentOpt.
     * 
     */
    public void setPercentOpt(double value) {
        this.percentOpt = value;
    }

}
