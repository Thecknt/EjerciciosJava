/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumarestamultidivi;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class SumaRestaMultiDivi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros para realizar las operaciones basicas de matematica");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multi = num1 * num2;
        int divi = num1 / num2;
        System.out.println("La suma de los numeros ingresado es: " + suma);
        System.out.println("La Resta de numeros ingresados es: " + resta);
        System.out.println("El Resultado de la Multiplicacion es: " + multi);
        System.out.println("El resultado de la Division es: "+ divi);
    }
    
}
