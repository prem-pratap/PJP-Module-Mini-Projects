<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<% String name=(String) request.getAttribute("name");%>
<font color="green"><b>Welcome <%= name %></b></font>

<center>
<a href="adduser.jsp" class="btn btn-primary">ADD Employee</a>
</center><br>

<center>
<a href="deleteuser.jsp" class="btn btn-primary">DELETE Employee</a>
</center><br>

<center>
<a href="modify.jsp" class="btn btn-primary">MODIFY Details</a>
</center><br>

<center>
<a href="selectbyid.jsp" class="btn btn-primary">SELECT Employee By Id</a>
</center><br>

<center>
<a href="showall.jsp" class="btn btn-primary">SELECT All Employee</a>
</center><br>

</body>
</html>