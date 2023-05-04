/*
 * Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número. 
*Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. 
*Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. 
*Nota: recordar que las variables de tipo entero truncan los números o resultados.
.
 */
package ejerciciosextra3y4;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class devolverCantidadDeNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero:");
        int num = leer.nextInt();
        int contador = 0;
        
        do {            
            
            num /= 10;
           
            contador ++;
            
        } while (num != 0);
        
        System.out.println("cantidad de digitos: " + contador);
    }
    
}
