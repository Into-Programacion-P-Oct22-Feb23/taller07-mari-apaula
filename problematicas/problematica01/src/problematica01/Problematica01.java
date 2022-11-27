/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problematica01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sistemas G Didactic
 */
public class Problematica01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        String posicion;
        int edad; 
        double estatura;
        boolean bandera = true;
        String opcion;
        String mensaje = "";
        double promedio_edad = 0;
        String listado_edad = "";
        double promedio_estatura = 0;
        int contador = 0;
        
        while(bandera){
            
            System.out.println("Ingrese el nombre del Jugador");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posición en el campo");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del Jugador");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del Jugador");
            estatura = entrada.nextDouble();
            
            listado_edad = listado_edad + edad + "\n";
            contador = contador + 1;
            promedio_edad = promedio_edad + edad;
            promedio_estatura = promedio_estatura + estatura;
            mensaje = mensaje + contador + ". " + nombre + "\t" + 
                    "-" + posicion + "-," + " edad " +  edad + 
                    ", " + "estatura " + estatura + "\n";
            
            System.out.print("Desea terminar el proceso. Ingrese s para "
                    + "salir\n");
            entrada.nextLine();
            opcion = entrada.nextLine();
            
            if(opcion.equals ("s")){
                bandera = false;
            }
        }
        promedio_edad = promedio_edad / contador;
        promedio_estatura = promedio_estatura / contador;
        
        System.out.printf("""
                          Listado de Jugadores
                          %s
                          Listado de edades 
                          %s
                          Promedio de edades: %.2f
                          Promedio de estaturas: %.2f
                          """, mensaje, listado_edad, 
                promedio_edad, promedio_estatura);
    }
    
}
