<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Get Cookie</title>
</head>
<body bgcolor=<%
String color="";
try{
    color=request.getCookies()[0].getValue();
    out.print(color);
}

catch(NullPointerException e){ color="";out.print(color);}

%> >
    <h1><% if(color.equals("")){
    %> Cookie Not Found  <% 
}
else{
    
    %> Cookie Found   <%
    }%></h1>
</body>
</html>