/*
 * Crear un programa que dado un número determine si es par o impar.
 */
package numero.Par.o;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class Impar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero. Determinaremos si es par o impar");
        int num;
        num = leer.nextInt();
        
        if(num % 2 == 0){
            System.out.println("el numero "+ num +" es par");
        } else {
            System.out.println("El numero " + num + " que a ingresado es impar");
        }
    }
    
}
