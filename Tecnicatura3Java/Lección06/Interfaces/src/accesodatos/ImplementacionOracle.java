/* JAVA Clase 7 - 24/05/2023 */
package accesodatos;
/**
 *
 * @author ASCUA
 */
public class ImplementacionOracle implements I_AccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertar desde Oracle");
    
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Oracle");
    
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde Oracle");
    
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde Oracle");

    }
    
    
}
