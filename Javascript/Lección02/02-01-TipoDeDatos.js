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