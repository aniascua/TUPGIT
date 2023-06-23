import java.util.Scanner;
public class CalculadoraUTN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (true){ // Ciclo infinito
            System.out.println("******* Aplicación Calculadora *******");
            mostrarMenu(); // Llamamos a la función que creamos para mostrar el menú

            try {
                var opcion = Integer.parseInt(entrada.nextLine());
                if (opcion >= 1 && opcion <= 4) {
                    ejecutarOperacion(opcion, entrada);

                } // Fin del if
                else if (opcion == 5) {
                    System.out.println("Gracias por usar la aplicación");
                    break; // Salimos del ciclo infinito al presionar 5
                } else {
                    System.out.println("Opción no válida: " + opcion);
                }
                // Imprimimos un salto de linea  antes de repetir el menú
                System.out.println();
            }
            catch (Exception e){ // Fin del try, comienzo del catch
                System.out.println("Ocurrió un error: " + e.getMessage());
                System.out.println();
            } // Fin try catch
        }// Fin While
    } // Fin main

    // Creamos un método privado para mostrar el menú y así optimizar el código
    private static void mostrarMenu(){
        // Mostramos el menú
        System.out.println("1. Suma\n" +
                "2. Resta\n" +
                "3. Multiplicación\n" +
                "4. División\n" +
                "5. Salir");
        System.out.print("\nIngrese la opción deseada: ");
    } // Fin del método mostrarMenu

    private static void ejecutarOperacion(int opcion, Scanner entrada){
        System.out.print("Ingrese el primer valor: ");
        var operando1 = Double.parseDouble(entrada.nextLine());
        System.out.print("Ingrese el segundo valor: ");
        var operando2 = Double.parseDouble(entrada.nextLine());
        double resultado;
        switch (opcion) {
            case 1 -> { // Suma
                resultado = operando1 + operando2;
                System.out.println("El resultado de la suma es: " + resultado);
            }
            case 2 -> { // Resta
                resultado = operando1 - operando2;
                System.out.println("El resultado de la resta es: " + resultado);
            }
            case 3 -> { // Multiplicación
                resultado = operando1 * operando2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
            }
            case 4 -> { // División
                resultado = operando1 / operando2;
                System.out.println("El resultado de la división es: " + resultado);
            }
            default -> System.out.println("Opción no válida: " + opcion);
        } // Fin del switch
    } // Fin del método ejecutarOperacion

} // Fin de la clase


