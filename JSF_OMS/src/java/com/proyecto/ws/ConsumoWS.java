/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.ws;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class ConsumoWS {
    
    public static String probarServicios(String wsURL, String xmlInput) {
            URL url = null;
            URLConnection connection = null;
            HttpURLConnection httpConn = null;
            String responseString = null;
            String outputString = null;
            ByteArrayOutputStream bout = null;
            OutputStream out = null;
            InputStreamReader isr = null;
            BufferedReader in = null;
            outputString = "";
            try {
                    url = new URL(wsURL);
                    connection = url.openConnection();
                    httpConn = (HttpURLConnection) connection;
                    bout = new ByteArrayOutputStream();
                    byte[] buffer = new byte[xmlInput.length()];
                    buffer = xmlInput.getBytes();
                    bout.write(buffer);
                    byte[] b = bout.toByteArray();
                    String SOAPAction = "";
                    // Set the appropriate HTTP parameters.
                    httpConn.setRequestProperty("Content-Length",String.valueOf(b.length));
                    httpConn.setRequestProperty("Content-Type","text/xml; charset=utf-8");
                    httpConn.setRequestProperty("SOAPAction", SOAPAction);
                    httpConn.setRequestMethod("POST");
                    httpConn.setDoOutput(true);
                    httpConn.setDoInput(true);
                    out = httpConn.getOutputStream();
                    out.write(b);
                    out.close();
                    // Read the response and write it to standard out.
                    isr = new InputStreamReader(httpConn.getInputStream());
                    in = new BufferedReader(isr);
                    while ((responseString = in.readLine()) != null) {
                            outputString = outputString + responseString;
                    }
                    return outputString;
            } catch (Exception e) {
                    e.printStackTrace();
                    return "error al invocar el ws " + e.getMessage();
            }
    }
    
    public static String consumerWSS_2(String soapWSS,String str_endpoint) {
        String consumo;
        try {
            consumo = ConsumoWS.probarServicios(str_endpoint, soapWSS);
            return consumo;

        } catch (Exception e) {
            return "error al invocar el ws " + e.getMessage();
        }
    }
}
