
import java.util.Scanner;

/*
Ejercicio 1/4: Leer 10 números enteros, guardarlos en un arreglo.
Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo,
el penúltimo, el tercero, etc.
 */

public class Arreglos_Ejercicio_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+ ". Ingrese un número:");
            numeros[i] = entrada.nextInt();
        }
        System.out.println("El resultado es: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]+" "); // Primero, segundo
            System.out.println(numeros[9-i]+" ");// último, penúltimo
        }
        
        System.out.println(); // Salto de línea
    }
}
