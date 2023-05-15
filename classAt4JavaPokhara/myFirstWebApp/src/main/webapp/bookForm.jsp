<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Book Registration Form</h1>
	<form action="addBook" method="POST">
		<input type="text" name="isbn" placeholder="ISBN"><br>
		<input type="text" name="title" placeholder="Title"><br>
		<input type="text" name="author" placeholder="Author"><br>
		<input type="submit" value="submit">
	</form>
</body>
</html>