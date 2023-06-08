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
<h5>${message}</h5>
<%= request.getAttribute("message") %>
<%= new Date() %>
<%! int age=25; %>
<%
	for(int i=0; i<10; i++){
		out.print("<p>Hello Guys!</p>");
	}
%>
<h1>Products</h1>

</body>
</html>