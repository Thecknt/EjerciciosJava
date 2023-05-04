/*Escribir un programa que lea un número entero por teclado y 
muestre por pantalla el doble, el triple y 
la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt(). */
package mostrar.doble.triple;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class raiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int doble;
        int triple;
        int raiz2;
        int numero;
        
        System.out.println("Ingrese un numero, y a continuacion se mostrara su doble,triple y raiz cuadrada");
        
        numero = leer.nextInt();
        
        System.out.println("El doble del numero ingresado es: " + numero *2);
        System.out.println("El triple del numero ingresado es: " + numero *3);
        System.out.println("La raiz cuadrada del numero ingresado es: " + Math.sqrt(numero));
    }
    
}
