/* Tipos de Datos en JavaScript  -  Clase 27/09/2022

Otro tipo de formato para comentarios más extensos
La sintaxis en lo que es comentarios es muy similar
a la de Java, realmente diríamos que es idéntica    */

// DATO DE TIPO STRING:
var nombre = 'Ana';
console.log(typeof nombre);
nombre = 7;
console.log(typeof nombre);
nombre = 12.3;
console.log(typeof nombre)


// Tipo Numérico
var numero = 3000; // tipo numérico
console.log(numero);


// Tipo Object
var objeto = {
    nombre : 'Ana Ayelén', 
    apellido : 'Ascua',
    telefono : '123456789'
}

console.log(typeof objeto);

// Tipo de dato boolean
var bandera = true;
console.log(bandera);

// Tipo de dato función
function miFuncion(){}
    console.log(typeof miFuncion);

// Tipo de dato Symbol
var simbolo = Symbol("Esto es una cadena. Mi simbolo");
console.log(typeof simbolo); 

 // Tipo de dato Clase
 class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
 }

 console.log(Persona);

 // Tipo de dato undefined
 var x;
 console.log(typeof x);

 x = undefined;
 console.log(x);

 // null: significa ausencia de valor
var y = null; // null no es un tipo de dato, pero su origen es de tipo object
console.log(typeof y);

// Tipo de dato array y Empty String // los arreglos en js son de tipo object
var autos = ['Peugeot', '308', '208', '3008'];
console.log(autos);
console.log(typeof autos); // QUOKKA: ctrl+shift+p - Preguntamos que tipo de dato es:

var z = '';
console.log(z); // string vacío, esto es una cadena vacía
console.log(typeof z);