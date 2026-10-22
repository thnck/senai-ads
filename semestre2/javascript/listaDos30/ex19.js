let nota = 5.8;
let frequencia = 82;

if(frequencia < 75){
    console.log("Reprovado por frequencia");
}else{
    if(nota >= 7){
        console.log("Aprovado");
    }
    else if(nota >= 5 && nota < 7){
        console.log("Recuperacao");        
    }else{
        console.log("Reprovado por nota");
    }
}