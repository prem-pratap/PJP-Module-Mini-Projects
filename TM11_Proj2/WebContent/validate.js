function loginvalidate(){
	var username=document.loginform.uname.value;
	var password=document.loginform.pwd.value;
	if(username==""||password==""){
		alert("Fields cannot be empty ");
		return false;}
	else
		return true;
}

function validatePass() {
    var passwd = document.registerform.passwd.value;
    var cpasswd = document.registerform.cpasswd.value;
    var passwdRegex = /^(?=.*\d)(?=.*[A-Z]).{6,20}$/;
    if (!passwd.value.match(passwdRegex)  ) {
        alert("Invalid password!");
        passwd.focus();
        return false;
    }
    else if(passwd!=cpasswd){
    	alert("Passwords do not match");
		return false;
    }
    else if(passwd==""||cpasswd==""){
		alert("Empty Passwords");
		return false;}
    else
    	return true;
}

function checkPass(){
	var oldpasswd=document.changeform.oldpasswd.value;
	var newpasswd=document.changeform.newpasswd.value;
	var renewpasswd=document.changeform.renewpasswd.value;
	if(oldpasswd==""||newpasswd==""||renewpasswd==""){
		alert("Empty Passwords");
		return false;}
	else if(newpasswd!=renewpasswd){
		alert("Passwords do not match");
		return false;}
	else
		return true;
}
