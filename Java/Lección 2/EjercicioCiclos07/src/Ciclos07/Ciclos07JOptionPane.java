
package Ciclos07;

import javax.swing.JOptionPane;

public class Ciclos07JOptionPane {
    public static void main(String[] args) {
        //Scanner entrada = new Scanner(System.in);
        
        int numero, contador = 0, suma = 0;
        float promedio = 0;
        
    
        numero = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NÚMERO"));
      
        
        while(numero >= 0){   // Mientras el Num sea POSITIVO..
            suma += numero;
            contador ++;
          
            numero = Integer.parseInt(JOptionPane.showInputDialog("INGRESE OTRO NÚMERO"));
            
        }
        if (contador == 0){
            
            JOptionPane.showMessageDialog(null,"LA DIVISIÓN ENTRE 0 NO EXISTE.");
        }else{
            promedio = (float)suma/contador; // convertimos suma y contador a float
        
            JOptionPane.showMessageDialog(null,"EL PROMEDIO ES: "+promedio);
        }

        
    }
}
