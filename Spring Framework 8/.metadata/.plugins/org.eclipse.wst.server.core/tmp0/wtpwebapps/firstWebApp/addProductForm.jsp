<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Product Form</h1>
<form action="/firstWebApp/addProduct" method= "POST">
	<input type="hidden" name = "productId" value
    <label for="productName">Product Name: </label><br>
    <input type="text" name="productName" >
    <br>
    <label for="manufacturer">Manufacturer: </label><br>
    <input type="text" name="brand">
    <br>
    <label for="description">Product Description: </label><br>
    <textarea name="description" id="" cols="50" rows="4"></textarea>
    <br>
    <label for="price">Price: </label><br>
    <input type="number" step="0.01" name="price">
    <br>
    <label for="isInStock">Is Available: </label><br>
    <input type="radio" name="isInStock" value="true"><span>Yes</span>
    <input type="radio" name="isInStock" value="false"><span>No</span>

    <br>
    <input type="submit" value="Submit">
    </form>
</body>
</html>