/* Ampliando el uso del var, let y const

Con var se puede redeclarar la variable	en cualquier moment
forma parte del ambito global.

Un error es que se sobreescriba
*/
var nombre = 'Ana';
nombre = 'Osvaldo';
console.log(nombre);

function saludar(){
    var nombre = 'Natalia';
    console.log(nombre);
}   
console.log(nombre); // El problema es que aquí no lee el dato en la función


if(true){
    var edad = 34;
    console.log(edad); //34
}
console.log(edad); // En la función funciona correctamente, en la estructura if, falló

/*
Con let se puede redeclarar la variable	en cualquier moment
la diferencia es que su ambito es de bloque, solo disponible dentro de un bloque,
si se declara fuera de un bloque, no se puede usar dentro de un bloque o de una función
*/

function saludar2(){
    let nombre = 'Natalia';
    //console.log(nombre);
}
//console.log(nombre); // El problema es que aquí no lee el dato en la función

if(true){
    let edad = 34;
    console.log(edad2);
}
console.log(edad2);

/*
const se utiliza para valores constantes que no pueden ser reasignados
*/

const fechaNacimiento = 2006;
console.log(fechaNacimiento);
fechaNacimiento = 2003; // Error, no se puede reasignar
console.log(fechaNacimiento); // solo se ejecuta el consolelog anterior

/*
let: esta puede ser reasignada en cualquier momento,
la diferencia es que su ambito es de bloque, solo disponible dentro de un bloque,
*/