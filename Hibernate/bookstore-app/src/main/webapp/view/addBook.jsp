<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<title>Image Upload</title>
</head>
<body style="background-color: #f8f8f8; margin-left: 200px; margin-top: 40px; font-size: 25px;">
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand">Banking-Spring-Struts</a>
    </div>
    <ul class="nav navbar-nav">
      <!-- <li class="active"><a href="#">Home</a></li> -->
      <li><a href="welcome">Home</a></li>
    </ul>
  </div>
</nav>
	<h1>Add Book</h1>
	
	<s:form action="addBook.do" method="POST" enctype="multipart/form-data">
		<s:textfield name="bookName" label="Book Name"/>
		<s:textfield name="category" label="Category"/>
		<s:textfield name="price" type="number" label="Price"/>
		<s:textfield name="quantity" type="number" label="Quantity"/>
		<s:file name="image" label="Select Image" />
		<s:submit name="sumbit" value="Submit" />
	</s:form>
	
	<div style="margin-top: 40px; font-size: 30px; color: green;">
		<s:property value="msg" />
	</div>
	
</body>
</html>