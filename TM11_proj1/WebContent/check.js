	document.getElementById("auctionregister").onsubmit=function(){
		var itid=document.forms["auctionregister"]["itemid"].value;
		var itname=document.forms["auctionregister"]["iname"].value;
		var username=document.forms["auctionregister"]["uname"].value;
		var emailid=document.forms["auctionregister"]["email"].value;
		var amt=document.forms["auctionregister"]["amount"].value;
		
		var submit=true;
		
		if(itid==null || itid==""){
			iderror="Required item id";
			document.getElementById("id_error").innerHTML=iderror;
			document.getElementById("entry_error").innerHTML="Required Data Missing";
			submit=false;
		}
		
		if(itname==null || itname==""){
			inameerror="Required Item Name";
			document.getElementById("iname_error").innerHTML=inameerror;
			document.getElementById("entry_error").innerHTML="Required Data Missing";
			submit=false;
		}
		
		if(username==null || username==""){
			unameerror="Required Username";
			document.getElementById("uname_error").innerHTML=unameerror;
			document.getElementById("entry_error").innerHTML="Required Data Missing";
			submit=false;
		}
		
		if(emailid==null || emailid==""){
			emailerror="Required Email Id";
			document.getElementById("email_error").innerHTML=emailerror;
			document.getElementById("entry_error").innerHTML="Required Data Missing";
			submit=false;
		}
		if(amt==null || amt==""){
			amterror="Required  Bid Amount";
			document.getElementById("amount_error").innerHTML=amterror;
			document.getElementById("entry_error").innerHTML="Required Data Missing";
			submit=false;
		}
		
		return submit;
		
		
	}