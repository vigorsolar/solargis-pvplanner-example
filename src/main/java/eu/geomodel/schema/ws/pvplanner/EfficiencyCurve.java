
package eu.geomodel.schema.ws.pvplanner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EfficiencyCurve complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EfficiencyCurve"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://geomodel.eu/schema/common/pv}Efficiency"&gt;
 *       &lt;attribute name="dataPairs" type="{http://geomodel.eu/schema/common/types}doublePairs" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EfficiencyCurve")
public class EfficiencyCurve
    extends Efficiency
{

    @XmlAttribute(name = "dataPairs")
    protected List<String> dataPairs;

    /**
     * Gets the value of the dataPairs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataPairs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataPairs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDataPairs() {
        if (dataPairs == null) {
            dataPairs = new ArrayList<String>();
        }
        return this.dataPairs;
    }

}
