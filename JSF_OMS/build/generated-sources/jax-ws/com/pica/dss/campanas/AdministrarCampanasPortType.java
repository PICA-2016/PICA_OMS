
package com.pica.dss.campanas;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "administrarCampanasPortType", targetNamespace = "http://pica.com/dss/Campanas")
@XmlSeeAlso({
    org.wso2.ws.dataservice.ObjectFactory.class,
    com.pica.dss.campanas.ObjectFactory.class
})
public interface AdministrarCampanasPortType {


    /**
     * 
     * @param idcampana
     * @param idproducto
     * @return
     *     returns java.util.List<com.pica.dss.campanas.CampanaInsPC>
     * @throws DataServiceFault
     */
    @WebMethod(action = "urn:wsInsertaProductoCampana")
    @WebResult(name = "CampanaInsPC", targetNamespace = "http://pica.com/dss/Campanas")
    @RequestWrapper(localName = "wsInsertaProductoCampana", targetNamespace = "http://pica.com/dss/Campanas", className = "com.pica.dss.campanas.WsInsertaProductoCampana")
    @ResponseWrapper(localName = "CampanasInsPC", targetNamespace = "http://pica.com/dss/Campanas", className = "com.pica.dss.campanas.CampanasInsPC")
    public List<CampanaInsPC> wsInsertaProductoCampana(
        @WebParam(name = "IDPRODUCTO", targetNamespace = "http://pica.com/dss/Campanas")
        Integer idproducto,
        @WebParam(name = "IDCAMPANA", targetNamespace = "http://pica.com/dss/Campanas")
        Integer idcampana)
        throws DataServiceFault
    ;

    /**
     * 
     * @param fechaini
     * @param nombre
     * @param fechavencimiento
     * @param estado
     * @param descripcion
     * @return
     *     returns java.util.List<com.pica.dss.campanas.CampanaInsert>
     * @throws DataServiceFault
     */
    @WebMethod(action = "urn:wsInsertarCampana")
    @WebResult(name = "CampanaInsert", targetNamespace = "http://pica.com/dss/Campanas")
    @RequestWrapper(localName = "wsInsertarCampana", targetNamespace = "http://pica.com/dss/Campanas", className = "com.pica.dss.campanas.WsInsertarCampana")
    @ResponseWrapper(localName = "CampanasInsert", targetNamespace = "http://pica.com/dss/Campanas", className = "com.pica.dss.campanas.CampanasInsert")
    public List<CampanaInsert> wsInsertarCampana(
        @WebParam(name = "NOMBRE", targetNamespace = "http://pica.com/dss/Campanas")
        String nombre,
        @WebParam(name = "DESCRIPCION", targetNamespace = "http://pica.com/dss/Campanas")
        String descripcion,
        @WebParam(name = "FECHAINI", targetNamespace = "http://pica.com/dss/Campanas")
        String fechaini,
        @WebParam(name = "FECHAVENCIMIENTO", targetNamespace = "http://pica.com/dss/Campanas")
        String fechavencimiento,
        @WebParam(name = "ESTADO", targetNamespace = "http://pica.com/dss/Campanas")
        String estado)
        throws DataServiceFault
    ;

    /**
     * 
     * @param estado
     * @param idcampana
     * @return
     *     returns java.util.List<com.pica.dss.campanas.CampanaConXPro>
     * @throws DataServiceFault
     */
    @WebMethod(action = "urn:wsConsultarProductosXCampana")
    @WebResult(name = "CampanaConXPro", targetNamespace = "http://pica.com/dss/Campanas")
    @RequestWrapper(localName = "wsConsultarProductosXCampana", targetNamespace = "http://pica.com/dss/Campanas", className = "com.pica.dss.campanas.WsConsultarProductosXCampana")
    @ResponseWrapper(localName = "CampanasConXPro", targetNamespace = "http://pica.com/dss/Campanas", className = "com.pica.dss.campanas.CampanasConXPro")
    public List<CampanaConXPro> wsConsultarProductosXCampana(
        @WebParam(name = "IDCAMPANA", targetNamespace = "http://pica.com/dss/Campanas")
        Integer idcampana,
        @WebParam(name = "ESTADO", targetNamespace = "http://pica.com/dss/Campanas")
        String estado)
        throws DataServiceFault
    ;

    /**
     * 
     * @param estado
     * @return
     *     returns java.util.List<com.pica.dss.campanas.CampanaCons>
     * @throws DataServiceFault
     */
    @WebMethod(action = "urn:wsConsultaCampana")
    @WebResult(name = "CampanaCons", targetNamespace = "http://pica.com/dss/Campanas")
    @RequestWrapper(localName = "wsConsultaCampana", targetNamespace = "http://pica.com/dss/Campanas", className = "com.pica.dss.campanas.WsConsultaCampana")
    @ResponseWrapper(localName = "CampanasCons", targetNamespace = "http://pica.com/dss/Campanas", className = "com.pica.dss.campanas.CampanasCons")
    public List<CampanaCons> wsConsultaCampana(
        @WebParam(name = "ESTADO", targetNamespace = "http://pica.com/dss/Campanas")
        String estado)
        throws DataServiceFault
    ;

    /**
     * 
     * @param nombre
     * @param fechavencimiento
     * @param estado
     * @param idcampana
     * @param descripcion
     * @return
     *     returns java.util.List<com.pica.dss.campanas.CampanaAct>
     * @throws DataServiceFault
     */
    @WebMethod(action = "urn:wsActualizarCampana")
    @WebResult(name = "CampanaAct", targetNamespace = "http://pica.com/dss/Campanas")
    @RequestWrapper(localName = "wsActualizarCampana", targetNamespace = "http://pica.com/dss/Campanas", className = "com.pica.dss.campanas.WsActualizarCampana")
    @ResponseWrapper(localName = "CampanasAct", targetNamespace = "http://pica.com/dss/Campanas", className = "com.pica.dss.campanas.CampanasAct")
    public List<CampanaAct> wsActualizarCampana(
        @WebParam(name = "IDCAMPANA", targetNamespace = "http://pica.com/dss/Campanas")
        Integer idcampana,
        @WebParam(name = "NOMBRE", targetNamespace = "http://pica.com/dss/Campanas")
        String nombre,
        @WebParam(name = "DESCRIPCION", targetNamespace = "http://pica.com/dss/Campanas")
        String descripcion,
        @WebParam(name = "FECHAVENCIMIENTO", targetNamespace = "http://pica.com/dss/Campanas")
        String fechavencimiento,
        @WebParam(name = "ESTADO", targetNamespace = "http://pica.com/dss/Campanas")
        String estado)
        throws DataServiceFault
    ;

}
