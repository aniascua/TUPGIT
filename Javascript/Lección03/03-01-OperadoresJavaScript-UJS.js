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


// Ejercicio: Si el padre puede asistir al juego de su hijo
let vacaciones = false, diaDescanso = false;
if (vacaciones || diaDescanso) {
    console.log("El padre puede asistir al juego de su hijo");
}
else {
    console.log("El padre no puede asistir al juego de su hijo");
}

// Operador ternario
let resultado2 = 3 > 2 ? "Verdadero" : "Falso";
console.log(resultado2);

// Convertir String a Number
let miNumero = "20"; // Es una cadena String
console.log(typeof miNumero);
let miNumero2 = Number(miNumero); // Esta es una función para convertir a número
console.log(typeof miNumero2);

if(isNaN(miNumero2)){
    console.log("No es un número");
}else{
    console.log("Es un número");
}

if(edad >= 18){
    console.log("Puede votar");
}else{
    console.log("Muy joven para votar");
}

let resultado3 = edad2 >= 18 ? "Puede votar" : "Muy joven para votar";
console.log(resultado3); 


// Función isNaN
