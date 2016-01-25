'use strict';

/*var dat = new Date(year, month, day)
var d = new Date();
document.getElementById("demo")= d;

function myFunction() 
{
    /*document.getElementById("myText").value = "Johnny Bravo";
    
}*/
// document.getElementById("message").setAttribute("class","error");
// if(message.class=="error"){
// 	message.style.borderColor = "red";
// 
var d = new Date();
document.getElementById("date").innerHTML;
date.value=d;
var divs=document.getElementsByTagName("div");
document.getElementById("count").innerHTML="In document "+divs.length+" of 'div' tags.<br>";
var n=0;

for(var i=0;i<divs.length;i++){

	if(divs[i].className=="form-group");
		n=n+1;
}
document.getElementById("count").innerHTML=document.getElementById("count").innerHTML+"From them have attribute 'class' "+n;


function valid(){
	var validon=true;
	// var author=document.forms["myform"]["title"];
	// if(name==null|name=="")console.log
	// author.getAttribute("required");
	// author.setAttribute("max",10);

	var author=document.getElementById("name");
	var theme=document.getElementById("theme");
	var message=document.getElementById("message");
	var date=document.getElementById("date");
	//---------------------------------------
	var tauthor=document.getElementById("errorAuthor");
	var ttheme=document.getElementById("errorTheme");
	var tmessage=document.getElementById("errorMessage");
	var tdate=document.getElementById("errorDate");
	//---------------------------------------
	var lauthor=document.getElementById("autorlen");

	if(author.value==""){
		//console.log("Please, present your self");
		author.className+=" invalid";
		tauthor.className="error-on";
		validon=false;
	}else if(author.value!=""){
		author.className="form-control";
		tauthor.className="error-off";
		
	}
	if(theme.value==""){
		// console.log("Please, input theme for your message");
		theme.className+=" invalid";
		ttheme.className="error-on";
		validon=false;
	}else if(theme.value!=""){
		theme.className="form-control";
		ttheme.className="error-off";
	}
	if(message.value==""){
		// console.log("Please, this is the main chapter of this thing, for god sake.");
		message.className+=" invalid";
		tmessage.className="error-on";
		validon=false;
	}else if(message.value!=""){
		message.className="form-control";
		tmessage.className="error-off";
		
	}
	else{
		validon=true;
	}
	if (author.value.length>50&&author.value.length<2){
		lauthor.className="maxl";
		validon=false;
	}
	return validon;
	// var a=[author,theme,message,date]
	//  for ( i = 0; i < a.length; i++ ){
	// 	if(a[i].value==""){
	// 		a[i].className+=" invalid";
	// 		return false
	// 	}
	// 	if (a[i].value!=""){
	// 		a[i].className="form-control"

	// 	}
		

	// }
	// return true
	/*if(date.value==""){
		alert("Please, enter todays date");
		return false;
	}
	else{
		alert("Congrats, you did it!");
		return true;
	 <input type="text" class="form-control" id="date" name="date" placeholder="d/m/y">}*/
	 // return validon;
}	
// author.className = "invalid";	
// theme.className = "invalid";
// message.className = "invalid";