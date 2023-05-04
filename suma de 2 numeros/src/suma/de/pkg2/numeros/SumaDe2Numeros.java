/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma.de.pkg2.numeros;

/**
 *
 * @author santi
 */
import java.util.Scanner;
public class SumaDe2Numeros {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int numero1 = 0;
        int numero2 = 0;
        System.out.println("Ingrese el primer numero entero");
        numero1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo numero entero");
        numero2 = leer.nextInt();
        
        int resultado = numero1 + numero2;
        
        System.out.println("La suma de los numeros ingresados es: " + resultado);
       
    }
    
}
