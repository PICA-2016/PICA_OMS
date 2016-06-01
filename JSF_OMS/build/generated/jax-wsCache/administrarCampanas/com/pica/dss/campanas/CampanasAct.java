
package com.pica.dss.campanas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CampanasAct complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CampanasAct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CampanaAct" type="{http://pica.com/dss/Campanas}CampanaAct" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampanasAct", propOrder = {
    "campanaAct"
})
public class CampanasAct {

    @XmlElement(name = "CampanaAct")
    protected List<CampanaAct> campanaAct;

    /**
     * Gets the value of the campanaAct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campanaAct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampanaAct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampanaAct }
     * 
     * 
     */
    public List<CampanaAct> getCampanaAct() {
        if (campanaAct == null) {
            campanaAct = new ArrayList<CampanaAct>();
        }
        return this.campanaAct;
    }

}
