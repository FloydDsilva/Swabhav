<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transaction</title>
<link rel="stylesheet" href="assets/bootstrap-3.4.1-dist/css/bootstrap.css">
</head>
<body>
<div class="container-fluid">
<form action="transaction" method="post">
<div class="form-inline">
Amount:<input type="text" class="form-control" name="amount" ></div>
<label class="radio-inline"><input type="radio" name="transaction" value="Deposit" checked>Deposit</label>
<label class="radio-inline"><input type="radio" name="transaction" value="Withdraw">Withdraw</label>
<div class="form-inline">
<input type="submit" class="btn btn-primary" value="Submit"></div>
</form>
<h4 style="color: red;"><%=(request.getAttribute("message")==null)?"":(request.getAttribute("message")) %> </h4>
</body>
</html>