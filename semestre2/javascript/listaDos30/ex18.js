let estoque = 4;
let quantidadePedida = 6;

if(quantidadePedida <= estoque){
    console.log("Venda autorizada");
}else if(quantidadePedida <= 0){
    console.log("Pedido inválido");
}
else{
    console.log("Venda não permitida"); 
}