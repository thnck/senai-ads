let ladoA = 1;
let ladoB = 3;
let ladoC = 5;

if((ladoA > 0  && ladoB > 0 && ladoC > 0) &&((ladoA + ladoB > ladoC) || (ladoB + ladoC > ladoA) || (ladoA + ladoC > ladoB)){
    console.log("Triangulo válido");
    }
else{
    console.log("Triângulo inválido");
}