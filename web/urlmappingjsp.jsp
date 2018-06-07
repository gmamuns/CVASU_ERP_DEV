<%-- 
    Document   : urlmapping.jsp
    Created on : Jun 6, 2018, 7:25:26 AM
    Author     : mamuns
<%-- 

<%-- 
web.xml file e add korle sob requet ke urlmappingjsp.jsp e forward korbe.
<%-- 

<%-- 
 <servlet>
        <servlet-name>urlMapping</servlet-name>
        <jsp-file>/urlmappingjsp.jsp</jsp-file>
    </servlet>
    <servlet-mapping>
        <servlet-name>urlMapping</servlet-name>
        <url-pattern>/</url-pattern>
    </servlet-mapping>
  <error-page>
        <error-code>404</error-code>
        <location>/404.jsp</location>
    </error-page>
--%>

<%@page import="java.util.regex.Pattern"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



<%
    String pathUri = request.getRequestURI();   
    String baseUrl = request.getContextPath();
    
    String pageToFind = pathUri.substring(baseUrl.length() + 1).toLowerCase();

    if (pageToFind.isEmpty()) {
        pageToFind = pageToFind.concat("index");
    }

    if (pageToFind.contains(".jsp")) {
        pageToFind = pageToFind;
    } else {

        pageToFind = pageToFind.concat(".jsp");
    }
%>
<!DOCTYPE html>
<html>
    <body>
        <jsp:forward page="<%=pageToFind%>"></jsp:forward>
    </body>
</html>
