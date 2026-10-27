let peso = 72;
let altura = 1.75;

if(peso > 0 && altura > 0){
    let imc = peso / (altura ** 2);

    console.log(`IMC: ${imc.toFixed(2)}`);

    if(imc < 18.5){
        console.log("Abaixo do peso");
    }else if(imc < 25){
        console.log("Faixa considerada normal");
    }else if(imc < 30){
        console.log("Sobrepeso");
    }else{
        console.log("Obesidade");
    }
}else{
    console.log("Peso e altura devem ser maiores que zero");
}