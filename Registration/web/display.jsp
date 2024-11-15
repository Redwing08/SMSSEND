<%-- 
    Document   : display
    Created on : Nov 14, 2024, 9:23:28 AM
    Author     : Steve
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!<%= session.getAttribute("name") %></h1>
    </body>
</html>
