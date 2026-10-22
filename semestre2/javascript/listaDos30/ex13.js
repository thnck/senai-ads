let pontos = 750;

if(pontos < 100){
    console.log("Iniciante");
}else if(pontos >= 100 || pontos <= 499){
    console.log("Bronze");
}else if(pontos >= 500 || pontos <= 999){
    console.log("Prata");
}else{
    console.log("Ouro");
}