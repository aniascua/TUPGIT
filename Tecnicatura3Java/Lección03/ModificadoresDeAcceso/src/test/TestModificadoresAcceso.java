// Clase 3 JAVA - 25/04/2023
package test;
/**
 *
 * @author ASCUA
 */
import paquete1.Clase1;
import paquete2.Clase3;

/**
 *
 * @author ASCUA
 */
public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();
        System.out.println("clase1 = " + clase1.atributoPublic);
        clase1.metodoPublico();
        
        // Creamos objeto de clase hija 3
        Clase3 claseHija = new Clase3();
        System.out.println("claseHija = " + claseHija);
        
        
        
    }
    
}
