<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Profile</title>
<link rel="stylesheet" href="assets/bootstrap-3.4.1-dist/css/bootstrap.css">
</head>
<body>
<%@ include file="nav.jsp" %>
<div class="container-fluid jumbotron">
<h3>Total Balance : <s:property value="balance"/></h3><br>
<h3>User : <%=session.getAttribute("name") %></h3><br>
<a class="btn btn-primary" href="transaction">Transaction</a>
<a class="btn btn-primary" href="passbook">Passbook</a>
</div>
</body>
</html>