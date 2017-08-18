<%-- 
    Document   : index
    Created on : Aug 18, 2017, 7:01:37 AM
    Author     : mamuns
--%>

<%@page import="utils.DBBL_balance_check"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>To check data</h1> http://localhost:8080/CVASU_ERP/index.jsp?txid=12345  
        <%
         
        DBBL_balance_check test = new DBBL_balance_check();
        String txnid = request.getParameter("txid"); //http://localhost:8080/CVASU_Convocation/check.jsp?txid=10253 
        String status = test.sendGet(Integer.parseInt(txnid));
        
        %>
        
        <h1><% out.println(status);%></h1>
    </body>
</html>
