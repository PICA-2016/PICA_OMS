
package com.pica.dss.productos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultaProductosXID complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultaProductosXID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsultaProductoXID" type="{http://pica.com/dss/Productos}ConsultaProductoXID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaProductosXID", propOrder = {
    "consultaProductoXID"
})
public class ConsultaProductosXID {

    @XmlElement(name = "ConsultaProductoXID")
    protected List<ConsultaProductoXID> consultaProductoXID;

    /**
     * Gets the value of the consultaProductoXID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consultaProductoXID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsultaProductoXID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultaProductoXID }
     * 
     * 
     */
    public List<ConsultaProductoXID> getConsultaProductoXID() {
        if (consultaProductoXID == null) {
            consultaProductoXID = new ArrayList<ConsultaProductoXID>();
        }
        return this.consultaProductoXID;
    }

}
