// // arrays - vetores incicio - fim progressao direcao e um sentido 0, 1, 2, 3, 4...

// let notas = [1,2,3,4,5,6,7,8,9,"palavras", [9,8,7],12,321,4,234,32,5,235,3,54,5,43,5,435,43,543]
// console.log(notas[10]);

// console.log(notas.length);

// let nomes = ["Ana", "Beatriz", "João", "Carlos"];
// console.log(nomes[1]);

// // métodos
// // push() - adiciona um elemento no fim do array
// // pop() - remove o elemento final do array
// // unshift() - adiciona o elemento ao inicio do array
// // shift() - remove o elemento inicial
// // splice() - adiciona, remove ou substitui
// // slice() - copia um intervalo

// let frutas = ["Maça","Uva","Pera"]
// console.log(frutas);
// frutas.push("Laranja")
// console.log(frutas);
// frutas.pop()
// frutas.pop()
// console.log(frutas);
// frutas.unshift("Morango")
// console.log(frutas);
// frutas.shift()
// frutas.shift()
// console.log(frutas);

// let numeros = [10,20,30,40,50,60,70,80,90,100]
// // numeros.splice(1,10)]
// let parte = numeros.slice(3,5);
// console.log(parte);

// for (let i = 0; i < nomes.length; i+= 1) {
//     console.log(nomes[i]);
// }

// for(let nome of nomes){
//     console.log(nome);

// }

// nomes.forEach((nome) =>{
//     console.log(nome);

// })

// CallBack

// function cumprimentar(nome) {
//     console.log(`Olá, ${nome}!`);
// }
// cumprimentar("")

// function somar(a, b){
//     let resultado = a + b
//     return resultado
// }

// console.log(somar(10,5));

// function apresentar(name, idade){
//     console.log(`Meu nome é ${name}!`);
//     console.log(`Tenho ${idade} anos de idade`);
//     console.log(`Muito Prazer`);
// }

// apresentar("João", 18)

// function saudacao(name = "Visitante"){
//     console.log(`Bem-Vindo, ${name}`);
// }

// saudacao("Thomas")
// saudacao()

// function somar(a, b) {
//   return `${a} + ${b} = ${a+b}`
// }

// function subtracao(a, b) {
//   return `${a} - ${b} = ${a-b}`
// }

// function multiplicacao(a, b) {
//   return `${a} x ${b} = ${a*b}`
// }

// function divisao(a, b) {
//   if (b === 0) {
//     return "Erro: Divisão por zero";
//   } else {
//   return `${a} : ${b} = ${a/b}`
//   }
// }

// console.log(somar(5, 7));
// console.log(multiplicacao(5, 7));
// console.log(divisao(5, 7));
// console.log(subtracao(5, 7));

// //1
// function cumprimentar(nome) {
//     return `Olá, ${nome}!`
// }
// //2
// const cumprimenta = function(nome) {
//     return `Olá, ${nome}!`
// }
// //3
// const cumprimentaArrow = (nome) => `Olá, ${nome}!`

// console.log(cumprimentar("Thomas"));
// console.log(cumprimenta("Thomas"));
// console.log(cumprimentaArrow("Thomas"));

// // HOFS de Array
// // forEach percorre todos os elementos 
// // Map transforma todos os elementos 
// // filter filtra todos os elementos 
// // find encontra um elemento 
// // some verifica se algum elemento atende
// // every verifica se todos os elementos atendem
// // reduce acumula resultados

// let alunos = ["Ana", "Bruno", "Carlos"]

// alunos.forEach(aluno => {
//     console.log(`Bom dia, ${aluno}`);
// });

// let numeros = [1,2,3,4,5,6,7,8,9,10]
// let dobrados = numeros.map((numero) => numero *2)

// console.log(dobrados);


// let idade = [12,15,61,71,18,54]


// let maiorIdade = idade.filter((i) => i >=18)
// console.log(maiorIdade);

// let alunos = [
//     {nome : "Leandro", nota:8},
//     {nome : "Leonardo", nota:3},
//     {nome : "Leonel", nota:7}
// ]

// let aluno = alunos.find((aluno) => aluno.nota >=7)

// console.log(aluno);

let notas = [5,6,7,4,3,2,4,5,3,10] 

let existeAprovado = notas.some((nota) => nota >=7)

console.log(existeAprovado);

let todosAprovados = notas.every ((nota) => nota>= 7)

console.log(todosAprovados);

let numeros = [10,20,30]

let soma = numeros.reduce ((acumulador, numero) => acumulador + numero)

console.log(soma);


let alunos = [
    {nome : "Leandro", nota:8},
    {nome : "Leonardo", nota:3},
    {nome : "Leonel", nota:7},
    {nome}
]