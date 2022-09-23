
package Ciclos06;

import javax.swing.JOptionPane; // IMPORTAMOS LA CLASE JOPTIONPANE

public class Ejercicio06JOptionPane {
    public static void main(String[] args) {
        
         int numero, suma = 0;
        
        
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NÚMERO: "));
            //numero = Integer.parseInt(entrada.nextLine());
            suma += numero;
        }while(numero != 0);
        
        JOptionPane.showMessageDialog(null,"El resultado de la suma de todos los números ingresados, es: "+ suma);
        //System.out.println("\nLa suma de todos los números ingresados es: "+suma);
        
        
        
        
    }
}
