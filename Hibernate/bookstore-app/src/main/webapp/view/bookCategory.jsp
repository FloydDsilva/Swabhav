<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet"
	href="assets/bootstrap-3.4.1-dist/css/bootstrap.css">
<style type="text/css">
.row.no-gutter {
  margin-left: 0;
  margin-right: 0;
}

.row.no-gutter [class*='col-']:not(:first-child),
.row.no-gutter [class*='col-']:not(:last-child) {
  padding-right: 0;
  padding-left: 0;
}
</style>
</head>
<body>
	<%@ include file="nav.jsp"%>
	<div class="jumbotron">
		<center>
		<h3><b><s:property value='category'/></b></h3>
		</center>
	</div>
	<section class="container-fluid">
		<article class="row">
			<s:iterator value="books">
				<div class="col-xs-3"
					style="height: 250px; border-radius: 20px;">
					<img width="130"
						style="display: block; margin-left: auto; margin-right: auto;"
						height="150"
						src="<s:property value='image'/>">
					<center>
						<h4 style="overflow: hidden; max-width: 20ch;">
							<a href="bookInfo?id=<s:property value='id' />"><s:property
									value="bookName" /></a>
						</h4>
						<span>Price:<s:property value="price" /></span>
					</center>
				</div>
			</s:iterator>
		</article>
	</section>

</body>
</html>