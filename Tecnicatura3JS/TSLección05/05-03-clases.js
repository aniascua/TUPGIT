// 15-05-2023 - Clase 6  

//let persona3 = new Persona('Carla', 'Ponce'); Esto no se debe hacer: Persona is not defined

class Persona {
    constructor (nombre, apellido, email) {
        this._nombre = nombre;
        this._apellido = apellido;
    }

    get nombre() {
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }

    get apellido() {
        return this._apellido;
    }

    set apellido(apellido){
        this._apellido = apellido;
    }   
}

class Empleado extends Persona {
    constructor(nombre, apellido, departamento){
        super(nombre, apellido);
        this._departamento = departamento;
    }

    get departamento(){
        return this._departamento;
    }

    set departamento(departamento){
        this._departamento = departamento;
    }   
}

let persona1 = new Persona('Juan', 'Perez');
console.log(persona1.nombre);
persona1.nombre = 'Juan Carlos';
console.log(persona1.nombre);
//console.log(persona1.nombre);
let persona2 = new Persona('Carlos', 'Lara');
console.log(persona2.nombre);
persona2.nombre = 'María Laura';
console.log(persona2.nombre);
//console.log(persona2);

let empleado1 = new Empleado('María', 'Jiménez', 'Sistemas');
console.log(empleado1);
console.log(empleado1.nombre);