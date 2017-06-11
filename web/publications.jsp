<%@page import="com.mongodb.BasicDBObject"%>
<%@include file="DbConn.jsp" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Publications Page</h1>
        <%
        BasicDBObject doc = new BasicDBObject("name", "jane")
		        .append("type", "database")
		        .append("count", 1)
		        .append("info", new BasicDBObject("x", 203).append("y", 102));
		coll.insert(doc);
        %>
    </body>
</html>
