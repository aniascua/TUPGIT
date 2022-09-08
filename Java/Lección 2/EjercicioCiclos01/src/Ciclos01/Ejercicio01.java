/*
Ejercicio 1: Leer un número y mostrar su cuadrado,
repetir el proceso hasta que se introduzca un N° negativo.
Clase 2/08/2022
 */
package Ciclos01;

import javax.swing.JOptionPane; 

public class Ejercicio01 {

    public static void main(String[] args) {

        int numero, cuadrado;
      
        numero = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NÚMERO: "));
        while (numero >= 0) {  // Mientras el número sea igual a 0 ó positivo, funciona la condición
            cuadrado = (int) Math.pow(numero, 2);
            System.out.println("EL NÚMERO " + numero + " ELEVADO AL CUADRADO ES: " + cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("INGRESE OTRO NÚMERO: "));
        }
        System.out.println("EL PROGRAMA HA FINALIZADO POR HABER INGRESADO UN N° NEGATIVO.");

    }
}
