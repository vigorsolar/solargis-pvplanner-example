
package eu.geomodel.schema.ws.pvplanner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GeometryFixedOneAngle complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GeometryFixedOneAngle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://geomodel.eu/schema/common/pv}Geometry"&gt;
 *       &lt;attribute name="tilt" use="required" type="{http://geomodel.eu/schema/common/geo}inclination" /&gt;
 *       &lt;attribute name="azimuth" use="required" type="{http://geomodel.eu/schema/common/geo}azimuth" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeometryFixedOneAngle")
public class GeometryFixedOneAngle
    extends Geometry
{

    @XmlAttribute(name = "tilt", required = true)
    protected double tilt;
    @XmlAttribute(name = "azimuth", required = true)
    protected int azimuth;

    /**
     * Obtiene el valor de la propiedad tilt.
     * 
     */
    public double getTilt() {
        return tilt;
    }

    /**
     * Define el valor de la propiedad tilt.
     * 
     */
    public void setTilt(double value) {
        this.tilt = value;
    }

    /**
     * Obtiene el valor de la propiedad azimuth.
     * 
     */
    public int getAzimuth() {
        return azimuth;
    }

    /**
     * Define el valor de la propiedad azimuth.
     * 
     */
    public void setAzimuth(int value) {
        this.azimuth = value;
    }

}
