<%-- 
    Document   : header
    Created on : Dec 5, 2021, 10:45:49 PM
    Author     : jeetic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<header>
    <div id="container_navbar">
        <img id="header_logo" src="logo/memory.png" alt="memory">

        <!--
        <a id="header_logo_link" href="index.html">
            <img id="header_logo" src="logo/memory.png" alt="memory_logo" />
        </a>
        -->

        <h1 id="header_title">Gestion de vacances</h1>

        <nav id="burger_menu_mobile">
            <a id="burger_menu_mobile_inner" href="#">
                <!-- <a id="burger_menu_mobile_inner" href="#" onclick="burger_deroule()"> -->
                <span></span>
                <span></span>
                <span></span>
            </a>
            <ul>
                <li class="lien"><a href="index">Accueil</a></li>
                <li class="lien"><a href="destination">Destinations</a></li>
                <li class="lien"><a href="reservations">Reservations</a></li>
                <li class="lien"><a href="panier">Destinations souhaitees</a></li>
            </ul>
        </nav>

    </div>
</header>
