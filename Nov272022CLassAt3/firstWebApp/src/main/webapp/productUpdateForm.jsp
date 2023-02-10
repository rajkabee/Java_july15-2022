<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Update Form</title>
</head>
<body>
<h1>Product Update Form</h1>
<form action="update" method="POST">
		<input hidden type="text" name="id" value="${product.getId()}">
		<label>Name: </label>
		<input type="text" name="name" value="${product.getName()}">
		<br> 
		<label>Manufacturer: </label>
		<input type="text" name="manufacturer" value="${product.getManufacturer()}">
		<br> 
		<label>Price: </label>
		<input type="number" step=0.01 name="price" value="${product.getPrice()}">
		<br> 
		<input type="submit" value="Submit">
		
	</form>
</body>
</html>