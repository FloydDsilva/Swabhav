<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Students</title>
<link rel="stylesheet"
	href="assets/bootstrap-3.4.1-dist/bootstrap-3.4.1-dist/css/bootstrap.css">
</head>
<body>
<%if(session.getAttribute("userName")!=null){ %>
	<span><%=session.getAttribute("userName") %></span>
	<a href="logout">Logout</a>
	<%} %>
<a href="view/addStudent.jsp" class="btn btn-primary">Add</a>
<table class="table">
  <tr>
    <th>Id</th>
    <th>Name</th>
    <th>Roll No</th>
    <th>Age</th>
    <th>Edit</th>
    <th>Delete</th>
  </tr>
  <tbody>
<s:iterator value="students">
  <tr>
    <td><s:property value="id"/></td>
    <td><s:property value="name"/></td>
    <td><s:property value="rollNo"/></td>
    <td><s:property value="age"/></td>
    <s:url action="editStudent" var="urlTag" >
   		<s:param name="id"><s:property value="id"/></s:param>
	</s:url>

	<td><s:a href="%{urlTag}"><span class="btn">Edit</span></s:a></td>
    <s:url action="deleteStudent" var="urlTag" >
   		<s:param name="id"><s:property value="id"/></s:param>
	</s:url>

	<td><s:a href="%{urlTag}"><span class="btn btn-danger">Delete</span></s:a></td>
  </tr>
</s:iterator>
</tbody>
</table>



</body>
</html>