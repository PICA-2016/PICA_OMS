/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.beans;

import com.pica.dss.productos.RankingCategoria;
import com.pica.dss.productos.ConsultasEspecialesProductos;
import com.pica.dss.productos.DataServiceFault;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author luu
 */
@ManagedBean(name="BeanConsultaRankingCategorias")
@ViewScoped
public class BeanConsultaRankingCategorias  implements java.io.Serializable {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_9763/services/consultasEspecialesProductos.wsdl")
    private ConsultasEspecialesProductos service;
    private List<RankingCategoria> listaProductos;
    
    @PostConstruct
    public void init() {
        listaProductos = this.listarProductos();
    }
    
    public List<RankingCategoria> listarProductos(){
        System.out.println("hola");
        try {   
            List<RankingCategoria> lista = new ArrayList<>();            
            listaProductos = wsRankingCategorias("03-12-2015","04-02-2016");
            for (RankingCategoria rankingCategoria : listaProductos) {
                System.out.println("Producto : " + rankingCategoria.getPRODUCTCATEGORIA());   
            }
        } catch (DataServiceFault ex) {
            System.out.println("error");
        }
        return listaProductos;
    }
    
    public List<RankingCategoria> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<RankingCategoria> listaProductos) {
        this.listaProductos = listaProductos;
    }

    private java.util.List<com.pica.dss.productos.RankingCategoria> wsRankingCategorias(java.lang.String fechaini, java.lang.String fechafin) throws DataServiceFault {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.pica.dss.productos.ConsultasEspecialesProductosPortType port = service.getSOAP11Endpoint();
        return port.wsRankingCategorias(fechaini, fechafin);
    }
}
