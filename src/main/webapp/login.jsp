<%--
  Created by IntelliJ IDEA.
  User: hamza bettaibi
  Date: 5/12/2025
  Time: 12:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="display: flex;flex-direction: column">
    <h1>welcome back 👌</h1>
<form action="account" method="post">
<table>
<tr><td>email :</td><td>
    <input type="email" name="email">
</td></tr>
<tr><td>password :</td><td>
    <input type="password" name="password">
</td></tr>
    <tr><td rowspan="2">
        <a href="index.jsp">sing in ☠️</a><br>
        <input type="submit" value="log in">
    </td></tr>
</table>
</form>
</div>
</body>
</html>
