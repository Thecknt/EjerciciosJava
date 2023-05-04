/*
 * Se dispone de un conjunto de N familias, 
 * cada una de las cuales tiene una M cantidad de hijos. 
 * Escriba un programa que pida la cantidad de familias y 
 * para cada familia la cantidad de hijos 
 * para averiguar la media de edad de los hijos de todas las familias.
 */
package ejerciciosextra3y4;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class mediaFamiliaMediaHijos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int familias;
        int hijos = 0;
        
        System.out.println("Conjunto de familias?");
        familias = leer.nextInt();
        
        for (int i = 0; i < familias; i++) {
            System.out.println("Cantidad de Hijos de la familia Nº" + i);
            hijos += leer.nextInt();
        }
        
        System.out.println("El promedio de hijos por familia es de -> " +  ( (double) hijos / familias));
            
        }
    }
    
