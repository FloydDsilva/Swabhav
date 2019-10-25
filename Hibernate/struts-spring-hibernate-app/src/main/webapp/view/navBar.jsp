<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Student-App</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="/struts-spring-hibernate-app/viewStudents">View</a></li>
      <!-- <li><a href="/struts-spring-hibernate-app/view/addStudent.jsp">Add</a></li> -->
      <li><a href="addStudent">Add</a></li>
      <%if(session.getAttribute("userName")!=null){ %>
	<li><a><%=session.getAttribute("userName") %></a></li>
	<li><a href="logout" class="glyphicon glyphicon-log-out">Logout</a></li>
	<%} %>
    </ul>
  </div>
</nav>
