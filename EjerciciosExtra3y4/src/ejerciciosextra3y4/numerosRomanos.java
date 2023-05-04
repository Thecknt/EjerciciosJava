/*
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 
 * y se muestre su equivalente en romano..
 */
package ejerciciosextra3y4;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class numerosRomanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String romanos;
        int num;
        
        System.out.println("Ingrese un numero del 1 al 10");
         num = leer.nextInt();
       
        
         if(num >= 1 && num <=10) {
             switch(num) {
                case 1:
                     System.out.println("El numero ingresado en numeros Romanos es: I" );
                     break;
                case 2:
                     System.out.println("El numero ingresado en numeros Romanos es: II");
                     break;
                case 3:
                     System.out.println("El numero ingresado en numeros Romanos es: III");
                     break;
                case 4:
                     System.out.println("El numero ingresado en numeros Romanos es: IV");
                     break;
                case 5:
                     System.out.println("El numero ingresado en numeros Romanos es: V");
                     break;
                case 6:
                     System.out.println("El numero ingresado en numeros Romanos es: VI");
                     break;
                case 7:
                     System.out.println("El numero ingresado en numeros Romanos es: VII");
                     break;
                case 8:
                     System.out.println("El numero ingresado en numeros Romanos es: VIII");
                     break;
                case 9:
                     System.out.println("El numero ingresado en numeros Romanos es: IX");
                     break;
               case 10:
                     System.out.println("El numero ingresado en numeros Romanos es: X");
                     break;
                 default:
                     System.out.println("error");
             }
         } else {
             System.out.println("Ingrese un numero dentro de los parametros");
         }
        
        
    }
    
}
