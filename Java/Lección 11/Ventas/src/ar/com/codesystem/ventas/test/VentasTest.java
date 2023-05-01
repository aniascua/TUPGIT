
package ar.com.codesystem.ventas.test;

import ar.com.codesystem.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Pantalon", 20000.00);
        Producto producto2 = new Producto("Campera", 30000.00);
        Producto producto3 = new Producto("Zapatillas Nike", 50000.00);
        Producto producto4 = new Producto("Zapatillas NB", 30000.00);
        Producto producto5 = new Producto("Zapatillas Lacoste", 60000.00);
        Producto producto6 = new Producto("Remera H&M", 2000.00);
        Producto producto7 = new Producto("Musculosa", 2000.00);
        Producto producto8 = new Producto("Medias", 600.00);
        Producto producto9 = new Producto("Anteojos", 900.00);
        Producto producto10 = new Producto("Buzo azul", 9000.00);
        Producto producto11 = new Producto("Buzo naranja", 9000.00);
        Producto producto12 = new Producto("Buzo rojo", 9000.00);
        Producto producto13 = new Producto("Zapatillas rojas", 56000.00);
        Producto producto14 = new Producto("Campera rompeviento", 19000.00);
        Producto producto15 = new Producto("Remera manga larga", 8000.00);
        Producto producto16 = new Producto("Havaianas", 6000.00);
        Producto producto17 = new Producto("Camisa", 5000.00);
        Producto producto18 = new Producto("Musculosa negra", 2000.00);
        Producto producto19 = new Producto("Zapatos", 30000.00);
        Producto producto20 = new Producto("Camperon", 100000.00);
        Producto producto21 = new Producto("3 pares de medias largas", 5000.00);
        Producto producto22 = new Producto("Camisa hawaiana", 7000.00);

        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.agregarProducto(producto5);
        orden1.mostrarOrden();
        
        System.out.println("");
        orden1.agregarProducto(producto6);
        orden1.agregarProducto(producto7);
        orden1.agregarProducto(producto8);
        orden1.agregarProducto(producto9);
        orden1.agregarProducto(producto10);
        orden1.agregarProducto(producto11);
        orden1.mostrarOrden();
        
        System.out.println("");
        orden1.agregarProducto(producto12);
        orden1.agregarProducto(producto13);
        orden1.agregarProducto(producto14);
        orden1.agregarProducto(producto15);
        orden1.agregarProducto(producto16);
        orden1.agregarProducto(producto17);
        orden1.agregarProducto(producto18);
        orden1.agregarProducto(producto19);
        orden1.agregarProducto(producto20);
        orden1.agregarProducto(producto21);
        orden1.agregarProducto(producto22);
        orden1.mostrarOrden();
        
        // TAREA:
        // Crear más objetos de tipo Producto = 10 (cantidad)
        // Crear más objetos de tipo Orden = 2 (2 mas)
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.agregarProducto(producto5);
        orden1.mostrarOrden();
    }
}
