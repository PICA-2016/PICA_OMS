
package co.aes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultarPRODUCTOS_NOMBRE complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultarPRODUCTOS_NOMBRE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "consultarPRODUCTOS_NOMBRE", propOrder = {
    "nombre",
    "numeropagina",
    "tamanopagina"
})
public class ConsultarPRODUCTOSNOMBRE {

    @XmlElement(name = "NOMBRE")
    protected String nombre;
    @XmlElement(name = "NUMERO_PAGINA")
    protected int numeropagina;
    @XmlElement(name = "TAMANO_PAGINA")
    protected int tamanopagina;

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
     * Obtiene el valor de la propiedad numeropagina.
     * 
     */
    public int getNUMEROPAGINA() {
        return numeropagina;
    }

    /**
     * Define el valor de la propiedad numeropagina.
     * 
     */
    public void setNUMEROPAGINA(int value) {
        this.numeropagina = value;
    }

    /**
     * Obtiene el valor de la propiedad tamanopagina.
     * 
     */
    public int getTAMANOPAGINA() {
        return tamanopagina;
    }

    /**
     * Define el valor de la propiedad tamanopagina.
     * 
     */
    public void setTAMANOPAGINA(int value) {
        this.tamanopagina = value;
    }

}
