<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Session</title>
</head>
<body>
    <%
        String oldVal="0",newVal="1";
        if(session.getAttribute("counter")==null){
            session.setAttribute("counter",newVal);
        }
        else{
            oldVal=(String)(session.getAttribute("counter"));
            newVal=""+(Integer.parseInt(oldVal)+1);
            session.setAttribute("counter",newVal);
        }%>
        <label>
            <p>Old:<%=oldVal%></p>
            <p>New:<%=newVal%></p>
            <p>Id:<%=session.getId()%></p>
        </label>   
    <a href="summary.jsp">Summary</a>
</body>
</html>