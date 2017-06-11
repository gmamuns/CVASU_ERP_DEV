<%-- 
    Document   : student
    Created on : May 29, 2017, 12:05:24 AM
    Author     : mamuns
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Student Page</h1>
        <form method="post" action="insertDB">
            Insert the Query:<br>
            <input type="text" name="query" value="Mouse"><br><br>
            <input type="submit" value="Submit">

        </form>

    </body>
</html>
