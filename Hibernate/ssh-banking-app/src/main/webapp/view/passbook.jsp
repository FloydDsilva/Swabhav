<%@page import="com.techlabs.model.TransactionLog"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Passbook</title>
<link rel="stylesheet" href="assets/bootstrap-3.4.1-dist/css/bootstrap.css">
</head>
<body>
<%@ include file="nav.jsp" %>
<div class="container-fluid">
		<a class="btn btn-primary" style="float: right;" href="passbookDownload"><label class="glyphicon glyphicon-download"></label>Download</a>
		<table class="table table-hover">
			<tr>
			<thead>
				<th>Name</th>
				<th>Amount</th>
				<th>Transaction</th>
				<th>Date</th>
			</thead>
			</tr>
			<tbody>
		<s:iterator value="transactions">
			<tr>
				<td><s:property value="name"/></td>
				<td><s:property value="amount"/></td>
				<td><s:property value="transactionType"/></td>
				<td><s:property value="transactionDate"/></td>
		</tr>
		</s:iterator>
		</tbody>
		</table>
	</div>
</body>
</html>