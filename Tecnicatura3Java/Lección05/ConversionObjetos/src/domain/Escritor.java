// Clase 5 - JAVA - 10/05/2023
package domain;
/**
 *
 * @author ASCUA
 */
public class Escritor extends Empleado{
    final TipoEscritura tipoEscritura;
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre,sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    
    //Metodo para sobreescribir
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles()+", Tipo Escritura: "+tipoEscritura.getDescripcion();
    }

    @Override
    public String toString() {
        return "Escritor{" + "tipoEscritura=" + tipoEscritura + '}'+" "+super.toString();
    }

    public TipoEscritura getTipoEscritura() {
        return this.tipoEscritura;
    }
    
    
}