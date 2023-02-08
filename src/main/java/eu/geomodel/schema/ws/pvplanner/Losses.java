
package eu.geomodel.schema.ws.pvplanner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Losses of system components
 * 
 * <p>Clase Java para Losses complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Losses"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="dcLosses" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="snowPollution" type="{http://geomodel.eu/schema/common/types}percent" /&gt;
 *                 &lt;attribute name="monthlySnowPollution" type="{http://geomodel.eu/schema/common/types}doubleValues" /&gt;
 *                 &lt;attribute name="cables" type="{http://geomodel.eu/schema/common/types}percent" /&gt;
 *                 &lt;attribute name="mismatch" type="{http://geomodel.eu/schema/common/types}percent" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="acLosses" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="transformer" type="{http://geomodel.eu/schema/common/types}percent" /&gt;
 *                 &lt;attribute name="cables" type="{http://geomodel.eu/schema/common/types}percent" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="dc" type="{http://geomodel.eu/schema/common/types}percent" /&gt;
 *       &lt;attribute name="ac" type="{http://geomodel.eu/schema/common/types}percent" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Losses", propOrder = {

})
public class Losses {

    protected Losses.DcLosses dcLosses;
    protected Losses.AcLosses acLosses;
    @XmlAttribute(name = "dc")
    protected Double dc;
    @XmlAttribute(name = "ac")
    protected Double ac;

    /**
     * Obtiene el valor de la propiedad dcLosses.
     * 
     * @return
     *     possible object is
     *     {@link Losses.DcLosses }
     *     
     */
    public Losses.DcLosses getDcLosses() {
        return dcLosses;
    }

    /**
     * Define el valor de la propiedad dcLosses.
     * 
     * @param value
     *     allowed object is
     *     {@link Losses.DcLosses }
     *     
     */
    public void setDcLosses(Losses.DcLosses value) {
        this.dcLosses = value;
    }

    /**
     * Obtiene el valor de la propiedad acLosses.
     * 
     * @return
     *     possible object is
     *     {@link Losses.AcLosses }
     *     
     */
    public Losses.AcLosses getAcLosses() {
        return acLosses;
    }

    /**
     * Define el valor de la propiedad acLosses.
     * 
     * @param value
     *     allowed object is
     *     {@link Losses.AcLosses }
     *     
     */
    public void setAcLosses(Losses.AcLosses value) {
        this.acLosses = value;
    }

    /**
     * Obtiene el valor de la propiedad dc.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDc() {
        return dc;
    }

    /**
     * Define el valor de la propiedad dc.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDc(Double value) {
        this.dc = value;
    }

    /**
     * Obtiene el valor de la propiedad ac.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAc() {
        return ac;
    }

    /**
     * Define el valor de la propiedad ac.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAc(Double value) {
        this.ac = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="transformer" type="{http://geomodel.eu/schema/common/types}percent" /&gt;
     *       &lt;attribute name="cables" type="{http://geomodel.eu/schema/common/types}percent" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AcLosses {

        @XmlAttribute(name = "transformer")
        protected Double transformer;
        @XmlAttribute(name = "cables")
        protected Double cables;

        /**
         * Obtiene el valor de la propiedad transformer.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getTransformer() {
            return transformer;
        }

        /**
         * Define el valor de la propiedad transformer.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setTransformer(Double value) {
            this.transformer = value;
        }

        /**
         * Obtiene el valor de la propiedad cables.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getCables() {
            return cables;
        }

        /**
         * Define el valor de la propiedad cables.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setCables(Double value) {
            this.cables = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="snowPollution" type="{http://geomodel.eu/schema/common/types}percent" /&gt;
     *       &lt;attribute name="monthlySnowPollution" type="{http://geomodel.eu/schema/common/types}doubleValues" /&gt;
     *       &lt;attribute name="cables" type="{http://geomodel.eu/schema/common/types}percent" /&gt;
     *       &lt;attribute name="mismatch" type="{http://geomodel.eu/schema/common/types}percent" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DcLosses {

        @XmlAttribute(name = "snowPollution")
        protected Double snowPollution;
        @XmlAttribute(name = "monthlySnowPollution")
        protected List<Double> monthlySnowPollution;
        @XmlAttribute(name = "cables")
        protected Double cables;
        @XmlAttribute(name = "mismatch")
        protected Double mismatch;

        /**
         * Obtiene el valor de la propiedad snowPollution.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getSnowPollution() {
            return snowPollution;
        }

        /**
         * Define el valor de la propiedad snowPollution.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setSnowPollution(Double value) {
            this.snowPollution = value;
        }

        /**
         * Gets the value of the monthlySnowPollution property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the monthlySnowPollution property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMonthlySnowPollution().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Double }
         * 
         * 
         */
        public List<Double> getMonthlySnowPollution() {
            if (monthlySnowPollution == null) {
                monthlySnowPollution = new ArrayList<Double>();
            }
            return this.monthlySnowPollution;
        }

        /**
         * Obtiene el valor de la propiedad cables.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getCables() {
            return cables;
        }

        /**
         * Define el valor de la propiedad cables.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setCables(Double value) {
            this.cables = value;
        }

        /**
         * Obtiene el valor de la propiedad mismatch.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getMismatch() {
            return mismatch;
        }

        /**
         * Define el valor de la propiedad mismatch.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setMismatch(Double value) {
            this.mismatch = value;
        }

    }

}
