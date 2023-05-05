/*
CLASE 4 - 3/05/2023
 */
package test;

import domain.*;

/**
 *
 * @author ASCUA
 */
public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 10000);
        determinarTipo(empleado1);
        empleado1 = new Gerente("Ana", 5000, "Sistemas");
        //determinarTipo(empleado1);
    }


    public static void determinarTipo(Empleado empleado){
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo Gerente");
            //Gerente gerente = (Gerente)empleado;
            ((Gerente) empleado).getDepartamento(); // La genera el IDE automáticamente
            Gerente gerente = null;
            System.out.println("gerente = " + gerente.getDepartamento());
        }
        if (empleado instanceof Empleado);{
            System.out.println("Es de tipo Empleado");
            //Gerente gerente = (Gerente)empleado;
            //System.out.println("gerente = " + gerente.getDepartamento());
        }
        if (empleado instanceof Object){
            System.out.println("Es de tipo Object");
        }

    }
}
