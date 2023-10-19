function hola(nombre, miCallback) {
    setTimeout(function () {
        console.log('Hola ' + nombre);
        miCallback();
    }, 1000);
}

function hablar(callbackHablar) {
    setTimeout(function () {
        console.log("bla bla bla bla...");
        callbackHablar();
    }, 1000);
}

function adios(nombre, otroCallback) {
    setTimeout(function () {
        console.log('Adios', nombre);
        otroCallback();
    }, 1500);
}

function conversacion(nombre, veces, callback) {
    hablar( function () {
        conversacion()
    })
}


/* Proceso Principal */
console.log('Iniciando el proceso...');
hola('Ana', function (nombre) {
});
/*hola('Carlos', function (nombre) {
    hablar(function () {
        hablar(function () {
            hablar(function () {
                hablar(function () {
                    adios(nombre, function () {
                        console.log('Terminando el proceso...');
                    });
                });
            });
        });
    });
}); */