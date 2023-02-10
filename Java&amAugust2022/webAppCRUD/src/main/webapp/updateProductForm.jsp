<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Update Product</h1>
	${product }
	<form action="updateProduct" method="POST">
		<input type="hidden" name="id" value="${product.id}">
		<input type="text" name="name" value="${product.name}"><br>
		<input type="text" name="description" value="${product.description}"><br>
		<input type="radio" name="inStock" ${product.inStock?"checked":""}><label>Is In Stock</label>
		<input type="radio" name="inStock" ${product.inStock?"":"checked"}><label>Not In Stock</label>
		<br>
		<input type="number" name="price" value="${product.price}"><br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>