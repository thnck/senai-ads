let idade = 22;
let possuiCNH = false;

if(idade>= 18 && possuiCNH == true){
    console.log("Pode dirigir");
}else if(idade < 18){
    console.log("Não pode dirigir pois não tem 18 anos");
}else if(possuiCNH == false){
    console.log("Não pode dirigir pois não tem CNH");
}else{
    console.log("Não pode dirigir pois não tem 18 anos nem CNH");   
}