<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
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

<form name="add" action="AddEmployeeController">
<table>
                <tr>
                    <td> Employee id: </td>
                    <td><input type="number" name="eid"></td>
                </tr>
                <tr>
                    <td> Employee Name: </td>
                    <td><input type="text" name="ename"></td>
                </tr>
                <tr>
                    <td> Employee Gender: </td>
                    <td><input type="text" name="gender"></td>
                </tr>
                <tr>
                    <td> Employee Designation: </td>
                    <td><input type="text" name="designation"></td>
                </tr>
                <tr>
                    <td> Employee Salary: </td>
                    <td><input type="number" name="salary"></td>
                </tr>
                <tr>
                    <td> Employee City: </td>
                    <td><input type="text" name="city"></td>
                </tr>
                <tr>
                    <td> Employee Email: </td>
                    <td><input type="text" name="email"></td>
                </tr>
                <tr>
                    <td> Employee Contact: </td>
                    <td><input type="number" name="contact"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="addEmployee" value="Add"></td>
                    
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