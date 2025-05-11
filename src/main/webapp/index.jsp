<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>course</title>
</head>
<body>
<form action="addCourse" method="get">
    <input type="text" placeholder="put name of the course" name="name">
    <input type="text" placeholder="put title of the course" name="title">
    <input type="text" placeholder="put description" name="description">
    <textarea placeholder="put the content of the course" name="main_content"></textarea>
    <input type="submit" value="add">
</form>

</body>
</html>