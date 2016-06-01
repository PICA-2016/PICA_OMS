
package com.pica.dss.productos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PRODUCTO_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "productoid"
})
@XmlRootElement(name = "wsBuscarproductoXID")
public class WsBuscarproductoXID {

    @XmlElement(name = "PRODUCTO_ID", required = true, type = Integer.class, nillable = true)
    protected Integer productoid;

    /**
     * Obtiene el valor de la propiedad productoid.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPRODUCTOID() {
        return productoid;
    }

    /**
     * Define el valor de la propiedad productoid.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPRODUCTOID(Integer value) {
        this.productoid = value;
    }

}
