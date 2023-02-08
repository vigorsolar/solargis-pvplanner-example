
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ModuleSettings complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ModuleSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="degradation" type="{http://geomodel.eu/schema/common/types}percent" minOccurs="0"/&gt;
 *         &lt;element name="degradationFirstYear" type="{http://geomodel.eu/schema/common/types}percent" minOccurs="0"/&gt;
 *         &lt;element name="surfaceReflectance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="powerTolerance" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="low" type="{http://geomodel.eu/schema/common/types}percent" /&gt;
 *                 &lt;attribute name="high" type="{http://geomodel.eu/schema/common/types}percent" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nominalOperatingCellTemp" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="openCircuitVoltageCoeff" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="shortCircuitCurrentCoeff" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PmaxCoeff" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attGroup ref="{http://geomodel.eu/schema/common/pv}modulePowerAttributes"/&gt;
 *       &lt;attribute name="type" use="required" type="{http://geomodel.eu/schema/common/pv}moduleTypeEnum" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModuleSettings", propOrder = {

})
public class ModuleSettings {

    protected Double degradation;
    protected Double degradationFirstYear;
    protected Double surfaceReflectance;
    protected ModuleSettings.PowerTolerance powerTolerance;
    protected Double nominalOperatingCellTemp;
    protected Double openCircuitVoltageCoeff;
    protected Double shortCircuitCurrentCoeff;
    @XmlElement(name = "PmaxCoeff")
    protected Double pmaxCoeff;
    @XmlAttribute(name = "type", required = true)
    protected ModuleTypeEnum type;
    @XmlAttribute(name = "count")
    protected Integer count;
    @XmlAttribute(name = "nominalPower")
    protected Integer nominalPower;

    /**
     * Obtiene el valor de la propiedad degradation.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDegradation() {
        return degradation;
    }

    /**
     * Define el valor de la propiedad degradation.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDegradation(Double value) {
        this.degradation = value;
    }

    /**
     * Obtiene el valor de la propiedad degradationFirstYear.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDegradationFirstYear() {
        return degradationFirstYear;
    }

    /**
     * Define el valor de la propiedad degradationFirstYear.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDegradationFirstYear(Double value) {
        this.degradationFirstYear = value;
    }

    /**
     * Obtiene el valor de la propiedad surfaceReflectance.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSurfaceReflectance() {
        return surfaceReflectance;
    }

    /**
     * Define el valor de la propiedad surfaceReflectance.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSurfaceReflectance(Double value) {
        this.surfaceReflectance = value;
    }

    /**
     * Obtiene el valor de la propiedad powerTolerance.
     * 
     * @return
     *     possible object is
     *     {@link ModuleSettings.PowerTolerance }
     *     
     */
    public ModuleSettings.PowerTolerance getPowerTolerance() {
        return powerTolerance;
    }

    /**
     * Define el valor de la propiedad powerTolerance.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleSettings.PowerTolerance }
     *     
     */
    public void setPowerTolerance(ModuleSettings.PowerTolerance value) {
        this.powerTolerance = value;
    }

    /**
     * Obtiene el valor de la propiedad nominalOperatingCellTemp.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNominalOperatingCellTemp() {
        return nominalOperatingCellTemp;
    }

    /**
     * Define el valor de la propiedad nominalOperatingCellTemp.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNominalOperatingCellTemp(Double value) {
        this.nominalOperatingCellTemp = value;
    }

    /**
     * Obtiene el valor de la propiedad openCircuitVoltageCoeff.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpenCircuitVoltageCoeff() {
        return openCircuitVoltageCoeff;
    }

    /**
     * Define el valor de la propiedad openCircuitVoltageCoeff.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpenCircuitVoltageCoeff(Double value) {
        this.openCircuitVoltageCoeff = value;
    }

    /**
     * Obtiene el valor de la propiedad shortCircuitCurrentCoeff.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShortCircuitCurrentCoeff() {
        return shortCircuitCurrentCoeff;
    }

    /**
     * Define el valor de la propiedad shortCircuitCurrentCoeff.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShortCircuitCurrentCoeff(Double value) {
        this.shortCircuitCurrentCoeff = value;
    }

    /**
     * Obtiene el valor de la propiedad pmaxCoeff.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPmaxCoeff() {
        return pmaxCoeff;
    }

    /**
     * Define el valor de la propiedad pmaxCoeff.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPmaxCoeff(Double value) {
        this.pmaxCoeff = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link ModuleTypeEnum }
     *     
     */
    public ModuleTypeEnum getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleTypeEnum }
     *     
     */
    public void setType(ModuleTypeEnum value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad count.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Define el valor de la propiedad count.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCount(Integer value) {
        this.count = value;
    }

    /**
     * Obtiene el valor de la propiedad nominalPower.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNominalPower() {
        return nominalPower;
    }

    /**
     * Define el valor de la propiedad nominalPower.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNominalPower(Integer value) {
        this.nominalPower = value;
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
     *       &lt;attribute name="low" type="{http://geomodel.eu/schema/common/types}percent" /&gt;
     *       &lt;attribute name="high" type="{http://geomodel.eu/schema/common/types}percent" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PowerTolerance {

        @XmlAttribute(name = "low")
        protected Double low;
        @XmlAttribute(name = "high")
        protected Double high;

        /**
         * Obtiene el valor de la propiedad low.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getLow() {
            return low;
        }

        /**
         * Define el valor de la propiedad low.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setLow(Double value) {
            this.low = value;
        }

        /**
         * Obtiene el valor de la propiedad high.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getHigh() {
            return high;
        }

        /**
         * Define el valor de la propiedad high.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setHigh(Double value) {
            this.high = value;
        }

    }

}
