<script src="http://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript" src="assets/bootstrap-3.4.1-dist/js/bootstrap.js"></script>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">AurionPro BookStore</a>
    </div>
    <ul class="nav navbar-nav">
      <!-- <li class="active"><a href="#">Register</a></li> -->
      <li><a href="welcome">Home</a></li> 
      <%if(session.getAttribute("loggedIn")==null){ %>     
      <li><a href="register">Register</a></li>
      <%} %>
      <li><a href="addBook">Add Book</a></li>
      <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Category <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="bookCategory?category=Comedy">Comedy</a></li>
            <li><a href="bookCategory?category=Romance">Romance</a></li>
            <li><a href="bookCategory?category=Thriller">Thriller</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">One more separated link</a></li>
          </ul>
        </li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
      <%if(session.getAttribute("loggedIn")!=null){ %>      
      <li><a href="viewProfile"><%=session.getAttribute("loggedIn") %></a></li>
      <li><a href="logout"><span class="glyphicon glyphicon-log-out">Logout</a></li>
      <%}
      else{%>
      <ul class="nav navbar-nav navbar-right">
      <li style="margin-right:10px"><a href="login"><span class="glyphicon glyphicon-log-in"> Login</a></li>
      <%} %>
    </ul>
  </div>
</nav>