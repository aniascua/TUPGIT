package ciclowhile;
/**
 *
 * @author ASCUA
 */
public class EjercicioWhile01 {

    public static void main(String[] args) {
      //  WHILE. SE EJECUTA SI SE CUMPLE LA CONDICIÓN:
//        var conteo = 0;  // inferencia de tipos
//        while (conteo < 7) {  // mientras conteo sea menor a 7, imprimir lo del sout
//            System.out.println("conteo =  " + conteo);
//            conteo++;    // vamos aumentando en uno la variable
//        }


        //  DO WHILE. EJECUTA 1 VEZ ANTES DE EVALUAR LA CONDICIÓN:
//        var contador = 0;
//        do{
//            System.out.println("contador =  " + contador);
//            contador++;
//        }while(contador < 7);
        

        // FOR. SE REPITE LAS VECES QUE LE INDIQUEMOS. INICIALIZA Y CREA VARIABLES.
        // adelante declaro la variable y la inicializo,
        // en el medio va la condición,
        // y al final se incrementa o decrementa el ciclo
//        for(var contador = 0; contador < 7; contador++){
//            if(contador % 2 == 0){   // mostrará los números pares del 0 al 7 = 2 4 6
//                 System.out.println("contador = " + contador);
//                 break
//            }
//           
//        }
        
//        for(var contador = 0; contador <= 7; contador++){
//            if(contador % 2 != 0){   // mostrará los números impares del 0 al 7 = 1 3 5 7
//                continue; // esto hace que en vez de guardar los impares, guarde los pares
//                //System.out.println("contador = " + contador);  si quiero mostrar los impares, debo activar este y borrar el de abajo
//             
//            }
//            System.out.println("contador = " + contador);
//        }
        
        
        // LABELS etiquettes   programación de tipo Go To (Ir a) // no es recomendable utilizarlo porque puede romper el programa
        // a través de las etiquetas, nos deja ir hacia un lugar específico de nuestro programa
        for (var contador = 0; contador < 7; contador++){
            if(contador % 2 == 0){
                System.out.println("contador = " + contador);
            }
        }
        
        int var = 50;
        
        while (var > 30)
                var = var - 7;
        System.out.println("resultado:"+var);
        
    }
}
