<%-- 
    Document   : register
    Created on : 5 févr. 2016, 16:56:18
    Author     : xavier_ng
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <img src="logo.png" alt="logo PedoBook"/>

        <form method="POST" action="">
            <label> Name </label> <input type="text" name="name"/>
            <label> Surname </label> <input type="text" name="surname"/>
            <label> Birthdate </label> <input type="text" name="birthdate"/>
            <label> Username </label> <input type="text" name="username"/>
            <label> Password </label> <input type="text" name="pwd"/>
        </form>

        <div>
            <button> Login </button>
            <button><a href="/register.jsp">Register</a></button>
        </div>
    </body>
</html>
