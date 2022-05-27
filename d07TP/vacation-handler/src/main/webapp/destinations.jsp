<%-- 
    Document   : Reservation
    Created on : Dec 10, 2021, 9:59:25 AM
    Author     : isi
--%>

<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Destination"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% ArrayList<Destination> mesDestination = (ArrayList<Destination>)request.getAttribute("ListDestinations"); %>
<% HashMap<Integer, Integer> testpanier = (HashMap<Integer, Integer>)session.getAttribute("panier"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>JSP Page</title>
    </head>
    <body>
        <header>
            <div>
                <img src="src" alt="logo"/>
            </div>
            <nav>
                <ul>
                    <li><a href="/vacation-handler/PageDestinationController">Home</a></li>
                    <li><a href="/vacation-handler/PageDestinationController">Reservation</a></li>
                    <li><a href="/vacation-handler/PageDestinationController">Register</a></li>
                </ul>
            </nav>
        </header>
        <main>
            <h1>List de destination</h1>
            <form action="/vacation-handler/PageDestinationController">
                <div>
                    <select name="cat">
                        <option value="1">Summer</option>
                        <option value="2">Winter</option>
                        <option value="3">Urbain</option>
                        <option value="4">All year</option>
                    </select>
                </div>
                <input type="submit" value="filter">
            </form>
                <% for (Destination destination : mesDestination) {%>
                    <div>
                        <h2><%= destination.getNom() %></h2>
                        <img src="images/<%= destination.getNom().toLowerCase() %>0.jpg" alt="<%= destination.getNom() %>"/>
                        <div><a href="/vacation-handler/PageDestinationController?reservation=<%= destination.getDestination_id() %>">Reserver</a></div>
                        <div><a href="/vacation-handler/PageDestinationController?panier=<%= destination.getDestination_id() %>&catPanier=<%= destination.getDestination_id() %>">Ajouter au panier</a></div>
                        <div></div>
                    </div>
            <% }%>
        </main>
        <footer></footer>
    </body>
</html>
