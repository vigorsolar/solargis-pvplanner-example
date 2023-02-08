
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Solar radiation reference and inplane values, strategy comparison and optimum angles includes
 * 
 * <p>Clase Java para SolarRadiation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SolarRadiation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reference" type="{http://geomodel.eu/schema/ws/pvplanner}ClimateReference"/&gt;
 *         &lt;element name="inplane" type="{http://geomodel.eu/schema/ws/pvplanner}InplaneIrradiation"/&gt;
 *         &lt;element name="comparison" type="{http://geomodel.eu/schema/ws/pvplanner}StrategyComparison"/&gt;
 *         &lt;element name="optimum" type="{http://geomodel.eu/schema/ws/pvplanner}OptimumAngles"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolarRadiation", namespace = "http://geomodel.eu/schema/ws/pvplanner", propOrder = {
    "reference",
    "inplane",
    "comparison",
    "optimum"
})
public class SolarRadiation {

    @XmlElement(required = true)
    protected ClimateReference reference;
    @XmlElement(required = true)
    protected InplaneIrradiation inplane;
    @XmlElement(required = true)
    protected StrategyComparison comparison;
    @XmlElement(required = true)
    protected OptimumAngles optimum;

    /**
     * Obtiene el valor de la propiedad reference.
     * 
     * @return
     *     possible object is
     *     {@link ClimateReference }
     *     
     */
    public ClimateReference getReference() {
        return reference;
    }

    /**
     * Define el valor de la propiedad reference.
     * 
     * @param value
     *     allowed object is
     *     {@link ClimateReference }
     *     
     */
    public void setReference(ClimateReference value) {
        this.reference = value;
    }

    /**
     * Obtiene el valor de la propiedad inplane.
     * 
     * @return
     *     possible object is
     *     {@link InplaneIrradiation }
     *     
     */
    public InplaneIrradiation getInplane() {
        return inplane;
    }

    /**
     * Define el valor de la propiedad inplane.
     * 
     * @param value
     *     allowed object is
     *     {@link InplaneIrradiation }
     *     
     */
    public void setInplane(InplaneIrradiation value) {
        this.inplane = value;
    }

    /**
     * Obtiene el valor de la propiedad comparison.
     * 
     * @return
     *     possible object is
     *     {@link StrategyComparison }
     *     
     */
    public StrategyComparison getComparison() {
        return comparison;
    }

    /**
     * Define el valor de la propiedad comparison.
     * 
     * @param value
     *     allowed object is
     *     {@link StrategyComparison }
     *     
     */
    public void setComparison(StrategyComparison value) {
        this.comparison = value;
    }

    /**
     * Obtiene el valor de la propiedad optimum.
     * 
     * @return
     *     possible object is
     *     {@link OptimumAngles }
     *     
     */
    public OptimumAngles getOptimum() {
        return optimum;
    }

    /**
     * Define el valor de la propiedad optimum.
     * 
     * @param value
     *     allowed object is
     *     {@link OptimumAngles }
     *     
     */
    public void setOptimum(OptimumAngles value) {
        this.optimum = value;
    }

}
