
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
 *         &lt;element name="FECHAINI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FECHAFIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "fechaini",
    "fechafin"
})
@XmlRootElement(name = "wsRankingCategorias")
public class WsRankingCategorias {

    @XmlElement(name = "FECHAINI", required = true, nillable = true)
    protected String fechaini;
    @XmlElement(name = "FECHAFIN", required = true, nillable = true)
    protected String fechafin;

    /**
     * Obtiene el valor de la propiedad fechaini.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHAINI() {
        return fechaini;
    }

    /**
     * Define el valor de la propiedad fechaini.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHAINI(String value) {
        this.fechaini = value;
    }

    /**
     * Obtiene el valor de la propiedad fechafin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHAFIN() {
        return fechafin;
    }

    /**
     * Define el valor de la propiedad fechafin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHAFIN(String value) {
        this.fechafin = value;
    }

}
