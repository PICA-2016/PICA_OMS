<%-- 
    Document   : newjsp
    Created on : 29-may-2016, 13:32:11
    Author     : luu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	com.pica.dss.productos.ConsultasEspecialesProductos service = new com.pica.dss.productos.ConsultasEspecialesProductos();
	com.pica.dss.productos.ConsultasEspecialesProductosPortType port = service.getSOAP11Endpoint();
	 // TODO initialize WS operation arguments here
	java.lang.String nombre = "";
	java.lang.Integer numeroPAGINA = Integer.valueOf(0);
	java.lang.Integer tamanoPAGINA = Integer.valueOf(0);
	// TODO process result here
	java.util.List<com.pica.dss.productos.ConsultaProXNombre> result = port.wsBuscarproductosXNombre(nombre, numeroPAGINA, tamanoPAGINA);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
