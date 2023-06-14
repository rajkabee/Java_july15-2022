<%@page import="jakarta.servlet.http.Cookie"%>
<%@page import="java.util.ArrayList"%>
<html>
<body>
<h2>Hello World!</h2>
<a href="products"><h4>products</h4></a>

<h1>Session Object</h1>
<form action="sessionHandler" method="POST">
	<input type="text" name="item" placeholder="item name"><br>
	<input type="submit" value="submit">
</form>
<ol>
<%
ArrayList<String> items = (ArrayList<String>)request.getAttribute("items");
if(items!=null){
	for(String item:items){
		out.print("<li>"+item+"</li>");
	}
}
	
%>
</ol>
<h1>Cookie Handler</h1>
<form action="cookieHandler" >
	<input type="text" name="name" placeholder="Name"><br>
	<input type="submit" value="Submit">

</form>
<%
	Cookie[] cookies = request.getCookies();
	if(cookies!=null){
		for(Cookie cookie: cookies){
			 if(cookie.getName().equals("username")){ 
				out.print("Username: "+cookie.getValue());
			}
		}
	}

%>
</body>
</html>
