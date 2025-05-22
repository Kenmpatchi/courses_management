<%--
  Created by IntelliJ IDEA.
  User: hamza bettaibi
  Date: 5/13/2025
  Time: 4:26 PM
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
    <h1>List of groupes</h1>
    ${groups}
    <a href="Padd_groups.jsp?professor_id=<%=request.getAttribute("professor_id")%>">add group from here ❤️</a>

</body>
</html>
