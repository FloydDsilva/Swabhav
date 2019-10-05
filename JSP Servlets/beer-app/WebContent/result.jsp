<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
<h1 align="center">Beer Recommendations</h1>
<p>
<%List<String> results=(List<String>)request.getAttribute("results");
	for(String result:results){
		out.print("<br>try: "+result);
	}
%>
</body>
</html>