<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<s:form action="login">
<s:textfield name="userName" label="UserName"></s:textfield>
<s:textfield name="password" label="Password" type="password"></s:textfield>
<s:submit value="Login"></s:submit>
</s:form>
<s:property value="errorMsg"/>
</body>
</html>