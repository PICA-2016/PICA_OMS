
package com.pica.dss.campanas;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para CampanaCons complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CampanaCons">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDCAMPANA" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DESCRIPCION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FECHAINI" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FECHAVENCIMIENTO" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
@XmlType(name = "CampanaCons", propOrder = {
    "idcampana",
    "nombre",
    "descripcion",
    "fechaini",
    "fechavencimiento",
    "estado"
})
public class CampanaCons {

    @XmlElement(name = "IDCAMPANA", required = true, nillable = true)
    protected BigInteger idcampana;
    @XmlElement(name = "NOMBRE", required = true, nillable = true)
    protected String nombre;
    @XmlElement(name = "DESCRIPCION", required = true, nillable = true)
    protected String descripcion;
    @XmlElement(name = "FECHAINI", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaini;
    @XmlElement(name = "FECHAVENCIMIENTO", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechavencimiento;
    @XmlElement(name = "ESTADO", required = true, nillable = true)
    protected String estado;

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
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBRE() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBRE(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPCION() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPCION(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaini.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHAINI() {
        return fechaini;
    }

    /**
     * Define el valor de la propiedad fechaini.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHAINI(XMLGregorianCalendar value) {
        this.fechaini = value;
    }

    /**
     * Obtiene el valor de la propiedad fechavencimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHAVENCIMIENTO() {
        return fechavencimiento;
    }

    /**
     * Define el valor de la propiedad fechavencimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHAVENCIMIENTO(XMLGregorianCalendar value) {
        this.fechavencimiento = value;
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
