// Clase 3 JAVA - 25/04/2023
package paquete2;

import paquete1.Clase1;
/**
 *
 * @author ASCUA
 */
public class Clase3 extends Clase1 {
    public Clase3(){
        super("protected");
        this.atributoProtected = "Accedemos desde la clase hija";
        System.out.println("AtributoProtected = " + this.atributoProtected);
        this.atributoPublic = "Es totalmente público";
    }
    
}
