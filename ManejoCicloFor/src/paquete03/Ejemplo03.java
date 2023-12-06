/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Ingrese el número de jugadores a registrar");
        int limite = entrada.nextInt();
        entrada.nextLine();
        String cadena = "";
        
        for (int i = 1; i <= limite; i++) {
            System.out.println("Ingrese el nombre del jugador");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese la posicion en el campo de juego");
            String posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador");
            int edad = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingrese estatura del jugador");
            double estatura = entrada.nextDouble();
            entrada.nextLine();
            
            cadena = String.format("%s%d. %s -%s-, edad %d, estatura %.2f\n",
                    cadena,
                    i,
                    nombre,
                    posicion,
                    edad,
                    estatura);
 
        }
        
        System.out.printf("Listado de Jugadores\n%s", cadena);
        
    }
}
