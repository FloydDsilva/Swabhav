<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="assets/bootstrap-3.4.1-dist/css/bootstrap.css">
</head>
<body>
<div class="container-fluid">
<form action="login" method="post">
<div class="form-inline">
A/C Name:<input type="text" class="form-control" name="name" ></div>
<div class="form-inline">
Password:<input type="password" class="form-control" name="password"></div>
<div class="form-inline">
<input type="submit" class="btn btn-primary" value="Login"></div>
</form>
<h4 style="color: red;"><%=(request.getAttribute("message")==null)?"":(request.getAttribute("message")+" "+session.getAttribute("name")) %></h4>
</body>
</html>