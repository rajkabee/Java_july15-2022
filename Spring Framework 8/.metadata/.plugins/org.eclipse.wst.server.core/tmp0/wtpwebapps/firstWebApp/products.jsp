<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.io.PrintWriter"%>
<%@page import="firstWebApp.model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h1>Products</h1>
		<a href="/firstWebApp/addProduct"><button>Add Product</button></a>
		<table>
			<thead>
				<tr>
					<th>Sn.</th>
					<th>Product Name</th>
					<th>Manufacturer</th>
					<th>Price</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="product" items="${products}">
					<tr>
					<td>${product.productId}</td>
					<td>${product.productName}</td>
					<td>${product.brand}</td>
					<td>${product.price}</td>
					<td></td>
					</tr>
				</c:forEach>
				
				
				<!--
				<%	ArrayList<Product> products = (ArrayList<Product>)request.getAttribute("products");
					for(Product p :products ){
						out.print("<tr><td>"+p.getProductId()+"</td><td>"+p.getProductName()+"</td><td>"+p.getBrand()+"</td><td>"+p.getPrice()+"</td><td></td></tr>");
					}
				%>
				-->
			</tbody>
			
		</table>
		
				<%="Hello World" %>
				<%! int age = 12; %>
				<%=age %>
</body>
</html>