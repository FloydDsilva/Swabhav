<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <% 
        String userName=request.getParameter("userName");
        String password=request.getParameter("password");

        if(userName.equals("admin")&&password.equals("admin")){
            %><h1>Welcome <%=userName%> </h1><%
        }
        else{%>
            <h1>Login Failed</h1>
            <a href="basicForm.html">Back</a>
        <%}
    %>
</body>
</html>