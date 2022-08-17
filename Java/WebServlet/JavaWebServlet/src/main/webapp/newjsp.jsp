<%-- 
    Document   : newjsp
    Created on : 15 ago. 2022, 03:14:01
    Author     : ACAMUS79
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String nombre=(String)request.getParameter("Caja1");
        out.print("tu nombre es "+request.getParameter("Caja1")+" ");
        out.print("<br/>");
        out.print("<br/>");
        %>
    </body>
</html>
