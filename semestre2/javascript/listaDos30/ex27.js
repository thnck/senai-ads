let usuario = "admin";
let senha = "1234"; 
let tentativas = 2;

if(tentativas >= 3){
    console.log("Conta bloqueada"); 
}else if(usuario === "admin" && senha === "1234"){
    console.log("Login realizado com sucesso");
}else{
    console.log("Credenciais inválidas");
}