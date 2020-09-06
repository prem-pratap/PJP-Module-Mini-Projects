<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String msg1=(String) request.getAttribute("msg1");
if(msg1!=null){
%>
<h3 style="color:green"><%=msg1 %></h3>
<%} %>


</body>
</html>