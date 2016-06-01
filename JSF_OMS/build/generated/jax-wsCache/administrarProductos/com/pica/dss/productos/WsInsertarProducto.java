
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
 *         &lt;element name="NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DESCRIPCION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CATEGORIA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PRECIO_LISTA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FABRICANTE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IMAGEN_URL" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "nombre",
    "descripcion",
    "categoria",
    "preciolista",
    "fabricante",
    "imagenurl"
})
@XmlRootElement(name = "wsInsertarProducto")
public class WsInsertarProducto {

    @XmlElement(name = "NOMBRE", required = true, nillable = true)
    protected String nombre;
    @XmlElement(name = "DESCRIPCION", required = true, nillable = true)
    protected String descripcion;
    @XmlElement(name = "CATEGORIA", required = true, nillable = true)
    protected String categoria;
    @XmlElement(name = "PRECIO_LISTA", required = true, type = Integer.class, nillable = true)
    protected Integer preciolista;
    @XmlElement(name = "FABRICANTE", required = true, nillable = true)
    protected String fabricante;
    @XmlElement(name = "IMAGEN_URL", required = true, nillable = true)
    protected String imagenurl;

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
     * Obtiene el valor de la propiedad categoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATEGORIA() {
        return categoria;
    }

    /**
     * Define el valor de la propiedad categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATEGORIA(String value) {
        this.categoria = value;
    }

    /**
     * Obtiene el valor de la propiedad preciolista.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPRECIOLISTA() {
        return preciolista;
    }

    /**
     * Define el valor de la propiedad preciolista.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPRECIOLISTA(Integer value) {
        this.preciolista = value;
    }

    /**
     * Obtiene el valor de la propiedad fabricante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFABRICANTE() {
        return fabricante;
    }

    /**
     * Define el valor de la propiedad fabricante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFABRICANTE(String value) {
        this.fabricante = value;
    }

    /**
     * Obtiene el valor de la propiedad imagenurl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMAGENURL() {
        return imagenurl;
    }

    /**
     * Define el valor de la propiedad imagenurl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMAGENURL(String value) {
        this.imagenurl = value;
    }

}
