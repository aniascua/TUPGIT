package excepciones;
/**
 *
 * @author ASCUA
 */
public class OperacionesExcepcion extends RuntimeException {
    // Constructor
    public OperacionesExcepcion(String mensaje){
        super(mensaje);
    }
}
