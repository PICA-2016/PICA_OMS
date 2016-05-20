
package co.aes;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "consultarProductos", targetNamespace = "http://servicioomsproductos.kallsonys.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ConsultarProductos {


    /**
     * 
     * @param numeroPAGINA
     * @param tamanoPAGINA
     * @param descripcion
     * @return
     *     returns java.util.List<co.aes.Producto>
     */
    @WebMethod(operationName = "consultarPRODUCTOS_DESCRIPCION", action = "http://localhost/consultarPRODUCTOS_DESCRIPCION")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarPRODUCTOS_DESCRIPCION", targetNamespace = "http://servicioomsproductos.kallsonys.com/", className = "co.aes.ConsultarPRODUCTOSDESCRIPCION")
    @ResponseWrapper(localName = "consultarPRODUCTOS_DESCRIPCIONResponse", targetNamespace = "http://servicioomsproductos.kallsonys.com/", className = "co.aes.ConsultarPRODUCTOSDESCRIPCIONResponse")
    @Action(input = "http://localhost/consultarPRODUCTOS_DESCRIPCION", output = "http://servicioomsproductos.kallsonys.com/consultarProductos/consultarPRODUCTOS_DESCRIPCIONResponse")
    public List<Producto> consultarPRODUCTOSDESCRIPCION(
        @WebParam(name = "DESCRIPCION", targetNamespace = "")
        String descripcion,
        @WebParam(name = "NUMERO_PAGINA", targetNamespace = "")
        int numeroPAGINA,
        @WebParam(name = "TAMANO_PAGINA", targetNamespace = "")
        int tamanoPAGINA);

    /**
     * 
     * @param numeroPAGINA
     * @param tamanoPAGINA
     * @return
     *     returns java.util.List<co.aes.Producto>
     */
    @WebMethod(operationName = "consultarPRODUCTOS_LISTA", action = "http://localhost/consultarPRODUCTOS_LISTA")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarPRODUCTOS_LISTA", targetNamespace = "http://servicioomsproductos.kallsonys.com/", className = "co.aes.ConsultarPRODUCTOSLISTA")
    @ResponseWrapper(localName = "consultarPRODUCTOS_LISTAResponse", targetNamespace = "http://servicioomsproductos.kallsonys.com/", className = "co.aes.ConsultarPRODUCTOSLISTAResponse")
    @Action(input = "http://localhost/consultarPRODUCTOS_LISTA", output = "http://servicioomsproductos.kallsonys.com/consultarProductos/consultarPRODUCTOS_LISTAResponse")
    public List<Producto> consultarPRODUCTOSLISTA(
        @WebParam(name = "NUMERO_PAGINA", targetNamespace = "")
        int numeroPAGINA,
        @WebParam(name = "TAMANO_PAGINA", targetNamespace = "")
        int tamanoPAGINA);

    /**
     * 
     * @param id
     * @return
     *     returns java.util.List<co.aes.Producto>
     */
    @WebMethod(operationName = "consultarPRODUCTOS_ID", action = "http://localhost/consultarPRODUCTOS_ID")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarPRODUCTOS_ID", targetNamespace = "http://servicioomsproductos.kallsonys.com/", className = "co.aes.ConsultarPRODUCTOSID")
    @ResponseWrapper(localName = "consultarPRODUCTOS_IDResponse", targetNamespace = "http://servicioomsproductos.kallsonys.com/", className = "co.aes.ConsultarPRODUCTOSIDResponse")
    @Action(input = "http://localhost/consultarPRODUCTOS_ID", output = "http://servicioomsproductos.kallsonys.com/consultarProductos/consultarPRODUCTOS_IDResponse")
    public List<Producto> consultarPRODUCTOSID(
        @WebParam(name = "ID", targetNamespace = "")
        int id);

    /**
     * 
     * @param numeroPAGINA
     * @param nombre
     * @param tamanoPAGINA
     * @return
     *     returns java.util.List<co.aes.Producto>
     */
    @WebMethod(operationName = "consultarPRODUCTOS_NOMBRE", action = "http://localhost/consultarPRODUCTOS_NOMBRE")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarPRODUCTOS_NOMBRE", targetNamespace = "http://servicioomsproductos.kallsonys.com/", className = "co.aes.ConsultarPRODUCTOSNOMBRE")
    @ResponseWrapper(localName = "consultarPRODUCTOS_NOMBREResponse", targetNamespace = "http://servicioomsproductos.kallsonys.com/", className = "co.aes.ConsultarPRODUCTOSNOMBREResponse")
    @Action(input = "http://localhost/consultarPRODUCTOS_NOMBRE", output = "http://servicioomsproductos.kallsonys.com/consultarProductos/consultarPRODUCTOS_NOMBREResponse")
    public List<Producto> consultarPRODUCTOSNOMBRE(
        @WebParam(name = "NOMBRE", targetNamespace = "")
        String nombre,
        @WebParam(name = "NUMERO_PAGINA", targetNamespace = "")
        int numeroPAGINA,
        @WebParam(name = "TAMANO_PAGINA", targetNamespace = "")
        int tamanoPAGINA);

}