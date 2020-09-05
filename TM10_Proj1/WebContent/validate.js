function validateDetails() {
    var fname=document.getElementById("firstName").value;
    var lname=document.getElementById("lastName").value;
    var passwd = document.getElementById("password1").value;
    var confirmpasswd = document.getElementById("password2").value;
    var dob = document.getElementById("dob").value;
    var contact = document.getElementById("mobile").value;
    var email=document.getElementById("email").value;

    var fnameRegex = /^[a-zA-Z]+$/;
    var lnameRegex = /^[a-zA-Z]+$/;;
    var passwdRegex = /^(?=.*\d)(?=.*[A-Z]).{6,20}$/;
    var contactRegex = /^\(?([0-9]{3})\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$/;
    var dobDate = new Date(dob);
    var emailRegex = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w {2, 3})+$/;
    var today = new Date();

    if (
        fname.match(fnameRegex)&&
        
        lname.match(lnameRegex) &&
        passwd.match(passwdRegex) &&
        confirmpasswd.match(passwdRegex) &&
        dobDate.getTime() < today.getTime() &&
        contact.match(contactRegex)
        
    ) {
        return true;
    } else {
        alert("Invalid Details!");
        return false;
    }
}

function startTime(){
	var today = new Date();
	var time = today.getHours() + ":" + today.getMinutes() + ":" + today.getSeconds();
	document.getElementById('txt').innerHTML =time;
	var t = setTimeout(startTime, 500);
	
}
