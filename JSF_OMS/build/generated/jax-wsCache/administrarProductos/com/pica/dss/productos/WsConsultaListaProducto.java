
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
 *         &lt;element name="NUMERO_PAGINA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TAMANO_PAGINA" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "numeropagina",
    "tamanopagina"
})
@XmlRootElement(name = "wsConsultaListaProducto")
public class WsConsultaListaProducto {

    @XmlElement(name = "NUMERO_PAGINA", required = true, type = Integer.class, nillable = true)
    protected Integer numeropagina;
    @XmlElement(name = "TAMANO_PAGINA", required = true, type = Integer.class, nillable = true)
    protected Integer tamanopagina;

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
