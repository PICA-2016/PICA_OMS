/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.beans;

import com.pica.dss.clientes.ConsultasEspecialesClientes;
import com.pica.dss.clientes.ConsultaClientesXFac;
import com.pica.dss.productos.DataServiceFault;
import com.pica.dss.productos.Entry;
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
@ManagedBean(name="beanConsultaRankingClientesFacturacion")
//@Named(value = "beanConsultaProductos")
@ViewScoped
public class BeanConsultaRankingClientesFacturacion  implements java.io.Serializable {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_9763/services/consultasEspecialesClientes.wsdl")
    private ConsultasEspecialesClientes service;

    private List<ConsultaClientesXFac> listaOrdenes;
    
    @PostConstruct
    public void init() {
        listaOrdenes = this.listarOrdenes();
    }
    
    public List<ConsultaClientesXFac> listarOrdenes(){
        System.out.println("hola");
        try {   
            List<ConsultaClientesXFac> lista = new ArrayList<>();     
            //TODO: Filtro
            listaOrdenes = wsConsultaClientesXFac("02-12-2015","02-12-2016");
            for (ConsultaClientesXFac consultaOrdenesxProducto : listaOrdenes) {
                System.out.println("Producto : " + consultaOrdenesxProducto.getORDERDATE());   
            }
        } catch (DataServiceFault ex) {
            System.out.println("error");
        }
        return listaOrdenes;
    }
    

    public List<ConsultaClientesXFac> getListaOrdenes() {
        return listaOrdenes;
    }

    public void setListaOrdenes(List<ConsultaClientesXFac> listaOrdenes) {
        this.listaOrdenes = listaOrdenes;
    }

    private java.util.List<com.pica.dss.clientes.ConsultaClientesXFac> wsConsultaClientesXFac(java.lang.String fechaini, java.lang.String fechafin) throws com.pica.dss.clientes.DataServiceFault {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.pica.dss.clientes.ConsultasEspecialesClientesPortType port = service.getSOAP11Endpoint();
        return port.wsConsultaClientesXFac(fechaini, fechafin);
    }


}
