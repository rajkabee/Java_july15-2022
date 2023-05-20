<%@page import="java.util.List"%>
<%@page import="pojo.Book"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jakarta/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html lang="en"
      xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html"
      xmlns:c="http://xmlns.jcp.org/jsf/core">
<!-- <html xmlns:c="http://xmlns.jcp.org/jsp/jstl/core"> -->
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.html" %>
<h1>home Jsp</h1>
<%=session.getAttribute("title") %>
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
	<c:forEach items="${ books }" var="book">
		<tr>
		<td>${ book.isbn }</td>
		<td>${ book.title}</td>
		<td>${ book.author}</td>
		</tr>
	</c:forEach>
	
	
	
	
</table>


</body>
</html>