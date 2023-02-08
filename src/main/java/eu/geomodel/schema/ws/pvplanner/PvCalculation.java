
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Photovoltaic calculation results
 * 
 * <p>Clase Java para PvCalculation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PvCalculation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="output" type="{http://geomodel.eu/schema/ws/pvplanner}PvOutput"/&gt;
 *         &lt;element name="losses" type="{http://geomodel.eu/schema/ws/pvplanner}EnergyConversion"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PvCalculation", namespace = "http://geomodel.eu/schema/ws/pvplanner", propOrder = {
    "output",
    "losses"
})
public class PvCalculation {

    @XmlElement(required = true)
    protected PvOutput output;
    @XmlElement(required = true)
    protected EnergyConversion losses;

    /**
     * Obtiene el valor de la propiedad output.
     * 
     * @return
     *     possible object is
     *     {@link PvOutput }
     *     
     */
    public PvOutput getOutput() {
        return output;
    }

    /**
     * Define el valor de la propiedad output.
     * 
     * @param value
     *     allowed object is
     *     {@link PvOutput }
     *     
     */
    public void setOutput(PvOutput value) {
        this.output = value;
    }

    /**
     * Obtiene el valor de la propiedad losses.
     * 
     * @return
     *     possible object is
     *     {@link EnergyConversion }
     *     
     */
    public EnergyConversion getLosses() {
        return losses;
    }

    /**
     * Define el valor de la propiedad losses.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyConversion }
     *     
     */
    public void setLosses(EnergyConversion value) {
        this.losses = value;
    }

}
