
package com.pica.dss.campanas;

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
 *         &lt;element name="IDPRODUCTO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IDCAMPANA" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idproducto",
    "idcampana"
})
@XmlRootElement(name = "wsInsertaProductoCampana")
public class WsInsertaProductoCampana {

    @XmlElement(name = "IDPRODUCTO", required = true, type = Integer.class, nillable = true)
    protected Integer idproducto;
    @XmlElement(name = "IDCAMPANA", required = true, type = Integer.class, nillable = true)
    protected Integer idcampana;

    /**
     * Obtiene el valor de la propiedad idproducto.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDPRODUCTO() {
        return idproducto;
    }

    /**
     * Define el valor de la propiedad idproducto.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDPRODUCTO(Integer value) {
        this.idproducto = value;
    }

    /**
     * Obtiene el valor de la propiedad idcampana.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDCAMPANA() {
        return idcampana;
    }

    /**
     * Define el valor de la propiedad idcampana.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDCAMPANA(Integer value) {
        this.idcampana = value;
    }

}
