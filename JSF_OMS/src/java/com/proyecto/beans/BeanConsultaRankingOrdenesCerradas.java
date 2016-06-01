/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.beans;

import com.pica.dss.productos.RankingOrdenesC;
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
@ManagedBean(name="beanConsultaRankingOrdenesCerradas")
//@Named(value = "beanConsultaProductos")
@ViewScoped
public class BeanConsultaRankingOrdenesCerradas  implements java.io.Serializable {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_9763/services/consultasEspecalesOrdenes.wsdl")
    private ConsultasEspecalesOrdenes service;

    private List<RankingOrdenesC> listaOrdenes;
    
    @PostConstruct
    public void init() {
        listaOrdenes = this.listarOrdenes();
    }
    
    public List<RankingOrdenesC> listarOrdenes(){
        System.out.println("hola");
        try {   
            List<RankingOrdenesC> lista = new ArrayList<>();            
            listaOrdenes = wsRankingOrdenesC("02-02-2015", "02-02-2017");
            for (RankingOrdenesC consultaRanking : listaOrdenes) {
                System.out.println("Producto : " + consultaRanking.getORDERDATE());   
            }
        } catch (DataServiceFault ex) {
            System.out.println("error");
        }
        return listaOrdenes;
    }
    

    public List<RankingOrdenesC> getListaOrdenes() {
        return listaOrdenes;
    }

    public void setListaOrdenes(List<RankingOrdenesC> listaOrdenes) {
        this.listaOrdenes = listaOrdenes;
    }
    
    private java.util.List<com.pica.dss.productos.RankingOrdenesC> wsRankingOrdenesC(java.lang.String fechaini, java.lang.String fechafin) throws DataServiceFault {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.pica.dss.productos.ConsultasEspecalesOrdenesPortType port = service.getSOAP11Endpoint();
        return port.wsRankingOrdenesC(fechaini, fechafin);
    }
}
