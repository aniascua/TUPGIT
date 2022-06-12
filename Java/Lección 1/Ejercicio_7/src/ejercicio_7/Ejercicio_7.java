package ejercicio_7;

import java.util.Scanner;

// Una compañia de venta de autos usados, paga a su personal de ventas,
// un salario de $1000 mensuales + una comisión de $150 por cada auto vendido,
// + el 5% del valor de la venta por auto.
// Cada mes, el capturista de la empresa ingresa en la PC los datos pertinentes.

// HACER UN PROGRAMA QUE CALCULE E IMPRIMA EL SALARIO MENSUAL DE UN VENDEDOR DADO.

// El salario de $1000 lo vamos a manejar como un dato constante, para asignarlo debemos usar la palabra reservada "final"

public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
     
        // declaramos las variables
        final int salario = 1000;
        int comision = 150, venta;
        float salarioMensual, autoVendido, porcentajeVenta, precioTotal;
        
        System.out.println("INGRESE LA CANTIDAD DE AUTOS VENDIDOS: ");
        venta = Integer.parseInt(entrada.nextLine());
        System.out.println("INGRESE EL PRECIO DE UN AUTO: ");
        autoVendido = Float.parseFloat(entrada.nextLine());
        
        comision *= venta;
        precioTotal = autoVendido * venta;
        porcentajeVenta = precioTotal * 0.05f;
        salarioMensual = salario + comision + porcentajeVenta;
        
        System.out.println("\nEL SALARIO MENSUAL ES DE: $" +salarioMensual);
     
   }
}
