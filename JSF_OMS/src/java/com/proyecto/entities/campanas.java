/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.entities;

/**
 *
 * @author GermanO
 */
public class campanas {
    
    private String nombre,descripcion,estado;
    private String fechaini,fechavencimiento;
    private String respuesta;
    private int numReg;

    
    
    public String getEstado() 
    {
        return estado;
    }

    public void setEstado(String estado) 
    {
        this.estado = estado;
    }
    

    
    public String getNombre() 
    {
        return nombre;
    }
    
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }    
    
    public String getDescripcion() 
    {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) 
    {
        this.descripcion = descripcion;
    }    
    
    public String getFechaVen() 
    {
        return fechavencimiento;
    }
    
    public void setFechaVen(String fechavencimiento) 
    {
        this.fechavencimiento = fechavencimiento;
    }   
    
    public String getFechaIni() 
    {
        return fechavencimiento;
    }
    
    public void setFechaIni(String fechaini) 
    {
        this.fechaini = fechaini;
    }
    
    public int getNumReg() {
        return numReg;
    }

    public void setNumReg(int numReg) {
        this.numReg = numReg;
    }
    
}
