
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Global horizontal irradiation and air temperature - climate reference
 * 
 * <p>Clase Java para ClimateReference complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClimateReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ghm" type="{http://geomodel.eu/schema/common/types}MonthlyValues"/&gt;
 *         &lt;element name="Ghd" type="{http://geomodel.eu/schema/common/types}MonthlyValues"/&gt;
 *         &lt;element name="Dhd" type="{http://geomodel.eu/schema/common/types}MonthlyValues"/&gt;
 *         &lt;element name="Td" type="{http://geomodel.eu/schema/common/types}MonthlyValues"/&gt;
 *         &lt;element name="Tmin" type="{http://geomodel.eu/schema/common/types}MonthlyValues"/&gt;
 *         &lt;element name="Tmax" type="{http://geomodel.eu/schema/common/types}MonthlyValues"/&gt;
 *         &lt;element name="invar" type="{http://geomodel.eu/schema/common/types}MonthlyValues"/&gt;
 *         &lt;element name="Rh" type="{http://geomodel.eu/schema/common/types}MonthlyValues"/&gt;
 *         &lt;element name="Pwat" type="{http://geomodel.eu/schema/common/types}MonthlyValues"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClimateReference", namespace = "http://geomodel.eu/schema/ws/pvplanner", propOrder = {
    "ghm",
    "ghd",
    "dhd",
    "td",
    "tmin",
    "tmax",
    "invar",
    "rh",
    "pwat"
})
public class ClimateReference {

    @XmlElement(name = "Ghm", required = true)
    protected MonthlyValues ghm;
    @XmlElement(name = "Ghd", required = true)
    protected MonthlyValues ghd;
    @XmlElement(name = "Dhd", required = true)
    protected MonthlyValues dhd;
    @XmlElement(name = "Td", required = true)
    protected MonthlyValues td;
    @XmlElement(name = "Tmin", required = true)
    protected MonthlyValues tmin;
    @XmlElement(name = "Tmax", required = true)
    protected MonthlyValues tmax;
    @XmlElement(required = true)
    protected MonthlyValues invar;
    @XmlElement(name = "Rh", required = true)
    protected MonthlyValues rh;
    @XmlElement(name = "Pwat", required = true)
    protected MonthlyValues pwat;

    /**
     * Obtiene el valor de la propiedad ghm.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyValues }
     *     
     */
    public MonthlyValues getGhm() {
        return ghm;
    }

    /**
     * Define el valor de la propiedad ghm.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyValues }
     *     
     */
    public void setGhm(MonthlyValues value) {
        this.ghm = value;
    }

    /**
     * Obtiene el valor de la propiedad ghd.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyValues }
     *     
     */
    public MonthlyValues getGhd() {
        return ghd;
    }

    /**
     * Define el valor de la propiedad ghd.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyValues }
     *     
     */
    public void setGhd(MonthlyValues value) {
        this.ghd = value;
    }

    /**
     * Obtiene el valor de la propiedad dhd.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyValues }
     *     
     */
    public MonthlyValues getDhd() {
        return dhd;
    }

    /**
     * Define el valor de la propiedad dhd.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyValues }
     *     
     */
    public void setDhd(MonthlyValues value) {
        this.dhd = value;
    }

    /**
     * Obtiene el valor de la propiedad td.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyValues }
     *     
     */
    public MonthlyValues getTd() {
        return td;
    }

    /**
     * Define el valor de la propiedad td.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyValues }
     *     
     */
    public void setTd(MonthlyValues value) {
        this.td = value;
    }

    /**
     * Obtiene el valor de la propiedad tmin.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyValues }
     *     
     */
    public MonthlyValues getTmin() {
        return tmin;
    }

    /**
     * Define el valor de la propiedad tmin.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyValues }
     *     
     */
    public void setTmin(MonthlyValues value) {
        this.tmin = value;
    }

    /**
     * Obtiene el valor de la propiedad tmax.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyValues }
     *     
     */
    public MonthlyValues getTmax() {
        return tmax;
    }

    /**
     * Define el valor de la propiedad tmax.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyValues }
     *     
     */
    public void setTmax(MonthlyValues value) {
        this.tmax = value;
    }

    /**
     * Obtiene el valor de la propiedad invar.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyValues }
     *     
     */
    public MonthlyValues getInvar() {
        return invar;
    }

    /**
     * Define el valor de la propiedad invar.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyValues }
     *     
     */
    public void setInvar(MonthlyValues value) {
        this.invar = value;
    }

    /**
     * Obtiene el valor de la propiedad rh.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyValues }
     *     
     */
    public MonthlyValues getRh() {
        return rh;
    }

    /**
     * Define el valor de la propiedad rh.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyValues }
     *     
     */
    public void setRh(MonthlyValues value) {
        this.rh = value;
    }

    /**
     * Obtiene el valor de la propiedad pwat.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyValues }
     *     
     */
    public MonthlyValues getPwat() {
        return pwat;
    }

    /**
     * Define el valor de la propiedad pwat.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyValues }
     *     
     */
    public void setPwat(MonthlyValues value) {
        this.pwat = value;
    }

}
