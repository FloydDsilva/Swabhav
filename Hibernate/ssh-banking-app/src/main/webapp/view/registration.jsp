<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="assets/bootstrap-3.4.1-dist/css/bootstrap.css">
<title>Registration</title>
<style>

.errorMessage {
	color: red;
}

label {
	color: black ! important;
}

.loginPanel {
	height: 50%;
	width: 30%;
	margin-left: 30%;
}

</style>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand">Aurionpro Bank</a>
    </div>
    <ul class="nav navbar-nav">
      <!-- <li class="active"><a href="#">Home</a></li> -->
      <li><a href="welcome">Home</a></li>
    </ul>
  </div>
</nav>
<div class="panel panel-primary loginPanel">
			<div class="panel-heading">
				<span class="heading">Registration</span>
			</div>
			<div class="panel-body">
				<s:form method="post" action="registration.do">
					<div class="form-inline">
						<s:textfield name="accName" class="form-control"
							label="Name "></s:textfield>
					</div>
					<div class="form-inline">
						<s:textfield name="accPassword" type="password" class="form-control"
							label="Password "></s:textfield>
					</div>
					<div class="form-inline">
						<s:textfield name="balance" type="number" class="form-control"
							label="Opening Balance "></s:textfield>
					</div>
					<s:submit value="Register" class="btn btn-primary"></s:submit>
				</s:form>
			</div>
		</div>
	<h1>
		<s:property value="message" />
	</h1>
</body>
</html>