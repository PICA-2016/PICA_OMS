
package com.pica.dss.productos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RankingProductos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RankingProductos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RankingProducto" type="{http://pica.com/dss/Productos}RankingProducto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RankingProductos", propOrder = {
    "rankingProducto"
})
public class RankingProductos {

    @XmlElement(name = "RankingProducto")
    protected List<RankingProducto> rankingProducto;

    /**
     * Gets the value of the rankingProducto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rankingProducto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRankingProducto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RankingProducto }
     * 
     * 
     */
    public List<RankingProducto> getRankingProducto() {
        if (rankingProducto == null) {
            rankingProducto = new ArrayList<RankingProducto>();
        }
        return this.rankingProducto;
    }

}
