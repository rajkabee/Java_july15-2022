<%@page import="webAppCRUD.model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	tr, td, th{
		border-collapse: collapse;
	}
	table{
		width: 70%;
		margin: auto;
		font-size: 24px;
		border: 2px solid grey;
		border-radius: 20px 20px 0 0;
	}
	td, th{
		padding: 5px;
		text-align: center;
	}
	tbody tr:nth-child(even){
		background-color: gray;
	}
	thead tr{
		background-color: green;
	}
	th{
		padding: 10px;
	}
	th:first-child{
		border-radius: 20px 0 0 0;
	}
	th:last-child{
		border-radius: 0 20px 0 0;
	}
</style>
</head>
<body>
<h2>PRODUCTS</h2>
<a href="addProduct"><button>Add New Product</button></a>


<table>
	<thead>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Description</th>
			<th>Price</th>
			<th>Is In Stock</th>
			<th>Actions</th>
		</tr>
	</thead>
	<tbody>
		<%
			ArrayList<Product> products =(ArrayList<Product>)request.getAttribute("products");
			for(Product p:products){
				out.print(
						"<tr><td>"+p.getId()+
						"</td><td>"+p.getName()+
						"</td><td>"+p.getDescription()+
						"</td><td>"+p.getPrice()+
						"</td><td>"+p.isInStock()+
						"</td><td>"+
						"<a href='updateProduct?id="+p.getId()+"'><button>Edit</button></a>"+
						"<a href='deleteProduct?id="+p.getId()+"'><button>Delete</button></a>"+
						"</td></tr>"
						);
				
			}
		%>
	</tbody>
</table>
</body>
</html>