<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style type="text/css">
#form{
	position:absolute;
	top:30px;
	left:100px;
	width:300px;
	height:250px;
	border:2px dashed green;
	border-radius:20px;


}
#add{
position:absolute;
	top:170px;
	left:200px;
}
#change{
position:absolute;
	top:200px;
	left:200px;
}

#message{
position:absolute;
	top:270px;
	left:170px;
	color: red;

}
</style>

</head>
<body>
<form name="loginform" method="POST" action="LoginServlet">
<div id="form">
<br>
USERNAME <input type="text" name="uname" ><br><br>
PASSWORD <input type="password" name="pwd"><br><br>
<input type="submit" value="Submit" style="margin-left:80px" onClick="return loginvalidate()">
</div>
</form>

<div id="add">
<a href="register.jsp">New User</a>
</div>
<div id="change">
<a href="changepassword.jsp">Change Password</a>
</div>
<div id="message">
<% String msg=(String) request.getAttribute("message");
if(msg!=null){
%>
<h3><%=msg %></h3>
<%} %>

<% String msg2=(String) request.getAttribute("msg2");
if(msg2!=null){
%>
<h3 style="color:red"><%=msg2 %></h3>
<%} %>


</div>
</body>
<script src="validate.js"></script>
</html>