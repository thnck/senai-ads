let estoque = 12;
let quantidade = 3;
let precoUnitario = 80;
let saldoCliente = 220; 
let clienteVIP = false;

let subtotal = quantidade * precoUnitario;
let valorFinal = subtotal;

if(clienteVIP === true){
    valorFinal = subtotal * 0.90;
} 
      
if(quantidade <= 0){  
    console.log("Compra rejeitada: a quantidade deve ser maior que zero");
}else if(quantidade > estoque){   
    console.log("Compra rejeitada: quantidade maior que o estoque");
}else if(saldoCliente < valorFinal){  
    console.log("Compra rejeitada: saldo insuficiente");   
}else{
    console.log(`Compra autorizada: R$ ${valorFinal.toFixed(2)}`);
}