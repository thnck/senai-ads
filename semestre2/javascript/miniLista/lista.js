//1
function boasVindas() {
    console.log("Bem-vindo ao JavaScript");
}

//2
function cumprimentar(nome) {
    console.log(`Olá, ${nome}!`);
}

//3
function soma(a, b) {
  return `${a} + ${b} = ${a+b}`
}

//4
function subtracao(a, b) {
  return `${a} - ${b} = ${a-b}`
}

//5
function multiplicacao(a, b) {
  return `${a} x ${b} = ${a*b}`
}
//6
function divisao(a, b) {
  if (b === 0) {
    return "Erro: Divisão por zero";
  } else {
  return `${a} : ${b} = ${a/b}`
  }
}

//7
function dobro(a) {
  return `O dobro de ${a} é ${a*2}`
}

//8
function triplo(a) {
  return `O triplo de ${a} é ${a*3}`
}

//9
function quadrado(a) {
  return `O quadrado de ${a} é ${a*a}`
}

//10
function media(a,b,c) {
  return `O média entre ${a}, ${b} e ${c} é ${(a+b+c)/3}`
}

//11
function parOuImpar(a) {
    if(a%2==0){
  return `O número ${a} é par`
    }else{
        return `O número ${a} é ímpar`
    }
}

//12
function maioridade(a) {
    if(a >= 18){
  return `É maior de idade`
    }else{
        return `É menor de idade`
    }
}

//13
function aprovacao(a) {
    if(a >= 7){
  return `Aprovado`
    }else{
        return `Reprovado`
    }
}

//14
function maiorNum(a,b) {
    if(a > b){
  return `${a} é maior que ${b}`
    }else if(a < b){
        return `${a} é maior que ${b}`
    }else{
        return `${a} é igual a ${b}`
    }
}

//15
function positivoNegativo(a) {
    if(a > 0){
  return `É positivo`
    }else if(a < 0){
    return `É negativo`
    }else{
        return `O número é zero`
    }
}

//16
function desconto(a) {
  return `O ${a} com desconto de 10% é ${a-=a*0.10}`
}

//17
function temperatura(a) {
  return `${a}°C é igual a${a * 9 / 5 + 32}°F`
}

//18
function nomeCompleto(nome,sobrenome){
  return `${nome + " " + sobrenome}`
}

//19
function senha(senha){
  if(senha.lenght >= 8){
    return `Senha válida`
  }else{
    return `Senha inválida`
  }
}

//20
function calculadora (a,b,s){
  switch(s){
    case "+":
      return `${a} + ${b} = ${a+b}`
      break
    case "-":
      return `${a} - ${b} = ${a-b}`
      break
    case "*":
      return `${a} x ${b} = ${a*b}`
      break
    case "/":
      return `${a} / ${b} = ${a/b}`
      break
  } 
}

//21
const somaArrow = (a,b) => `${a} + ${b} = ${a+b}`

//22
const dobroArrow = (a) => `O dobro de ${a} é ${a*2}`

//23
const saudacao = (nome) => `Saudações ${nome}!`

//24
const numPar = (a) => `${ a % 2 ==0 }`

//25
let num = [1,2,3,4,5,6,7,8,9,10]
let firstNum = num.splice(0)

//26
function ultimoElemento(array) {
  return array[array.length - 1]
}

//27
function quantidadeElementos(array) {
  return array.length
}

//28
function adicionarElemento(array, elemento) {
  array.push(elemento)
  return array
}

//29
function removerUltimo(array) {
  array.pop()
  return array
}

//30
function listarElementos(nomes) {
  for (let i = 0; i < nomes.length; i++) {
    console.log(nomes[i])
  }
}

//31
function exibirNomes(nomes) {
  nomes.forEach((nome) => {
    console.log(nome)
  })
}

//32
function exibirNumeros() {
  const numeros = [10, 20, 30, 40, 50]
  numeros.forEach((numero) => {
    console.log(`Número: ${numero}`)
  })
}

//33
function dobrarNumeros() {
  const numeros = [1, 2, 3, 4, 5]
  return numeros.map((numero) => numero * 2)
}

//34
function triplicarNumeros() {
  const numeros = [2, 4, 6, 8]
  return numeros.map((numero) => numero * 3)
}

//35
function nomesMaiusculos(nomes) {
  return nomes.map((nome) => nome.toUpperCase())
}

//36
function aumentarPrecos() {
  const precos = [10, 20, 30, 40]
  return precos.map((preco) => preco * 1.1)
}

//37
function numerosPares() {
  const numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
  return numeros.filter((numero) => numero % 2 === 0)
}

//38
function numerosImpares() {
  const numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
  return numeros.filter((numero) => numero % 2 !== 0)
}

//39
function maioresDeIdade() {
  const idades = [12, 18, 25, 14, 30, 16]
  return idades.filter((idade) => idade >= 18)
}

//40
function notasAprovadas() {
  const notas = [5, 8, 6, 9, 10, 4, 7]
  return notas.filter((nota) => nota >= 7)
}

//41
function encontrarNumero() {
  const numeros = [5, 12, 8, 20, 3]
  return numeros.find((numero) => numero > 10)
}

//42
function encontrarNome() {
  const nomes = ["Ana", "Bruno", "Carlos", "Daniela"]
  return nomes.find((nome) => nome === "Carlos")
}

//43
function primeiraNotaBaixa() {
  const notas = [8, 9, 4, 7, 5]
  return notas.find((nota) => nota < 6)
}

//44
function existeNumeroNegativo() {
  const numeros = [3, 5, -2, 8, 10]
  return numeros.some((numero) => numero < 0)
}

//45
function existeAlunoAprovado() {
  const notas = [3, 5, 6, 8, 4]
  return notas.some((nota) => nota >= 7)
}

//46
function todosSaoPositivos() {
  const numeros = [2, 4, 6, 8, 10]
  return numeros.every((numero) => numero > 0)
}

//47
function todosForamAprovados() {
  const notas = [7, 8, 9, 10, 6]
  return notas.every((nota) => nota >= 7)
}

//48
function somarValores() {
  const valores = [10, 20, 30, 40]
  return valores.reduce((acumulador, valor) => acumulador + valor, 0)
}

//49
function calcularMedia() {
  const notas = [6, 8, 7, 9]
  const soma = notas.reduce((acumulador, nota) => acumulador + nota, 0)
  return soma / notas.length
}

//50
function nomesAlunosAprovados() {
  const alunos = [
    { nome: "Ana", nota: 8 },
    { nome: "Bruno", nota: 5 },
    { nome: "Carlos", nota: 9 },
    { nome: "Daniela", nota: 6 },
    { nome: "Eduardo", nota: 7 }
  ]

  return alunos
    .filter((aluno) => aluno.nota >= 7)
    .map((aluno) => aluno.nome)
}
