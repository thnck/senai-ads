
const pedido = new Promise((resolve, reject) => {
setTimeout(() => {
    resolve("Pedido pronto")
}, 3000);
});

pedido.then((resultado)  => {
    console.log(resultado);

}); 
