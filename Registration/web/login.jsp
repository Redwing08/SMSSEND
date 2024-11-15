<%-- 
    Document   : index
    Created on : Nov 14, 2024, 8:41:35 AM
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
        <form action="<%= request.getContextPath() %>/reg" method ="post">
            <label for="name">Name:</label><br>
        <input type="text" id="name" name="name" required><br><br>
        
        
        
        <input type="submit" value="Login"><br><br>
        
        
        </form>
    </body>
</html>
