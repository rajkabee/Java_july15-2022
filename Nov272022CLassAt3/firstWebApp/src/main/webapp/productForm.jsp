<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Form</title>
</head>
<body>
<h1>Product Form</h1>
	<form action="addProduct" method="POST">
		<label>Name: </label>
		<input type="text" name="name" placeholder="Product Name">
		<br> 
		<label>Manufacturer: </label>
		<input type="text" name="manufacturer" placeholder="Manufacturer">
		<br> 
		<label>Price: </label>
		<input type="number" step=0.01 name="price" placeholder="Price">
		<br> 
		<input type="submit" value="Submit">
		
	</form>
</body>
</html>