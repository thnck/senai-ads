let ladoA = 6;
let ladoB = 6;
let ladoC = 4;

let formaTriangulo = ladoA > 0 && ladoB > 0 && ladoC > 0 &&
    ladoA + ladoB > ladoC &&
    ladoA + ladoC > ladoB &&
    ladoB + ladoC > ladoA;

if(formaTriangulo){
    if(ladoA === ladoB && ladoB === ladoC){
        console.log("Triângulo equilátero");
    }else if(ladoA === ladoB || ladoA === ladoC || ladoB === ladoC){
        console.log("Triângulo isósceles");
    }else{
        console.log("Triângulo escaleno");
    }
}else{
    console.log("Triângulo inválido");
}