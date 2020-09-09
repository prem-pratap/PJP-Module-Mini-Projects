<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete User</title>
<style>
#message{
position:absolute;
	top:400px;
	left:170px;
	color: green;

}

</style>
</head>
<body>
<form name="delete" action="DeleteEmployeeController">
<table>
                <tr>
                    <td> Enter Employee id whose details to be deleted: </td>
                    <td><input type="number" name="eid"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="deleteEmployee" value="Delete Employee"></td>
                    
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