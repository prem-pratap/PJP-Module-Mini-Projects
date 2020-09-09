<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modify</title>
</head>
<body>
<form name="modify" action="ModifyEmployeeController">
<table>
                <tr>
                    <td> Enter Employee id</td>
                    <td><input type="number" name="eid"></td>
                </tr>
                <tr>
                    <td> Enter New Employee Name</td>
                    <td><input type="text" name="ename"></td>
                </tr>
                
                <tr>
                    <td> Enter New City Name</td>
                    <td><input type="text" name="city"></td>
                </tr>
                
                <tr>
                    <td> Enter New Email Id</td>
                    <td><input type="text" name="email"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="modifyEmployee" value="Modify Employee"></td>
                    
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