
package com.pica.dss.productos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pica.dss.productos package. 
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

    private final static QName _ConsultaProtosXDes_QNAME = new QName("http://pica.com/dss/Productos", "ConsultaProtosXDes");
    private final static QName _ConsultaProsXNombre_QNAME = new QName("http://pica.com/dss/Productos", "ConsultaProsXNombre");
    private final static QName _RankingProductos_QNAME = new QName("http://pica.com/dss/Productos", "RankingProductos");
    private final static QName _ConsultaProductosXID_QNAME = new QName("http://pica.com/dss/Productos", "ConsultaProductosXID");
    private final static QName _RankingCategorias_QNAME = new QName("http://pica.com/dss/Productos", "RankingCategorias");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pica.dss.productos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WsBuscarProductosXDescripcion }
     * 
     */
    public WsBuscarProductosXDescripcion createWsBuscarProductosXDescripcion() {
        return new WsBuscarProductosXDescripcion();
    }

    /**
     * Create an instance of {@link ConsultaProtosXDes }
     * 
     */
    public ConsultaProtosXDes createConsultaProtosXDes() {
        return new ConsultaProtosXDes();
    }

    /**
     * Create an instance of {@link WsBuscarproductosXNombre }
     * 
     */
    public WsBuscarproductosXNombre createWsBuscarproductosXNombre() {
        return new WsBuscarproductosXNombre();
    }

    /**
     * Create an instance of {@link ConsultaProsXNombre }
     * 
     */
    public ConsultaProsXNombre createConsultaProsXNombre() {
        return new ConsultaProsXNombre();
    }

    /**
     * Create an instance of {@link WsRankingProductos }
     * 
     */
    public WsRankingProductos createWsRankingProductos() {
        return new WsRankingProductos();
    }

    /**
     * Create an instance of {@link RankingProductos }
     * 
     */
    public RankingProductos createRankingProductos() {
        return new RankingProductos();
    }

    /**
     * Create an instance of {@link WsBuscarproductoXID }
     * 
     */
    public WsBuscarproductoXID createWsBuscarproductoXID() {
        return new WsBuscarproductoXID();
    }

    /**
     * Create an instance of {@link ConsultaProductosXID }
     * 
     */
    public ConsultaProductosXID createConsultaProductosXID() {
        return new ConsultaProductosXID();
    }

    /**
     * Create an instance of {@link WsRankingCategorias }
     * 
     */
    public WsRankingCategorias createWsRankingCategorias() {
        return new WsRankingCategorias();
    }

    /**
     * Create an instance of {@link RankingCategorias }
     * 
     */
    public RankingCategorias createRankingCategorias() {
        return new RankingCategorias();
    }

    /**
     * Create an instance of {@link ConsultaProXDes }
     * 
     */
    public ConsultaProXDes createConsultaProXDes() {
        return new ConsultaProXDes();
    }

    /**
     * Create an instance of {@link ConsultaProXNombre }
     * 
     */
    public ConsultaProXNombre createConsultaProXNombre() {
        return new ConsultaProXNombre();
    }

    /**
     * Create an instance of {@link RankingProducto }
     * 
     */
    public RankingProducto createRankingProducto() {
        return new RankingProducto();
    }

    /**
     * Create an instance of {@link ConsultaProductoXID }
     * 
     */
    public ConsultaProductoXID createConsultaProductoXID() {
        return new ConsultaProductoXID();
    }

    /**
     * Create an instance of {@link RankingCategoria }
     * 
     */
    public RankingCategoria createRankingCategoria() {
        return new RankingCategoria();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaProtosXDes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pica.com/dss/Productos", name = "ConsultaProtosXDes")
    public JAXBElement<ConsultaProtosXDes> createConsultaProtosXDes(ConsultaProtosXDes value) {
        return new JAXBElement<ConsultaProtosXDes>(_ConsultaProtosXDes_QNAME, ConsultaProtosXDes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaProsXNombre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pica.com/dss/Productos", name = "ConsultaProsXNombre")
    public JAXBElement<ConsultaProsXNombre> createConsultaProsXNombre(ConsultaProsXNombre value) {
        return new JAXBElement<ConsultaProsXNombre>(_ConsultaProsXNombre_QNAME, ConsultaProsXNombre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RankingProductos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pica.com/dss/Productos", name = "RankingProductos")
    public JAXBElement<RankingProductos> createRankingProductos(RankingProductos value) {
        return new JAXBElement<RankingProductos>(_RankingProductos_QNAME, RankingProductos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaProductosXID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pica.com/dss/Productos", name = "ConsultaProductosXID")
    public JAXBElement<ConsultaProductosXID> createConsultaProductosXID(ConsultaProductosXID value) {
        return new JAXBElement<ConsultaProductosXID>(_ConsultaProductosXID_QNAME, ConsultaProductosXID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RankingCategorias }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pica.com/dss/Productos", name = "RankingCategorias")
    public JAXBElement<RankingCategorias> createRankingCategorias(RankingCategorias value) {
        return new JAXBElement<RankingCategorias>(_RankingCategorias_QNAME, RankingCategorias.class, null, value);
    }

}
