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
        
        
        <label for="email">Email:</label><br>
        <input type="text"  id="email" name="email" required><br><br>
        

        <label for="password">Password:</label><br>
        <input type="password" id="password" name="country" required><br><br>
        
        <hr>
        
        <input type="submit" value="submit"><br><br>
        
        
        </form>
    </body>
</html>
