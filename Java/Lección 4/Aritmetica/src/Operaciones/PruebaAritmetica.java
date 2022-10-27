package Operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {
        var a = 10;  // variables locales
        int b = 7;  // Memoria stack
        miMetodo(); // Llamamos el método nuevo

        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 11;
        aritmetica1.b = 11;

        aritmetica1.sumarNumeros();
        // Para almacenar un objeto o los atributosse utiliza la memoria heap

        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);

        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando arguementos = " + resultado);

        System.out.println("aritmetica1 a: " + aritmetica1.a);
        System.out.println("aritmetica1 b: " + aritmetica1.b);

        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 = " + aritmetica2.a);
        System.out.println("aritmetica2 = " + aritmetica2.b);
        // aritmetica1 = null; no utilizar esto, no se debe hacer
        // System.gc(); método para limpiar residuos, es pesado, no utilizar
        Persona persona = new Persona("Ana", "Ascua"); // le pasamos 2 argumentos
        System.out.println("persona = " + persona);
        System.out.println("Persona nombre: " + persona.nombre);
        System.out.println("Persona apellido: " + persona.apellido);
    }

    // otro método // Modularidad creamos un nuevo método:
    public static void miMetodo() {
        // a = 10;  la variable está limitada porque no está con el int delante
        int a = 10;
        System.out.println("Aquí hay otro método");
    }

}

// Clase 7 JAVA - Uso de la palabra this Parte 1 y crear una clase a continuación de otra:
// Solo a una sola clase se le puede asignar el tipo Public
// luego será de tipo default o package (no se pone nada, solo class y el nombre de la clase a crear)
// CREAMOS UNA NUEVA CLASE:
class Persona {

    // acá ponemos atributos
    // a esta clase solo se puede acceder dentro del mismo paquete
    String nombre;
    String apellido;

    // método constructor de tipo Persona:
    Persona(String nombre, String apellido) {  // Constructor
        super(); // Llamada al constructor de la clase Padre object
        //Imprimir imprimir = new Imprimir();
        new Imprimir().imprimir(this);
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: " + this);
    }

}

// Creamos una clase llamada Imprimir
class Imprimir {

    public Imprimir() {
        super(); // El constructor de la clase padre, para reservar memoria
    }

    public void imprimir(Persona persona) {
        System.out.println("Persona dese la clase imprimir: " + persona);
        System.out.println("Impresión del objeto actual (this): " + this);

    }
}
