<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
  <h1>Add New User</h1>
  <form  name="registerform" action="RegisterServlet" method="post">
            <label>User Name : <input type="text" id="uname" name="uname" /></label><br><br>
            <label>Password : <input type="password" id="passwd" name="passwd"/></label><br><br>
            <label>Confirm Password : <input type="password" id="cpasswd" name="cpasswd"/></label><br><br>
            <input type="submit" value="Add User" style="margin-left:80px" onclick="return validatePass();">
</form>
</div>
<script src="validate.js">
</script>
</body>

</html>