<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="initial-scale=1, maximum-scale=1, user-scalable=no, width=device-width">
        <title> Login Page </title>
    </head>

    <body>
    <img src="logo.png" alt="logo PedoBook"/>

        <form method="POST" action="#">
            <label> Username </label> <input type="text" name="username"/>
            <label> Password </label> <input type="text" name="password"/>
        </form>

        <div>
            <button> Login </button>
            <button> <a href="<c:url value="/register.jsp"/>">Register</a> </button>
        </div>
    </body>
</html>