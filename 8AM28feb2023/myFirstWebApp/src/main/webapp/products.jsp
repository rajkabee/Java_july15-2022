<!-- 
<%@page import="myFirstWebApp.entity.Product"%>
<%@page import="java.util.ArrayList"%>
 -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Products</h1>
<a href="addProduct"><button>Add Product</button></a>
<table>
	<thead>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Manufacturer</th>
			<th>Active</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="product" items="${products}">
			<tr>
				<td>${ product.id }</td>
				<td>${ product.name }</td>
				<td>${ product.manufacturer }</td>
				<td>${ product.active }</td>
			</tr>
		</c:forEach>
	
	
	
		<!-- 
		<%
			ArrayList<Product> products = (ArrayList<Product>)request.getAttribute("products");
			for(Product p:products){
				out.append("<tr><td>"+p.getId()+"</td><td>"+p.getName()+"</td><td>"+p.getManufacturer()+"</td><td>"+p.getActive()+"</td></tr>");
			}
		%>
		 -->
	</tbody>
</table>
</body>
</html>