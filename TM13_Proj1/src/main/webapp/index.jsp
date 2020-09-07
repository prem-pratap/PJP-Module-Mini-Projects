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

<div id="message">
<% String msg=(String) request.getAttribute("message");
if(msg!=null){
%>
<h3><%=msg %></h3>
<%} %>




</div>
</body>
<script>
function loginvalidate(){
	var username=document.loginform.uname.value;
	var password=document.loginform.pwd.value;
	if(username==""||password==""){
		alert("Fields cannot be empty ");
		return false;}
	else
		return true;
}</script>
</html>