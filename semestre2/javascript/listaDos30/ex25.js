let velocidade = 92;
let limite = 80;

if(velocidade <= limite){
    console.log("Dentro do limite");
}else if(velocidade <= limite * 1.20){
    console.log("Acima do limite");
}else{
    console.log("Muito acima do limite");
}