/*
ASCUA Ana
Clase 8 Java - 21/10/2022
Contexto estático parte 2 (lo ponemos en práctica)
 */
package test;

import domain.Persona;

public class PersonaPrueba {
    
    // atributo nuevo dentro de la clase PersonaPrueba:
    private int contador;

    public static void main(String[] args) {
        // creamos un objeto de la clase Persona:
        Persona persona1 = new Persona("Ana");
        System.out.println("persona1 = " + persona1);

        // creamos otro objeto:
        // el id será 2 (se incrementó en 1)
        Persona persona2 = new Persona("Naty");
        System.out.println("persona2 = " + persona2);
        imprimir(persona1);
        imprimir(persona2);
        //this.contador = 10;// no se puede referenciar desde un contexto estático
        PersonaPrueba personaP1 = new PersonaPrueba();
        System.out.println(personaP1.getContador());
    }
    
    
    public static  void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
    
    public int getContador(){
        imprimir(new Persona("Liliana"));
        return this.contador;
    }
    
}
