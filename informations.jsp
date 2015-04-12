<%-- 
    Document   : informations
    Created on : 12 avr. 2015, 14:06:10
    Author     : Anne-So
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%= request.getParameter("title")  %>
        <%= request.getParameter("author")  %>
        <%= request.getParameter("date")  %>
    </body>
</html>
