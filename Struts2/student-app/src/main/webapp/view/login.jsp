<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="assets/bootstrap-3.4.1-dist/bootstrap-3.4.1-dist/css/bootstrap.css">
<style type="text/css">
label{
color: black !important;}
</style>
</head>
<body>
<%@ include file ="navBar.jsp" %>
<div class="panel panel-primary">
<div class="panel-heading">
Login
</div>
<s:form action="login">
<div class="form-inline">
<s:textfield name="userName" label="UserName" class="form-control"></s:textfield></div>
<div class="form-inline">
<s:textfield name="password" label="Password" type="password"  class="form-control"></s:textfield></div>
<s:submit value="Login" class="btn btn-primary"></s:submit>
</s:form>
<s:property value="errorMsg"/>
</div>
</body>
</html>