<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
<link rel="stylesheet" href="assets/bootstrap-3.4.1-dist/css/bootstrap.css">
</head>
<body>
<%@ include file="nav.jsp" %>
<div class="container-fluid">
	<div class="row">
		<div class="col-xs-6">
			<img width="90%" style="height:80vh" src="<s:url value='Image.action?id='/><s:property value='id' />">
		</div>
		<div class="col-xs-6" style="margin-top:100px">
			<h3><b>Name:</b><s:property value="book.bookName"/></h3><br>
			<h4><b>Category:</b><s:property value="book.category"/></h4><br>
			<h4><b>Price:</b><s:property value="book.price"/></h4><br>
			<h4><a class="btn btn-success">Add to Cart <span class="glyphicon glyphicon-shopping-cart"></a></h4>
		</div>
	</div>
	
</div>
</body>
</html>