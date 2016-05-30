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
import java.math.BigInteger;
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

    List<Producto> listarProductos(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters, String filtroId, String filtroNombre, boolean filtroIdActivo) {
        System.out.println("hola");
        List<Producto> lista = new ArrayList<>();
        List<ConsultaProXNombre> listaNombre = new ArrayList<>();
        List<ConsultaProductoXID> listaId = new ArrayList<>();
        if (filtroNombre == null) {
            filtroNombre = "";
        }
        int filtroIdNumber = 0;
        if (!isNumeric(filtroId)) {
            filtroIdNumber = 0;
        } else {
            filtroIdNumber = Integer.parseInt(filtroId);
        }
        if (first == 0) {
            first = 1;
        }

        try {
            if (!filtroIdActivo) {
                listaNombre = this.wsBuscarproductosXNombre(filtroNombre, first, pageSize);
                for (ConsultaProXNombre consultaProXNombre : listaNombre) {
                    Producto producto = new Producto();
                    producto.setId(consultaProXNombre.getID());
                    producto.setNombre(consultaProXNombre.getNOMBRE());
                    producto.setDescripcion(consultaProXNombre.getDESCRIPCION());
                    producto.setCategoria(consultaProXNombre.getCATEGORIA());
                    producto.setFabricante(consultaProXNombre.getFABRICANTE());
                    producto.setPrecioLista(consultaProXNombre.getPRECIOLISTA());
                    producto.setNumReg(consultaProXNombre.getCANTIDADREGISTROS().intValue());
                    lista.add(producto);
                    System.out.println("Producto : " + consultaProXNombre.getNOMBRE());
                }
            } else if (filtroIdActivo) {
                listaId = this.wsBuscarproductoXID(filtroIdNumber);
                for (ConsultaProductoXID consultaProductoXID : listaId) {
                    Producto producto = new Producto();
                    producto.setId(consultaProductoXID.getID());
                    producto.setNombre(consultaProductoXID.getNOMBRE());
                    producto.setDescripcion(consultaProductoXID.getDESCRIPCION());
                    producto.setCategoria(consultaProductoXID.getCATEGORIA());
                    producto.setFabricante(consultaProductoXID.getFABRICANTE());
                    producto.setPrecioLista(BigInteger.valueOf(Long.parseLong(consultaProductoXID.getPRECIOLISTA())));
                    producto.setNumReg(1);
                    lista.add(producto);
                }
            } else {
                listaNombre = this.wsBuscarproductosXNombre(filtroNombre, first, pageSize);
                for (ConsultaProXNombre consultaProXNombre : listaNombre) {
                    Producto producto = new Producto();
                    producto.setId(consultaProXNombre.getID());
                    producto.setNombre(consultaProXNombre.getNOMBRE());
                    producto.setDescripcion(consultaProXNombre.getDESCRIPCION());
                    producto.setCategoria(consultaProXNombre.getCATEGORIA());
                    producto.setFabricante(consultaProXNombre.getFABRICANTE());
                    producto.setPrecioLista(consultaProXNombre.getPRECIOLISTA());
                    producto.setNumReg(consultaProXNombre.getCANTIDADREGISTROS().intValue());
                    lista.add(producto);
                    System.out.println("Producto : " + consultaProXNombre.getNOMBRE());
                }
            }
        } catch (DataServiceFault ex) {
            System.out.println("error" + ex);
        }
        return lista;
    }
    
    public boolean actualizarProducto(Producto producto){
        try{
            this.wsActualizarProducto(producto.getId().intValue(), producto.getNombre(), producto.getDescripcion(), producto.getCategoria(), producto.getPrecioLista().intValue(), producto.getFabricante(), producto.getUrl());
        }
        catch(Exception e){
            System.out.println("Error en la actualización del producto " + e.toString());
            return false;
        }
        return true;
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

    private static java.util.List<com.pica.dss.productos.Producto> wsActualizarProducto(java.lang.Integer productoID, java.lang.String nombre, java.lang.String descripcion, java.lang.String categoria, java.lang.Integer precioLISTA, java.lang.String fabricante, java.lang.String imagenURL) throws DataServiceFault {
        com.pica.dss.productos.AdministrarProductos service = new com.pica.dss.productos.AdministrarProductos();
        com.pica.dss.productos.AdministrarProductosPortType port = service.getSOAP11Endpoint();
        return port.wsActualizarProducto(productoID, nombre, descripcion, categoria, precioLISTA, fabricante, imagenURL);
    }

    public static boolean isNumeric(String str) {
        try {
            double d = Integer.parseInt(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
