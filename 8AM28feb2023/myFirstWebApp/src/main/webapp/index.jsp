<!DOCTYPE html>
<%@ page import="java.util.Date" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Home Page</h1>
<%="Hello"%>
<br>
<%= new Date()%>
<br>
<%=45+34 %>
<br>
<%! String name="Kabiraj Shrestha"; %>
<%=name %>
<br>
<%
	String msg = name+", welcome to my first web application!";
	out.append(msg+"<br>");
	out.append("Expression are used to output data to the page!<br>");
	out.append("Declaration are used to declare and assign variables!<br>");
	out.append("scrplets are used to insert larger block of java code in JSP!<br>");
%>



</body>
</html>