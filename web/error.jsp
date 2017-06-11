<%-- 
    Document   : error
    Created on : Jun 3, 2017, 12:58:37 AM
    Author     : mamuns
--%>
<%@ page isErrorPage="true" %>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page</title>
    </head>
    <body>
        <h1>Opps an error occured</h1>
        Exception is: <%= exception %>  
    </body>
</html>
