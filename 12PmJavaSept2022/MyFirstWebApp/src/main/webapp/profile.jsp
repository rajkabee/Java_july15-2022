
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Date"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p><%= new Date()%></p>
<h1>Profile</h1>
<%! String username = "Kabiraj Shrestha"; %><!-- declarations -->
<%=username %><!-- expression -->

${name}
<%=request.getAttribute("name")%>
<form action="profile" method="POST">
	<input type="text" name="name" placeholder="name"><br>
	<input type="submit" value="submit">
</form>
<ul>
<%
	String[] fruits = {"Mangoes", "Apples", "Bananas", "papayas", "Grapes"};
	for(int i=0; i<5; i++){
		out.write("<li>"+fruits[i]+"</li>");
	}

%>
</ul>
<h1>names</h1>
<ol>
<%
	ArrayList<String> names =(ArrayList<String>) request.getAttribute("names");
		for(String var:names){
			out.write("<li>"+var+"</li>");
		}

%>

<core:forEach var="name" items="${names}">
${name} <br/>
</core:forEach>

</ol>

</body>
</html>





