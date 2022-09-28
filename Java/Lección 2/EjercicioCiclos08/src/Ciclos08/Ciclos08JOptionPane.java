/*
Ejercicio 8 con JOptionPane: Pedir un número N, y mostrar todos los números del 1 al N
*/
package Ciclos08;

import javax.swing.JOptionPane;

public class Ciclos08JOptionPane {
    public static void main(String[] args) {
        int numero, i = 1;
  
        numero = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NÚMERO: "));

        while ( i <= numero){
            JOptionPane.showMessageDialog(null,i);
            i++;
        }
    }
}
