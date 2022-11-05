// Clase 7 JavaScript
// Ejercicio para encontrar números pares:

var numero = 0;

/*while (numero <= 100) {
    if (numero % 2 == 0) {
        console.log(numero);
    }
    numero++;
}
*/

let parImpar = 22;
if(parImpar % 2 == 0){
    console.log("El número es par");
}else{
    console.log("El número es impar");
}


// Ejercicio: Dentro de un rango
let dentroRango = 5; // Aquí vamos a ir cambiando el valor
let valMin = 0, valMax = 10;
if (dentroRango >= valMin && dentroRango <= valMax) {
    console.log("El número está dentro del rango");
} else {
    console.log("El número está fuera del rango");
}