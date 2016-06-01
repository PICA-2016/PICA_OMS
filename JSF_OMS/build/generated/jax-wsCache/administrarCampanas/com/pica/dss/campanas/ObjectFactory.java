
package com.pica.dss.campanas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pica.dss.campanas package. 
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

    private final static QName _CampanasAct_QNAME = new QName("http://pica.com/dss/Campanas", "CampanasAct");
    private final static QName _CampanasCons_QNAME = new QName("http://pica.com/dss/Campanas", "CampanasCons");
    private final static QName _CampanasInsert_QNAME = new QName("http://pica.com/dss/Campanas", "CampanasInsert");
    private final static QName _CampanasConXPro_QNAME = new QName("http://pica.com/dss/Campanas", "CampanasConXPro");
    private final static QName _CampanasInsPC_QNAME = new QName("http://pica.com/dss/Campanas", "CampanasInsPC");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pica.dss.campanas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CampanasConXPro }
     * 
     */
    public CampanasConXPro createCampanasConXPro() {
        return new CampanasConXPro();
    }

    /**
     * Create an instance of {@link WsActualizarCampana }
     * 
     */
    public WsActualizarCampana createWsActualizarCampana() {
        return new WsActualizarCampana();
    }

    /**
     * Create an instance of {@link WsInsertarCampana }
     * 
     */
    public WsInsertarCampana createWsInsertarCampana() {
        return new WsInsertarCampana();
    }

    /**
     * Create an instance of {@link CampanasInsPC }
     * 
     */
    public CampanasInsPC createCampanasInsPC() {
        return new CampanasInsPC();
    }

    /**
     * Create an instance of {@link WsConsultaCampana }
     * 
     */
    public WsConsultaCampana createWsConsultaCampana() {
        return new WsConsultaCampana();
    }

    /**
     * Create an instance of {@link CampanasAct }
     * 
     */
    public CampanasAct createCampanasAct() {
        return new CampanasAct();
    }

    /**
     * Create an instance of {@link WsConsultarProductosXCampana }
     * 
     */
    public WsConsultarProductosXCampana createWsConsultarProductosXCampana() {
        return new WsConsultarProductosXCampana();
    }

    /**
     * Create an instance of {@link CampanasCons }
     * 
     */
    public CampanasCons createCampanasCons() {
        return new CampanasCons();
    }

    /**
     * Create an instance of {@link WsInsertaProductoCampana }
     * 
     */
    public WsInsertaProductoCampana createWsInsertaProductoCampana() {
        return new WsInsertaProductoCampana();
    }

    /**
     * Create an instance of {@link CampanasInsert }
     * 
     */
    public CampanasInsert createCampanasInsert() {
        return new CampanasInsert();
    }

    /**
     * Create an instance of {@link CampanaCons }
     * 
     */
    public CampanaCons createCampanaCons() {
        return new CampanaCons();
    }

    /**
     * Create an instance of {@link CampanaConXPro }
     * 
     */
    public CampanaConXPro createCampanaConXPro() {
        return new CampanaConXPro();
    }

    /**
     * Create an instance of {@link CampanaAct }
     * 
     */
    public CampanaAct createCampanaAct() {
        return new CampanaAct();
    }

    /**
     * Create an instance of {@link CampanaInsPC }
     * 
     */
    public CampanaInsPC createCampanaInsPC() {
        return new CampanaInsPC();
    }

    /**
     * Create an instance of {@link CampanaInsert }
     * 
     */
    public CampanaInsert createCampanaInsert() {
        return new CampanaInsert();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampanasAct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pica.com/dss/Campanas", name = "CampanasAct")
    public JAXBElement<CampanasAct> createCampanasAct(CampanasAct value) {
        return new JAXBElement<CampanasAct>(_CampanasAct_QNAME, CampanasAct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampanasCons }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pica.com/dss/Campanas", name = "CampanasCons")
    public JAXBElement<CampanasCons> createCampanasCons(CampanasCons value) {
        return new JAXBElement<CampanasCons>(_CampanasCons_QNAME, CampanasCons.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampanasInsert }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pica.com/dss/Campanas", name = "CampanasInsert")
    public JAXBElement<CampanasInsert> createCampanasInsert(CampanasInsert value) {
        return new JAXBElement<CampanasInsert>(_CampanasInsert_QNAME, CampanasInsert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampanasConXPro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pica.com/dss/Campanas", name = "CampanasConXPro")
    public JAXBElement<CampanasConXPro> createCampanasConXPro(CampanasConXPro value) {
        return new JAXBElement<CampanasConXPro>(_CampanasConXPro_QNAME, CampanasConXPro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampanasInsPC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pica.com/dss/Campanas", name = "CampanasInsPC")
    public JAXBElement<CampanasInsPC> createCampanasInsPC(CampanasInsPC value) {
        return new JAXBElement<CampanasInsPC>(_CampanasInsPC_QNAME, CampanasInsPC.class, null, value);
    }

}
