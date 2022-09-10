/*
Ejercicio 5: realizar un juego para adivinar un número, para ello, 
generar un número aleatorio entre 0-100, y luego ir pidiendo números, indicando
"es mayor" o "es menor" según sea mayor o menor con respecto al N° a adivinar.
El proceso termina cuando el usuario acierta y mostramos el número de intentos 
hechos.
* @author ASCUA
Clase 09/09/2022

 */
package Ciclos05;

import java.util.Scanner;

public class Ciclos05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, random, contador = 0;
        random = (int)(Math.random()*100); // Esto genera un N° random

        do {
            System.out.println("INGRESE UN NÚMERO, TE DIRÉ SI ES EL N° SECRETO: ");
            numero = Integer.parseInt(entrada.nextLine());

            if (numero < random) {
                System.out.println("Ingrese un número mayor: ");
            } else if (numero > random) {
                System.out.println("Ingrese un número menor: ");

            } else {
                System.out.println("BINGO! ADIVINASTE EL NÚMERO SECRETO!");
            }
            contador++;
        } while (numero != random);
            System.out.println("Adivinaste el número secreto en: "+contador+" intentos");
    } 

}
