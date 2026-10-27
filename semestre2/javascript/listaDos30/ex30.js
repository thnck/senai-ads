let idade = 17;
let notaProva = 82;
let frequencia = 88;
let autorizacaoResponsavel = true;
let possuiPendencia = false; 

if(idade >= 14 && idade <= 20 &&
    notaProva >= 70 &&
    frequencia >= 80 &&
    !possuiPendencia &&   
    (idade >= 18 || autorizacaoResponsavel)){
    console.log("Inscrição aprovada");
}else{
    console.log("Inscrição recusada");
}   