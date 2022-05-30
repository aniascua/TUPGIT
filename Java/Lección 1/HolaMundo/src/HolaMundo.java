
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
         


        int num1 = 4, num2 = 4;
        var solucion = num1 + num2;
        System.out.println("solución suma = " + solucion);

        solucion = num1 - num2;
        System.out.println("solucion de la resta = " + solucion);

        solucion = num1 * num2;
        System.out.println("solucion de la multiplicación = " + solucion);

        solucion = num1 / num2;
        System.out.println("solucion de la división = " + solucion);

        var solucion2 = 3.4 / num2;
        System.out.println("solucion2 = " + solucion2);

        solucion = num1 % num2; // Guarda el residuo entero de la división
        System.out.println("solucion = " + solucion);

        if (num1 % 2 == 0) {
            System.out.println("ES PAR!!!");
        } else {
            System.out.println("ES IMPAR!!!");
        }


        

        int varNum1 = 1, varNum2 = 4;
        var varNum3 = varNum1 + 6 - varNum2; // Una operación 
        System.out.println("varNum = " +varNum3);
        
        varNum1 += 1; // varNum1 + varNum1 + 1;
        System.out.println("varNum1 = " +varNum1);
        
        varNum2 -= 2;
        System.out.println("varNum2 = " + varNum2);
        
        varNum1 *= 5;
        System.out.println("varNum1 = " + varNum1);
        
        varNum3 /= 4;
        System.out.println("varNum3 = " + varNum3);
        
        varNum1 %= 6;
        System.out.println("varNum1 = " + varNum1);
        
        

        
        
        // CLASE 8
        
        // OPERADORES UNARIOS: CAMBIO DE SIGNO (POSITIVO O NEGATIVO)
        var varA = 7;
        var varB = -varA; // le asignamos la variable A pero con el signo de Menos antes de la Variable
        System.out.println("varA = " + varA); // va a mostrar 7
        System.out.println("varB = " + varB); // va a mostrar -7
        
        // OPERADOR DE NEGACIÓN: INVIERTE EL RESULTADO DE UN BOOLEAN TRUE OR FALSE
        var varC = true; // Esta literal por default en Java es de tipo Boolean
        var varD = !varC; // Acá invierte el valor, si es true, será false, y viceversa
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);
        
        
        // OPERADORES UNARIOS DE INCREMENTO: PREINCREMENTO
        var varE = 9; // Se va a modificar su valor
        var varF = ++varE; // Simbolo de + antes de la variable
        // Primero se incrementa la variable y despues se usa su valor
        System.out.println("varE = " + varE);
        System.out.println("varF = " + varF); // Se muestra el incremento realizado, se suma 1
        // ambos resultados muestran un 10 en pantalla
        
        
        // POSTINCREMENTO (el simbolo va despues de la variable)
        var varG = 3;
        var varH = varG++; // Primero el valor de la variable y luego el incremento
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);
        // muestra un 4 y luego un 3
        
        
        // OPERADORES UNARIOS DE DECREMENTO: predecremento
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI); // La variable I ya está con decremento
        System.out.println("varJ = " + varJ); 
        // las 2 variables muestran un 3 en pantalla
        
        
        // POSTDECREMENTO
        var varK = 8;
        var varL = varK--; // Primero el valor de la variable, luego queda el decremento
        System.out.println("varK = " + varK); // Aquí va a mostrar 7, porque decrementa en 1 (resta 1)
        System.out.println("varL = " + varL);
        
        
        

        // OPERADORES DE IGUALDAD Y RELACIONALES
        var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);

        var dNum = aNum != bNum;
        System.out.println("dNum = " + dNum);

        // con la inferencia de tipos, Java ve que hay letras y le asigna tipo string a la var cadenaA y cadenaB
        var cadenaA = "Hello";
        var cadenaB = "bye bye";
        var cVar = cadenaA == cadenaB; // no compara el contenido, compara referencias
        System.out.println("cVar = " + cVar); // dice que es falso, no son iguales, pero tampoco hace comprobación de lo que hay dentro de las variables

        // para comparar el contenido de una cadena con otra, hacemos lo siguiente:
        // usamos el método EQUALS (IGUAL A) tipo BOOLEAN
        var fVar = cadenaA.equals(cadenaB); // Acá pregunta: cadena A, tiene lo mismo que cadena B? 
        System.out.println("fVar = " + fVar); // Aca nos dice falso, porque comprueba que el contenido es distinto    

        // OPERADORES RELACIONALES   >=  <=   < ó >  ==  !=        
        var gVar = aNum != bNum;//podemos probar diferentes operadores relacionales para ver que resultado muestra
        System.out.println("gVar = " + gVar);
        
        // USAMOS IF ELSE PARA SABER SI UN NÚMERO ES PAR O IMPAR
        if (bNum % 2 == 0) // es par?
        {
            System.out.println("Es par");
        } else {
            System.out.println("NO es par");
        }

        // MAS EJERCICIOS DE COMPROBACIÓN: EDAD
        var edad = 22;
        var adulto = 18;
        if(edad >= adulto){
            System.out.println("MAYOR DE EDAD");
        }else{
            System.out.println("ES MENOR DE EDAD");
        }
        
        

        // OPERADORES CONDICIONALES: AND Y OR
        var valorA = 11;
        var valorMinimo = 0; // creamos un rango del 0 al 10
        var valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <= 10; // Usamos el operador condicional AND &&
        // recordemos dar click derecho > Format > para darle formato y llaves al código

        if (respuesta) {
            System.out.println("Está dentro del rango establecido");
        } else {
            System.out.println("Está fuera del rango");
        }

        // Ahora usamos el operador condicional OR ||. Si una de las 2 condiciones evaluadas es verdadera, todo es verdadero
        var vacaciones = false;
        var diaLibre = true;
        if (vacaciones || diaLibre) {
            System.out.println("Papá puede asistir al juego de su hijo");
        } else {
            System.out.println("Papá no puede asistir al juego");
        }

        
         

        // OPERADOR TERNARIO: tiene 3 partes
        var resultadoT = (5 > 8) ? "Verdadero" : "Falso";
        System.out.println("resultadoT = " + resultadoT);

        // COMPROBAMOS SI UN NÚMERO ES PAR O IMPAR CON EL OPERADOR TERNARIO: SÓLO SIRVE PARA OPERACIONES SENCILLAS
        var numeroT = 4;
        resultadoT = (numeroT % 2 == 0) ? "Es par" : "Impar";
        System.out.println("resultadoT = " + resultadoT);
        
        
        
        
        // PRIORIDAD DE OPERADORES
        // PRECEDENCIA O PRIORIDAD EN LA QUE SE EVALUAN OPERACIONES EN UNA EXPRESIÓN
        
        // PRIORIDAD NÚMERO 1:  ++   --   +   -   ;
        
        // PRIORIDAD NÚMERO 2: (tipos)
        
        // PRIORIDAD NÚMERO 3: *  /  %
        
        // PRIORIDAD NÚMERO 4: +  -  concatenación de cadenas
        
        // ASIGNAMOS VALORES A NUESTRAS VARIABLES
        var x = 5;
        var y = 10;
        var z = ++x + y--; // Estas se evalúan de IZQ a DER.  X preincremento y Y postdecremento
        //6 y 9 = 15  / 16
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        
        
        var solucionAritmetica = 4 + 5 * 6 / 3; //  4 + ((5*6) / 3) = 30 / 3 = 10 + 4 = 14
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        
        // Hacemos la misma operación pero le ponemos paréntesis para cambiar la prioridad de expresiones y evaluaciones
        var solucionAritmetica2 = (4 + 5) * 6 / 3;  // 4 + 5 = 9 * 6 = 54 / 3 = 18
        System.out.println("solucionAritmetica2 = " + solucionAritmetica2);
   
        
       
        // EJERCICIOS: 
        
        // SACAR AREA Y PERÍMETRO DE UN RECTÁNGULO
       
        // definimos area, base y altura
        int area = 0;
        int base = 10;
        int altura = 10;
        // usamos la fórmula para sacar área y perímetro: base*h (base por altura)
        area = base * altura;
        System.out.println(" Resultado de área y perímetro del rectángulo (fórmula base * altura) = " + area);     
        
        
        // AHORA HACEMOS EL MISMO EJERCICIO PERO CON DATOS INGRESADOS POR TECLADO:    
        int area = 0;
        int base = 0;
        int h = 0;

        var entrada = new Scanner(System.in);
        System.out.println("Ingrese la base: ");
        base = Integer.parseInt(entrada.nextLine());
        System.out.println("base= " + base);

        var entrada2 = new Scanner(System.in);
        System.out.println("Ingrese la altura (H): ");
        h = Integer.parseInt(entrada.nextLine());
        System.out.println("h= " + h);

        area = base * h;
        System.out.println("EL RESULTADO DE ÁREA: BASE POR ALTURA EN CM: = " + area);

        
        
        // EL MAYOR DE DOS NÚMEROS
        int a = 15;
        int b = 20;
        //int mayor = 0;
        if (a > b) {
            System.out.println("A es mayor que B");
        } else {
            System.out.println("B es mayor que A");
        }
*/        
        
        
        

    }
}
