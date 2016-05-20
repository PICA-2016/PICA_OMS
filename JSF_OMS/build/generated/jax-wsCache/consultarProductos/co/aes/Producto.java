
package co.aes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para producto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="producto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CANTIDAD_REGISTROS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CATEGORIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESCRIPCION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FABRICANTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IMAGEN_URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRECIO_LISTA" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "producto", propOrder = {
    "cantidadregistros",
    "categoria",
    "descripcion",
    "fabricante",
    "id",
    "imagenurl",
    "nombre",
    "preciolista",
    "productoid"
})
public class Producto {

    @XmlElement(name = "CANTIDAD_REGISTROS")
    protected int cantidadregistros;
    @XmlElement(name = "CATEGORIA")
    protected String categoria;
    @XmlElement(name = "DESCRIPCION")
    protected String descripcion;
    @XmlElement(name = "FABRICANTE")
    protected String fabricante;
    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "IMAGEN_URL")
    protected String imagenurl;
    @XmlElement(name = "NOMBRE")
    protected String nombre;
    @XmlElement(name = "PRECIO_LISTA")
    protected int preciolista;
    @XmlElement(name = "PRODUCTO_ID")
    protected int productoid;

    /**
     * Obtiene el valor de la propiedad cantidadregistros.
     * 
     */
    public int getCANTIDADREGISTROS() {
        return cantidadregistros;
    }

    /**
     * Define el valor de la propiedad cantidadregistros.
     * 
     */
    public void setCANTIDADREGISTROS(int value) {
        this.cantidadregistros = value;
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
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setID(int value) {
        this.id = value;
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
     * Obtiene el valor de la propiedad preciolista.
     * 
     */
    public int getPRECIOLISTA() {
        return preciolista;
    }

    /**
     * Define el valor de la propiedad preciolista.
     * 
     */
    public void setPRECIOLISTA(int value) {
        this.preciolista = value;
    }

    /**
     * Obtiene el valor de la propiedad productoid.
     * 
     */
    public int getPRODUCTOID() {
        return productoid;
    }

    /**
     * Define el valor de la propiedad productoid.
     * 
     */
    public void setPRODUCTOID(int value) {
        this.productoid = value;
    }

}
