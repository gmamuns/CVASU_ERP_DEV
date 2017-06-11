
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="lib/bootstrap.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>Student Page</h1>
        <form method="post" action="insertDB">
            Insert the Query:<br>
            <input type="text" name="query" value="Please give Mongo Query"><br><br>
            <input type="submit" value="Submit">

        </form>

    </body>
</html>
