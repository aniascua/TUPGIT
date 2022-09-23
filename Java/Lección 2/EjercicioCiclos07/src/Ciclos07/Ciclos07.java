/*
Ejercicio 7: Pedir números hasta que se introduzca uno negativo
y calcular la media (promedio)
*/

package Ciclos07;

import java.util.Scanner; // IMPORTAMOS LA CLASE SCANNER

public class Ciclos07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero, contador = 0, suma = 0;
        float promedio = 0;
        
        System.out.println("INGRESE UN NÚMERO: ");
        numero = Integer.parseInt(entrada.nextLine());
        
        while(numero >= 0){   // Mientras el Num sea POSITIVO..
            suma += numero;
            contador ++;
            System.out.println("INGRESE OTRO NÚMERO: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        if (contador == 0){
            System.out.println("ERROR, LA DIVISIÓN ENTRE 0 NO EXISTE");         
        }else{
            promedio = (float)suma/contador; // convertimos suma y contador a float
            System.out.println("\nEl promedio es: "+promedio);
        }
    }
}
