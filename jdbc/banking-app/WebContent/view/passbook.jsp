<%@page import="com.techlabs.model.TransactionLog"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Passbook</title>
</head>
<body>
<div class="container-fluid">
		<table class="table table-hover">
			<tr>
			<thead>
				<th>Name</th>
				<th>Amount</th>
				<th>Transaction</th>
				<th>Date</th>
				<th>Edit</th>
				<th>Delete</th>
			</thead>
			</tr>
			<tbody>

				<%
					List<TransactionLog> transactions = (ArrayList<TransactionLog>) request.getAttribute("log");
					for (TransactionLog transaction : transactions) {
				%>
				<tr>
					<td><%=transaction.getName() %></td>
					<td><%=transaction.getAmount()%></td>
					<td><%=transaction.getTransactionType()%></td>
					<td><%=transaction.getTransactionDate()%></td>
				</tr>
				<%
					}
				%>
			</tbody>
		</table>
	</div>
</body>
</html>