<%-- 
    Document   : detailsDestination
    Created on : Dec 12, 2021, 11:22:07 PM
    Author     : jeetic
--%>

<%@page import="model.Destination"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Destination destination = (Destination)request.getAttribute("destination");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <main>
            <section>
                <h2>Lieux a visiter</h2>
                <article><img src="images/<%=destination.getNomImage()%>.jpg" alt="<%=destination.getNomImage()%>"/></article>
            </section>
            <section>
                <h2>Details</h2>
                <article>
                    <p>Nom: <%=destination.getNom()%></p>
                    <p>Adresse: <%=destination.getAdresse()%></p>
                    <p>Pays: <%=destination.getVille().getPays().getNom_pays()%></p>
                    <p>Ville: <%=destination.getVille().getNom_ville()%></p>
                    <p>Prix: <%=destination.getCout()%>$</p>
                    <p>Rating: <%=destination.getRating()%></p>
                    <h3>Description</h3>
                    <p><%=destination.getDescription()%></p>
                    <a href="panier?id=<%=destination.getDestination_id()%>">A visiter</a>
                </article>
            </section>
        </main>
        <%@include file="footer.jsp" %>
    </body>
</html>
