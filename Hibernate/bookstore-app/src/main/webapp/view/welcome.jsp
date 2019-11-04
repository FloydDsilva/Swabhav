<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet" href="assets/bootstrap-3.4.1-dist/css/bootstrap.css">
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">AurionPro Bank</a>
    </div>
    <ul class="nav navbar-nav">
      <!-- <li class="active"><a href="#">Register</a></li> -->
      <li><a href="registration">Register</a></li>
      <li><a href="login">Login</a></li>
    </ul>
  </div>
</nav>
 <div class="jumbotron"><h1>Welcome to Aurionpro Bank</h1></div>
<div class="container-fluid">
		<table class="table table-hover">
			<tr>
			<thead>
				<th>Id</th>
				<th>Name</th>
				<th>Category</th>
				<th>Quantity</th>
				<th>Price</th>
			</thead>
			</tr>
			<tbody>
		<s:iterator value="books">
			<tr>
				<td><s:property value="id"/></td>
				<td><s:property value="bookName"/></td>
				<td><s:property value="category"/></td>
				<td><s:property value="quantity"/></td>
				<td><s:property value="price"/></td>
		</tr>
		</s:iterator>
		</tbody>
		</table>
	</div>
	<div class="container">
		<div class="row justify-content-center">
			<s:iterator value="books"  begin="0" end="2">
			<div class="col-xs-3" style="height:200px; background-color:red; border-radius:20px;margin-left:10px;">
			<h2><s:property value="bookName"/></h2>
			<span><s:property value="price"/></span>
			</div>
			</s:iterator>
			<div class="col-xs-3" style="height:200px; background-color:red; border-radius:20px;margin-left:10px;">
			<h2 class="glyphicon glyphicon-plus"></h2><br><br>
			<span>View more books</span>
			</div>
		</div>
	</div>
</body>
</html>