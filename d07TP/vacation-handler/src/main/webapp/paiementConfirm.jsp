<%-- 
    Document   : paiementConfirm.jsp
    Created on : Dec. 16, 2021, 12:23:44 a.m.
    Author     : isi
--%>

<%@page import="model.Panier"%>
<%@page import="model.Paiement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Paiement paiement = (Paiement)request.getAttribute("paiement");
    Panier panier = (Panier)session.getAttribute("panier");
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
                <p>Nom : <%=paiement.getNom()%></p>
                <p>Prenom : <%=paiement.getPrenom()%></p>
                <p>Telephone : <%=paiement.getTelephone()%></p>
                <p>Email : <%=paiement.getEmail()%></p>
                <p>Adresse : <%=paiement.getAdresse()%></p>
                <p>Carte de credit : ****</p>
            </section>
            <section>
                
            </section>
        </main>
        
        <%@include file="footer.jsp" %>
    </body>
</html>
