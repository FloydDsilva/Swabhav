<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Welcome</title>
</head>
<body>
    <% 
            for(int i=1;i<=6;i++){ %>
    <h<%=i%>>Hello World <% String q=request.getParameter("developer");
    if(q==null)
    {out.print("");}
    else{out.print(q);}
    %> </h<%=i%>>
    <%}
        %>
    
</body>
</html>