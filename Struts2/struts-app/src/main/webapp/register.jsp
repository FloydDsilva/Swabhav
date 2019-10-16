<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<style>
.tdErrorMessage{
	color:red;
}
</style>
<body>
<s:form action="registerDo">
	<s:textfield name="name" label="Name"></s:textfield>
	<s:textfield name="age" label="Age" ></s:textfield>
	<s:textfield name="address" label="Address"></s:textfield>
	<s:submit value="Resgister"></s:submit>
</s:form>
<div class="details">
<pre><s:property value="message"/></pre><br>
</div>
</body>
</html>