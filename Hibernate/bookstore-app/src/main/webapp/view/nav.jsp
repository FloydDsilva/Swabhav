<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">AurionPro Bank</a>
    </div>
    <ul class="nav navbar-nav">
      <!-- <li class="active"><a href="#">Register</a></li> -->
      <li><a href="transaction">Transaction</a></li>      
      <li><a href="passbook">Passbook</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">      
      <li><a href="profile"><%=session.getAttribute("name") %></a></li>
      <li><a href="logout"><span class="glyphicon glyphicon-log-out">Logout</a></li>
    </ul>
  </div>
</nav>