
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para topologyTypeEnum.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="topologyTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PROPORTIONAL"/&gt;
 *     &lt;enumeration value="UNPROPORTIONAL1"/&gt;
 *     &lt;enumeration value="UNPROPORTIONAL2"/&gt;
 *     &lt;enumeration value="UNPROPORTIONAL3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "topologyTypeEnum")
@XmlEnum
public enum TopologyTypeEnum {


    /**
     * applicable for a-Si, CdTe and CIS (thin film technologies), the loss of generated electricity is proportional to the size of module area in shade
     * 
     */
    PROPORTIONAL("PROPORTIONAL"),

    /**
     * applicable for c-Si, modules are landscape oriented with proper layout optimization
     * 
     */
    @XmlEnumValue("UNPROPORTIONAL1")
    UNPROPORTIONAL_1("UNPROPORTIONAL1"),

    /**
     * applicable for c-Si, modules are landscape oriented with intermediate layout optimization
     * 
     */
    @XmlEnumValue("UNPROPORTIONAL2")
    UNPROPORTIONAL_2("UNPROPORTIONAL2"),

    /**
     * applicable for c-Si, modules are portrait oriented with poor layout optimization, bottom cells in shade will shut the whole row of modules down
     * 
     */
    @XmlEnumValue("UNPROPORTIONAL3")
    UNPROPORTIONAL_3("UNPROPORTIONAL3");
    private final String value;

    TopologyTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TopologyTypeEnum fromValue(String v) {
        for (TopologyTypeEnum c: TopologyTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
