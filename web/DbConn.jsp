<%@page import="com.mongodb.DBCollection"%>
<%@page import="com.mongodb.DB"%>
<%@page import="com.mongodb.MongoClient"%>
<% 
try{

    MongoClient client = new MongoClient();
    DB db = client.getDB("mamuns");
    DBCollection coll = db.getCollection("mamuns");
    out.println("DB Connected");
}
catch(Exception e ){
    out.println("DB Connection problem");
}

%>
