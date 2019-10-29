<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

    <h1>Login</h1>
    <form method="post" action="login">

        <table>
            <tr>
                <td>Login: </td>
                <td><input name="txtUsername" type="text" value="${username}"></td>
            </tr>
            <tr>
                <td>Password: </td>
                <td><input name="txtPassword" type="password" value="${password}"></td>
            </tr>
        </table>
        <br>
        <input type="submit" value="Login">

    </form>


</body>
</html>
