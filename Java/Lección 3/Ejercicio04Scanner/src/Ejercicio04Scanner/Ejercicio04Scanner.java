/**
 * EJERCICO 4: Pedir números hasta que se teclee un número negativo y mostrar
 * cuántos números se han introducido.
 * Primero lo hacemos con la clase Scanner y luego con la clase JOptionPane
 * SI ES MAYOR A 0, POSITIVO. MENOR A 0, NEGATIVO. HACER CONTADOR TOTAL.
 *
 * @author ASCUA
 * Clase 9/09/2022
 */
package Ejercicio04Scanner;

//import javax.swing.JOptionPane; // IMPORTAMOS LA CLASE JOPTIONPANE
import java.util.Scanner; // IMPORTAMOS LA CLASE SCANNER

public class Ejercicio04Scanner {

    public static void main(String[] args) {
        //int numero;
        //int contador = 0;
        Scanner entrada = new Scanner(System.in);
        int numero, contador = 0;
        System.out.println("INGRESE UN NÚMERO: ");
        numero = Integer.parseInt(entrada.nextLine());
        //numero = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NÚMERO"));

        while (numero >= 0) {
            //JOptionPane.showMessageDialog(null, "EL NÚMERO " + numero + " ES POSITIVO");
            System.out.println("EL NÚMERO" + numero + " ES POSITIVO");
            contador++;
            //numero = Integer.parseInt(JOptionPane.showInputDialog("INGRESE OTRO NÚMERO"));
            System.out.println("INGRESE OTRO NÚMERO: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("SE HAN INTRODUCIDO EL NÚMERO " + numero + ", EL PROGRAMA FINALIZA POR N° NEGATIVO.");
        System.out.println("EL TOTAL DE NÚMEROS INGRESADOS ES: " + contador);
        //JOptionPane.showMessageDialog(null, "SE HAN INTRODUCIDO EL NÚMERO " + numero + ", EL PROGRAMA FINALIZA POR N° NEGATIVO.");
        //JOptionPane.showMessageDialog(null, "EL TOTAL DE NÚMEROS INGRESADOS ES: " + contador);

    }
}
