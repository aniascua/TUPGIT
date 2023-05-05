/*
CLASE 4 - 3/05/2023
 */
package domain;
/**
 *
 * @author ASCUA
 */
public class Gerente extends Empleado {
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    // Sobreescribimos el método de la clase padre Empleado.java
    @Override
    public String obtenerDetalles() {
        // va a retornar
        return super.obtenerDetalles()+", Departamento: "+this.departamento;
    }
}
