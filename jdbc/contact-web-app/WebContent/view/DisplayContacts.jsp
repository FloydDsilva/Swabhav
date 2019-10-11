<%@page import="com.techlabs.model.Contact"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="addContact">Add Contact</a>
	<table>
		<thead>
			<th>Name</th>
			<th>Email</th>
			<th>Contact</th>
		</thead>
		<tbody>
			<%
				List<Contact> contacts = (ArrayList<Contact>) request.getAttribute("contacts");
				for (Contact contact : contacts) {
			%>
			<tr>
				<td><%= contact.getFirstName()+" "+contact.getLastName() %></td>
				<td><%= contact.getEmail() %></td>
				<td><%= contact.getContact() %></td>
			</tr>
			<%} %>
		</tbody>
	</table>
</body>
</html>