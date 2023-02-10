
<%@page import="webapp.model.Product"%>
<%@page import="java.util.ArrayList"%>
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
<a href="addProduct"><button>Add Product</button></a>

<%=new Date() %>
<table>
	<thead>
		<tr>
			<th>Id.</th>
			<th>Name</th>
			<th>Manufacturer</th>
			<th>Description</th>
			<th>Price</th>
			<th>Is Available</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
	
<% 
	ArrayList<Product> products = (ArrayList<Product>)request.getAttribute("products"); 
	for(Product p:products){
		out.print(
				"<tr><td>"+p.getId()+
				"</td><td>"+p.getName()+
				"</td><td>"+p.getManufacturer()+
				"</td><td>"+p.getDescription()+
				"</td><td>"+p.getPrice()+
				"</td><td>"+p.isInStock()+
				"</td><td>"+
				"</td></tr>"
				);
	}
%>
 
	</tbody>

</table>





</body>
<style>
table{
	border: 1px solid #00bb00;
	border-radius: 20px;
	
}
th, td{
	border:none;
	border-collapse: collapse;
}

table{
	margin: auto;
}

tbody tr:nth-child(odd){
	background-color: #dddddd;
}
thead tr{
	background-color: #00bb00;
	color: white;
}
th, td{
	padding: 10px 25px;
	font-size: 20px;
	font-family: sans-serif;
}
thead tr th:first-child{
	border-radius: 20px 0px 0 0;
}
thead tr th:last-child{
	border-radius: 0 20px 0 0;
}

</style>
</html>