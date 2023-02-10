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

	<form action="SessionServlet" method="POST">
		<input type="text" name="item" placeholder="item name"><br>
		<input type="submit" value="submit">
	</form>
	
	<ul>
	<%
		ArrayList<String> list = (ArrayList<String>)request.getSession().getAttribute("list");
		for(String item:list){
			out.write("<li>"+item+"</li>");
		}
	%>
	
	</ul>

</body>
</html>