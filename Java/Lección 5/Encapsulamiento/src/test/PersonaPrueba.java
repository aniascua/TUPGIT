/*
Ascua Ana
Clase 8 - 21/10/2022
Seguimos trabajando con el ENCAPSULAMIENTO

 */
package test;
        
import dominio.*; // importamos TODAS las clases dentro del paquete Dominio
import dominio.Persona; // así solo importamos 1 clase, la clase Persona

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Osvaldo", 57.000, false);
        // copy paste para ver si aparece Juan Ignacio u Osvaldo:
        System.out.println("persona1 = " + persona1);
        System.out.println("persona1 su nombre es: "+persona1.getNombre());
        
        // Modificamos a través de los métodos:
        persona1.setNombre("Juan Ignacio");
        //persona1.nombre = "Juan Ignacio"; // Ya no se puede utilizar
        //System.out.println("El nombre es: "+persona1.nombre); // Error
        System.out.println("persona1 su nombre es: "+persona1.getNombre());
        System.out.println("persona1 con su nombre modificado: "+persona1.getNombre());
        System.out.println("persona1 el resultado para el sueldo: "+persona1.getSueldo());
        System.out.println("para obtener el booleano: "+persona1.isEliminado());
        
// Tarea: Crear otro objeto de tipo Persona, asignar valores de manera inicial
 // e imprimir, luego modificar sus valores y volver a imprimir
        
        // Creamos un objeto nuevo de tipo Persona y le asignamos valores iniciales:
        Persona persona2 = new Persona("Pepe", 22, true);
        // Mostramos al objeto nuevo por pantalla:
        System.out.println("persona 2 su nombre es: "+persona2.getNombre());
        // Ahora modificamos sus valores:
        persona2.setNombre("Pepa Pig");
        System.out.println("persona2 con su nombre modificado: "+persona2.getNombre());
        // También modificamos su sueldo:
        persona2.setSueldo(40000);
        System.out.println("persona2 Nuevo sueldo: "+persona2.getSueldo());
       
        // Usamos el método ToString que creamos en Persona.java:
        System.out.println("persona1: "+persona1.toString());
        // el toString nos muestra todos los datos de la persona entre [ ]
        
        // y si hacemos esto, soutv + tab: automáticamente accede al toString y concatena todo:
        System.out.println("persona1 = " + persona1);
        // también muestra todos los datos de la persona entre [ ]
        
    }
}

