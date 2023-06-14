<%@page import="java.util.List"%>
<%@page import="servletsExample.Transaction"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transactions</title>
</head>
<body>
	<h1>Transactions</h1>
	<table>
		<thead>
			<th>Tx. Id.</th>
			<th>Sender</th>
			<th>Receiver</th>
			<th>Amount</th>
			<th>Action</th>
		</thead>
		<tbody>
		
		
	<%-- <%
		List<Transaction> txs = (List<Transaction>)request.getAttribute("transactions");
		if(txs!=null){
			for(Transaction tx: txs){
				out.append("<tr><td>"+
						tx.getId()+"</td><td>"+
						tx.getSender()+"</td><td>"+
						tx.getReceiver()+"</td><td>"+
						tx.getAmount()+"</td><td>"+
						"<a href='updateTransaction?id="+tx.getId()+"'>Update</a>"
						+"</td></tr>");
			}
		}
	%> --%>
	<c:forEach var="tx" items="${transactions}">
		<tr>
			<td>${tx.id}</td>
			<td>${tx.sender}</td>
			<td>${tx.receiver}</td>
			<td>${tx.amount}</td>
			<td>
				<a href="updateTransaction?id=${tx.id}">update</a>
			</td>
		</tr>
	</c:forEach>
		</tbody>
	</table>
	
	
	
	<h1>New Transaction Form</h1>
	
	<form action="transactions" method="POST">
		<input type="text" name="sender" placeholder="Sender"><br>
		<input type="text" name="receiver" placeholder="Receiver"><br>
		<input type="text" name="amount" placeholder="Amount"><br>
		<input type="Submit" value="submit">
	</form>
	
	<h1>Update Transaction Form</h1>
		<form action="transactions" method="POST">
		<input type="hidden" name="id" value="${transaction.id}">
		<input type="text" name="sender" value="${transaction.sender}"><br>
		<input type="text" name="receiver" value="${transaction.receiver}"><br>
		<input type="text" name="amount" value="${transaction.amount}"><br>
		<input type="Submit" value="submit">
	</form>
</body>
</html>


















