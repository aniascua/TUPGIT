
package test;
import domain.Persona;
/**
 *
 * @author ASCUA
 */
public class TestJavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Ana");
        persona.setApellido("Ascua");
        System.out.println("persona = " + persona);
        
        System.out.println("Persona nombre: "+persona.getNombre());
        System.out.println("Persona apellido: "+persona.getApellido());
        
        
    }
}
