/**
 *
 * @author ASCUA
 * Clase 2/08/2022
 * Ejercicio 2: Leer un número e indicar si es positivo o negativo.
 * El proceso se repetirá hasta que se introduzca un 0
 * 
 * Hacer este ejercicio con la clase JOptionPane.
 *
 */
package Ciclos02;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE UN NÚMERO: ");
        var numero = Integer.parseInt(entrada.nextLine());
        while (numero != 0) {
            if (numero > 0) {
                System.out.println("EL NÚMERO " + numero + " ES POSITIVO");
            } else {
                System.out.println("EL NÚMERO " + numero + " ES NEGATIVO");
            }
            System.out.println("INGRESE OTRO NÚMERO: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El número "+numero+" finaliza el programa");
    }
}
