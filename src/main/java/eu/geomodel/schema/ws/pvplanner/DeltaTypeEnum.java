
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DeltaTypeEnum.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="DeltaTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="KM"/&gt;
 *     &lt;enumeration value="DEG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeltaTypeEnum", namespace = "http://geomodel.eu/schema/common/geo")
@XmlEnum
public enum DeltaTypeEnum {

    KM,
    DEG;

    public String value() {
        return name();
    }

    public static DeltaTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
