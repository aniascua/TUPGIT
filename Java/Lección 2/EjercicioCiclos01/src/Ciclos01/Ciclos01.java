/*
Ejercicio 1: Leer un número y mostrar su cuadrado,
repetir el proceso hasta que se introduzca un N° negativo.
 */
package Ciclos01; // carpeta/folder 

import java.util.Scanner;

public class Ciclos01 {

    public static void main(String[] args) {
        int numero, cuadrado;
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE UN NÚMERO: ");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero >= 0) {  // Mientras el número sea igual a 0 ó positivo, funciona la condición
            cuadrado = (int) Math.pow(numero, 2);
            System.out.println("EL NÚMERO " + numero + " ELEVADO AL CUADRADO ES: " + cuadrado);
            System.out.println("INGRESE OTRO NÚMERO: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("EL PROGRAMA HA FINALIZADO POR HABER INGRESADO UN N° NEGATIVO.");

    }
}
