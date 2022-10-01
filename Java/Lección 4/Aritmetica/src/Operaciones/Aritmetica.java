package Operaciones;

public class Aritmetica {  // Pascal case para Clases. Las clases empiezan con Mayúscula

    // ATRIBUTOS comienzan con minúscula
    int a;  // valor por default = 0
    int b;

    // El constructor es un método especial y cumple 3 objetivos:
    // - construye un objeto
    // - reserva un espacio de memoria
    // - inicializa 
    public Aritmetica(){  // Constructor 1
        System.out.println("Se está ejecutando este constructor n°1");
    }
    

    // Estamos viendo lo que se llama sobrecarga de constructores
    public Aritmetica(int a, int b){  // Constructor 2
        this.a = a;
        this.b = b;
        System.out.println("Se está ejecutando el constructor n°2");
    }
   
    
    // Método vacío
    public void sumarNumeros() { // camelCase para métodos
        // lo que vaya aca, son variables locales
        //ej:
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    // Otro método 
    // Método NO vacío
    public int sumarConRetorno() {
        //int resultado = a + b;
        return a + b;
    }

    public int sumarConArgumentos(int argumento1, int argumento2) {
        this.a = argumento1;  // El argumento A se asigna al atributo this.a
        this.b = argumento2;
        //return a + b;
        return this.sumarConRetorno();
    }
}
