/*
Ejercicio 2: Leer 5 números, guardarlos en un arreglo y mostrarlos en el orden
inverso al introducido
*/
package domain;
/**
 *
 * @author ASCUA
 */

import java.util.Scanner;

public class ArreglosEjercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];
        
        System.out.println("Guardando los elementos del arreglo");
        for(int i = 0; i < 5; i++){
            System.out.println((i+1)+". INGRESE UN NÚMERO: ");
            numeros[i] = entrada.nextFloat();
        }
        
        System.out.println("\n Imprimimos los elementos del arreglo: ");
        for(int i = 4; i >= 0; i--){
            System.out.println(i+" "+numeros[i]);
        }
        System.out.println("\n");
        
        
    }
}
