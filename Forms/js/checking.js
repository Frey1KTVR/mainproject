"use strict"
function valid(){
	var login=document.getElementById("email");
	var pass=document.getElementById("pwd");
	if(login.value==""){
		alert("Please, input email adress");
		return false;
	}
	if(pass.value==""){
		alert("Please, input password");
		return false;
	}
	else{
		alert("Congrats, you did it!");
		return true;
	}
}