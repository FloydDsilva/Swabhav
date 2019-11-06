<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">AurionPro BookStore</a>
    </div>
    <ul class="nav navbar-nav">
      <!-- <li class="active"><a href="#">Register</a></li> -->
      <li><a href="welcome">Home</a></li>      
      <li><a href="register">Register</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
      <%if(session.getAttribute("loggedIn")!=null){ %>      
      <li><a href="profile"><%=session.getAttribute("loggedIn") %></a></li>
      <li><a href="logout"><span class="glyphicon glyphicon-log-out">Logout</a></li>
      <%}
      else{%>
      <ul class="nav navbar-nav navbar-right">
      <li style="margin-right:10px"><a href="login"><span class="glyphicon glyphicon-log-in"> Login</a></li>
      <%} %>
    </ul>
  </div>
</nav>