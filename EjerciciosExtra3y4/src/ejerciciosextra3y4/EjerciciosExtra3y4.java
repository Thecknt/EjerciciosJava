/*
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, 
el sistema debe calcular su equivalente: 1 día, 2 horas..
 */
package ejerciciosextra3y4;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class EjerciciosExtra3y4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner leer = new Scanner(System.in);
  float min, dias, horas;
        System.out.println("Ingrese el tiempo deseado a convertir, expresado en minutos");
        min = leer.nextInt();
        
        dias = min / (60 * 24);
        horas = min / 60;
        System.out.println("El numero de minutos ingresados, corresponden a " + dias + " dias");
        System.out.println("Los minutos ingresados, equivalen a " + horas + " horas");
        System.out.println("Finalizando el programa...");
    }
    
}
