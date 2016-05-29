/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.beans;

import com.proyecto.ejb.ProductoBeanInterface;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author EAYALA
 */
@Named(value = "beanProducto")
@SessionScoped
public class BeanProducto implements java.io.Serializable{
    
    @EJB
    ProductoBeanInterface productoBeanInterface;
        
    private String nombre;
    private String descripcion;
    private String categoria;
    private String precioLista;
    private String fabricante;
    private String url;
    
    private String salidaConsumoWS;
    
    public BeanProducto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPrecioLista() {
        return precioLista;
    }

    public void setPrecioLista(String precioLista) {
        this.precioLista = precioLista;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    public void enviarTramaWS(){
        List<String>infoProducto = new ArrayList<String>();
        infoProducto.add(getNombre());
        infoProducto.add(getDescripcion());
        infoProducto.add(getCategoria());
        infoProducto.add(getPrecioLista());
        infoProducto.add(getFabricante());
        infoProducto.add(getUrl());
        String respuesta = productoBeanInterface.consumirWS(infoProducto);
        System.out.println("Salida Test del WS......"+respuesta);
        setSalidaConsumoWS(respuesta);
        
        
    }
    
    public void getListadoProductosWS(){
        List<String>infoProducto = new ArrayList<String>();
        infoProducto.add("hola");
        String respuesta = productoBeanInterface.consumirListadoProductosWS(infoProducto);
        System.out.println("Salida Test del WS......"+respuesta);
        setSalidaConsumoWS(respuesta);
        
        
    }

    public String getSalidaConsumoWS() {
        return salidaConsumoWS;
    }

    public void setSalidaConsumoWS(String salidaConsumoWS) {
        this.salidaConsumoWS = salidaConsumoWS;
    }
    
    
}
