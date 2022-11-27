/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problematica02;

/**
 *
 * @author Sistemas G Didactic
 */
public class Problematica02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero = 0;
        int contador = 1;
        int suma = 2;
        String mensaje = "";
        
        while (contador <= 10) {
            contador = contador + 1;
            numero = numero + suma;
            mensaje = mensaje + numero + "\n";
            suma = suma + 2;
            
            
            
        }
        System.out.printf("%s\n", mensaje);
        
    }
    
}
