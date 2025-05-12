<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>course</title>
</head>
<body >
<div style="display: flex;flex-direction: column;" >
<h1 >sing in</h1>
<form action="account" method="get" style="align-items: center">
    <table>
        <tr><td>first name :</td><td>
            <input type="text" name="first_name">
        </td></tr>
        <tr><td>last name :</td><td>
            <input type="text" name="last_name">
        </td></tr>
        <tr><td>email :</td><td>
            <input type="text" name="email">
        </td></tr>
        <tr><td>phone number :</td><td>
            <input type="number" name="phone">
        </td></tr>
        <tr><td>password :</td><td>
            <input type="password" name="password">
        </td></tr>
        <tr><td>confirm password :</td><td>
            <input type="password" name="valpass">
        </td></tr>
        <tr><td rowspan="2">
            <a href="login.jsp">if u already had an account !!</a><br>
            <input type="submit" value="sign in">
        </td></tr>
    </table>
</form>
</div>
</body>
</html>