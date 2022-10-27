var nombre = 'Jose';
var apellido = 'Montes';
var nombreCompleto = nombre +' '+apellido; // primera concatenación
console.log(nombreCompleto);

var nombreCompleto2 = 'Pepe'+' '+'Jons'; // segunda concatenación
console.log(nombreCompleto2);

var juntos = nombre + 219; // lee de izq a der siguiendo la cadena, lee el número como str
console.log(juntos);
juntos = nombre + (78 + 17); // Sin (), sigue concatenando como str
console.log(juntos);
juntos = 78 + 17 + nombre; // suma los números y concatena el nombre
console.log(juntos); // output: 95Jose
// A esto se lo llama contexto str o contexto cadena.

nombre += apellido; // Tercera concatenación usando el operador simplificado
console.log(nombre)

// Hoy ya no se usa var, se utiliza let y const
let nombre2 = "Pedro";
console.log(nombre2)

const apellido2 = "Simpson";
//apellido2 = "Simsponito"; una constante no puede ser modificada
console.log(apellido2)

// Clase  7 JavaScript - 25/10/2022

//let x, y;  // Se pueden crear varias variables dentro de una misma línea, al igual que en Java.

let x = 17, y = 21; // Se pueden asignar a las 2 en la misma línea
let z = x + y;
console.log(z);

let _1num = 31; // No utilizar números para iniciar el nombre de una variable
//let break = "romper"; // No se usan palabras reservadas como break

console.log(_1num);