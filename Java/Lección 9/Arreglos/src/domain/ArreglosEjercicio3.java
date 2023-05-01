/*
Ejercicio 3: Leer 5 números por teclado, almacenarlos en
un arreglo y a continuación realizar la media de los números positivos, 
la media de los negativos y contar el número de ceros
 */
package domain;
/**
 *
 * @author ASCUA
 */

import java.util.Scanner;

public class ArreglosEjercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];
        float negativos = 0, positivos = 0, mediaNegativos, mediaPositivos;
        int contador0 = 0, contador_neg = 0, contador_positivo = 0;
        
        System.out.println("Guardamos los elementos del array: ");
        for(int i = 0; i < 5; i++){
            System.out.print((i+1)+". INGRESE UN NÚMERO: ");
            numeros[i] = entrada.nextFloat();
            if(numeros[i]>0){
                positivos += numeros[i];
                contador_positivo++;
            }
            else if(numeros[i]<0) {
                contador_neg++;
            }
            else{
                contador0++;
            }
        }
        
        if(contador_positivo == 0){
            System.out.println("\nNo se puede sacar la media de los N° positivos");
        }else{
            mediaPositivos = positivos/contador_positivo;
            System.out.println("\nLa media de los N° positivos es: "+mediaPositivos);
        }
        
        if(contador_neg == 0){
            System.out.println("\nNo se puede sacar la media de los N° negativos");
        }else{
            mediaNegativos = negativos/contador_neg;
            System.out.println("\nLa media de los N° negativos, es: "+mediaNegativos);
        }
        
        System.out.println("La cantidad de ceros, es: "+contador0);
        // Ingresar 2, -5, 6, -2, 0
        
        
        
    }
}
