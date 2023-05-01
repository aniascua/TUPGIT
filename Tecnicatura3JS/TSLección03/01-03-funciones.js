miFuncion(8, 2); // Esto se le conoce como hosting

function miFuncion(a, b) {
    //console.log("Sumamos: " + (a + b))")
    return a + b;
}

// Llamamos a la función
miFuncion(5, 4);

let resultado = miFuncion(6, 7);
console.log(resultado);

// Declaramos una función de tipo expresión
let x = function(a, b) { return a + b };
resultado = x (5, 6);
console.log(resultado);

// Funciones de tipo self e invoking
(function(a, b) {
    console.log("Ejecutando la función: " + (a + b));
} (9, 6));


console.log(typeof miFuncion);
function miFuncion(a, b) {
    console.log(arguments.length);
}

miFuncionDos(5, 7, 3, 6);
var miFuncionTexto = miFuncionDos.toString();
console.log(miFuncionTexto);


// Funciones flecha
const sumarFuncionFlecha = (a, b) => a + b;
resultado = sumarFuncionFlecha(3, 7); // Asignamos el valor a una variable
console.log(resultado);

let sumar = function(a, b) {
    console.log(arguments[0]); // muestra el parámetro de: a
    console.log(arguments[1]); // muestra el parámetro de: b
    a + b + arguments[2];
    return a + b;
}
resultado = sumar(3);
console.log(resultado);

let respuesta = sumarTodo(5, 4, 13, 10, 9); 
console.log(respuesta);
function sumarTodo(){
    let suma = 0;
    for(let i = 0; i < arguments.length; i++){
        suma += arguments[i]; // Arguments es para arreglos (arrays)
    }
    return suma;
}

// Tipos primitiivos
let k = 10;
function cambiarValor(a){
    a = 20;
}
cambiarValor(k);
console.log(k);

// Paso por referencia: objetos
const persona = {
    nombre: "Juan",
    apellido: "Perez"
}
console.log(persona); // Primero vemos el objeto y luego lo cambiamos:
function cambiarValorObjeto(p1){
    p1.nombre = "Ignacio";
    p1.apellido = "Perez";
}

cambiarValorObjeto(persona);
console.log(persona);