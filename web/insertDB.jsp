<%@page import="com.mongodb.util.JSON"%>
<%@page import="com.mongodb.DBObject"%>
<%@page import="com.mongodb.BasicDBObject"%>
<%@page import="com.mongodb.DBCollection"%>
<%@page import="com.mongodb.DB"%>
<%@page import="com.mongodb.MongoClient"%>

<%@ page errorPage="error.jsp" %>  
<%
String query = request.getParameter("query");

%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%=query%></h1>
        <%
        
        MongoClient client = new MongoClient();
	DB db = client.getDB("mamuns");
	DBCollection coll = db.getCollection("mamuns");
        BasicDBObject doc = new BasicDBObject();
        
        //https://www.mkyong.com/mongodb/java-mongodb-convert-json-data-to-dbobject/
        // convert JSON to DBObject directly
	DBObject dbObject = (DBObject) JSON.parse(query);
        
        //Insert Into the database
        coll.insert(dbObject);
        out.print(dbObject);
        
        %>
    </body>
</html>
