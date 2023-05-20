<%@page import="jakarta.servlet.http.Cookie"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Sessions</h1>
	<%=session.getAttribute("title") %>

	<h1>Cookies</h1>
	<%
		Cookie[] cookies = request.getCookies();
		if(cookies.length!=0 ||cookies!=null){
			for(Cookie cookie:cookies){
				if(cookie.getName()!="JSESSIONID"){
					out.print(cookie.getName()+" : "+cookie.getValue()+"<br>");
				}
			}
		}
	%>
	
	
	
	<form action="cookies" method="post">
		<input type="text" name="firstName" placeholder="First Name"><br>
		<input type="text" name="lastName" placeholder="Last Name"><br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>