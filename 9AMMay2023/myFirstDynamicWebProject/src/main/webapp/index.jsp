<%@page import="javax.sound.midi.SysexMessage"%>
<%@page import="java.util.ArrayList"%>
<%@page import="jakarta.servlet.http.Cookie"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>index.jsp</h1>
<a href="products"><h3>Products</h3></a>
<%
	Cookie[] cookies = request.getCookies();
	if(cookies!=null){
		for(int i=0; i<cookies.length-1; i++){
			out.print(cookies[i].getName()+" : "+cookies[i].getValue() +"<br>");
		}
	}
%>

<form action="cookieHandler" method="POST">
	<input type="text" name="name" placeholder="Name"><br>
	<input type="text" name="address" placeholder="address"><br>
	<input type="submit" value="submit">
</form>
<a href="cookieHandler">clear cookie</a> 

<form action="sessionHandler" method="POST">
	<input type="text" name="item" placeholder="Item"><br>
	
	<input type="submit" value="Add Item">
</form>
<ul>
<%
	
		ArrayList<String> items = (ArrayList<String>) session.getAttribute("items");
		if(items!=null){
			for(String item:items){
				out.print("<li>"+item+"</li>");
			}
		}
%>
</ul>
<a href="sessionHandler">clear session</a>
</body>
</html>