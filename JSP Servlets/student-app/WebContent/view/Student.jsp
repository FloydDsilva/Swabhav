<%@page import="java.util.ArrayList"%>
<%@page import="com.techlabs.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="assets/bootstrap-3.4.1-dist/bootstrap-3.4.1-dist/css/bootstrap.css">
</head>
<body>
	<h1 class="jumbotron">Students</h1>
	<br>
	<a href="addStudent">Add</a>
	<div class="container-fluid">
		<table class="table table-hover">
			<tr>
			<thead>
				<th>Id</th>
				<th>Name</th>
				<th>Age</th>
				<th>Roll No</th>
			</thead>
			</tr>
			<tbody>

				<%
					List<Student> students = (ArrayList<Student>) request.getAttribute("students");
					for (Student student : students) {
				%>
				<tr>
					<td><%=student.getId()%></td>
					<td><%=student.getName()%></td>
					<td><%=student.getAge()%></td>
					<td><%=student.getRollNo()%></td>
				</tr>
				<%
					}
				%>
			</tbody>
		</table>
	</div>

</body>
</html>