package ejercicio_5;

import java.util.Scanner;

// HACER UN PROGRAMA QUE CALCULE E IMPRIMA LA SUMA DE 3 CALIFICACIONES
// PEDIR LAS CALIFICACIONES AL USUARIO, CREAR UN PROYECTO NUEVO LLAMADO EJERCICIO 5

public class Ejercicio_5 {

    public static void main(String[] args) {
        
        // Declaramos las variables para las calificaciones:
        int calificacion1 = 0;
        int calificacion2 = 0;
        int calificacion3 = 0;
        int suma = 0;
        
        var entrada = new Scanner(System.in);
        System.out.println("INGRESE LA CALIFICACIÓN N°1: ");
        calificacion1 = Integer.parseInt(entrada.nextLine());
        
        var entrada2 = new Scanner(System.in);
        System.out.println("INGRESE LA CALIFICACIÓN N°2: ");
        calificacion2 = Integer.parseInt(entrada.nextLine());
        
        var entrada3 = new Scanner(System.in);
        System.out.println("INGRESE LA CALIFICACIÓN N°3: ");
        calificacion3 = Integer.parseInt(entrada.nextLine());
        
        suma = calificacion1 + calificacion2 + calificacion3;
        
        System.out.println("LA SUMA DE LAS CALIFICACIONES DA COMO RESULTADO: " + suma);
        
        
        
        // FORMA N°2 PARA HACER ESTE MISMO EJERCICIO:
        /*
        public class Ejercicio_5 {
            public static void main(String[] args) {
                Scanner entrada = new Scanner(System.in);
                float nota1,nota2,nota3,suma;
                
                // Le pedimos al usuario que ingrese las 3 notas:
                System.out.println("INGRESE LAS 3 CALIFICACIONES: ");
                nota1 = Float.parseFloat(entrada.nextLine());
                nota2 = Float.parseFloat(entrada.nextLine());
                nota3 = Float.parseFloat(entrada.nextLine());
                
                suma = nota1 + nota2 + nota3;
                
                System.out.println("\nLA SUMA DE LAS 3 CALIFICACIONES DA: " + suma);
            }
        }
        
        */

    }
}
