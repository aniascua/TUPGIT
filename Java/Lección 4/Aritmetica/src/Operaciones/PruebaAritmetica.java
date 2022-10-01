package Operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {
        var a = 10;  // variables locales
        int b = 7;  // Memoria stack
        miMetodo(); // Llamamos el método nuevo
        
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 11;
        aritmetica1.b = 11;
        
        aritmetica1.sumarNumeros();
        // Para almacenar un objeto o los atributosse utiliza la memoria heap
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando arguementos = "+resultado);
   
        
        System.out.println("aritmetica1 a: "+aritmetica1.a);
        System.out.println("aritmetica1 b: "+aritmetica1.b);
    
    
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 = " + aritmetica2.a);
        System.out.println("aritmetica2 = " + aritmetica2.b);
        // aritmetica1 = null; no utilizar esto, no se debe hacer
        // System.gc(); método para limpiar residuos, es pesado, no utilizar
        
        
    }
    
    // otro método
    public static void miMetodo(){
     // a = 10;  la variable está limitada porque no está con el int delante
        int a = 10;
        System.out.println("Aquí hay otro método");
    }
    
    
    
}
