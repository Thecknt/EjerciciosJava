/*
 * Crear un programa que pida una frase 
 * y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, 
 * sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java..
 */
package numero.Par.o;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class fraseIgual{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase");
        
        String frase1 = "eureka";
        String frase2;
        
        frase2 = leer.next();
        if(frase1.equals(frase2)){
            System.out.println("Eureka!!" + "La frase ingresada es igual");
        } else {
            System.out.println("La frase ingresada no coincide");
        }
    }
    
}
