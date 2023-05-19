let x = 10; // Variable de tipo primitiva
console.log(x.length); // undefined

// Objeto
let persona = {
    nombre: 'Homero',
    apellido: 'Simpson',
    email: 'homerosimpson@mail.com',
    edad: 29,
    idioma: 'es',
    get lang(){
        return this.idioma.toUpperCase();
    },
    set lang(lang){
        this.idioma = lang.toUpperCase();
    },
    nombreCompleto: function(){ // Método o función en JS
        return this.nombre + ' ' + this.apellido;
    },
    get nombreEdad(){ // Este es el método get
        return 'El nombre es: '+this.nombre + ', Edad: ' + this.edad;
    }
}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);

let persona2 = new Object(); // Debe crear un nuevo objeto en memoria
persona2.nombre = 'Bart';
persona2.direccion = 'Av. Siempreviva 742';
persona2.tel = '555-555-5555';
console.log(persona2.tel);

console.log(persona['apellido']); // Se puede acceder a los atributos del objeto con corchetes

// for in
for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
}

persona.apellido = 'Ascua'; // Cambiamos dinámicamente el valor de un atributo
console.log(persona);

// Distintas formas de imprimir un objeto
// Número 1: la más sencilla: concatenar cada valor de cada propiedad
console.log(persona.nombre+', '+persona.apellido);

// Número 2: A través del ciclo for in
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

// Número 3: la función Object.values()
let personaArray = Object.values(persona);
console.log(personaArray);

// Número 4: utilizando JSON.stringify()
console.log('Distinta forma de imprimir un objeto: forma 4');
let personaString = JSON.stringify(persona);
console.log(personaString);

console.log('Comenzamos a utilizar el método get');
console.log(persona.nombreEdad);

console.log('Comenzamos a utilizar el método get y set para idiomas');
persona.lang = 'en';
console.log(persona.lang);

function Persona3(nombre, apellido, email){ // constructor
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function(){
        return this.nombre + ' ' + this.apellido;
}
let padre = new Persona3('Homero', 'Simpson', 'homerosimpson@mail.com');
padre.nombre = 'Pepe'; // Cambiamos el valor de un atributo Nombre
padre.telefono = '555-555-5555'; // Agregamos un nuevo atributo
console.log(padre);
console.log(padre.nombreCompleto()); 
let madre = new Persona3('Laura', 'Cristal', 'nomail@mail.com');
console.log(madre);
console.log(madre.telefono); // undefined
console.log(madre.nombreCompleto());


// Diferentes formas de crear objetos en JS
// caso objeto 1
let miObjeto = new Object(); // Esta es una opción formal

// caso objeto 2
let miObjeto2 = {}; // Esta es la forma más común   

// caso String
let miCadena1 = new String('Hola'); // Esta es una opción formal

// caso String 2
let miCadena2 = 'Hola'; // Esta es la forma más común, simplificada recomendada

// caso Number 1
let miNumero = new Number(1);

// caso Number 2
let miNumero2 = 1; // Sintaxis recomendada

// caso boolean 1
let miBoolean = new Boolean(false); // Formal
// caso boolean 2
let miBoolean2 = false; // Recomendada

// caso Arreglos 1
let miArreglo = new Array(); // Formal
// caso Arreglos 2
let miArreglo2 = []; // Recomendada 

// caso función 1
let miFuncion = new Function(); // Formal
// caso función 2
let miFuncion2 = function(){}; // Recomendada porque es simplioficada y más común

// Uso de prototype
Persona3.prototype.telefono = '555-555-5555';
console.log(padre.telefono);
madre.telefono = '444-444-4444';
console.log(madre.telefono);

// Uso de call
let persona4 = {
    nombre: 'Lisa',
    apellido: 'Simpson',
    nombreCompleto2: function(titulo, telefono){
        return titulo + ': ' + this.nombre + ' ' + this.apellido + ', ' + telefono;
        //return this.nombre+' '+this.apellido;
    }
}

let persona5 = {         
    nombre: 'Bart',
    apellido: 'Simpson'
}

console.log(persona4.nombreCompleto('Lic', '555-555-5555'));
console.log(persona4.nombreCompleto.call(persona5, 'Ing', '444-444-4444'));

// Método Apply
let arreglo = ['Ing', '555-555-5555'];
console.log(persona4.nombreCompleto2.apply(persona5));
