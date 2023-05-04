/*
 * Realice un programa para que el usuario adivine el resultado de una multiplicación 
 * entre dos números generados aleatoriamente entre 0 y 10. 
 * El programa debe indicar al usuario si su respuesta es o no correcta. 
 * En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. 
 * Para realizar este ejercicio investigue como utilizar la función Math.random() de Java..
 */
package ejerciciosextra3y4;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class mathRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 =  (int) (Math.random() * 10);
        int num2 =  (int) (Math.random() * 10);
        int mult = num1 * num2;
        int respuesta = 0;
        
        do {
            System.out.println("Adivine el resultado de la multiplicación:");
            respuesta = leer.nextInt();
            System.out.println("mult -> " + mult);
            
            if (respuesta == mult) {
                System.out.println("CORRECTO");
            } else {
                System.out.println("INCORRECTO");
            }
        } while (respuesta != mult);
    }
    
}
