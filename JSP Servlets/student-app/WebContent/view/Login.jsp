<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="assets/bootstrap-3.4.1-dist/bootstrap-3.4.1-dist/css/bootstrap.css">
</head>
<body>
<div class="container-fluid">
<form action="auth" method="post">
<div class="form-inline">
UserName:<input type="text" class="form-control" name="userName" value=<%= (request.getAttribute("userName")==null)?"":(request.getAttribute("userName")) %>></div>
<div class="form-inline">
Password:<input type="password" class="form-control" name="password" value=<%= (request.getAttribute("password")==null)?"":(request.getAttribute("password")) %>></div>
<div class="form-inline">
<input type="submit" class="btn btn-primary" value="Login"></div>
</form>
<h4 style="color: red;"><%=(request.getAttribute("message")==null)?"":(request.getAttribute("message")) %></h4>
</body>
</html>