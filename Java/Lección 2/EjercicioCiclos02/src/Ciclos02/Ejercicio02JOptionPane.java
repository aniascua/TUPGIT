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

import javax.swing.JOptionPane;

public class Ejercicio02JOptionPane {

    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NÚMERO: "));
        while (numero != 0) {
            if (numero > 0) {
                
                JOptionPane.showMessageDialog(null,"EL NÚMERO "+numero+" ES POSITIVO");
                //System.out.println("EL NÚMERO " + numero + " ES POSITIVO");
            } else {
                JOptionPane.showMessageDialog(null,"EL NÚMERO "+numero+" ES POSITIVO");
                //System.out.println("EL NÚMERO " + numero + " ES NEGATIVO");
            }
            //System.out.println("INGRESE OTRO NÚMERO: ");
            numero = Integer.parseInt(JOptionPane.showInputDialog("INGRESE OTRO NÚMERO: "));
            //numero = Integer.parseInt(entrada.nextLine());
        }
        JOptionPane.showMessageDialog(null,"El número 0 finaliza el programa");
    }
}