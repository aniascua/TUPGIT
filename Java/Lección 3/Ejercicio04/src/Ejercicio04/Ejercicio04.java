/**
 * EJERCICO 4: Pedir números hasta que se teclee un número negativo y mostrar cuántos números se han introducido.
 * Primero lo hacemos con la clase Scanner y luego con la clase JOptionPane
 * SI ES MAYOR A 0, POSITIVO. MENOR A 0, NEGATIVO. HACER CONTADOR TOTAL.
 *
 * @author ASCUA
 * Clase 9/09/2022
 */
package Ejercicio04;

import javax.swing.JOptionPane; // IMPORTAMOS LA CLASE JOPTIONPANE

public class Ejercicio04 {

    public static void main(String[] args) {
        //int numero;
        int numero, contador = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NÚMERO"));

        while (numero >= 0) {
            JOptionPane.showMessageDialog(null, "EL NÚMERO " + numero + " ES POSITIVO");
            contador++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("INGRESE OTRO NÚMERO"));
        }
        JOptionPane.showMessageDialog(null, "SE HAN INTRODUCIDO EL NÚMERO " + numero + ", EL PROGRAMA FINALIZA POR N° NEGATIVO.");
        JOptionPane.showMessageDialog(null, "EL TOTAL DE NÚMEROS INGRESADOS ES: " + contador);

    }
}
