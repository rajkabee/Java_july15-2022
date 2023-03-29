<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add Product Form</h1>
	
	<form action="addProduct" method="POST">
		<input type="text" name="name" placeholder="product name"><br>
		<input type="text" name="manufacturer" placeholder="product manufacturer"><br>
		<input type="radio" name="active" value="true" selected> <label>Active</label>
		<input type="radio" name="active" value="false"> <label>Inactive</label> <br>
		<input type="submit" value="submit">
	</form>
</body>
</html>