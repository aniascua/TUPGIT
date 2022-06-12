package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
/*        
        Calcular la estación del año con IF-ELSE
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE UN MES DEL AÑO EN NÚMERO: ");
        var mes = Integer.parseInt(entrada.nextLine());
        var estacion = "Estación desconocida";

        if (mes == 1 || mes == 2 || mes == 3) {
            estacion = "Verano";
        } else if (mes == 4 || mes == 5 || mes == 6) {
            estacion = "Otono";
        } else if (mes == 7 || mes == 8 || mes == 9) {
            estacion = "Invierno";
        } else if (mes == 10 || mes == 11 || mes == 12) {
            estacion = "Primavera";
        }
        System.out.println("estacion = " + estacion);
*/

        
       //  Convertimos números a texto:
       
       // Le pedimos al usuario que ingrese un numero mediante Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE UN NÚMERO: ");
        var numero = Integer.parseInt(entrada.nextLine());
     // var numero = 22;
        var numeroTexto = "Valor desconocido";
        
        switch(numero){
            case 1:
                numeroTexto = "Número uno";
                break;
            case 2:
                numeroTexto = "Número dos";
                break;
            case 3:
                numeroTexto = "Número tres";
                break;
            case 4: 
                numeroTexto = "Número cuatro";
                break;
            default: 
                numeroTexto = "Case no encontrado";
        }
        
        System.out.println("numeroTexto = " + numeroTexto);

        
        
        
        
    }
}
