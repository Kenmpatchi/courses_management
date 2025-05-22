<%--
  Created by IntelliJ IDEA.
  User: hamza bettaibi
  Date: 5/12/2025
  Time: 11:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        body{
            background-color: wheat;
            font-family: Dubai;
            max-height: 100vh;
            overflow: auto;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
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
        textarea {
            width: 100%;
            max-width: 500px;
            height: 150px;
            padding: 10px;
            font-size: 16px;
            border: 2px solid #ccc;
            border-radius: 5px;
            resize: vertical;
            outline: none;
            transition: border-color 0.3s ease-in-out;
        }

        textarea:focus {
            border-color: #007bff;
            box-shadow: 0 0 5px rgba(0, 123, 255, 0.5);
        }
    </style>
</head>
<body>
<script src="logout.js"></script>
    <h1>update the course 😁</h1>
    <form action="updateCourse" method="get">
        <table>
            <tr><td>
                <label for="name"> put name of the course</label>
            </td><td>
                <input type="text" id="name" name="name">
            </td></tr>
            <tr><td>
                <label for="title">put title of the course</label>
            </td><td>
                <input type="text" id="title" name="title">
            </td></tr>
            <tr><td>
                <label for="description">put description:</label>
            </td><td>
                <input type="text" id="description" name="description">
            </td></tr>
            <tr><td colspan="2">
                <label for="main_content">put the content of the course :</label>
            </td></tr><tr><td colspan="2">
            <textarea name="main_content" id="main_content"></textarea>
        </td></tr>
            <tr><td colspan="2">
                <input type="hidden" name="course_id" value=<%=request.getParameter("course_id")%>>
                <input type="submit" value="update">
            </td></tr>
        </table>
    </form>
</body>
</html>
