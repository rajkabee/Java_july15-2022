<%@page import="webapp.entity.Product"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">

</head>
<body>
	<div class="container">
		<c:if test="${ not empty message }">
		<h5>message: ${ message }</h5>
		</c:if>
		<a href="addProduct">
			<button>Add Product</button>
		</a>
		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Name</th>
					<th scope="col">Price</th>
					<th scope="col">Quantity</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var='product' items="${products}">
				<tr >
					<th scope="row">${ product.id }</th>
					<td>${ product.name }</td>
					<td>${ product.unitPrice }</td>
					<td>${ product.quantityInStock }</td>
					<td>
					<a href="updateProduct?id=${ product.id }"><button class="btn btn-success btn-sm">Update</button></a>
					<button class="btn btn-danger btn-sm" onClick="deleteProduct(${product.id})">Delete</button>
					<td>
				</tr>
				
				</c:forEach>
			
			
				<%
					List<Product> products = (List<Product>) request.getAttribute("products");
					for(Product pd : products){
						out.print("<tr><td>"+pd.getId()+"</td><td>"
									+pd.getName()+"</td><td>"
									+pd.getUnitPrice()+"</td><td>"
									+pd.getQuantityInStock()+"</td></tr>");
					}
				%>
				
				
			</tbody>
		</table>
		<%! int age=57; String name="Samjhana Subedi"; %>
		<%=request.getAttribute("products") %>
		<br>
		<%=2+3 %>
		<br>
		<%=new Date() %>
		<br>
		<%=name %>
		<br>
		<%=age %>
		<%
			
			for(int i=0; i<5; i++){
				out.write("<h1>Hello</h1>");
			}
		
		%>
		

	</div>
</body>
<script type="text/javascript">
	function deleteProduct(id){
		if(window.confirm("Delete Product? ")){
			var xhttp = new XMLHttpRequest();
			  xhttp.onreadystatechange = function() {
			    if (this.readyState == 4 && this.status == 200) {
			     window.alert("Product deleted successfully!");
			     //window.location.replace("http://localhost:8080/webapp/products");
			     window.location.reload();
			    }
			  };
			  xhttp.open("post", "deleteProduct?id="+id, true);
			  xhttp.send();
		}
	}

</script>
</html>