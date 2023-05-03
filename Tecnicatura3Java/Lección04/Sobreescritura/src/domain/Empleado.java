/*
CLASE 4 - 3/05/2023
 */
package domain;
/**
 *
 * @author ASCUA
 */
// Creamos atributos para la clase padre empleado
public class Empleado {
    protected String nombre;
    protected double sueldo;
    
    // El constructor para esta clase padre
    public Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    // Creamos el método para la sobreescritura 
    public String obtenerDetalles(){
        // va a retornar
        return "Nombre: "+this.nombre+", Sueldo: "+this.sueldo;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}
