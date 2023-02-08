
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para moduleTypeEnum.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="moduleTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CSI"/&gt;
 *     &lt;enumeration value="ASI"/&gt;
 *     &lt;enumeration value="CDTE"/&gt;
 *     &lt;enumeration value="CIS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "moduleTypeEnum")
@XmlEnum
public enum ModuleTypeEnum {


    /**
     * crystalline silicon (c-Si)
     * 
     */
    CSI,

    /**
     * amorphous silicon (a-Si)
     * 
     */
    ASI,

    /**
     * cadmium telluride (CdTe)
     * 
     */
    CDTE,

    /**
     * copper indium selenide (CIS)
     * 
     */
    CIS;

    public String value() {
        return name();
    }

    public static ModuleTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
