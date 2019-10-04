<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Set Cookie</title>
</head>
<body>
    <%
        Cookie color=new Cookie("color","red");
        color.setMaxAge(60*1);
        response.addCookie(color);
        if(color!=null){
    %><h1>Cookie Created</h1> <%
        }
    %>
    <a href="getCookie.jsp">View</a>
</body>
</html>