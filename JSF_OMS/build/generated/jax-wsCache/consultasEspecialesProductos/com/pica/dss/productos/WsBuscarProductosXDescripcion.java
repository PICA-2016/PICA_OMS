
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DESCRIPCION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NUMERO_PAGINA" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TAMANO_PAGINA" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "descripcion",
    "numeropagina",
    "tamanopagina"
})
@XmlRootElement(name = "wsBuscarProductosXDescripcion")
public class WsBuscarProductosXDescripcion {

    @XmlElement(name = "DESCRIPCION", required = true, nillable = true)
    protected String descripcion;
    @XmlElement(name = "NUMERO_PAGINA", required = true, type = Integer.class, nillable = true)
    protected Integer numeropagina;
    @XmlElement(name = "TAMANO_PAGINA", required = true, type = Integer.class, nillable = true)
    protected Integer tamanopagina;

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
     * Obtiene el valor de la propiedad numeropagina.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNUMEROPAGINA() {
        return numeropagina;
    }

    /**
     * Define el valor de la propiedad numeropagina.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNUMEROPAGINA(Integer value) {
        this.numeropagina = value;
    }

    /**
     * Obtiene el valor de la propiedad tamanopagina.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTAMANOPAGINA() {
        return tamanopagina;
    }

    /**
     * Define el valor de la propiedad tamanopagina.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTAMANOPAGINA(Integer value) {
        this.tamanopagina = value;
    }

}
