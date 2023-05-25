
package domain;

/**
 *
 * @author ASCUA
 */
public enum TipoEscritura {
    CLASICO ("Escritura a mano"),
    MODERNO ("Escritura digital");
    
    private final String descripcion;
    
    private TipoEscritura(String descripcion){ // Constructor
        this.descripcion = descripcion;
    }
    
    // Método Get
    public String getDescripcion(){
        return this.descripcion;
    }
}
