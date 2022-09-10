/*
Ejercicio 5: realizar un juego para adivinar un número, para ello, 
generar un número aleatorio entre 0-100, y luego ir pidiendo números, indicando
"es mayor" o "es menor" según sea mayor o menor con respecto al N° a adivinar.
El proceso termina cuando el usuario acierta y mostramos el número de intentos 
hechos.
* @author ASCUA
Clase 10/09/2022

 */
package Ciclos05JOptionPane;

import javax.swing.JOptionPane;

public class Ciclos05JOptionPane {

    public static void main(String[] args) {
        int random, contador = 0;
        random = (int)(Math.random()*100); // Esto genera un N° random
        int numero = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NÚMERO, TE DIRÉ SI ES EL N° SECRETO!"));
        
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NÚMERO, TE DIRÉ SI ES EL N° SECRETO!"));

            if (numero < random) {
                numero = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NÚMERO MAYOR"));
            } else if (numero > random) {
                numero = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NÚMERO MENOR"));

            } else {
                JOptionPane.showMessageDialog(null, "BINGO! ADIVINASTE EL NÚMERO SECRETO!");
            }
            contador++;
        } while (numero != random);
            JOptionPane.showMessageDialog(null, "Adivinaste el número secreto en: "+contador+" intentos");
    } 
}
