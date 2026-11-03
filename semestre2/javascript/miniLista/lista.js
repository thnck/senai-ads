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
