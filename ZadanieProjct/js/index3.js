'use strict';


// var arrAuthor=["Author: Сергей Есенин"];
// var arrTheme=["Сестре Шуре"];
// var arrPicture=["../images/sestra.jpg"];
// var arrMessage=["В этом мире я только прохожий, <br> Ты махни мне весёлой рукой.<br>У осеннего месяца тоже<br>Свет ласкающий, тихий такой.<br><br>В первый раз я от месяца греюсь,<br>В первый раз от прохлады согрет,<br>И опять и живу и надеюсь<br>На любовь, которой уж нет.<br>Это сделала наша равнинность,<br>Посоленная белью песка,<br>И измятая чья-то невинность,<br>И кому-то родная тоска.<br>Потому и навеки не скрою,<br>Что любить не отдельно, не врозь -<br>Нам одною любовью с тобою<br>Эту родину привелось."];
// var arrDate=["today"];


// var str='<div id="masiv" class="tema1">';
// for(var i=0; i<arrAuthor.length; i++){
// 	str+=('<h3 class="zag1">'+arrTheme[i]);
// 	str+=('<div><div class="avtor1"><h5>'+arrAuthor[i]+'</div>');
// 	str+=('<div class="date1"><h5>'+arrDate[i]+'</div></div>');
// 	str+=('<img src="'+arrPicture[i]+'" class="pictext">');
// 	str+=('<div><p id="textmes">'+arrMessage[i]+'</p></div>');
// }
// str+="</div>";
// var addingscript=document.getElementById("massive");
// 	addingscript.innerHTML+= str;


// function pisal(numb){
// 	var i=numb;
// 	return i;
// }

// function getContent(data){

// 	var i=pisal(numb);
// 	alert(i);
// 	var str='';
	
	
// 		//for(var i=0; i<data.popularwriters.length; i++){
// 			str+='<div class="tema1">';
// 			str+=('<h3 class="zag1">'+data.popularwriters[i].arrTheme);
// 			str+=('<div><div class="avtor1"><h5>'+data.popularwriters[i].arrAuthor+'</div>');
// 			str+=('<div class="date1"><h5>'+data.popularwriters[i].arrDate+'</div></div>');
// 			str+=('<img src="'+data.popularwriters[i].arrPicture+'" class="pictext">');
// 			str+=('<div><p class="textmes">'+data.popularwriters[i].arrMessage+'</p></div>');
// 			str+="</div>";
// 	//}
	
// 	return str;
// }

// var xhr=new XMLHttpRequest();
// xhr.onclick=function(){
// 	console.log(xhr.responseText);
// 	var data=JSON.parse(xhr.responseText);
// 	document.getElementById("massiv").innerHTML=getContent(data);
	
// }	
	
// xhr.open("GET","json/data.json",true);
// xhr.send();


function getContent(data,i){
	//alert(i);
	var str='';
	
	//for(var i=0; i<data.popularwriters.length; i++){
		
		str+='<div class="tema1">';
		str+=('<h3 class="zag1">'+data.popularwriters[i].arrTheme);
		str+=('<div><div class="avtor1"><h5>'+data.popularwriters[i].arrAuthor+'</div>');
		str+=('<div class="date1"><h5>'+data.popularwriters[i].arrDate+'</div></div>');
		str+=('<img src="'+data.popularwriters[i].arrPicture+'" class="pictext">');
		str+=('<div><p class="textmes">'+data.popularwriters[i].arrMessage+'</p></div>');
		
		str+="</div>";
	//}
	
	return str;
}
function pissOff(i){
	

var xhr=new XMLHttpRequest();
xhr.onload=function(){
	console.log(xhr.responseText);
	var data=JSON.parse(xhr.responseText);
	document.getElementById("massiv").innerHTML=getContent(data,i);
	
}	
	
xhr.open("GET","data.json",true);
xhr.send();
}



// function getContent(data){
	
// 	var str='';
	
// 	//for(var i=0; i<data.popularwriters.length; i++){
		
// 		str+='<div class="tema1">';
// 		str+=('<h3 class="zag1">'+data.popularwriters[i].arrTheme);
// 		str+=('<div><div class="avtor1"><h5>'+data.popularwriters[i].arrAuthor+'</div>');
// 		str+=('<div class="date1"><h5>'+data.popularwriters[i].arrDate+'</div></div>');
// 		str+=('<img src="'+data.popularwriters[i].arrPicture+'" class="pictext">');
// 		str+=('<div><p class="textmes">'+data.popularwriters[i].arrMessage+'</p></div>');
		
// 		str+="</div>";
// 	//}
	
// 	return str;
// }

// var xhr=new XMLHttpRequest();
// xhr.onload=function(){
// 	console.log(xhr.responseText);
// 	var data=JSON.parse(xhr.responseText);
// 	return data;
// }

	
// xhr.open("GET","data.json",true);
// xhr.send();

// //function pissOff(i){}


