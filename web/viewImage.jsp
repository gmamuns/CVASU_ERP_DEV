<%@page import="java.util.Base64"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : view
    Created on : Mar 11, 2020, 11:55:20 AM
    Author     : ASST PROGRAMMER
    Source : https://www.roseindia.net/jdbc/display-data-database.shtml
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View All Data</title>
    </head>
    <body>
        <%
            String dbURL = "jdbc:mysql://localhost:3306/test";
            String dbUser = "root";
            String dbPass = "";

            DriverManager.registerDriver(
                    new com.mysql.jdbc.Driver());
            Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPass);

            // constructs SQL statement
            String sql = "SELECT * FROM contacts"; // contacts: id(int), firstname(varchar), lastname(varchar), image(mediumblob)
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
        %>
        <TABLE cellpadding="15" border="1" style="background-color: #ffffcc;">

            <%while (rs.next()) {
                    byte[] imgData = rs.getBytes(4); // blob field 
                    String encode = Base64.getEncoder().encodeToString(imgData);
            %>
            <TR>
                <TD><%=rs.getInt(1)%></TD>
                <TD><%=rs.getString(2)%></TD>
                <TD><%=rs.getString(3)%></TD>
                <TD><img src="data:image/jpeg;base64,<%=encode%>" width="100" height="100"/></TD>
            </TR>
            <% }
                rs.close();
                statement.close();
                conn.close();
            %>

        </TABLE>
    </body>
</html>
