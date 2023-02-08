
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PerformanceLossesValues complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PerformanceLossesValues"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="output" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="lossAbs" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="lossRel" type="{http://geomodel.eu/schema/common/types}percent" /&gt;
 *       &lt;attribute name="PRp" type="{http://geomodel.eu/schema/common/types}percent" /&gt;
 *       &lt;attribute name="PRc" use="required" type="{http://geomodel.eu/schema/common/types}percent" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceLossesValues", namespace = "http://geomodel.eu/schema/ws/pvplanner")
public class PerformanceLossesValues {

    @XmlAttribute(name = "output", required = true)
    protected int output;
    @XmlAttribute(name = "lossAbs")
    protected Integer lossAbs;
    @XmlAttribute(name = "lossRel")
    protected Double lossRel;
    @XmlAttribute(name = "PRp")
    protected Double pRp;
    @XmlAttribute(name = "PRc", required = true)
    protected double pRc;

    /**
     * Obtiene el valor de la propiedad output.
     * 
     */
    public int getOutput() {
        return output;
    }

    /**
     * Define el valor de la propiedad output.
     * 
     */
    public void setOutput(int value) {
        this.output = value;
    }

    /**
     * Obtiene el valor de la propiedad lossAbs.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLossAbs() {
        return lossAbs;
    }

    /**
     * Define el valor de la propiedad lossAbs.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLossAbs(Integer value) {
        this.lossAbs = value;
    }

    /**
     * Obtiene el valor de la propiedad lossRel.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLossRel() {
        return lossRel;
    }

    /**
     * Define el valor de la propiedad lossRel.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLossRel(Double value) {
        this.lossRel = value;
    }

    /**
     * Obtiene el valor de la propiedad pRp.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPRp() {
        return pRp;
    }

    /**
     * Define el valor de la propiedad pRp.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPRp(Double value) {
        this.pRp = value;
    }

    /**
     * Obtiene el valor de la propiedad pRc.
     * 
     */
    public double getPRc() {
        return pRc;
    }

    /**
     * Define el valor de la propiedad pRc.
     * 
     */
    public void setPRc(double value) {
        this.pRc = value;
    }

}
