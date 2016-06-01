
package com.pica.dss.productos;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "consultasEspecialesProductos", targetNamespace = "http://pica.com/dss/Productos", wsdlLocation = "http://10.85.0.100:9763/services/consultasEspecialesProductos?wsdl")
public class ConsultasEspecialesProductos
    extends Service
{

    private final static URL CONSULTASESPECIALESPRODUCTOS_WSDL_LOCATION;
    private final static WebServiceException CONSULTASESPECIALESPRODUCTOS_EXCEPTION;
    private final static QName CONSULTASESPECIALESPRODUCTOS_QNAME = new QName("http://pica.com/dss/Productos", "consultasEspecialesProductos");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.85.0.100:9763/services/consultasEspecialesProductos?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONSULTASESPECIALESPRODUCTOS_WSDL_LOCATION = url;
        CONSULTASESPECIALESPRODUCTOS_EXCEPTION = e;
    }

    public ConsultasEspecialesProductos() {
        super(__getWsdlLocation(), CONSULTASESPECIALESPRODUCTOS_QNAME);
    }

    public ConsultasEspecialesProductos(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONSULTASESPECIALESPRODUCTOS_QNAME, features);
    }

    public ConsultasEspecialesProductos(URL wsdlLocation) {
        super(wsdlLocation, CONSULTASESPECIALESPRODUCTOS_QNAME);
    }

    public ConsultasEspecialesProductos(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONSULTASESPECIALESPRODUCTOS_QNAME, features);
    }

    public ConsultasEspecialesProductos(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultasEspecialesProductos(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ConsultasEspecialesProductosPortType
     */
    @WebEndpoint(name = "SecureSOAP11Endpoint")
    public ConsultasEspecialesProductosPortType getSecureSOAP11Endpoint() {
        return super.getPort(new QName("http://pica.com/dss/Productos", "SecureSOAP11Endpoint"), ConsultasEspecialesProductosPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultasEspecialesProductosPortType
     */
    @WebEndpoint(name = "SecureSOAP11Endpoint")
    public ConsultasEspecialesProductosPortType getSecureSOAP11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://pica.com/dss/Productos", "SecureSOAP11Endpoint"), ConsultasEspecialesProductosPortType.class, features);
    }

    /**
     * 
     * @return
     *     returns ConsultasEspecialesProductosPortType
     */
    @WebEndpoint(name = "SOAP11Endpoint")
    public ConsultasEspecialesProductosPortType getSOAP11Endpoint() {
        return super.getPort(new QName("http://pica.com/dss/Productos", "SOAP11Endpoint"), ConsultasEspecialesProductosPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultasEspecialesProductosPortType
     */
    @WebEndpoint(name = "SOAP11Endpoint")
    public ConsultasEspecialesProductosPortType getSOAP11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://pica.com/dss/Productos", "SOAP11Endpoint"), ConsultasEspecialesProductosPortType.class, features);
    }

    /**
     * 
     * @return
     *     returns ConsultasEspecialesProductosPortType
     */
    @WebEndpoint(name = "SecureSOAP12Endpoint")
    public ConsultasEspecialesProductosPortType getSecureSOAP12Endpoint() {
        return super.getPort(new QName("http://pica.com/dss/Productos", "SecureSOAP12Endpoint"), ConsultasEspecialesProductosPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultasEspecialesProductosPortType
     */
    @WebEndpoint(name = "SecureSOAP12Endpoint")
    public ConsultasEspecialesProductosPortType getSecureSOAP12Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://pica.com/dss/Productos", "SecureSOAP12Endpoint"), ConsultasEspecialesProductosPortType.class, features);
    }

    /**
     * 
     * @return
     *     returns ConsultasEspecialesProductosPortType
     */
    @WebEndpoint(name = "SOAP12Endpoint")
    public ConsultasEspecialesProductosPortType getSOAP12Endpoint() {
        return super.getPort(new QName("http://pica.com/dss/Productos", "SOAP12Endpoint"), ConsultasEspecialesProductosPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultasEspecialesProductosPortType
     */
    @WebEndpoint(name = "SOAP12Endpoint")
    public ConsultasEspecialesProductosPortType getSOAP12Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://pica.com/dss/Productos", "SOAP12Endpoint"), ConsultasEspecialesProductosPortType.class, features);
    }

    /**
     * 
     * @return
     *     returns ConsultasEspecialesProductosPortType
     */
    @WebEndpoint(name = "SecureHTTPEndpoint")
    public ConsultasEspecialesProductosPortType getSecureHTTPEndpoint() {
        return super.getPort(new QName("http://pica.com/dss/Productos", "SecureHTTPEndpoint"), ConsultasEspecialesProductosPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultasEspecialesProductosPortType
     */
    @WebEndpoint(name = "SecureHTTPEndpoint")
    public ConsultasEspecialesProductosPortType getSecureHTTPEndpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://pica.com/dss/Productos", "SecureHTTPEndpoint"), ConsultasEspecialesProductosPortType.class, features);
    }

    /**
     * 
     * @return
     *     returns ConsultasEspecialesProductosPortType
     */
    @WebEndpoint(name = "HTTPEndpoint")
    public ConsultasEspecialesProductosPortType getHTTPEndpoint() {
        return super.getPort(new QName("http://pica.com/dss/Productos", "HTTPEndpoint"), ConsultasEspecialesProductosPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultasEspecialesProductosPortType
     */
    @WebEndpoint(name = "HTTPEndpoint")
    public ConsultasEspecialesProductosPortType getHTTPEndpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://pica.com/dss/Productos", "HTTPEndpoint"), ConsultasEspecialesProductosPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONSULTASESPECIALESPRODUCTOS_EXCEPTION!= null) {
            throw CONSULTASESPECIALESPRODUCTOS_EXCEPTION;
        }
        return CONSULTASESPECIALESPRODUCTOS_WSDL_LOCATION;
    }

}
