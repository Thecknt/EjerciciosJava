/*
 * Leer la altura de N personas y determinar el promedio de estaturas 
 * que se encuentran por debajo de 1.60 mts. 
 * y el promedio de estaturas en general.
 */
package ejerciciosextra3y4;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class promedioAltura {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        
       int personas = 0;
       int estatura = 0;
       int suma = 0;
       int suma2 = 0;
       
       
       System.out.println("Ingrese la cantidad de personas");
            personas = leer.nextInt();
        for (int i = 1; i <= personas; i++) {
            System.out.println("Ingrese la estatura de la persona " + i);
            estatura = leer.nextInt();
            if (estatura <= 160) {
                suma = suma + estatura;
            } else {
             suma2 = suma + suma2 + estatura;
             }
        }
        float promedio = suma2/personas;
        double prom = suma/personas; 
        System.out.println("El promedio de estatura de 160 es " + prom + " mts.");
        System.out.println("El promedio  gral de estatura es " + promedio + " mts.");
    }
}
