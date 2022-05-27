<%-- 
    Document   : login
    Created on : Dec 15, 2021, 11:58:18 PM
    Author     : isi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% String msg =(String) request.getAttribute("msg"); 
if(msg==null){
    msg="";
}%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>index</title>
    </head>
    <body>
        <form method="GET" action="loginServlet">
            <p color="red" align="center"><%=msg%></p>
        <div bg-color="blue" width="30" align="center" margin-top="20">
            E-mail<input type="email" name="email" required=""><br>
            Password<input type="text" name="password" required=""><br>
            <input type="submit" value="login">
        </div>
        </form>
    </body>
</html>