<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
</head>
<body>

<h1>Products</h1>

<h1>${ msg }</h1>
<h2>Add Product Form</h2>
<form action="products" method="post">
	<input type="text" name="name" placeholder="Product Name"><br>
	<input type="text" name="manufacturer" placeholder="Product Manufacturer"><br>
	<input type="text" name="description" placeholder="Product Description"><br>
	<input type="number" name="price" placeholder="Product Price"><br>
	<input type="radio" name="inStock" value="true"><label>is in stock</label>
	<input type="radio" name="inStock" value="false"><label>out of stock</label><br>
	<input type="submit" value="submit">
</form>



</body>
</html>