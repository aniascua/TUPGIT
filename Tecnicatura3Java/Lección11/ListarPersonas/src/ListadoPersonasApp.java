import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Definimos la lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>(); // array vacío
        // Empezamos con el menú
        var salir = false;
        while(!salir){
            mostrarMenu();
            try{
                salir = ejecutarOperacion(entrada, personas);
            } catch (Exception e){
                System.out.println("Ocurrió un Error: " + e.getMessage());
            }
            System.out.println(); // salto de línea
        } // Fin del while
    }// Fin método Main

    // Creamos el método menú
    private static void mostrarMenu() {
        // Mostramos las opciones
        System.out.print("""
                ****** Listado de Personas ******
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Digite una de las opciones: ");
    } // Fin método mostrarMenu

    // Función ejecutarOperacion
    private static boolean ejecutarOperacion(Scanner entrada, List<Persona> personas){
        var opcion = Integer.parseInt(entrada.nextLine());
        var salir = false;
        // Revisamos la opción digitada a través de un switch
        switch (opcion) {
            case 1 -> {// Agregar una persona a la lista
                System.out.print("Digite el nombre de la persona: ");
                var nombre = entrada.nextLine();
                System.out.print("Digite el teléfono de la persona: ");
                var tel = entrada.nextLine();
                System.out.print("Digite el email de la persona: ");
                var email = entrada.nextLine();

                // Creamos el objeto persona
                var persona = new Persona(nombre, tel, email);

                // Agregamos la persona a la lista
                personas.add(persona);
                // Mostramos que la persona fue agregada correctamente
                System.out.print("Persona agregada correctamente");
                // Mostramos la cantidad de personas en la lista
                System.out.println("La lista tiene: " + personas.size() + " personas");
                // Mostramos el ID de la persona
                System.out.println("ID de la persona: " + persona.getId());
            } // Fin case 1
            case 2 -> {// Listar a las personas
                System.out.println("Listado de personas");
                // Mejoras con lambda  el método de referencia
                //personas.forEach((persona)) ->System.out.println(persona);
                personas.forEach(System.out::println);
            } // Fin case 2
            case 3 -> {// Salir
                System.out.println("Saliendo del sistema...");
                System.out.println("****** Gracias por usar el sistema ******");
                salir = true;
            } // Fin case 3
            default -> System.out.println("Opción incorrecta: " + opcion);
        }// Fin default y Switch
            return salir;

    } // Fin método ejecutarOperacion

} // Fin clase ListadoPersonasApp


