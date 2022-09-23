// CREACIÓN DE NUESTRO PRIMER OBJETO EN JAVA

package Clases;

public class PruebaPersona { // el método main está para ejecutar el programa
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona(); // con el objeto persona1 estamos llamando al constructor de la clase Persona
        persona1.nombre = "Ana"; // El valor hexadecimal normalmente comienza con 0x
        persona1.apellido = "Ascua";
        persona1.obtenerInfo(); // llamando al método "obtener información"
        
        Persona persona2 = new Persona();
        System.out.println("persona2 = "+ persona2);
        System.out.println("persona1 = "+ persona1);
        persona2.obtenerInfo(); // nos da Null como nombre y apellido
        
        // Para que podamos ver datos de persona2, hay que cargarlos:
        persona2.nombre = "Pepito";
        persona2.apellido = "MiConejo";
        persona2.obtenerInfo();
        // Los objetos NO comparten información. solo comparten los atributos
        // definidos en la clase Persona.java
        
        // La clase persona es nuestra plantilla, donde definimos los atributos
        // y los métodos/acciones
        
        // Instanciar objeto es crear objeto, se crean asi: Persona persona1 = new Persona();
        
    }
    
}
