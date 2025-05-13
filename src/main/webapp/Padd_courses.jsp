<%--
  Created by IntelliJ IDEA.
  User: hamza bettaibi
  Date: 5/11/2025
  Time: 1:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <div style="display: flex">
        <form action="addCourse" method="get">
          <table>
            <tr><td>
              put name of the course
            </td><td>
              <input type="text" name="name">
            </td></tr>
            <tr><td>
              put title of the course
            </td><td>
              <input type="text" name="title">
            </td></tr>
            <tr><td>
              put description:
            </td><td>
              <input type="text" name="description">
            </td></tr>
            <tr><td>
              put the content of the course :
            </td><td>
              <textarea name="main_content"></textarea>
            </td></tr>
            <tr><td rowspan="2">
              <input type="hidden" name="group_id" value=<%=request.getParameter("group_id")%>>
              <input type="submit" value="add">
            </td><</tr>
        </table>
      </form>
    </div>
  </body>
</html>
