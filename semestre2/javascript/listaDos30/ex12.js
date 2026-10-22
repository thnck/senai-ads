let totalCompra = 180;
let cupomFrete = true;
let frete = 25;

if(totalCompra>= 250 || cupomFrete == true){
    frete = 0;
}else{
    frete = 25;
}

console.log(`Total: ${totalCompra + frete}`);
