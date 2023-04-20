<%-- 
    Document   : usuario
    Created on : 19 abr. 2023, 21:18:41
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
        <h1>Formulario de Contacto</h1>
        <form action="<%= request.getContextPath() %>/UsuarioServlet" method="POST">
            <label>Introduzca su nombre:</label> <input type="text" name="nombre">
            <br>
            <label>Introduzca su Email:</label> <input type="email" name="email">
            <br>
            <input type="submit" value="Registrar">
        </form>
        
    </body>
</html>
