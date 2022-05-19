/* TIENDA DE LIBROS */ 

package ejercicio_1;

import java.util.Scanner;
/**
 *
 * @author ASCUA
 */
public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE EL NOMBRE DEL LIBRO: ");
        String nombreLibro = entrada.nextLine();
        System.out.println("INGRESE EL ID DEL LIBRO: ");
        int idLibro = Integer.parseInt(entrada.nextLine());
        System.out.println("INGRESE EL PRECIO DEL LIBRO: ");
        double precioLibro = Double.parseDouble(entrada.nextLine());
        System.out.println("CONFIRME SI EL ENVÍO ES GRATUITO: ");
        boolean envioGratuito = Boolean.parseBoolean(entrada.nextLine());
        
        System.out.println(nombreLibro+" #"+idLibro);
        System.out.println("Precio del libro: $"+ precioLibro);
        System.out.println("El envío del libro gratuito es: "+envioGratuito);
        
    }
    
}
