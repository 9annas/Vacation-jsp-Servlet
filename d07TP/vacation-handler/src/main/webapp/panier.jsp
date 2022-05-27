<%-- 
    Document   : panier
    Created on : Dec. 16, 2021, 12:28:16 a.m.
    Author     : Badr
--%>

<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% HashMap<Integer, Integer> testpanier = (HashMap<Integer, Integer>)session.getAttribute("panier"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <main>
            <h1>Hello World!</h1>
            <%if (testpanier != null) {
                for (Map.Entry mapentry : testpanier.entrySet()) {%>
                    <%= mapentry.getKey()%><%= mapentry.getValue()%>    
            <%    }
                }
            %> 
        </main>
        <%@include file="footer.jsp" %>
    </body>
</html>
