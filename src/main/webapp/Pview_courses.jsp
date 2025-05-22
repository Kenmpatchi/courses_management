<%--
  Created by IntelliJ IDEA.
  User: hamza bettaibi
  Date: 5/11/2025
  Time: 11:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>courses</title>
    <link rel="stylesheet" href="view_style.css">
</head>
<body>
<script src="logout.js"></script>
    <h1>List of courses</h1>
      ${courses}
      <a href="Padd_courses.jsp?group_id=<%=request.getAttribute("group_id")%>">add course from here 👌</a>
</body>
</html>
