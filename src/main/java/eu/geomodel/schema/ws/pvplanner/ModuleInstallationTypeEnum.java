
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para moduleInstallationTypeEnum.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="moduleInstallationTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BUILDING_INTEGRATED"/&gt;
 *     &lt;enumeration value="ROOF_MOUNTED"/&gt;
 *     &lt;enumeration value="FREE_STANDING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "moduleInstallationTypeEnum")
@XmlEnum
public enum ModuleInstallationTypeEnum {

    BUILDING_INTEGRATED,
    ROOF_MOUNTED,
    FREE_STANDING;

    public String value() {
        return name();
    }

    public static ModuleInstallationTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
