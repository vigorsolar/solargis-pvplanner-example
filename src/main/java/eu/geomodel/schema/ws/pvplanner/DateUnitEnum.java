
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dateUnitEnum.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="dateUnitEnum"&gt;
 *   &lt;restriction base="{http://geomodel.eu/schema/common/types}timeUnitEnum"&gt;
 *     &lt;enumeration value="DAY"/&gt;
 *     &lt;enumeration value="WEEK"/&gt;
 *     &lt;enumeration value="MONTH"/&gt;
 *     &lt;enumeration value="YEAR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "dateUnitEnum", namespace = "http://geomodel.eu/schema/common/types")
@XmlEnum(TimeUnitEnum.class)
public enum DateUnitEnum {

    DAY,
    WEEK,
    MONTH,
    YEAR;

    public String value() {
        return name();
    }

    public static DateUnitEnum fromValue(String v) {
        return valueOf(v);
    }

}
