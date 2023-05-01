// Clase 3 JAVA - 25/04/2023
package paquete2;

/**
 *
 * @author ASCUA
 */
public class Clase4 {
    private String atributoPrivate = "atributo Privado";

// Constructor
    private Clase4() {
        System.out.println("Constructor privado");
    }

// Creamos un constructor public para poder crear objetos
    public Clase4(String argumento) { // Acá se puede llamar al constructor vacío
        this();
        System.out.println("Constructor público");
    }

// Método private
    private void metodoPrivado(){
        System.out.println("Método privado");
    }
    
// Getters & Setters

    public String getAtributoPrivate() {
        return atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }
    
    
}
