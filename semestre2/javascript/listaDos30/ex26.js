let media = 9.1;
let frequencia = 92;
let rendaFamiliar = 2400;

if(media >= 9 && frequencia >= 90 && rendaFamiliar <= 2500){
    console.log("Bolsa integral");
}else if(media >= 7 && frequencia >= 75 && rendaFamiliar <= 4000){ 
    console.log("Bolsa parcial");
}else{
    console.log("Sem bolsa");
}