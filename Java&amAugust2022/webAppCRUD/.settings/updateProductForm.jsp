<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add New Product</h1>
<form action="addProduct" method="POST">
	<input type="text" name="name" placeholder="Product Name"><br>
	<input type="text" name="description" placeholder="Description"><br>
	<input type="radio" name="inStock" value="true"><label>Is In Stock</label>
	<input type="radio" name="inStock" value="false"><label>Not In Stock</label>
	<br>
	<input type="number" name="price" placeholder="Price"><br>
	<input type="submit" value="Submit">
</form>
</body>
</html>