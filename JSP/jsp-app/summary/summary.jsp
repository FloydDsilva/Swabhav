<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Summary</title>
</head>
<body>
    <h1>Session [count]=<%=session.getAttribute("counter")%></h1>
    <h1>Application [count]=<%=application.getAttribute("counter")%></h1>
    <a href="session.jsp">Session</a>
    <a href="application.jsp">Application</a>
</body>
</html>