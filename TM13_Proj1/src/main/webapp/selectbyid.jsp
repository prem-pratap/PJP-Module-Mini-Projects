<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Select user By Id</title>
</head>
<body>
<form name="modify" action="SelectEmployeeController">
<table>
                <tr>
                    <td> Enter Employee id : </td>
                    <td><input type="number" name="eid"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="deleteEmployee" value="View Employee"></td>
                    
                </tr>
</table>
</form>
<div id="message">
<% String msg=(String) request.getAttribute("message");
if(msg!=null){
%>
<h3><%=msg %></h3>
<%} %>
</div>
</body>
</html>