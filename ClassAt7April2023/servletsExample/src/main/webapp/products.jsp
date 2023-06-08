<%@page import="java.util.List"%>
<%@page import="servletsExample.model.Product"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
<style type="text/css">
	h1{
		text-align:center;
		color: gray;
	}
</style>
</head>
<body>
<h4><%=new Date() %></h4>
<h4><%! int x=123; %></h4>
<h1>Products</h1>
<table>
<tr>
	<th>Sn.</th>
	<th>Name</th>
	<th>Source</th>
	<th>Price</th>
</tr>
<%
	List<Product> products = (List<Product>)request.getAttribute("products");
	for(Product pd:products){
		out.write("<tr><td>"+pd.getId()+"</td><td>"+pd.getName()+"</td><td>"+pd.getManufacturer()+"</td><td>"+pd.getPrice()+"</td></tr>");
	}
%>
</table>

</body>
</html>