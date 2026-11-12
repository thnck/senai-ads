const botao = document.getElementById("buscar");
const image = document.getElementById("cachorro");

async function buscar() {
    const resposta = await fetch("https://dog.ceo/api/breeds/image/random");
    const dados = await resposta.json();

    image.src = dados.message;
}

botao.addEventListener("click", buscar);