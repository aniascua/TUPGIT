
package test;

import domain.Persona;

public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        personas[0] = new Persona("Ana");
        personas[1] = new Persona("Osvaldo");
        System.out.println("personas 0 = " + personas[0]);
        System.out.println("personas 1 = " + personas[1]);
        
        System.out.println("\nIterando a las personas, clase 11 Arreglos o Arrays:");
        
        for(int i = 0; i < personas.length; i++){
            System.out.println("personas "+i+" = " + personas[i]);
        }
        
        // Trabajamos con arreglos en la sintaxis resumida:
        String frutas[] = {"Banana", "Pera", "Manzana", "Durazno"};
        for (int i = 0; i < frutas.length; i++){
            System.out.println("frutas " +i+" = "+frutas[i]);
        }
        //System.out.println("frutas = " + frutas[3]); // Muestra Durazno
    }
}
