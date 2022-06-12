package Ejercicio_2;

/*
   Le pedimos al usuario que digite un mes en número y le decimos
   en que estación del año se encuentra
*/

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE UN NÚMERO DE MES: ");
        
        var mes = Integer.parseInt(entrada.nextLine());
        var estacion = "Estación desconocida";
        
        switch(mes){
            case 1: case 2: case 3:
                estacion = "Verano";
                break;
            case 4: case 5: case 6:
                estacion = "Otono";
                break;
            case 7: case 8: case 9:
                estacion = "Invierno";
                break;
            case 10: case 11: case 12:
                estacion = "Primavera";
                break;
        }
        // Mostramos en pantalla el mes ingresado + el nombre de la estación
        System.out.println("estacion = " + estacion);
        
        
    }
}
