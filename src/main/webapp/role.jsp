<%--
  Created by IntelliJ IDEA.
  User: hamza bettaibi
  Date: 5/12/2025
  Time: 5:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="view_style.css">
</head>
<body>
<script src="logout.js"></script>
<h1>List of Users</h1>
<%=request.getAttribute("users")%>
</body>
</html>
