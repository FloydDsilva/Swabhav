<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Profile</title>
<link rel="stylesheet" href="assets/bootstrap-3.4.1-dist/css/bootstrap.css">
</head>
<body class="container-fluid jumbotron">
<h3>Total Balance : <%=request.getAttribute("balance") %></h3><br>
<h3>User : <%=session.getAttribute("name") %></h3><br>
<a class="btn btn-primary" href="transaction">Transaction</a>
<a class="btn btn-primary" href="#">Passbook</a>
</form>
</body>
</html>