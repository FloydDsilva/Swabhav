<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Student</title>
</head>
<body>
<s:form action="edit.do">

<h4>Id: <s:property value="id"/></h4>
<s:textfield name="name" label="Name"></s:textfield>
<s:textfield name="rollNo" label="Roll No."></s:textfield>
<s:textfield name="age" label="Age"></s:textfield>
<s:submit value="Update"></s:submit>
</s:form>
</body>
</html>