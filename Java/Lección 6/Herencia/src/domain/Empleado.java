
package domain;

public class Empleado extends Persona { // extends: empleado es clase hija de la clase Persona
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados; // es para incrementar
    
    // Constructores
    public Empleado(){  // Constructor 1
        this.idEmpleado = ++Empleado.contadorEmpleados;
    }
    
    public Empleado(String nombre, double sueldo) {  // Constructor 2
        //super(nombre);
        this(); // Estamos llamando desde aquí al constructor vacío (llamar a un constructor interno)
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override // con StringBuilder se puede modificar y compila más rapido/eficaz. sin esto, sucede todo lo contrario
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
