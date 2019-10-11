<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" href="assets/bootstrap-3.4.1-dist/css/bootstrap.css">
</head>
<body>
<form method="POST" action="registration">
<h1>Bank Registration</h1><br>
<div class="form-inline">
<label>Name: </label><input type="text" class="form-control" name="name"><br>
</div>
<div class="form-inline">
<label>Password: </label><input type="password" class="form-control" name="password"><br>
</div>
<div class="form-inline">
<label>Opening Balance: </label><input type="number" class="form-control" name="balance"><br>
</div>
<input type="submit" value="Submit" class="btn btn-primary">
</form>
</body>
</html>