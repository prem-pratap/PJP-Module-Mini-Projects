<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<div align="center">
  <h1>Change Password</h1>
  <form  name="changeform" action="ChangePasswordServlet" method="post">
            <label>User Name : <input type="text" id="uname" name="uname" /></label><br><br>
            <label>Password : <input type="password" id="oldpasswd" name="oldpasswd"/></label><br><br>
            <label>New Password : <input type="password" id="newpasswd" name="newpasswd"/></label><br><br>
            <label>Retype New Password : <input type="password" id="renewpasswd" name="renewpasswd"/></label><br><br>
            <input type="submit" value="Change Password" style="margin-left:80px" onclick="return checkPass();">
  </form>
 </div>       		
</body>
<script src="validate.js"></script>
</html>