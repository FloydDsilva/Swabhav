<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transaction</title>
<link rel="stylesheet" href="assets/bootstrap-3.4.1-dist/css/bootstrap.css">
<style type="text/css">
label{
color: black !important;}
</style>
</head>
<%@ include file="nav.jsp" %>
<body>
<div class="container-fluid">
<s:form action="transaction.do">
<div class="form-inline">
	<s:textfield name="amount" class="form-control" label="Amount"></s:textfield>
</div>
<s:radio list="{'Deposit','Withdraw'}" name="transaction" value="'Deposit'"></s:radio>
<s:submit class="btn btn-primary" value="Submit" />
</s:form>
<h4 style="color: red;"><s:property value="message" /> </h4>
</div>
</body>
</html>