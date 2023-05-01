/*
Ejercicio 14: Leer 2 series de 10 números enteros, que estarán ordenados crecientemente.
Copiar (fusionar) las 2 tablas en una tercera, de forma que sigan ordenados.
 */
package Arreglos_Ejercicio_14;

import java.util.Scanner;

public class Arreglos_Ejercicio_14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[20];
        boolean creciente = true;

        System.out.println("Llenar el primer arreglo: ");
        do {
            for (int i = 0; i < 10; i++) {
                System.out.println((i + 1) + ". Ingrese un número: ");
                a[i] = entrada.nextInt();
            }
            // Comprobamos si el arreglo está ordenado:
            for (int i = 0; i < 9; i++) {
                if (a[i] < a[i + 1]) {// Creciente 1-2-3
                    creciente = true;
                }
                if (a[i] > a[i + 1]) {// Decreciente 3-2-1
                    creciente = false;
                    break;
                }

                if (creciente == false) {
                    System.out.println("\nEl arreglo está desordenado, vuelva a ingresar: ");
                }
            }
            while (creciente == false);

            System.out.println("Llenar el segundo arreglo: ");
            do {
                for (int i = 0; i < 10; i++) {
                    System.out.println((i + 1) + ". Ingrese un número: ");
                    b[i] = entrada.nextInt();
                }

                for (int i = 0; i < 9; i++) {
                    if (b[i] < b[i + 1]) {
                        creciente = true;
                    }
                    if (b[i] > b[i + 1]) {
                        creciente = false;
                        break;
                    }

                    if (creciente == false) {
                        System.out.println("\nEl arreglo está desordenado, vuelva a ingresarlo: ");
                    }
                }
                while (creciente == false);

                int i = 0; // iterador i para arreglo A
                int j = 0; // iterador j para arreglo B
                int k = 0; // iterador k para arreglo C

                while (i < 10 && j < 10) {
                    if (a[i] < b[j]) {// Si el elemento de A es menor de B
                        c[k] = a[i];// copiamos el elemento de A
                        i++; // Avanzamos una posición en A
                    } else {
                        c[k] = b[j];//Copiamos el elemento de B
                        j++;// Avanzamos una posición más en B
                    k++;//Avanzamos una posición más en C
                }
                }else{// Significa que ya copiamos todo el arreglo B, falta el A
                    while(i<10){
                    c[k] = a[i];
                    i++;
                    k++;
                    }
        }
   
            System.out.println("\nEl arreglo C completo es: ");
            for (k = 0; k < 20; k++) {
                System.out.print(c[k] + " - ");
            }
            System.out.println();
        }
    } 