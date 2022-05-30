package ejercicio_2;

import java.util.Scanner;

/* EJERCICIO 2: hacer un programa que calcule e imprima el salario de
un empleado, a partir de sus horas semanales trabajadas, 
y de su salario por hora

IMPRIMIR EL SALARIO DEL EMPLEADO A PARTIR DE SUS HORAS SEMANALES. QUE INGRESARÁ EL USER.
EL USER DEBE INGRESAR HORAS SEMANALES Y SALARIO POR HORA.
LUEGO CALCULAMOS EL SALARIO. Y LO IMPRIMIMOS. 
*/
public class Ejercicio_2 {

    public static void main(String[] args) {
    
        // PEDIR UN VALOR
        Scanner entrada = new Scanner(System.in);
        int horasSemanales;
        float salarioHora, salarioTotal;
        
        System.out.println("Este programa calcula su SALARIO...");
        System.out.println("INGRESE SUS HORAS SEMANALES TRABAJADAS: ");
        horasSemanales = Integer.parseInt(entrada.nextLine());
        System.out.println("INGRESE SU SALARIO POR HORA: ");
        salarioHora = Float.parseFloat(entrada.nextLine());
        
        salarioTotal = horasSemanales * salarioHora;
        System.out.println("\nEl salario semanal es de: $"+salarioTotal);
        
    }
    
}
