<%-- 
    Document   : paiement
    Created on : Dec. 15, 2021, 2:06:40 p.m.
    Author     : isi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <form action="paiement" method="post">
            <fieldset>
                <legend>Paiement des reservations</legend>
                <div>
                    <label for="nom">Nom</label>
                    <input type="text" id="nom" name="nom" placeholder="Nom" required="required" maxlength="50" autofocus />
                </div>

                <div>
                    <label for="prenom">Prénom</label>
                    <input type="text" id="firstName" name="prenom" placeholder="Prénom" required="required" maxlength="50" />
                </div>

                <div>
                    <label for="phone">Téléphone</label>
                    <input type="tel" id="userPhone" name="phone" placeholder="514-888-9999" pattern="^\(?\d{3}\)?(-| )?\d{3}(-| )?\d{4}$" required="required" />
                </div>

                <div>
                    <label for="email">Courriel</label>
                    <input type="email" id="mail" name="email" placeholder="Courriel" required="required" maxlength="100" />
                </div>

                <div>
                    <label for="adresse">Adresse</label>
                    <input type="text" id="adresse" name="adresse" placeholder="Adresse" maxlength="2000" />
                </div>

                <div>
                    <label for="creditCard">Numero de Carte de Credit</label>
                    <input type="text" id="userAge" name="creditCard" maxlength="16" required="required" placeholder="9999-9999-9999-9999" required/>
                </div>
                
                <div>
                    <label for="expiration">Date d'expiration</label>
                    <input type="text" id="userAge" name="expiration" maxlength="6" required="required" placeholder="YYYY-MM" required/>
                </div>
                
                <div>
                    <label for="code">Code secret</label>
                    <input type="password" id="userAge" name="code" maxlength="3" minlength="3" required="required" placeholder="000" required/>
                </div>
            </fieldset>

            <div>
                <input type="submit" value="Soumettre" />
            </div>

        </form>
        <%@include file="footer.jsp" %>
    </body>
</html>
