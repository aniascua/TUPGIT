// Primera clase de Javascript - Ciclos (Bucles) 05/04/2023

// while
let contador = 0;
while (contador < 3) {
    console.log(contador);
    contador++;
}  
console.log('Fin del ciclo while');

// do while
let conteo = 0;
do {
    console.log(conteo);
    conteo++;
}
while (conteo < 3);

// for
for (let contando = 0; contando < 3; contando++) {
    console.log(contando);
}   
console.log('Fin del ciclo for');

// Palabra reservada break
for (let contando = 0; contando <= 10; contando++) {
    if (contando % 2 == 0) {
        console.log(contando); // Muestra todos los pares
        break;
    }
}
console.log('Fin del ciclo for');

// Palabra reservada continue y Etiquetas/Labels
inicio:
for (let contando = 0; contando <= 10; contando++) {
    if (contando % 2 !== 0) {
        continue; // ir a la siguiente iteración
    } 
    console.log(contando); 
}
console.log('Termina el ciclo');       