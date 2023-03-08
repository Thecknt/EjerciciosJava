/*
 * Dada una cantidad de grados centígrados se debe 
 * mostrar su equivalente en grados Fahrenheit. 
 * La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package centigrados.a.faren;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class CentigradosAFaren {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese los grados deseados a convertir");
        int temp = leer.nextInt();
        
        int faren = 32 + (temp * 9/5);
        
       System.out.println(temp + "° en escala Fahrenheit es " + faren +"°");
    }
    
}
