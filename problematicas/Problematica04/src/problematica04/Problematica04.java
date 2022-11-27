/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problematica04;

/**
 *
 * @author Sistemas G Didactic
 */
public class Problematica04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int contador = 1;
        int contador1 = 3;
        String mensaje = "";
        String dato = "";
            // 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 - 1/15
           

        while (contador <= 7) {
            
            if (contador % 2 == 0) {
                dato = " + ";
            } else {
                dato = " - ";
                
            }
            mensaje = mensaje + dato + "1/" + contador1;
            contador = contador + 1;
            contador1= contador1 + 2;
        } 
        System.out.printf("1 %s\n", mensaje);
    }
    
}
