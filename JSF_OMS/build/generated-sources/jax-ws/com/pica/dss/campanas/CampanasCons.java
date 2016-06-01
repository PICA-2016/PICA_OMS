
package com.pica.dss.campanas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CampanasCons complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CampanasCons">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CampanaCons" type="{http://pica.com/dss/Campanas}CampanaCons" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampanasCons", propOrder = {
    "campanaCons"
})
public class CampanasCons {

    @XmlElement(name = "CampanaCons")
    protected List<CampanaCons> campanaCons;

    /**
     * Gets the value of the campanaCons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campanaCons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampanaCons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampanaCons }
     * 
     * 
     */
    public List<CampanaCons> getCampanaCons() {
        if (campanaCons == null) {
            campanaCons = new ArrayList<CampanaCons>();
        }
        return this.campanaCons;
    }

}
