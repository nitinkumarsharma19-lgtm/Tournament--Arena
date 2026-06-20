let players = [];

function register(){

let name = document.getElementById("name").value;

if(name==""){
alert("नाम दर्ज करें");
return;
}

players.push(name);

localStorage.setItem(
"players",
JSON.stringify(players)
);

showPlayers();

document.getElementById("name").value="";
}

function showPlayers(){

let list=document.getElementById("playerList");

list.innerHTML="";

players=JSON.parse(
localStorage.getItem("players")
)||[];

players.forEach(function(p){

list.innerHTML +=
"<li>"+p+"</li>";

});

}

showPlayers();
