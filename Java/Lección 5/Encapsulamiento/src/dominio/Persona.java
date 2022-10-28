/*
Ascua Ana
Clase 8 - 21/10/2022
*/

package dominio;

public class Persona {
    // ATRIBUTOS:
    private String nombre;  // este recibe default o package (paquete) 
    private double sueldo;
    private boolean eliminado;
    
    // Constructor:
    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

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

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    
    
    
    // Creamos el método To String: para luego llamarlo y usarlo en PersonaPrueba.java
    // Para poder acceder y ver la info de nuestros atributos, debe ser tipo public
    public String toString(){ // toString convierte en una cadena cada atributo
        return "Persona [ nombre: "+this.nombre+
                ", sueldo: $"+this.sueldo+
                ", eliminado: "+this.eliminado+" ]";
    }
    
    
}
