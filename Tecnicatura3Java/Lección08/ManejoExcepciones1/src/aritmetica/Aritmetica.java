package aritmetica;

import excepciones.OperacionesExcepcion;

/**
 *
 * @author ASCUA
 */
public class Aritmetica {
    public static int division(int numerador, int denominador)
    {
        if(denominador == 0){
            throw new OperacionesExcepcion("División entre cero");
        }
        return numerador / denominador;
    }
}
