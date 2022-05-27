<%-- 
    Document   : enregistrement
    Created on : Dec 15, 2021, 3:04:21 PM
    Author     : isi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <main>
            <form method="GET" action="enregistrementServlet">
                Nom:<input type="text" name="lname" required><br>
                Prenom:<input type="text" name="fname"required><br>
                date de naissance:<input type="date" name="date_naissance" required><br>
                Email:<input type="email" name="email"required><br>
                telephone:<input type="tel" name="telephone" required><br>                
                Mot de passe:<input type="text" name="pwd" required><br>
                Confirmation du mot de passe:<input type="text" name="cpwd" required><br>
                <input type="submit">   
                <input type="reset">
            </form>
            
        </main>
        <%@include file="footer.jsp" %>
    </body>
</html>
