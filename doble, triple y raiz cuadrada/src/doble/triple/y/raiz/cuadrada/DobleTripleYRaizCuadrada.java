/*
 * Escribir un programa que lea un número entero por teclado 
 * y muestre por pantalla el doble, el triple y 
 * la raíz cuadrada de ese número. 
 * Nota: investigar la función Math.sqrt().
 */
package doble.triple.y.raiz.cuadrada;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class DobleTripleYRaizCuadrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero, para calcular su doble, triple y raiz cuadrada");
        
        int numero1 = leer.nextInt();
        
        int numero2 = numero1*2;
        
        int numero3 = numero1*3;
        
        double numero4 = Math.sqrt(numero1);
        
        System.out.println("El doble del numero ingresado es: " + numero2);
        System.out.println("El triple del numero ingresado es: " + numero3);
        System.out.println("La Raiz cuadrada del numero ingresado es: " + numero4);
        
    }
    
}
