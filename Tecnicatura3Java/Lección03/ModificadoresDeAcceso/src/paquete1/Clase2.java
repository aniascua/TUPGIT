// Clase 3 JAVA - 25/04/2023
package paquete1;
/**
 *
 * @author ASCUA
 */
class Clase2 {
    String atributoDefault = "Valor del atributo Default";
    
    // Constructor
    //Clase2(){ // vacío
      //  System.out.println("Constructor Default");
    //}
    
    // Creamos otro constructor
    public Clase2(){
        super();
        this.atributoDefault = "Modificación del atributo Default";
        System.out.println("atributoDefault = " + this.atributoDefault);
        this.metodoDefault();
    }
    
    // Método void
    void metodoDefault(){
        System.out.println("Método Default");
    }
    
    
    
}
