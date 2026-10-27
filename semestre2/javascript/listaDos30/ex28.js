let consumoKWh = 250;
let tarifa = 0;

if(consumoKWh < 0){
    console.log("O consumo não pode ser negativo");   
}else if(consumoKWh <= 100){  
    tarifa = 0.60;
}else if(consumoKWh <= 200){
    tarifa = 0.75;
}else{    
    tarifa = 0.90;
}
 
if(consumoKWh >= 0){
    let conta = consumoKWh * tarifa;
     console.log(`Valor da conta: R$ ${conta.toFixed(2)}`);
}