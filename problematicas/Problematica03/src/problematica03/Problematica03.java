/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problematica03;

/**
 *
 * @author Sistemas G Didactic
 */
public class Problematica03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              /*2
                5
                10
                17
                26
                37*/
        
        
        
        int numero = 1;
        int contador = 1;
        int suma = 1;
        String mensaje = "";
        
        while (contador <= 6) {
            contador = contador + 1;
            numero = numero + suma;
            mensaje = mensaje + numero + "\n";
            
            suma = suma + 2;
            
            
            
        }
        System.out.printf("%s\n", mensaje);
        
    }
    
}
