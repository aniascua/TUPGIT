/* JAVA Clase 7 - 24/05/2023 */
package test;

import accesodatos.*;
/**
 *
 * @author ASCUA
 */
public class TestInterfaces {
    public static void main(String[] args) {
        I_AccesoDatos datos = new ImplementacionMySQL();
        //datos.listar();
        //imprimir(datos);
        datos = new ImplementacionOracle();
        //datos.listar();
        imprimir(datos);
    }
    
    // Método genérico que recibe interface y apunta a referencias de MySQL y Oracle
    // esto depende del dato que esté recibiendo
    public static void imprimir(I_AccesoDatos datos){
        datos.listar();
    }
}
