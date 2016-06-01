/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumo;

import com.pica.dss.campanas.AdministrarCampanas;
import com.pica.dss.campanas.CampanaCons;
import com.pica.dss.campanas.CampanaInsert;
import com.pica.dss.campanas.DataServiceFault;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author GermanO
 */
@ManagedBean
@RequestScoped
public class campanas 
{
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/10.85.0.100_9766/services/administrarCampanas.wsdl")
    private AdministrarCampanas service;
    
    private String nombre,descripcion,estado;
    private String fechaini,fechavencimiento;
    private String respuesta;

    private List<CampanaCons> listaCampanas;
    
    public String getEstado() 
    {
        return estado;
    }

    public void setEstado(String estado) 
    {
        this.estado = estado;
    }
    
    public String getRespuesta() 
    {
        return respuesta;
    }

    public void setRespuesta(String respuesta) 
    {
        this.respuesta = respuesta;
    }
    
    public String getNombre() 
    {
        return nombre;
    }
    
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }    
    
    public String getDescripcion() 
    {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) 
    {
        this.descripcion = descripcion;
    }    
    
    public String getFechaVen() 
    {
        return fechavencimiento;
    }
    
    public void setFechaVen(String fechavencimiento) 
    {
        this.fechavencimiento = fechavencimiento;
    }   
    
    public String getFechaIni() 
    {
        return fechavencimiento;
    }
    
    public void setFechaIni(String fechaini) 
    {
        this.fechaini = fechaini;
    }       
    
    public campanas(String nombre, String descripcion,String fechaini,String fechavencimiento) 
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechavencimiento = fechavencimiento;
        this.fechaini = fechaini;
    }
    
    public campanas()
    {
                
    }
    
    public void insertarCampana() throws DataServiceFault
    {
        System.out.println("insertarCampana");
        List<CampanaInsert> lista = new ArrayList<>();
        lista = wsInsertarCampana(nombre, descripcion, fechaini, fechavencimiento, estado);
        //com.pica.dss.campanas.AdministrarCampanasPortType port = service.getSOAP11Endpoint();
        //return port.wsInsertarCampana(nombre, descripcion, fechaini, fechavencimiento, estado);       
    }

    private List<CampanaInsert> wsInsertarCampana(String nombre, String descripcion, String fechaini, 
                                                  String fechavencimiento, String estado) throws DataServiceFault 
    {
        List<CampanaInsert> lista = new ArrayList<>();
        com.pica.dss.campanas.AdministrarCampanasPortType port = service.getSOAP11Endpoint();
        respuesta = "Insercion Correcta";
        return port.wsInsertarCampana(nombre, descripcion, fechaini, fechavencimiento, estado);  
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void consultarCampana() throws DataServiceFault
    {
        
        System.out.println("consultarCampana");
        List<CampanaCons> lista = new ArrayList<>();
        //lista = wsConsultaCampana(estado);
        listaCampanas = wsConsultaCampana(estado);
        respuesta = lista.toString();
        //com.pica.dss.campanas.AdministrarCampanasPortType port = service.getSOAP11Endpoint();
        //return port.wsInsertarCampana(nombre, descripcion, fechaini, fechavencimiento, estado);       
    }    

    private java.util.List<com.pica.dss.campanas.CampanaCons> wsConsultaCampana(java.lang.String estado) 
            throws DataServiceFault 
    {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.pica.dss.campanas.AdministrarCampanasPortType port = service.getSOAP11Endpoint();
        System.out.println(port.wsConsultaCampana(estado));
        return port.wsConsultaCampana(estado);
        
    }
    
    /*
    private java.util.List<com.pica.dss.campanas.CampanaConXPro> wsConsultarProductosXCampana(java.lang.Integer idcampana, java.lang.String estado) throws DataServiceFault {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.pica.dss.campanas.AdministrarCampanasPortType port = service.getSOAP11Endpoint();
        return port.wsConsultarProductosXCampana(idcampana, estado);
    }*/
    
public List<CampanaCons> getListaCampanas() {
        return listaCampanas;
    }    
    
    
}
