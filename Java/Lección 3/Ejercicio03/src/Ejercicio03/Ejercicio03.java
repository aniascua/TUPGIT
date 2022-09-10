/*
Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar. 
Primero hacerlo con la clase Scanner
luego con JOptionPane
 *
 * @author ASCUA
    Clase 9/09/2022
 */
package Ejercicio03;

import java.util.Scanner; // IMPORTAMOS LA CLASE SCANNER

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESAR UN NÚMERO: ");
        var numero = Integer.parseInt(entrada.nextLine());
        while (numero != 0) {
            if (numero > 0) {
                System.out.println(numero);
                if (numero % 2 == 0) {
                    System.out.println("EL NÚMERO " + numero + " ES PAR");
                    //break;
                } else {
                    System.out.println("EL NÚMERO " + numero + " ES IMPAR");

                }
                System.out.println("INGRESE OTRO NÚMERO: ");
                numero = Integer.parseInt(entrada.nextLine());

            }

        }
        //System.out.println("El número " + numero + " finaliza el programa");
        if (numero == 0) {
            System.out.println("EL NÚMERO INGRESADO ES 0, POR LO TANTO FINALIZA EL PROGRAMA");
        }
    }
}
