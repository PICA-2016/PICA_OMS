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
import org.primefaces.event.SelectEvent;
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

    @Override
    public List<Producto> load(
            int first, int pageSize,
            String sortField, SortOrder sortOrder,
            Map<String, Object> filters) {
        int numPagina = first / pageSize;
        ProductosServicios servicio = new ProductosServicios();
        List<Producto> productos = servicio.listarProductos(numPagina, pageSize,
                sortField, sortOrder, filters);
        this.setRowCount(productos.get(0).getNumReg());
        //setRowCount(userService.countUsers(filters));
        return productos;
    }
}
