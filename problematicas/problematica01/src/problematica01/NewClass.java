/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problematica01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sistemas G Didactic
 */
public class NewClass {

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

        System.out.println("Ingrese el nombre del Jugador");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la posición en el campo");
        posicion = entrada.nextLine();
        System.out.println("Ingrese la edad del Jugador");
        edad = entrada.nextInt();
        System.out.println("Ingrese la estatura del Jugador");
        estatura = entrada.nextDouble();

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
