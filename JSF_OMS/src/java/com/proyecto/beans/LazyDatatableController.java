/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.beans;

import com.pica.dss.productos.ConsultaProXNombre;
import com.pica.dss.productos.DataServiceFault;
import com.proyecto.entities.Producto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.data.FilterEvent;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

/**
 *
 * @author luu
 */
@ManagedBean(name = "lazyDatatableController")
@ViewScoped
public class LazyDatatableController extends LazyDataModel<Producto> implements Serializable {

    private ProductosServicios servicioProductos;
    private String filtroId;
    private String filtroName;
    private boolean filtroIdActivo;

    public LazyDatatableController() {
        this.setFiltroIdActivo(false);
    }
    
    @Override
    public List<Producto> load(
            int first, int pageSize,
            String sortField, SortOrder sortOrder,
            Map<String, Object> filters) {
        int numPagina = first / pageSize;
        ProductosServicios servicio = new ProductosServicios();
        List<Producto> productos = servicio.listarProductos(numPagina, pageSize,
                sortField, sortOrder, filters, filtroId, filtroName, filtroIdActivo);
        int numRegistros = 0;
        if(productos.get(0).getNumReg() == 0){
            numRegistros = 1;
            productos.clear();
        }else{
            numRegistros = productos.get(0).getNumReg();
        }
        this.setRowCount(numRegistros);
        //setRowCount(userService.countUsers(filters));
        return productos;
    }   
    
    public void filtroNombreAction() {
        System.out.println("com.proyecto.beans.LazyDatatableController.filtroNombre()");
        this.setFiltroId("");
        this.setFiltroIdActivo(false);
    }
    
    public void filtroIdAction() {
        System.out.println("com.proyecto.beans.LazyDatatableController.filtroId()");
        this.setFiltroName("");
        this.setFiltroIdActivo(true);
    } 
    
    public void onRowEdit(RowEditEvent event) {
        Producto producto = (Producto) event.getObject();
        ProductosServicios servicio = new ProductosServicios();
        servicio.actualizarProducto(producto);
    }    

    public void onRowCancel(RowEditEvent event) {
        System.out.println("com.proyecto.beans.LazyDatatableController.onRowCancel()");
    }
    
    public ProductosServicios getServicioProductos() {
        return servicioProductos;
    }

    public void setServicioProductos(ProductosServicios servicioProductos) {
        this.servicioProductos = servicioProductos;
    }

    public String getFiltroId() {
        return filtroId;
    }

    public void setFiltroId(String filtroId) {
        this.filtroId = filtroId;
    }

    public String getFiltroName() {
        return filtroName;
    }

    public void setFiltroName(String filtroName) {
        this.filtroName = filtroName;
    }

    public boolean isFiltroIdActivo() {
        return filtroIdActivo;
    }

    public void setFiltroIdActivo(boolean filtroIdActivo) {
        this.filtroIdActivo = filtroIdActivo;
    }
    
    
}
