// Clase 3 JAVA - 25/04/2023
package paquete1;
/**
 *
 * @author ASCUA
 */
public class ClaseHija2 extends Clase2 {
    public ClaseHija2() {
        super();
        this.atributoDefault = "Modificación del atributo DEFAULT";
        System.out.println("atributoDefault = " + this.atributoDefault);
        this.metodoDefault();
    }
}
