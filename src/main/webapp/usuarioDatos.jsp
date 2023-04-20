<%-- 
    Document   : usuarioDatos
    Created on : 19 abr. 2023, 21:41:15
    Author     : P3R3Z1T0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos del Usuario</h1>
        <form action="action">
        Nombre: <%=request.getAttribute("nombre") %>
        <br>
        Email: <%=request.getAttribute("email") %>
        </form>
    </body>
</html>
