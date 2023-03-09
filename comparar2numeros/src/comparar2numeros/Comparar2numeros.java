/*
 *  Pide 2 números y muestra cual es el mayor, 
 *  el menor, o si son iguales.
 */
package comparar2numeros;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Comparar2numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros para compararlos");
        int num1;
        int num2;
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        if(num1 == num2) {
            System.out.println("Los numeros ingresados son iguales");
        }
        else if (num1 > num2) {
            System.out.println("El numero " + num1 + " es mayor que " + num2);
        } else {
            System.out.println("El numero "+ num2 + " es mayor que " + num1);
    }
    
}
