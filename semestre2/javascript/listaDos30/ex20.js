let valorCompra = 380;

if(valorCompra < 100){
    console.log("Sem desconto");
}else if(valorCompra >= 100 && valorCompra < 300){
    valorCompra *= 0.95;
}else if(valorCompra >= 300 && valorCompra < 500){
    valorCompra *= 0.90;
}else if(valorCompra >= 500){
    valorCOmpra *= 0.85;
}else{
    valorCompra = 1;
}

console.log(`Valor da compra: ${valorCompra.toFixed(2)}`);
