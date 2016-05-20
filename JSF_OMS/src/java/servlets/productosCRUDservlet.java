/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

import co.aes.ConsultarProductos_Service;

/**
 *
 * @author GermanO
 */

@WebServlet(name = "productosCRUDservlet", urlPatterns = {"/productosCRUDservlet"})
public class productosCRUDservlet extends HttpServlet  
{
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/192.168.0.8_8686/ServicioOMSProductosSA/consultarProductos.wsdl")
    private ConsultarProductos_Service service = new ConsultarProductos_Service();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    public String consultarPRODUCTOS_LISTA (String numeropagina,String tamanopagina)
//autenticarUsuarioLoginClave(java.lang.String arg0, java.lang.String arg1) 
    {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        //paquetewsclientesordenes.UsuariosCrud port = service.getUsuariosCrudPort();
        co.aes.ConsultarPRODUCTOSLISTA port = service.getConsultarProductosPort();
        return port.toString();
        //return port.autenticarUsuarioLoginClave(arg0, arg1);
    }    
}
