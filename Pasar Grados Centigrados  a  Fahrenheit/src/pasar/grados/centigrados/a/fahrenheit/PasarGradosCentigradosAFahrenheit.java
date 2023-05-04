/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasar.grados.centigrados.a.fahrenheit;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class PasarGradosCentigradosAFahrenheit {

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
