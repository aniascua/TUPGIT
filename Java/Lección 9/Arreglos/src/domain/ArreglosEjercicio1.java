/*
Ejercicio 1: Leer 5 números, guardarlos en un arreglo y mostrarlos en el mismo 
orden introducidos
*/
package domain;
/**
 * @author ASCUA
 */
import java.util.Scanner;

public class ArreglosEjercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] cincoNumeros = new float[5];
        
        System.out.println("Guardando los datos en el arreglo");
        for(int i = 0; i < 5; i++){
            System.out.print((i+1)+". INGRESE UN NÚMERO: ");
            cincoNumeros[i] = entrada.nextFloat();
        }
        
        System.out.println("\nImprimimos los elementos del array: ");
        for(float i:cincoNumeros){
            System.out.println(i+" ");
        }
        System.out.println("\n");
    }

}
