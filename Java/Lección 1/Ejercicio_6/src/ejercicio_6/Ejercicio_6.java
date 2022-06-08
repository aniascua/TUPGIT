package ejercicio_6;

import java.util.Scanner;

// Guillermo tiene N dólares. 
// Luis tiene la mitad de lo que tiene Guillermo.
// Juan tiene la mitad de lo que tiene Luis y Guillermo juntos.
// Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los 3

// Crear un nuevo proyecto llamado Ejercicio_6;


/*
public class Ejercicio_6 {

    public static void main(String[] args) {
        
    // Declaramos las variables que vamos a usar
    float dolares = 0;
    float guillermo = 200;
    float luis = 100;
    float juan = 150;

        System.out.println("Guillermo tiene U$D: "+ guillermo);
        System.out.println("Luis tiene U$D: "+ luis);
        System.out.println("Juan tiene U$D: "+ juan);
        
        dolares = guillermo + luis + juan;
        
        System.out.println("Entre los 3, tienen esta cantidad de dinero: "+dolares);
    
*/        
    // OTRA FORMA DE HACER ESTE EJERCICIO CON DATOS INGRESADOS POR TECLADO:
    
    public class Ejercicio_6 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            
            float guillermo,luis,juan,suma;
            
            System.out.println("INGRESE LA CANTIDAD DE DINERO DE GUILLERMO: ");
            guillermo = Float.parseFloat(entrada.nextLine());
            
            luis = guillermo / 2;
            juan = (luis + guillermo) / 2;
            suma = luis + guillermo + juan;
            
            System.out.println("\nGUILLERMO TIENE: U$D "+ guillermo);
            System.out.println("\nLUIS TIENE: U$D "+ luis);
            System.out.println("\nJUAN TIENE: U$D "+ juan);
            System.out.println("\nEL TOTAL DE LOS 3 ES U$D: "+ suma);
   
        }
    }

    }  
}
