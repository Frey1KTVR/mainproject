/*'use strict';
alert ("Hello");
*/
"use strict"
/*var dat = new Date(year, month, day)*/
function myFunction() {
    document.getElementById("myText").value = "Johnny Bravo";
}
function valid(){
	var autor=document.getElementById("name");
	var theme=document.getElementById("theme");
	var message=document.getElementById("message");
	var date=document.getElementById("date");
	if(autor.value==""){
		alert("Please, present your self");
		return false;
	}
	if(theme.value==""){
		alert("Please, input theme for your message");
		return false;
	}
	if(message.value==""){
		alert("Please, this is the main chapter of this thing, for god sake.");
		return false;
	}
	/*if(date.value==""){
		alert("Please, enter todays date");
		return false;
	}
	else{
		alert("Congrats, you did it!");
		return true;
	 <input type="text" class="form-control" id="date" name="date" placeholder="d/m/y">}*/
}