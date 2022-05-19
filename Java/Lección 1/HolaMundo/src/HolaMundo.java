
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
/*        System.out.println("Hola Mundo desde Java!");

        // int miVariable;
        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);

        
        // TIPO STRING
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en programación";
        System.out.println(miVariableCadena);

        
        // Var - inferencia de tipos en Java
        var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);

        
        // soutv + tab
        // Para ejecutar shift + F6 es la tecla para mayúscula
        // Reglas para definir una variable en Java
        var usuario = "Osvaldo";
        var titulo = "ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b));

        
        // Ejercicio: Caracteres Especiales con Java 
        var nombre = "Natalia";
        System.out.println("\nNueva linea: \n" + nombre); // Diagonal inversa y letra n
        System.out.println("Tabulador: \t" + nombre); // Tabulador un espacio para centrar
        System.out.println("\t\t.:MENÚ:.");
        System.out.println("Retroceso: \b\b" + nombre); // Caracter de Retroceso
        System.out.println("Comillas simples: \'" + nombre + "\'");
        System.out.println("Comillas dobles: \"" + nombre + "\"");

        
        // Clase SCANNER     
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE SU NOMBRE: ");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el título: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: " + titulo2 + " " + usuario2);

       
        
        // TIPOS DE BYTES       
        byte numEnteroByte = 127;
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor minimo del Byte:" + Byte.MIN_VALUE); // -128 
        System.out.println("Valor maximo del Byte:" + Byte.MAX_VALUE); // 127

        
        short numEnteroShort = 32767;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor minimo del Short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo del Short: " + Short.MAX_VALUE);

        
        int numEnteroInt = (int) 2147483648L; // L mayúscula de Long y el INT delante
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor minimo del Int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo del Int: " + Integer.MAX_VALUE);

        
        long numEnteroLong = 9223372036854775807L;
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor minimo del long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo del long: " + Long.MAX_VALUE);
      
        
        // TIPOS PRIMITIVOS Y TIPOS FLOTANTES
        float numFloat = 3.4028235E38F;     // float numFloat = 10.0F;
        //float numFloat = (float) 10.0;  Otra forma de hacer lo mismo
        System.out.println("numFloat = " + numFloat);
        System.out.println("El valor minimo de float: " + Float.MIN_VALUE);
        System.out.println("El valor maximo de float: " + Float.MAX_VALUE);

        double numDouble = 10;
        System.out.println("numDouble = " + numDouble);
        System.out.println("El valor minimo de double: " + Double.MIN_VALUE);
        System.out.println("El valor maximo de double: " + Double.MAX_VALUE);

        
        
        // INFERENCIA DE TIPOS VAR Y TIPOS PRIMITIVOS   
        var numEntero = 20; // las literalessin punto automaticamente son int
        System.out.println("numEntero = " + numEntero);
        var numFloat = 10.0; // automáticamente con el punto se transforma
        System.out.println("numFloat = " + numFloat);
        var numDouble = 10.0; //
        System.out.println("numDouble = " + numDouble);
        
        // Tipos primitivos Char
        char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);
        
        char varCaracter = '\u0024'; // Indicamos a Java la asignación Unicode
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterDecimal = 36; // Valor decimal del juego de caracteres Unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbolo = '$'; // UN caracter especial, podemos copiar y pegar desde Unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo); 
 
        var varCaracter1 = '\u0024'; // Indicamos a Java la asignación Unicode
        System.out.println("varCaracter1 = " + varCaracter1);
        var varCaracterDecimal1 = 36; // Lo toma como valor entero y le asigna tipo INT
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        var varCaracterSimbolo1 = '$'; // UN caracter especial, podemos copiar y pegar desde Unicode
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1); 

        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);
        
       
        // TIPOS PRIMITIVOS, TIPOS BOOLEANOS       
        boolean varBool = true;   // funciona si declaro var en vez de boolean delante 
        System.out.println("varBool = " + varBool);
        
        if (varBool) {
             System.out.println("La bandera es verde");
        }
        else{
            System.out.println("La bandera es roja");
        }

        
        
        // Algoritmo: Es mayor de edad? JAVA
        var edad = 22; // Literal tener presente la inferencia de tipos
        //var adulto = edad >= 18; // Esta es una expresión booleana
        if(edad >= 18){
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("Es menor de edad");
        }
       



        // Conversión de tipos Parte 1
        // var edad = "20"; // esto es inferencia de tipos, una cadena string
        // para convertirla a tipo entero vamos a hacer esto:
        var edad = Integer.parseInt("20"); // parseInt convierte un dato string a un dato entero (int)
        System.out.println("edad = " + (edad + 2));
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        // PEDIR UN VALOR
        var entrada = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(entrada.nextLine());
        System.out.println("edad = " + edad );
    


       // Conversión de tipos primitivos en Java Parte 2 
       var edadTexto = String.valueOf(10); // inferencia de tipo (asigna valor de derecha a izquierda)
       System.out.println("edadTexto = " + edadTexto);
       
       var fraseChar = "programadores".charAt(4);
       System.out.println("fraseChar = " + fraseChar);
        
        System.out.println("Ingrese un caracter: ");
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);
        
 */    
        



    }
}
