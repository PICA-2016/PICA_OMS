/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.beans;


import com.pica.dss.productos.ConsultasEspecialesProductos;
import com.pica.dss.productos.DataServiceFault;
import com.pica.dss.productos.RankingProducto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.xml.ws.WebServiceRef;


/**
 *
 * @author luu
 */
@ManagedBean(name="beanProductosRanking")
@RequestScoped
public class ProductosRankingServicios implements java.io.Serializable{
    
    private String fechaInicio;
    private String fechaFinal;
    
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_9763/services/consultasEspecialesProductos.wsdl")
    private ConsultasEspecialesProductos service;
    
    private List<RankingProducto> listaPorRankingList;
    
    
    @PostConstruct
    public void init(){
        listaPorRankingList = this.listaPorRankingListX();
    }
    
    
    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
    
    public List<RankingProducto> listaPorRankingListX()
    {
        //System.out.println(fechaInicio.toString());
        //System.out.println(fechaFinal.toString());
        try{
            List<RankingProducto> lista = new ArrayList<>();
            //listaPorRankingList = wsRankingProductos(fechaInicio, fechaFinal);
            listaPorRankingList = wsRankingProductos("01-01-2014","01-01-2017");
            for(RankingProducto rankingProducto : listaPorRankingList){
                System.out.println("Prod: " + rankingProducto.getPRODID());
            }
        }catch (DataServiceFault ex){
            System.out.println("error " + ex);
        }
        return listaPorRankingList;
    }
/*
    public void setListaPorRanking(List<RankingProducto> listaPorRanking) {
        this.listaPorRankingList = listaPorRanking;
    }
    */
    
    private java.util.List<com.pica.dss.productos.RankingProducto> 
        wsRankingProductos(java.lang.String fechaInicio, java.lang.String fechaFinal) throws DataServiceFault {
        //com.pica.dss.productos.ConsultasEspecialesProductos service = new com.pica.dss.productos.ConsultasEspecialesProductos();
        com.pica.dss.productos.ConsultasEspecialesProductosPortType port = service.getSOAP11Endpoint();//.getSOAP12Endpoint();// .getSOAP11Endpoint();
        return port.wsRankingProductos(fechaInicio, fechaFinal);
    }

    public List<RankingProducto> getListaPorRankingList() 
    {
        return listaPorRankingList;
    }

    public void setListaPorRankingList(List<RankingProducto> listaPorRankingList) {
        this.listaPorRankingList = listaPorRankingList;
    }
        
        
    
}
