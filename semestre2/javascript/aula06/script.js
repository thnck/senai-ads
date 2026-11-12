// console.log("Primeiro");

// setTimeout(() => {
//     console.log("Segundo");
// }, 2000);

// const pedido = new Promise((resolve, reject) => {
// setTimeout(() => {
//     resolve("Pedido pronto")
// }, 3000);
// });

// pedido.then((resultado)  => {
//     console.log(resultado);

// }); 

function prepararPedido(){
    return new Promise((resolve) =>{
        setTimeout(() =>{
            resolve("Pedido pronto");
        }, 3000)
    });
};

async function iniciar() {
    console.log("Preparando...");
    const resultado = await prepararPedido()
    console.log(resultado);
       
}
iniciar()