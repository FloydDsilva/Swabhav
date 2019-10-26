<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title>Struts 2 image retrieve example- Websparrow.org</title>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}
</style>
</head>
<body style="background-color: #f8f8f8; margin-left: 100px; margin-top: 20px; font-size: 20px;">
	<h1>Struts 2 retrieve Image from Database example</h1>
	<s:form action="Image" method="POST">
		<button type="submit">Fetch Records</button>
	</s:form>
	<div style="margin-top: 40px; margin-right: 100px;">
		<table style="width: 90%; text-align: center;">
			<thead>
				<tr style="background-color: #E0E0E1;">
					<th>ID</th>
					<th>NAME</th>
					<th>Image</th>
				</tr>
			</thead>
			<s:iterator value="dataList">
				<tr>
					<td>
						<s:property value="id" />
					</td>
					<td>
						<s:property value="name" />
					</td>
					<td>
						<img width="100" height="100" src="<s:url value='Image.action?id='/><s:property value='id' />">
					</td>
				</tr>
			</s:iterator>
		</table>
	</div>
</body>
</html>