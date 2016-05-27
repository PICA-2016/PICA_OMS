/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.ejb;

import com.proyecto.ws.ConsumoWS;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import javax.ejb.Stateless;

/**
 *
 * @author EAYALA
 */
@Stateless
public class ProductoSessionBean implements ProductoBeanInterface{

    @Override
    public String consumirWS(List<String> data) {
        String salidaWS = null;
        if(data.size()>0){
            Iterator iterData = data.iterator();
            while(iterData.hasNext()){
                String info = (String)iterData.next();
                System.out.println(info);
            }
           
            
            
            String str_Xml="<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:prod=\"http://pica.com/dss/Productos\"><soapenv:Header/><soapenv:Body><prod:wsInsertarProducto><prod:PRODUCTO_ID>"+data.get(0)+"</prod:PRODUCTO_ID><prod:NOMBRE>"+data.get(1)+"</prod:NOMBRE><prod:DESCRIPCION>"+data.get(2)+"</prod:DESCRIPCION><prod:CATEGORIA>"+data.get(3)+"</prod:CATEGORIA><prod:PRECIO_LISTA>"+data.get(4)+"</prod:PRECIO_LISTA><prod:FABRICANTE>"+data.get(5)+"</prod:FABRICANTE><prod:IMAGEN_URL>"+data.get(6)+"</prod:IMAGEN_URL></prod:wsInsertarProducto></soapenv:Body></soapenv:Envelope>";
            System.out.println("Request SOAP----> "+str_Xml);
            //String str_endpoint = "http://localhost:9783/services/administrarProductos.SOAP11Endpoint/";
            String str_endpoint="http://localhost:9763/services/administrarProductos.SOAP11Endpoint/";
            
            String consumo = null;
            consumo=ConsumoWS.consumerWSS_2(str_Xml, str_endpoint);
           
            //consumo="<MSNRESPUESTA>ERROR</MSNRESPUESTA>";
            int verificacion = consumo.indexOf("OK");
            if(verificacion!=-1){
                salidaWS="OK";
            }else{
                salidaWS="ERROR";
            }

        }else{
            salidaWS="ERROR";
        }
        
        return salidaWS;
    }

}
