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
    <style>
        body{
            background-color: darkgray;
            font-family: Dubai;
            color: black;
            height: 100vh;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
        }
        h1{
            color: darkslategray;
        }
        form{
            width: 400px;
            height: 400px;
            border: 4px;
        }
        input{
            padding: 5px;
            font-size: 16px;
            border: 2px solid #ccc;
            border-radius: 5px;
            resize: vertical;
            outline: none;
            transition: border-color 0.3s ease-in-out;
        }
        input:focus{
            border-color: #007bff;
            box-shadow: 0 0 5px rgba(0, 123, 255, 0.5);
        }
    </style>
</head>
<body>
<script src="logout.js"></script>
<h1>update the group ☕</h1>
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
            <input type="submit" value="update">
        </td></tr></table>
</form>
</body>
</html>
