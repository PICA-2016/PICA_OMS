
package com.pica.dss.campanas;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CampanaInsert complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CampanaInsert">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDCAMPANA" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="CODRESPUESTA" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="MSNRESPUESTA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampanaInsert", propOrder = {
    "idcampana",
    "codrespuesta",
    "msnrespuesta"
})
public class CampanaInsert {

    @XmlElement(name = "IDCAMPANA", required = true, nillable = true)
    protected BigInteger idcampana;
    @XmlElement(name = "CODRESPUESTA", required = true, nillable = true)
    protected BigInteger codrespuesta;
    @XmlElement(name = "MSNRESPUESTA", required = true, nillable = true)
    protected String msnrespuesta;

    /**
     * Obtiene el valor de la propiedad idcampana.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIDCAMPANA() {
        return idcampana;
    }

    /**
     * Define el valor de la propiedad idcampana.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIDCAMPANA(BigInteger value) {
        this.idcampana = value;
    }

    /**
     * Obtiene el valor de la propiedad codrespuesta.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCODRESPUESTA() {
        return codrespuesta;
    }

    /**
     * Define el valor de la propiedad codrespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCODRESPUESTA(BigInteger value) {
        this.codrespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad msnrespuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSNRESPUESTA() {
        return msnrespuesta;
    }

    /**
     * Define el valor de la propiedad msnrespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSNRESPUESTA(String value) {
        this.msnrespuesta = value;
    }

}
