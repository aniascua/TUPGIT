/* Clase 30/09
Ejercicio 10: Pedir 10 números y escribir la suma del total
Hacerlo con la clase Scanner y JOptionPane
*/
package Ciclos10;

import java.util.Scanner;

public class Ciclos10 {
    public static void main(String[] args) {
        int numero, i = 0, suma = 0, suma_total = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        for (i = 1; i <= 10; i++){
            System.out.println("INGRESE 10 NÚMEROS, TE DIRÉ LA SUMA DEL TOTAL: ");
            numero = Integer.parseInt(entrada.nextLine());
            suma_total = suma_total + numero;
        }
        System.out.println("La suma total es: "+suma_total);
        
    }
}
