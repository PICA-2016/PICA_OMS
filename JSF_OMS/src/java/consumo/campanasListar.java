/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumo;

import com.pica.dss.campanas.AdministrarCampanas;
import com.pica.dss.campanas.CampanaCons;
import com.pica.dss.campanas.DataServiceFault;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author GermanO
 */
@ManagedBean(name="beanListarCampanas")
//@Named(value = "beanConsultaProductos")
@ViewScoped

public class campanasListar implements java.io.Serializable 
{
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/10.85.0.100_9766/services/administrarCampanas.wsdl")
    private AdministrarCampanas service;
    
    private List<CampanaCons> listaCampanas;
    
    private String estado;
    private String campana;
    
    private String IDCAMPANA;
    
    @PostConstruct
    public void init() 
    {
        listaCampanas = this.listaCampanas();
    }
    
    public String getEstado() 
    {
        return estado;
    }

    public void setEstado(String estado) 
    {
        this.estado = estado;
    }
    
    public List<CampanaCons> listaCampanas()
    {
        System.out.println("hola");
        try {   
            List<CampanaCons> lista = new ArrayList<>();            
            listaCampanas = wsConsultaCampana("A");
            for (CampanaCons campanaCons : listaCampanas) 
            {
                System.out.println("Campanas : " + campanaCons.getNOMBRE());   
            }
        } catch (DataServiceFault ex) 
        {
            System.out.println("error");
        }
        return listaCampanas;
    }

    private java.util.List<com.pica.dss.campanas.CampanaCons> wsConsultaCampana(java.lang.String estado) throws DataServiceFault {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.pica.dss.campanas.AdministrarCampanasPortType port = service.getSOAP11Endpoint();
        return port.wsConsultaCampana(estado);
    }
    
    public List<CampanaCons> getListaCampanas() {
        return listaCampanas;
    }

    public void setListaCampanas(List<CampanaCons> listaCampanas) {
        this.listaCampanas = listaCampanas;
    }    
    
    public void action(String IDCAMPANA) 
    {
        try 
        {
            System.out.println("germano - "+IDCAMPANA);
            FacesContext.getCurrentInstance().getExternalContext().redirect("registrar_campanhias_productos.xhtml");
        } catch (IOException ex) 
        {
       // do something here
        }
       
        
        
    }
    
    public String getCampana() 
    {
        return campana;
    }

    public void setCampana(String IDCAMPANA) 
    {
        System.out.println("2 - IDCAMPANA "+IDCAMPANA);
        this.campana = IDCAMPANA;
    }
    
    
}
