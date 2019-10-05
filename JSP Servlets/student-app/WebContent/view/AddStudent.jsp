<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
<link rel="stylesheet" href="assets/bootstrap-3.4.1-dist/bootstrap-3.4.1-dist/css/bootstrap.css">
</head>
<body>
<div class="container-fluid">
<form action="addStudent" method="post">
<div class="form-inline">
Name:<input type="text" class="form-control" name="name" value=<%= (request.getAttribute("name")==null)?"":(request.getAttribute("name")) %>></div>
<div class="form-inline">
Roll No:<input type="number" class="form-control" name="rollNo" value=<%= (request.getAttribute("rollNo")==null)?"":(request.getAttribute("rollNo")) %>></div>
<div class="form-inline">
Age:<input type="number" class="form-control" name="age" value=<%= (request.getAttribute("age")==null)?"":(request.getAttribute("age")) %>></div>
<div class="form-inline">
<input type="submit" class="btn btn-primary" value="Add Student"></div>
</form>
</div>
</body>
</html>