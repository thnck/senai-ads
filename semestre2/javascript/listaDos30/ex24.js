let horas = 5;
let clienteConveniado = true;

if(horas > 0 && Number.isInteger(horas)){
    let valor = 10;

    if(horas > 2){
        valor = 10 + (horas - 2) * 4;
    }

    if(clienteConveniado === true){
        valor *= 0.80;
    }

    console.log(`Valor do estacionamento: R$ ${valor.toFixed(2)}`);
}else{
    console.log("A quantidade de horas deve ser um número inteiro positivo");
}