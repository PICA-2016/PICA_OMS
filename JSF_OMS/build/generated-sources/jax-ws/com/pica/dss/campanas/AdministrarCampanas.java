
package com.pica.dss.campanas;

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
@WebServiceClient(name = "administrarCampanas", targetNamespace = "http://pica.com/dss/Campanas", wsdlLocation = "http://10.85.0.100:9766/services/administrarCampanas?wsdl")
public class AdministrarCampanas
    extends Service
{

    private final static URL ADMINISTRARCAMPANAS_WSDL_LOCATION;
    private final static WebServiceException ADMINISTRARCAMPANAS_EXCEPTION;
    private final static QName ADMINISTRARCAMPANAS_QNAME = new QName("http://pica.com/dss/Campanas", "administrarCampanas");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.85.0.100:9766/services/administrarCampanas?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADMINISTRARCAMPANAS_WSDL_LOCATION = url;
        ADMINISTRARCAMPANAS_EXCEPTION = e;
    }

    public AdministrarCampanas() {
        super(__getWsdlLocation(), ADMINISTRARCAMPANAS_QNAME);
    }

    public AdministrarCampanas(WebServiceFeature... features) {
        super(__getWsdlLocation(), ADMINISTRARCAMPANAS_QNAME, features);
    }

    public AdministrarCampanas(URL wsdlLocation) {
        super(wsdlLocation, ADMINISTRARCAMPANAS_QNAME);
    }

    public AdministrarCampanas(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ADMINISTRARCAMPANAS_QNAME, features);
    }

    public AdministrarCampanas(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AdministrarCampanas(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AdministrarCampanasPortType
     */
    @WebEndpoint(name = "SOAP11Endpoint")
    public AdministrarCampanasPortType getSOAP11Endpoint() {
        return super.getPort(new QName("http://pica.com/dss/Campanas", "SOAP11Endpoint"), AdministrarCampanasPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdministrarCampanasPortType
     */
    @WebEndpoint(name = "SOAP11Endpoint")
    public AdministrarCampanasPortType getSOAP11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://pica.com/dss/Campanas", "SOAP11Endpoint"), AdministrarCampanasPortType.class, features);
    }

    /**
     * 
     * @return
     *     returns AdministrarCampanasPortType
     */
    @WebEndpoint(name = "SecureSOAP11Endpoint")
    public AdministrarCampanasPortType getSecureSOAP11Endpoint() {
        return super.getPort(new QName("http://pica.com/dss/Campanas", "SecureSOAP11Endpoint"), AdministrarCampanasPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdministrarCampanasPortType
     */
    @WebEndpoint(name = "SecureSOAP11Endpoint")
    public AdministrarCampanasPortType getSecureSOAP11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://pica.com/dss/Campanas", "SecureSOAP11Endpoint"), AdministrarCampanasPortType.class, features);
    }

    /**
     * 
     * @return
     *     returns AdministrarCampanasPortType
     */
    @WebEndpoint(name = "SecureSOAP12Endpoint")
    public AdministrarCampanasPortType getSecureSOAP12Endpoint() {
        return super.getPort(new QName("http://pica.com/dss/Campanas", "SecureSOAP12Endpoint"), AdministrarCampanasPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdministrarCampanasPortType
     */
    @WebEndpoint(name = "SecureSOAP12Endpoint")
    public AdministrarCampanasPortType getSecureSOAP12Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://pica.com/dss/Campanas", "SecureSOAP12Endpoint"), AdministrarCampanasPortType.class, features);
    }

    /**
     * 
     * @return
     *     returns AdministrarCampanasPortType
     */
    @WebEndpoint(name = "SOAP12Endpoint")
    public AdministrarCampanasPortType getSOAP12Endpoint() {
        return super.getPort(new QName("http://pica.com/dss/Campanas", "SOAP12Endpoint"), AdministrarCampanasPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdministrarCampanasPortType
     */
    @WebEndpoint(name = "SOAP12Endpoint")
    public AdministrarCampanasPortType getSOAP12Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://pica.com/dss/Campanas", "SOAP12Endpoint"), AdministrarCampanasPortType.class, features);
    }

    /**
     * 
     * @return
     *     returns AdministrarCampanasPortType
     */
    @WebEndpoint(name = "HTTPEndpoint")
    public AdministrarCampanasPortType getHTTPEndpoint() {
        return super.getPort(new QName("http://pica.com/dss/Campanas", "HTTPEndpoint"), AdministrarCampanasPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdministrarCampanasPortType
     */
    @WebEndpoint(name = "HTTPEndpoint")
    public AdministrarCampanasPortType getHTTPEndpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://pica.com/dss/Campanas", "HTTPEndpoint"), AdministrarCampanasPortType.class, features);
    }

    /**
     * 
     * @return
     *     returns AdministrarCampanasPortType
     */
    @WebEndpoint(name = "SecureHTTPEndpoint")
    public AdministrarCampanasPortType getSecureHTTPEndpoint() {
        return super.getPort(new QName("http://pica.com/dss/Campanas", "SecureHTTPEndpoint"), AdministrarCampanasPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdministrarCampanasPortType
     */
    @WebEndpoint(name = "SecureHTTPEndpoint")
    public AdministrarCampanasPortType getSecureHTTPEndpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://pica.com/dss/Campanas", "SecureHTTPEndpoint"), AdministrarCampanasPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADMINISTRARCAMPANAS_EXCEPTION!= null) {
            throw ADMINISTRARCAMPANAS_EXCEPTION;
        }
        return ADMINISTRARCAMPANAS_WSDL_LOCATION;
    }

}
