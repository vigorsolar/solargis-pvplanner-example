
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * PV system configuration
 * 
 * <p>Clase Java para PvSystem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PvSystem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="module" type="{http://geomodel.eu/schema/common/pv}ModuleSettings"/&gt;
 *         &lt;element name="topology" type="{http://geomodel.eu/schema/common/pv}Topology" minOccurs="0"/&gt;
 *         &lt;element name="inverter" type="{http://geomodel.eu/schema/common/pv}InverterSettings"/&gt;
 *         &lt;element name="losses" type="{http://geomodel.eu/schema/common/pv}Losses"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="selfShading" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="installedPower"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *             &lt;minExclusive value="0"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="dateStartup" type="{http://geomodel.eu/schema/common/types}dateWithTimeZone" /&gt;
 *       &lt;attribute name="installationType" type="{http://geomodel.eu/schema/common/pv}moduleInstallationTypeEnum" default="FREE_STANDING" /&gt;
 *       &lt;attribute name="availability" type="{http://geomodel.eu/schema/common/types}percent" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PvSystem", propOrder = {

})
public class PvSystem {

    @XmlElement(required = true)
    protected ModuleSettings module;
    protected Topology topology;
    @XmlElement(required = true)
    protected InverterSettings inverter;
    @XmlElement(required = true)
    protected Losses losses;
    @XmlAttribute(name = "selfShading")
    protected Boolean selfShading;
    @XmlAttribute(name = "installedPower")
    protected Double installedPower;
    @XmlAttribute(name = "dateStartup")
    protected XMLGregorianCalendar dateStartup;
    @XmlAttribute(name = "installationType")
    protected ModuleInstallationTypeEnum installationType;
    @XmlAttribute(name = "availability")
    protected Double availability;

    /**
     * Obtiene el valor de la propiedad module.
     * 
     * @return
     *     possible object is
     *     {@link ModuleSettings }
     *     
     */
    public ModuleSettings getModule() {
        return module;
    }

    /**
     * Define el valor de la propiedad module.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleSettings }
     *     
     */
    public void setModule(ModuleSettings value) {
        this.module = value;
    }

    /**
     * Obtiene el valor de la propiedad topology.
     * 
     * @return
     *     possible object is
     *     {@link Topology }
     *     
     */
    public Topology getTopology() {
        return topology;
    }

    /**
     * Define el valor de la propiedad topology.
     * 
     * @param value
     *     allowed object is
     *     {@link Topology }
     *     
     */
    public void setTopology(Topology value) {
        this.topology = value;
    }

    /**
     * Obtiene el valor de la propiedad inverter.
     * 
     * @return
     *     possible object is
     *     {@link InverterSettings }
     *     
     */
    public InverterSettings getInverter() {
        return inverter;
    }

    /**
     * Define el valor de la propiedad inverter.
     * 
     * @param value
     *     allowed object is
     *     {@link InverterSettings }
     *     
     */
    public void setInverter(InverterSettings value) {
        this.inverter = value;
    }

    /**
     * Obtiene el valor de la propiedad losses.
     * 
     * @return
     *     possible object is
     *     {@link Losses }
     *     
     */
    public Losses getLosses() {
        return losses;
    }

    /**
     * Define el valor de la propiedad losses.
     * 
     * @param value
     *     allowed object is
     *     {@link Losses }
     *     
     */
    public void setLosses(Losses value) {
        this.losses = value;
    }

    /**
     * Obtiene el valor de la propiedad selfShading.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSelfShading() {
        if (selfShading == null) {
            return false;
        } else {
            return selfShading;
        }
    }

    /**
     * Define el valor de la propiedad selfShading.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelfShading(Boolean value) {
        this.selfShading = value;
    }

    /**
     * Obtiene el valor de la propiedad installedPower.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInstalledPower() {
        return installedPower;
    }

    /**
     * Define el valor de la propiedad installedPower.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInstalledPower(Double value) {
        this.installedPower = value;
    }

    /**
     * Obtiene el valor de la propiedad dateStartup.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateStartup() {
        return dateStartup;
    }

    /**
     * Define el valor de la propiedad dateStartup.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateStartup(XMLGregorianCalendar value) {
        this.dateStartup = value;
    }

    /**
     * Obtiene el valor de la propiedad installationType.
     * 
     * @return
     *     possible object is
     *     {@link ModuleInstallationTypeEnum }
     *     
     */
    public ModuleInstallationTypeEnum getInstallationType() {
        if (installationType == null) {
            return ModuleInstallationTypeEnum.FREE_STANDING;
        } else {
            return installationType;
        }
    }

    /**
     * Define el valor de la propiedad installationType.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleInstallationTypeEnum }
     *     
     */
    public void setInstallationType(ModuleInstallationTypeEnum value) {
        this.installationType = value;
    }

    /**
     * Obtiene el valor de la propiedad availability.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAvailability() {
        return availability;
    }

    /**
     * Define el valor de la propiedad availability.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAvailability(Double value) {
        this.availability = value;
    }

}
