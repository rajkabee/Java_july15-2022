<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Form</title>
</head>
<body>
<h1>Add New Product</h1>
    <form action="addProduct" method="post">
        <label for="name">Name: </label><br>
        <input type="text" name = "name" ><br>
        <label for="manufacturer">Manufacturer: </label><br>
        <input type="text" name="mnufacturer"><br>
        <label for="description">Description: </label><br>
        <input type="text" name="description"><br>
        <label for="price">Price: </label><br>
        <input type="text" name="price"><br>
        <label for="isAvalable">Is Availabel: </label><br>
        <input type="radio" name="isAvailable" value="true"><label>Yes</label><br>
        <input type="radio" name="isAvailable" value="false"><label>No</label><br>
        <input type="submit" value="Submit">



    </form>
</body>
</html>