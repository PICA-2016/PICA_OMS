
package co.aes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultarPRODUCTOS_LISTA complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultarPRODUCTOS_LISTA">
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
@XmlType(name = "consultarPRODUCTOS_LISTA", propOrder = {
    "numeropagina",
    "tamanopagina"
})
public class ConsultarPRODUCTOSLISTA {

    @XmlElement(name = "NUMERO_PAGINA")
    protected int numeropagina;
    @XmlElement(name = "TAMANO_PAGINA")
    protected int tamanopagina;

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
