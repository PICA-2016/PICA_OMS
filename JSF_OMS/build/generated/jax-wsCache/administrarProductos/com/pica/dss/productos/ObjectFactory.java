
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

    private final static QName _GrpProductos_QNAME = new QName("http://pica.com/dss/Productos", "grpProductos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pica.dss.productos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WsActualizarProducto }
     * 
     */
    public WsActualizarProducto createWsActualizarProducto() {
        return new WsActualizarProducto();
    }

    /**
     * Create an instance of {@link GrpProductos }
     * 
     */
    public GrpProductos createGrpProductos() {
        return new GrpProductos();
    }

    /**
     * Create an instance of {@link WsConsultaListaProducto }
     * 
     */
    public WsConsultaListaProducto createWsConsultaListaProducto() {
        return new WsConsultaListaProducto();
    }

    /**
     * Create an instance of {@link WsInsertarProducto }
     * 
     */
    public WsInsertarProducto createWsInsertarProducto() {
        return new WsInsertarProducto();
    }

    /**
     * Create an instance of {@link WsEliminarProducto }
     * 
     */
    public WsEliminarProducto createWsEliminarProducto() {
        return new WsEliminarProducto();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrpProductos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pica.com/dss/Productos", name = "grpProductos")
    public JAXBElement<GrpProductos> createGrpProductos(GrpProductos value) {
        return new JAXBElement<GrpProductos>(_GrpProductos_QNAME, GrpProductos.class, null, value);
    }

}
