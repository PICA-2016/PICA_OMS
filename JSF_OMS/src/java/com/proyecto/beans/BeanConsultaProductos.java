/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.beans;

import com.pica.dss.productos.ConsultaProXNombre;
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
@ManagedBean(name="beanConsultaProductos")
//@Named(value = "beanConsultaProductos")
@ViewScoped
public class BeanConsultaProductos  implements java.io.Serializable {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_9763/services/consultasEspecialesProductos.wsdl")
    private ConsultasEspecialesProductos service;
    private List<ConsultaProXNombre> listaProductos;
    
    @PostConstruct
    public void init() {
        listaProductos = this.listarProductos();
    }
    
    public List<ConsultaProXNombre> listarProductos(){
        System.out.println("hola");
        try {   
            List<ConsultaProXNombre> lista = new ArrayList<>();            
            listaProductos = wsBuscarproductosXNombre("", 1,100);
            for (ConsultaProXNombre consultaProXNombre : listaProductos) {
                System.out.println("Producto : " + consultaProXNombre.getNOMBRE());   
            }
        } catch (DataServiceFault ex) {
            System.out.println("error");
        }
        return listaProductos;
    }

    private java.util.List<com.pica.dss.productos.ConsultaProXNombre> wsBuscarproductosXNombre(java.lang.String nombre, java.lang.Integer numeroPAGINA, java.lang.Integer tamanoPAGINA) throws DataServiceFault {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.pica.dss.productos.ConsultasEspecialesProductosPortType port = service.getSOAP11Endpoint();
        return port.wsBuscarproductosXNombre(nombre, numeroPAGINA, tamanoPAGINA);
    }

    public List<ConsultaProXNombre> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<ConsultaProXNombre> listaProductos) {
        this.listaProductos = listaProductos;
    }
}
