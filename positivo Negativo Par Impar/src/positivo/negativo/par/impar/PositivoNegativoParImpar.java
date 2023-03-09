/*
 * Pide un número y muestra si es positivo o negativo y si es par o impar.
 */
package positivo.negativo.par.impar;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class PositivoNegativoParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero, de esta manera determinaremos si es par,impar o -,+");
        int num;
        num = leer.nextInt();
        
        if (num > 0) {
            System.out.println("El Numero ingresado " + "(" + num + ") es Positivo" );
        } else {
            System.out.println("El Numero ingresado " + "(" + num + ") es Negativo");
        }
        
         if(num%2 == 0) {
                System.out.println("El numero Ingresado es Par");
                } else {
                System.out.println("El numero ingresado es Impar");
                }
    }
}
