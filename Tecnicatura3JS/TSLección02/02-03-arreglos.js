// Segunda clase de Javascript - Arrays (arreglos) 10/04/2023

// CREACIÓN DE ARRAYS O ARREGLOS
// let autos = new Array('Ferrari, 'Lamborghini', 'Audi', 'BMW', 'Mercedes Benz'); 
// esa es la sintaxis obsolera de crear un arreglo

// La nueva sintaxis es la siguiente:
const autos = ['Ferrari', 'Lamborghini', 'Audi', 'BMW', 'Mercedes Benz'];

// Recorremos los elementos del arreglo
console.log(autos[0]);
console.log(autos[2]);

for(let i = 0; i < autos.length; i++) {
    console.log(i+' : '+autos[i]);
}


// Modificamos los elementos del arreglo
autos[1] = 'Porsche';
console.log(autos[1]);

// Otras formas de agregar elementos al arreglo
autos[autos.length] = 'Aston Martin';
console.log(autos);

// Tercera forma de agregar elementos al arreglo con cuidado
autos[6] = 'Bugatti';
console.log(autos);


// Como preguntar si es un Array o arreglo
console.log(Array.isArray(autos));

console.log(autos instanceof Array); // Pregunta si autos es una instancia de Array/