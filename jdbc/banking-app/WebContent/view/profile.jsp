<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Profile</title>
<link rel="stylesheet" href="assets/bootstrap-3.4.1-dist/css/bootstrap.css">
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">AurionPro Bank</a>
    </div>
    <ul class="nav navbar-nav">
      <!-- <li class="active"><a href="#">Register</a></li> -->
      <li><a href="transaction">Transaction</a></li>      
      <li><a href="passbook">Passbook</a></li>      
      <li><a href="#"><%=session.getAttribute("name") %></a></li>
      <li><a href="logout">Logout</a></li>
    </ul>
  </div>
</nav>
<div class="container-fluid jumbotron">
<h3>Total Balance : <%=request.getAttribute("balance") %></h3><br>
<h3>User : <%=session.getAttribute("name") %></h3><br>
<a class="btn btn-primary" href="transaction">Transaction</a>
<a class="btn btn-primary" href="passbook">Passbook</a>
</div>
</body>
</html>