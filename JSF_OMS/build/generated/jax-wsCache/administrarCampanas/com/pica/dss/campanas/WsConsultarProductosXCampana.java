
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
 *         &lt;element name="IDCAMPANA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ESTADO" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "idcampana",
    "estado"
})
@XmlRootElement(name = "wsConsultarProductosXCampana")
public class WsConsultarProductosXCampana {

    @XmlElement(name = "IDCAMPANA", required = true, type = Integer.class, nillable = true)
    protected Integer idcampana;
    @XmlElement(name = "ESTADO", required = true, nillable = true)
    protected String estado;

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

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESTADO() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESTADO(String value) {
        this.estado = value;
    }

}
