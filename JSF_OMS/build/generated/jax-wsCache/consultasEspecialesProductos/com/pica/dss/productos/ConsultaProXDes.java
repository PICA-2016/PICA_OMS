
package com.pica.dss.productos;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultaProXDes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultaProXDes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CANTIDAD_REGISTROS" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="PRODUCTO_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DESCRIPCION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CATEGORIA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PRECIO_LISTA" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="FABRICANTE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IMAGEN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IMAGEN_URL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaProXDes", propOrder = {
    "cantidadregistros",
    "id",
    "productoid",
    "nombre",
    "descripcion",
    "categoria",
    "preciolista",
    "fabricante",
    "imagen",
    "imagenurl"
})
public class ConsultaProXDes {

    @XmlElement(name = "CANTIDAD_REGISTROS", required = true, nillable = true)
    protected BigInteger cantidadregistros;
    @XmlElement(name = "ID", required = true, nillable = true)
    protected BigInteger id;
    @XmlElement(name = "PRODUCTO_ID", required = true, nillable = true)
    protected BigInteger productoid;
    @XmlElement(name = "NOMBRE", required = true, nillable = true)
    protected String nombre;
    @XmlElement(name = "DESCRIPCION", required = true, nillable = true)
    protected String descripcion;
    @XmlElement(name = "CATEGORIA", required = true, nillable = true)
    protected String categoria;
    @XmlElement(name = "PRECIO_LISTA", required = true, nillable = true)
    protected BigInteger preciolista;
    @XmlElement(name = "FABRICANTE", required = true, nillable = true)
    protected String fabricante;
    @XmlElement(name = "IMAGEN", required = true, nillable = true)
    protected String imagen;
    @XmlElement(name = "IMAGEN_URL", required = true, nillable = true)
    protected String imagenurl;

    /**
     * Obtiene el valor de la propiedad cantidadregistros.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCANTIDADREGISTROS() {
        return cantidadregistros;
    }

    /**
     * Define el valor de la propiedad cantidadregistros.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCANTIDADREGISTROS(BigInteger value) {
        this.cantidadregistros = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getID() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setID(BigInteger value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad productoid.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPRODUCTOID() {
        return productoid;
    }

    /**
     * Define el valor de la propiedad productoid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPRODUCTOID(BigInteger value) {
        this.productoid = value;
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
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPRECIOLISTA() {
        return preciolista;
    }

    /**
     * Define el valor de la propiedad preciolista.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPRECIOLISTA(BigInteger value) {
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
     * Obtiene el valor de la propiedad imagen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMAGEN() {
        return imagen;
    }

    /**
     * Define el valor de la propiedad imagen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMAGEN(String value) {
        this.imagen = value;
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
