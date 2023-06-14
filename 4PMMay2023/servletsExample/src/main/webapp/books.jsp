<%@page import="servletsExample.Book"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books</title>
</head>
<body>
<h3>${ username }</h3>
<%! 
	String address="Kathmandu"; 
	
	public String getAddress(){
		return address;
	}
%>
<h3><%=request.getAttribute("username") %></h3>
<h4><%= getAddress() %></h4>
<h1>Books</h1>
ISBN: ${ book.isbn }
<br>
Book Title: ${ book.title }
<br>
Author: ${ book.author }


<h3>Book: </h3>
<%
	Book book = (Book)request.getAttribute("book");
	out.append("ISBN: "+book.getIsbn()+"<br>");
	out.append("Title: "+book.getTitle()+"<br>");
	out.append("Author: "+book.getAuthor()+"<br>");

%>

</body>
</html>