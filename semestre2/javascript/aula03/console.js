// SWITCH CASE

// IF X SWICTH 
// CONDIÇÂO SIMPLES - IF/ ELSE
// DIAS DA SEMANA - SWITCH

//SWITCH - Avaliar uma expressao
//CASE - 

let dia = 3;

switch(dia){
    case 1:
        console.log("SEGUNDA");
        break;
    case 2: 
        console.log("TERÇA");
        break;
    case 3:
        console.log("QUARTA");
        break;
    case 4:
        console.log("QUINTA");
        break;
    case 5: 
        console.log("SEXTA");
        break;
    case 6:
        console.log("SÁBADO");
        break;
    case 7: 
        console.log("DOMINGO");
        break;
    default:
        console.log("INVÁLIDO");
        break;
}


//semaforo com switch case
let cor = "verde";

switch(cor){
    case "verde":
        console.log("Liberado");
        break;
    case "amarelo":
        console.log("Reduza");
        break;
    case "vermelho":
        console.log("Pare");
        break;
    default:
        console.log("Cor inválida");
        break;
}

// LAÇOS DE REPETIÇAO


// FOR

let tabuada = 7;
for (let i = 0; i<=10; i++ ){
    console.log(`${tabuada} X ${i} = ${tabuada*i}`);
}

// WHILE

let contador = 10;

while(contador <=10 && contador >= 0){
    console.log(contador);
    contador--;
}

// DO WHILE

let numero = 1;

do{
    console.log(`numero: ${numero}`);
    numero++;
}while(numero <= 10);