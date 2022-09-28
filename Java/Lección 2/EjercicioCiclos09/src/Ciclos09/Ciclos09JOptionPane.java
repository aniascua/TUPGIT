/*
Ejercicio 9: Pedir el día, mes y año de una fecha e indicar si la fecha
es correcta.
Suponiendo que todos los meses son de 30 días,
y que si ingresa el día -1 o 31, es incorrecto, y que no puede ingresar
un año que no sea el actual (2022)
 */
package Ciclos09;

import javax.swing.JOptionPane;

public class Ciclos09JOptionPane {
    public static void main(String[] args) {
     // Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el día (número): ");
        //int dia = Integer.parseInt(entrada.nextLine());
        int dia = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN DÍA"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL MES"));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL AÑO"));

        if ((dia != 0) && (dia <= 30)) {
            if ((mes != 0) && (mes <= 12)) {
                if ((anio != 0) && (anio <= 2022)) {
                    JOptionPane.showMessageDialog(null,"La fecha ingresada es: "+dia+"/"+mes+"/"+anio);
                }
                else {
                    JOptionPane.showMessageDialog(null,"Fecha incorrecta, año incorrecto");
                }
            } else {
                    JOptionPane.showMessageDialog(null,"Fecha incorrecta, año incorrecto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, año incorrecto");
        }
        
        
        
        
    }
}
