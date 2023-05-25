/* JAVA Clase 7 - 24/05/2023 */
package accesodatos;
/**
 *
 * @author ASCUA
 */
public class ImplementacionMySQL implements I_AccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertar desde MySQL");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde MySQL");
        
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde MySQL");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde MySQL");
        
    }
    
}
