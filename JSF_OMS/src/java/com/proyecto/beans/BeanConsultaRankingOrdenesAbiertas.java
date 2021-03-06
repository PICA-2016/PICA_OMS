/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.beans;

import com.pica.dss.productos.Entry;
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
@ManagedBean(name="beanConsultaRankingOrdenesAbiertas")
//@Named(value = "beanConsultaProductos")
@ViewScoped
public class BeanConsultaRankingOrdenesAbiertas  implements java.io.Serializable {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_9763/services/consultasEspecalesOrdenes.wsdl")
    private ConsultasEspecalesOrdenes service;

    private List<Entry> listaOrdenes;
    
    @PostConstruct
    public void init() {
        listaOrdenes = this.listarOrdenes();
    }
    
    public List<Entry> listarOrdenes(){
        System.out.println("hola");
        try {   
            List<Entry> lista = new ArrayList<>();            
            listaOrdenes = wsRankingOrdenesA("02-02-2015", "02-02-2017");
            for (Entry consultaRanking : listaOrdenes) {
                System.out.println("Producto : " + consultaRanking.getORDERDATE());   
            }
        } catch (DataServiceFault ex) {
            System.out.println("error");
        }
        return listaOrdenes;
    }
    

    public List<Entry> getListaOrdenes() {
        return listaOrdenes;
    }

    public void setListaOrdenes(List<Entry> listaOrdenes) {
        this.listaOrdenes = listaOrdenes;
    }

    private java.util.List<com.pica.dss.productos.Entry> wsRankingOrdenesA(java.lang.String fechaini, java.lang.String fechafin) throws DataServiceFault {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.pica.dss.productos.ConsultasEspecalesOrdenesPortType port = service.getSOAP11Endpoint();
        return port.wsRankingOrdenesA(fechaini, fechafin);
    }
}
