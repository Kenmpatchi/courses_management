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
</head>
<body>
<form action="update" method="get">
    <table><tr><td>
        name group :
    </td><td>
        <input type="text" name="name">
    </td></tr>
        <tr><td>
            theme of the group :
        </td><td>
            <input type="text" name="theme">
        </td></tr>
        <tr><td rowspan="2">
            <input type="hidden" name="group_id" value=<%=request.getParameter("group_id")%>>
            <input type="hidden" name="professor_id" value=<%=request.getParameter("professor_id")%>>
            <input type="submit" value="add">
        </td></tr></table>
</form>
</body>
</html>
