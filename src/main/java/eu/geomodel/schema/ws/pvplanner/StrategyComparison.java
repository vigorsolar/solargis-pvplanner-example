
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Average yearly sum of global irradiation for different types of surface
 * 
 * <p>Clase Java para StrategyComparison complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="StrategyComparison"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="horizontal" type="{http://geomodel.eu/schema/ws/pvplanner}IrradiationComparisonValues"/&gt;
 *         &lt;element name="optimum" type="{http://geomodel.eu/schema/ws/pvplanner}IrradiationComparisonValues"/&gt;
 *         &lt;element name="tracker2x" type="{http://geomodel.eu/schema/ws/pvplanner}IrradiationComparisonValues"/&gt;
 *         &lt;element name="selected" type="{http://geomodel.eu/schema/ws/pvplanner}IrradiationComparisonValues"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrategyComparison", namespace = "http://geomodel.eu/schema/ws/pvplanner", propOrder = {
    "horizontal",
    "optimum",
    "tracker2X",
    "selected"
})
public class StrategyComparison {

    @XmlElement(required = true)
    protected IrradiationComparisonValues horizontal;
    @XmlElement(required = true)
    protected IrradiationComparisonValues optimum;
    @XmlElement(name = "tracker2x", required = true)
    protected IrradiationComparisonValues tracker2X;
    @XmlElement(required = true)
    protected IrradiationComparisonValues selected;

    /**
     * Obtiene el valor de la propiedad horizontal.
     * 
     * @return
     *     possible object is
     *     {@link IrradiationComparisonValues }
     *     
     */
    public IrradiationComparisonValues getHorizontal() {
        return horizontal;
    }

    /**
     * Define el valor de la propiedad horizontal.
     * 
     * @param value
     *     allowed object is
     *     {@link IrradiationComparisonValues }
     *     
     */
    public void setHorizontal(IrradiationComparisonValues value) {
        this.horizontal = value;
    }

    /**
     * Obtiene el valor de la propiedad optimum.
     * 
     * @return
     *     possible object is
     *     {@link IrradiationComparisonValues }
     *     
     */
    public IrradiationComparisonValues getOptimum() {
        return optimum;
    }

    /**
     * Define el valor de la propiedad optimum.
     * 
     * @param value
     *     allowed object is
     *     {@link IrradiationComparisonValues }
     *     
     */
    public void setOptimum(IrradiationComparisonValues value) {
        this.optimum = value;
    }

    /**
     * Obtiene el valor de la propiedad tracker2X.
     * 
     * @return
     *     possible object is
     *     {@link IrradiationComparisonValues }
     *     
     */
    public IrradiationComparisonValues getTracker2X() {
        return tracker2X;
    }

    /**
     * Define el valor de la propiedad tracker2X.
     * 
     * @param value
     *     allowed object is
     *     {@link IrradiationComparisonValues }
     *     
     */
    public void setTracker2X(IrradiationComparisonValues value) {
        this.tracker2X = value;
    }

    /**
     * Obtiene el valor de la propiedad selected.
     * 
     * @return
     *     possible object is
     *     {@link IrradiationComparisonValues }
     *     
     */
    public IrradiationComparisonValues getSelected() {
        return selected;
    }

    /**
     * Define el valor de la propiedad selected.
     * 
     * @param value
     *     allowed object is
     *     {@link IrradiationComparisonValues }
     *     
     */
    public void setSelected(IrradiationComparisonValues value) {
        this.selected = value;
    }

}
