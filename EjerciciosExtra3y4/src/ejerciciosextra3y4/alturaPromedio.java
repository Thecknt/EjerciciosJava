/*
 * Leer la altura de N personas y determinar el promedio de estaturas 
 * que se encuentran por debajo de 1.60 mts. 
 * y el promedio de estaturas en general..
 */
package ejerciciosextra3y4;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class alturaPromedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        double personas = 0, sumaTotal = 0;
        double altura160 = 0;
        double altura = 0;
        double proGral = sumaTotal / personas;   
        int contador160 = 0;
        System.out.println("Ingrese la cantidad de personas:");
        personas = leer.nextInt();
        
        for (int i= 1 ; i<= personas ; i++) {
            System.out.println("Ingrese la estatura de la persona, sin puntos " + i + " en metros.");
            altura = leer.nextDouble();
            sumaTotal += altura;
            
            if (altura < 160){
            altura160 += altura;
            contador160++;
            }
        }
        
       System.out.println("El promedio de estatura en gral es: " + proGral + " mts");
            System.out.println("la suma total de alturas es: "+ sumaTotal);
    }
    
}
