<%-- 
    Document   : index
    Created on : Dec 9, 2021, 12:09:22 AM
    Author     : jeetic
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Destination"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ArrayList<Destination> destinations = (ArrayList<Destination>) request.getAttribute("destinations");
    ArrayList<Destination> bestDeals = (ArrayList<Destination>) request.getAttribute("bestDeals");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>Accueil</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <main>
            <section>
                <div>
                    <img src="images/tunisie1.jpg" alt="Hotel Tunisie"/>
                </div>
            </section>
            <section>
                <h1>Les meilleurs deals</h1>
                <h2><%= bestDeals.size() %></h2>
                <%for (Destination bestDeal : bestDeals) {%>             
                <article>
                    <a href="destination?id=<%=bestDeal.getDestination_id()%>&nom=<%=bestDeal.getNomImage()%>"><img src="images/<%=bestDeal.getNomImage()%>.jpg" alt="<%=bestDeal.getNom()%>"/></a>
                </article>
                <%}%>
            </section>
        </main>
        <%@include file="footer.jsp" %>
    </body>
</html>
