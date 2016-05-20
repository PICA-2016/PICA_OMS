
package co.aes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.aes package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConsultarPRODUCTOSLISTAResponse_QNAME = new QName("http://servicioomsproductos.kallsonys.com/", "consultarPRODUCTOS_LISTAResponse");
    private final static QName _ConsultarPRODUCTOSIDResponse_QNAME = new QName("http://servicioomsproductos.kallsonys.com/", "consultarPRODUCTOS_IDResponse");
    private final static QName _ConsultarPRODUCTOSNOMBRE_QNAME = new QName("http://servicioomsproductos.kallsonys.com/", "consultarPRODUCTOS_NOMBRE");
    private final static QName _ConsultarPRODUCTOSLISTA_QNAME = new QName("http://servicioomsproductos.kallsonys.com/", "consultarPRODUCTOS_LISTA");
    private final static QName _ConsultarPRODUCTOSNOMBREResponse_QNAME = new QName("http://servicioomsproductos.kallsonys.com/", "consultarPRODUCTOS_NOMBREResponse");
    private final static QName _ConsultarPRODUCTOSDESCRIPCIONResponse_QNAME = new QName("http://servicioomsproductos.kallsonys.com/", "consultarPRODUCTOS_DESCRIPCIONResponse");
    private final static QName _ConsultarPRODUCTOSDESCRIPCION_QNAME = new QName("http://servicioomsproductos.kallsonys.com/", "consultarPRODUCTOS_DESCRIPCION");
    private final static QName _ConsultarPRODUCTOSID_QNAME = new QName("http://servicioomsproductos.kallsonys.com/", "consultarPRODUCTOS_ID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.aes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarPRODUCTOSID }
     * 
     */
    public ConsultarPRODUCTOSID createConsultarPRODUCTOSID() {
        return new ConsultarPRODUCTOSID();
    }

    /**
     * Create an instance of {@link ConsultarPRODUCTOSDESCRIPCIONResponse }
     * 
     */
    public ConsultarPRODUCTOSDESCRIPCIONResponse createConsultarPRODUCTOSDESCRIPCIONResponse() {
        return new ConsultarPRODUCTOSDESCRIPCIONResponse();
    }

    /**
     * Create an instance of {@link ConsultarPRODUCTOSDESCRIPCION }
     * 
     */
    public ConsultarPRODUCTOSDESCRIPCION createConsultarPRODUCTOSDESCRIPCION() {
        return new ConsultarPRODUCTOSDESCRIPCION();
    }

    /**
     * Create an instance of {@link ConsultarPRODUCTOSNOMBREResponse }
     * 
     */
    public ConsultarPRODUCTOSNOMBREResponse createConsultarPRODUCTOSNOMBREResponse() {
        return new ConsultarPRODUCTOSNOMBREResponse();
    }

    /**
     * Create an instance of {@link ConsultarPRODUCTOSLISTA }
     * 
     */
    public ConsultarPRODUCTOSLISTA createConsultarPRODUCTOSLISTA() {
        return new ConsultarPRODUCTOSLISTA();
    }

    /**
     * Create an instance of {@link ConsultarPRODUCTOSNOMBRE }
     * 
     */
    public ConsultarPRODUCTOSNOMBRE createConsultarPRODUCTOSNOMBRE() {
        return new ConsultarPRODUCTOSNOMBRE();
    }

    /**
     * Create an instance of {@link ConsultarPRODUCTOSIDResponse }
     * 
     */
    public ConsultarPRODUCTOSIDResponse createConsultarPRODUCTOSIDResponse() {
        return new ConsultarPRODUCTOSIDResponse();
    }

    /**
     * Create an instance of {@link ConsultarPRODUCTOSLISTAResponse }
     * 
     */
    public ConsultarPRODUCTOSLISTAResponse createConsultarPRODUCTOSLISTAResponse() {
        return new ConsultarPRODUCTOSLISTAResponse();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPRODUCTOSLISTAResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicioomsproductos.kallsonys.com/", name = "consultarPRODUCTOS_LISTAResponse")
    public JAXBElement<ConsultarPRODUCTOSLISTAResponse> createConsultarPRODUCTOSLISTAResponse(ConsultarPRODUCTOSLISTAResponse value) {
        return new JAXBElement<ConsultarPRODUCTOSLISTAResponse>(_ConsultarPRODUCTOSLISTAResponse_QNAME, ConsultarPRODUCTOSLISTAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPRODUCTOSIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicioomsproductos.kallsonys.com/", name = "consultarPRODUCTOS_IDResponse")
    public JAXBElement<ConsultarPRODUCTOSIDResponse> createConsultarPRODUCTOSIDResponse(ConsultarPRODUCTOSIDResponse value) {
        return new JAXBElement<ConsultarPRODUCTOSIDResponse>(_ConsultarPRODUCTOSIDResponse_QNAME, ConsultarPRODUCTOSIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPRODUCTOSNOMBRE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicioomsproductos.kallsonys.com/", name = "consultarPRODUCTOS_NOMBRE")
    public JAXBElement<ConsultarPRODUCTOSNOMBRE> createConsultarPRODUCTOSNOMBRE(ConsultarPRODUCTOSNOMBRE value) {
        return new JAXBElement<ConsultarPRODUCTOSNOMBRE>(_ConsultarPRODUCTOSNOMBRE_QNAME, ConsultarPRODUCTOSNOMBRE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPRODUCTOSLISTA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicioomsproductos.kallsonys.com/", name = "consultarPRODUCTOS_LISTA")
    public JAXBElement<ConsultarPRODUCTOSLISTA> createConsultarPRODUCTOSLISTA(ConsultarPRODUCTOSLISTA value) {
        return new JAXBElement<ConsultarPRODUCTOSLISTA>(_ConsultarPRODUCTOSLISTA_QNAME, ConsultarPRODUCTOSLISTA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPRODUCTOSNOMBREResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicioomsproductos.kallsonys.com/", name = "consultarPRODUCTOS_NOMBREResponse")
    public JAXBElement<ConsultarPRODUCTOSNOMBREResponse> createConsultarPRODUCTOSNOMBREResponse(ConsultarPRODUCTOSNOMBREResponse value) {
        return new JAXBElement<ConsultarPRODUCTOSNOMBREResponse>(_ConsultarPRODUCTOSNOMBREResponse_QNAME, ConsultarPRODUCTOSNOMBREResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPRODUCTOSDESCRIPCIONResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicioomsproductos.kallsonys.com/", name = "consultarPRODUCTOS_DESCRIPCIONResponse")
    public JAXBElement<ConsultarPRODUCTOSDESCRIPCIONResponse> createConsultarPRODUCTOSDESCRIPCIONResponse(ConsultarPRODUCTOSDESCRIPCIONResponse value) {
        return new JAXBElement<ConsultarPRODUCTOSDESCRIPCIONResponse>(_ConsultarPRODUCTOSDESCRIPCIONResponse_QNAME, ConsultarPRODUCTOSDESCRIPCIONResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPRODUCTOSDESCRIPCION }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicioomsproductos.kallsonys.com/", name = "consultarPRODUCTOS_DESCRIPCION")
    public JAXBElement<ConsultarPRODUCTOSDESCRIPCION> createConsultarPRODUCTOSDESCRIPCION(ConsultarPRODUCTOSDESCRIPCION value) {
        return new JAXBElement<ConsultarPRODUCTOSDESCRIPCION>(_ConsultarPRODUCTOSDESCRIPCION_QNAME, ConsultarPRODUCTOSDESCRIPCION.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPRODUCTOSID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicioomsproductos.kallsonys.com/", name = "consultarPRODUCTOS_ID")
    public JAXBElement<ConsultarPRODUCTOSID> createConsultarPRODUCTOSID(ConsultarPRODUCTOSID value) {
        return new JAXBElement<ConsultarPRODUCTOSID>(_ConsultarPRODUCTOSID_QNAME, ConsultarPRODUCTOSID.class, null, value);
    }

}
