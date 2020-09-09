<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show All</title>
</head>
<body>
		<form action="ShowController" method="POST">
            <input type="submit" name="showEmployee" value="Show"> &nbsp; &nbsp;<br>
            
        </form>
All Employees: <br> 
        <c:forEach var="emp" items="${employeeList}">
            Employee ID: ${emp.id} <br>
            Employee Name: ${emp.ename} <br>
            Employee Number: ${emp.enumber}<br>
            -------------------------------------<br>
        </c:forEach>
</body>
</html>