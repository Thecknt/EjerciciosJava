/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma.de.dos.numeros;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class SumaDeDosNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Scanner leer = new Scanner(System.in);
      
      System.out.println("Ingrese un numero ");
      int numero1;
      numero1 = leer.nextInt();
      
      System.out.println(System.in);
      int numero2;
      numero2 = leer.nextInt();
      
      int suma = numero1 + numero2;
      System.out.println("La suma de los numeros ingresados es: " + suma);
      
    }
    
}
