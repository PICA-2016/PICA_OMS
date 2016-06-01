/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.beans;

import com.pica.dss.productos.CFacXMes;
import com.pica.dss.productos.ConsultasEspecalesOrdenes;
import com.pica.dss.productos.DataServiceFault;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author luu
 */
@ManagedBean(name="beanConsultaOrdenesCerradasyTotalFacturado")
//@Named(value = "beanConsultaProductos")
@ViewScoped
public class BeanConsultaOrdenesCerradasyTotalFacturado  implements java.io.Serializable {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_9763/services/consultasEspecalesOrdenes.wsdl")
    private ConsultasEspecalesOrdenes service;

    private List<CFacXMes> listaOrdenes;
    
    @PostConstruct
    public void init() {
        listaOrdenes = this.listarOrdenes();
    }
    
    public List<CFacXMes> listarOrdenes(){
        System.out.println("hola");
        try {   
            List<CFacXMes> lista = new ArrayList<>();            
            listaOrdenes = wsConsultaFacXMes();
            for (CFacXMes consultaFacMes : listaOrdenes) {
                System.out.println("Producto : " + consultaFacMes.getMES());   
            }
        } catch (DataServiceFault ex) {
            System.out.println("error");
        }
        return listaOrdenes;
    }
    

    public List<CFacXMes> getListaOrdenes() {
        return listaOrdenes;
    }

    public void setListaOrdenes(List<CFacXMes> listaOrdenes) {
        this.listaOrdenes = listaOrdenes;
    }

    private java.util.List<com.pica.dss.productos.CFacXMes> wsConsultaFacXMes() throws DataServiceFault {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.pica.dss.productos.ConsultasEspecalesOrdenesPortType port = service.getSOAP11Endpoint();
        return port.wsConsultaFacXMes();
    }
    
    
}
