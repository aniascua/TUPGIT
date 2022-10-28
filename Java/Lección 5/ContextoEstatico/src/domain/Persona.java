/*
ASCUA Ana
Clase 8 Java - 21/10/2022
Contexto estático parte 2 (lo ponemos en práctica)
 */
package domain;

public class Persona {

    // ponemos los atributos:
    private int idPersona;
    private static int contadorPersona;
    private String nombre;

    // Constructor:
    public Persona(String nombre) {      // creamos el método constructor:
        this.nombre = nombre;
        // incrementar el contador por cada objeto nuevo:
        Persona.contadorPersona++; // No utilizar el operador this para esto. la referencia debe ser a través de la clase

        // Ahora asignamos un nuevo valor a la variable idPersona:
        this.idPersona = Persona.contadorPersona; // lo que suceda allí dentro, es lo que se le va a asignar a a idPersona
    }

    // click derecho, insert code > getters and setters > select all > generate:
    // y esto nos crea todos los gets y sets de los atributos que creamos anteriormente en la clase Persona
    
    public static int getContadorPersona() {
        return contadorPersona;
    }

    public static void setContadorPersona(int contadorPersona) {
        Persona.contadorPersona = contadorPersona;
    }
    
    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }

}
