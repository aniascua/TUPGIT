/*
Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar. 
Primero hacerlo con la clase Scanner
luego con JOptionPane
 *
 * @author ASCUA
    Clase 9/09/2022
 */
package Ejercicio03JOptionPane;

import javax.swing.JOptionPane; // IMPORTAMOS LA CLASE JOPTIONPANE

public class Ejercicio03JOptionPane {

    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NÚMERO: "));
        while (numero != 0) {
            if (numero > 0) {

                //System.out.println(numero);
                if (numero % 2 == 0) {
                    JOptionPane.showMessageDialog(null, "EL NÚMERO " + numero + " ES PAR");
                    //System.out.println("EL NÚMERO " + numero + " ES PAR");
                    //break;
                } else {
                    JOptionPane.showMessageDialog(null, "EL NÚMERO " + numero + " ES IMPAR");
                    //System.out.println("EL NÚMERO " + numero + " ES IMPAR");

                }

                //System.out.println("INGRESE OTRO NÚMERO: ");
                numero = Integer.parseInt(JOptionPane.showInputDialog("INGRESE OTRO NÚMERO: "));
                //numero = Integer.parseInt(entrada.nextLine());
            }

        }
        JOptionPane.showMessageDialog(null, "El número 0 finaliza el programa");

    }
}
