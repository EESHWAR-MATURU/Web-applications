<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculate Sum</title>
</head>
<body>
    <h1>Calculate Sum</h1>
    <form action="" method="post">
        Enter value for x: <input type="text" name="x"><br>
        Enter value for y: <input type="text" name="y"><br>
        <input type="submit" value="Calculate Sum">
    </form>
    <% 
    if (request.getMethod().equalsIgnoreCase("POST")) {
        int x = Integer.parseInt(request.getParameter("x"));
        int y = Integer.parseInt(request.getParameter("y"));
        int z = x + y;
        %>
        <p>Sum is <%= z %></p>
    <% } %>
</body>
</html>