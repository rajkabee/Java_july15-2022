<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@page import="firstWebApp.Product"%>
<%@page import="java.util.List"%>
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
<a href="addProduct">
	<button>Add Products</button>
</a>
<table>
	<thead>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Manufacturer</th>
			<th>Price</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
		<%
			List<Product> products = (List<Product>)request.getAttribute("products");
			for(Product p:products){
				out.println("<tr><td>"+p.getId()+"</td><td>"+
							p.getName()+"</td><td>"+
							p.getManufacturer()+"</td><td>"+
							p.getPrice()+"</td></tr>"
						);
			}
		
		%>
		<c:forEach items="${products}" var="prod" >
			<tr>
				<td>${prod.getId()}</td>
				<td>${prod.name}</td>
				<td>${prod.manufacturer}</td>
				<td>${prod.price}</td>
				<td>
					<a href="products/update?id=${prod.getId()}"><button>Update</button></a>
				</td>
			</tr>
		</c:forEach>
	</tbody>
</table>	

</body>
</html>