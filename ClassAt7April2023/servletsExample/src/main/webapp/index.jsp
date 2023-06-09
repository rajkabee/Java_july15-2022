<%@page import="java.util.ArrayList"%>
<html>
<body>
<h2>Hello World!</h2>
<a href="products"><h4>products</h4></a>


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
</body>
</html>
