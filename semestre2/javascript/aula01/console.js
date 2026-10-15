console.log("Hello, World!");
// mais novo escopo local
let nome = "Thomas";
// mais antigo escopo global
var idade = "16";

ola = "Olá, mundo!";

console.log(ola);


console.log('aspas simples');

// template literals
console.log(
`acento
     agudo`);

const dataDeNascimento = 2007;

console.log(nome);
console.log(idade);

console.log(nome + " " + idade);

console.log("Meu nome é " + nome +" e tenho " + idade + " anos!");

console.log(`Meu nome é ${nome} e tenho ${idade} anos!`);

/*operadores aritmeticos

adição + 
subtração -
multiplicação *
divisão /
módulo %
exponenciação **
incremento ++
decremento --
*/

// let n1 = 10;
// let n2= 2;

// console.log(`A soma entre ${n1} e ${n2} é: ${n1+n2}`);
// console.log(`A subtração entre ${n1} e ${n2} é: ${n1-n2}`);
// console.log(`A multiplicação entre ${n1} e ${n2} é: ${n1*n2}`);
// console.log(`A divisão entre ${n1} e ${n2} é: ${n1/n2}`);

// // operacoes adicionais

// console.log(`O resto entre ${n1}/${n2} = ${n1%n2}`);
// console.log(`O ${n1} elevado a ${n2} é ${n1**n2}`);

// // incremento e decremento

// console.log(`Valor original: ${n1}`);
// n1++;
// console.log(`Valor incrementado: ${n1}`);

// console.log(`Valor original: ${n2}`);
// n2--;
// console.log(`Valor decrementado: ${n2}`);

// let pontos = 10;

// pontos += 5;
// pontos -= 3;
// pontos *= 2;
// pontos %= 3;
// pontos **= 2;
// pontos /= 4;

// console.log(pontos);


// atv 1

let n1 = 14;
let n2 = 5;

// 1
console.log(`A soma entre ${n1} e ${n2} é: ${n1+n2}`);
console.log(`A subtração entre ${n1} e ${n2} é: ${n1-n2}`);
console.log(`A multiplicação entre ${n1} e ${n2} é: ${n1*n2}`);
console.log(`A divisão entre ${n1} e ${n2} é: ${n1/n2}`);

// 2
console.log(`O resto entre ${n1}/${n2} = ${n1%n2}`);
console.log(`O ${n1} elevado a ${n2} é ${n1**n2}`);

// 3
console.log(`O dobro de ${n1} é: ${n1*2}`);
console.log(`O triplo de ${n1} é: ${n1*3}`);

// 4 
console.log(`A média entre ${n1} e ${n2} é ${(n1+n2)/2}`);

// 5
console.log(`O ${n1} elevado ao quadrado é ${n1**2}`);
console.log(`O ${n2} elevado ao quadrado é ${n2**2}`);

// 6
console.log(`O ${n1} é par pois o resto da divisão entre ${n1} e 2 é ${n1%2}`);

// 7


let nomec = "Carlos";    //string texto
let idadec = 18;         //number
let alturac = 1.85;      //number
let aprovado = true;     //boolean
let reprovado = false;   //boolean
let endereco;            //undefined
let telefone = null;     //null(ausencia intencional)
let numeroGrande = 123n  //bigint
let identificador = Symbol("id") //symbol(identificador unico)


console.log(typeof numeroGrande);

console.log(3 == "3");
console.log(3 === "3")
