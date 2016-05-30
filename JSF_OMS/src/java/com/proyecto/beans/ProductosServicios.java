/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.beans;

import com.pica.dss.productos.ConsultaProXNombre;
import com.pica.dss.productos.ConsultaProductoXID;
import com.pica.dss.productos.ConsultasEspecialesProductos;
import com.pica.dss.productos.DataServiceFault;
import com.proyecto.entities.Producto;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;
import org.primefaces.model.SortOrder;

/**
 *
 * @author luu
 */
public class ProductosServicios {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_9763/services/consultasEspecialesProductos.wsdl")
    private ConsultasEspecialesProductos service;

    List<Producto> listarProductos(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {
        System.out.println("hola");
        String filtro = "";
        int filtroId = 0;
        if (first == 0) {
            first = 1;
        }
        List<Producto> lista = new ArrayList<>();
        List<ConsultaProXNombre> listaNombre = new ArrayList<>();
        List<ConsultaProductoXID> listaId = new ArrayList<>();
        try {
            if (sortField == null) {
                sortField = "";
            }
            if (filters.containsKey("NOMBRE")) {
                if(filters.get("NOMBRE").toString() == null){
                    filtro = "";
                }else{
                    filtro = filters.get("NOMBRE").toString();
                }
                listaNombre = this.wsBuscarproductosXNombre(filtro, first, pageSize);
                for (ConsultaProXNombre consultaProXNombre : listaNombre) {
                    Producto producto = new Producto();
                    producto.setId(consultaProXNombre.getID());
                    producto.setNombre(consultaProXNombre.getNOMBRE());
                    producto.setDescripcion(consultaProXNombre.getDESCRIPCION());
                    producto.setCategoria(consultaProXNombre.getCATEGORIA());
                    producto.setFabricante(consultaProXNombre.getFABRICANTE());
                    producto.setPrecioLista(consultaProXNombre.getPRECIOLISTA());
                    System.out.println("Producto : " + consultaProXNombre.getNOMBRE());
                }
            }else if(filters.containsKey("ID")){
                if(filters.get("ID") == null){
                    filtroId = 0;
                }else{
                    filtroId = (Integer)filters.get("ID");
                }                
                listaId = this.wsBuscarproductoXID(filtroId);
            }else{
                listaNombre = this.wsBuscarproductosXNombre(filtro, first, pageSize);
                for (ConsultaProXNombre consultaProXNombre : listaNombre) {
                    Producto producto = new Producto();
                    producto.setId(consultaProXNombre.getID());
                    producto.setNombre(consultaProXNombre.getNOMBRE());
                    producto.setDescripcion(consultaProXNombre.getDESCRIPCION());
                    producto.setCategoria(consultaProXNombre.getCATEGORIA());
                    producto.setFabricante(consultaProXNombre.getFABRICANTE());
                    producto.setPrecioLista(consultaProXNombre.getPRECIOLISTA());
                    producto.setNumReg(consultaProXNombre.getCANTIDADREGISTROS());
                    lista.add(producto);
                    System.out.println("Producto : " + consultaProXNombre.getNOMBRE());
                }
            }
        } catch (DataServiceFault ex) {
            System.out.println("error" + ex);
        }
        return lista;
    }

    private java.util.List<com.pica.dss.productos.ConsultaProductoXID> wsBuscarproductoXID(java.lang.Integer productoID) throws DataServiceFault {
        com.pica.dss.productos.ConsultasEspecialesProductos service = new com.pica.dss.productos.ConsultasEspecialesProductos();
        com.pica.dss.productos.ConsultasEspecialesProductosPortType port = service.getSOAP11Endpoint();
        return port.wsBuscarproductoXID(productoID);
    }
    
    private java.util.List<com.pica.dss.productos.ConsultaProXNombre> wsBuscarproductosXNombre(java.lang.String nombre, java.lang.Integer numeroPAGINA, java.lang.Integer tamanoPAGINA) throws DataServiceFault {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ConsultasEspecialesProductos servicio = new ConsultasEspecialesProductos();
        com.pica.dss.productos.ConsultasEspecialesProductosPortType port = servicio.getSOAP11Endpoint();
        return port.wsBuscarproductosXNombre(nombre, numeroPAGINA, tamanoPAGINA);
    }    
}
