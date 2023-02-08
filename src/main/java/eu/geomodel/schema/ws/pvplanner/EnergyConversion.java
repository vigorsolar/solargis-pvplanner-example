
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				System losses and performance ratio
 * 
 * 				Energy conversion steps and losses: 
 * 				1. Initial production at Standard Test Conditions (STC) is assumed,
 * 				2. Reduction of global in-plane irradiation due to obstruction of terrain horizon and PV modules, 
 * 				3. Proportion of global irradiation that is reflected by surface of PV modules (typically glass), 
 * 				4. Losses in PV modules due to conversion of solar radiation to DC electricity; deviation of module efficiency from STC, 
 * 				5. DC losses: this step assumes integrated effect of mismatch between PV modules, heat losses in interconnections and cables, losses due to dirt, snow, icing and soiling, and self-shading of PV modules, 
 * 				6. This step considers euro efficiency to approximate average losses in the inverter, 
 * 				7. Losses in AC section and transformer (where applicable) depend on the system architecture, 
 * 				8. Availability parameter assumes losses due to downtime caused by maintenance or failures.
 * 
 * 				Losses at steps 2 to 4 are numerically modeled by pvPlanner. Losses at steps 5 to 8 are to be assessed by a user.
 * 			
 * 
 * <p>Clase Java para EnergyConversion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EnergyConversion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="global" type="{http://geomodel.eu/schema/ws/pvplanner}PerformanceLossesValues"/&gt;
 *         &lt;element name="terrain" type="{http://geomodel.eu/schema/ws/pvplanner}PerformanceLossesValues"/&gt;
 *         &lt;element name="angular" type="{http://geomodel.eu/schema/ws/pvplanner}PerformanceLossesValues"/&gt;
 *         &lt;element name="conversion" type="{http://geomodel.eu/schema/ws/pvplanner}PerformanceLossesValues"/&gt;
 *         &lt;element name="dcLoss" type="{http://geomodel.eu/schema/ws/pvplanner}PerformanceLossesValues"/&gt;
 *         &lt;element name="inverter" type="{http://geomodel.eu/schema/ws/pvplanner}PerformanceLossesValues"/&gt;
 *         &lt;element name="acLoss" type="{http://geomodel.eu/schema/ws/pvplanner}PerformanceLossesValues"/&gt;
 *         &lt;element name="availability" type="{http://geomodel.eu/schema/ws/pvplanner}PerformanceLossesValues"/&gt;
 *         &lt;element name="total" type="{http://geomodel.eu/schema/ws/pvplanner}PerformanceLossesValues"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyConversion", namespace = "http://geomodel.eu/schema/ws/pvplanner", propOrder = {
    "global",
    "terrain",
    "angular",
    "conversion",
    "dcLoss",
    "inverter",
    "acLoss",
    "availability",
    "total"
})
public class EnergyConversion {

    @XmlElement(required = true)
    protected PerformanceLossesValues global;
    @XmlElement(required = true)
    protected PerformanceLossesValues terrain;
    @XmlElement(required = true)
    protected PerformanceLossesValues angular;
    @XmlElement(required = true)
    protected PerformanceLossesValues conversion;
    @XmlElement(required = true)
    protected PerformanceLossesValues dcLoss;
    @XmlElement(required = true)
    protected PerformanceLossesValues inverter;
    @XmlElement(required = true)
    protected PerformanceLossesValues acLoss;
    @XmlElement(required = true)
    protected PerformanceLossesValues availability;
    @XmlElement(required = true)
    protected PerformanceLossesValues total;

    /**
     * Obtiene el valor de la propiedad global.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceLossesValues }
     *     
     */
    public PerformanceLossesValues getGlobal() {
        return global;
    }

    /**
     * Define el valor de la propiedad global.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceLossesValues }
     *     
     */
    public void setGlobal(PerformanceLossesValues value) {
        this.global = value;
    }

    /**
     * Obtiene el valor de la propiedad terrain.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceLossesValues }
     *     
     */
    public PerformanceLossesValues getTerrain() {
        return terrain;
    }

    /**
     * Define el valor de la propiedad terrain.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceLossesValues }
     *     
     */
    public void setTerrain(PerformanceLossesValues value) {
        this.terrain = value;
    }

    /**
     * Obtiene el valor de la propiedad angular.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceLossesValues }
     *     
     */
    public PerformanceLossesValues getAngular() {
        return angular;
    }

    /**
     * Define el valor de la propiedad angular.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceLossesValues }
     *     
     */
    public void setAngular(PerformanceLossesValues value) {
        this.angular = value;
    }

    /**
     * Obtiene el valor de la propiedad conversion.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceLossesValues }
     *     
     */
    public PerformanceLossesValues getConversion() {
        return conversion;
    }

    /**
     * Define el valor de la propiedad conversion.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceLossesValues }
     *     
     */
    public void setConversion(PerformanceLossesValues value) {
        this.conversion = value;
    }

    /**
     * Obtiene el valor de la propiedad dcLoss.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceLossesValues }
     *     
     */
    public PerformanceLossesValues getDcLoss() {
        return dcLoss;
    }

    /**
     * Define el valor de la propiedad dcLoss.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceLossesValues }
     *     
     */
    public void setDcLoss(PerformanceLossesValues value) {
        this.dcLoss = value;
    }

    /**
     * Obtiene el valor de la propiedad inverter.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceLossesValues }
     *     
     */
    public PerformanceLossesValues getInverter() {
        return inverter;
    }

    /**
     * Define el valor de la propiedad inverter.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceLossesValues }
     *     
     */
    public void setInverter(PerformanceLossesValues value) {
        this.inverter = value;
    }

    /**
     * Obtiene el valor de la propiedad acLoss.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceLossesValues }
     *     
     */
    public PerformanceLossesValues getAcLoss() {
        return acLoss;
    }

    /**
     * Define el valor de la propiedad acLoss.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceLossesValues }
     *     
     */
    public void setAcLoss(PerformanceLossesValues value) {
        this.acLoss = value;
    }

    /**
     * Obtiene el valor de la propiedad availability.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceLossesValues }
     *     
     */
    public PerformanceLossesValues getAvailability() {
        return availability;
    }

    /**
     * Define el valor de la propiedad availability.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceLossesValues }
     *     
     */
    public void setAvailability(PerformanceLossesValues value) {
        this.availability = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceLossesValues }
     *     
     */
    public PerformanceLossesValues getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceLossesValues }
     *     
     */
    public void setTotal(PerformanceLossesValues value) {
        this.total = value;
    }

}
