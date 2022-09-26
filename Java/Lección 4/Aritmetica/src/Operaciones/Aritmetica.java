package Operaciones;

public class Aritmetica {  // Pascal case para Clases. Las clases empiezan con Mayúscula

    // ATRIBUTOS comienzan con minúscula
    int a;  // valor por default = 0
    int b;

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
