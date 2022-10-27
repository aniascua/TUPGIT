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
    }
}

