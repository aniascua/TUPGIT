/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.*;

/**
 *
 * @author ASCUA
 */
public class TestSobreescritura {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan",10000);
        imprimir(empleado1);
        //System.out.println("empleado1 = " + empleado1.obtenerDetalles());
        Gerente gerente1 = new Gerente("Jose", 5000, "Sistemas");
        imprimir(gerente1);
        //System.out.println("gerente1 = " + gerente1.obtenerDetalles());
    }
    
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}