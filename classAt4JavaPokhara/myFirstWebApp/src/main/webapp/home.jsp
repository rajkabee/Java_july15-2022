<%@page import="java.util.List"%>
<%@page import="pojo.Book"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>home Jsp</h1>
<h3><%=(String)request.getAttribute("message") %></h3>
<h3>${message}</h3>
<%=new Date() %>

<table>
	<tr>
		<th>Id</th>
		<th>Title</th>
		<th>Author</th>
	</tr>
	<%
		List<Book> books = (List<Book>)request.getAttribute("books");
		for(Book book:books){
			out.append("<tr><td>"+book.getIsbn()+"</td><td>"+book.getTitle()+"</td><td>"+book.getAuthor()+"</td></tr>");
		}
	%>
</table>


</body>
</html>