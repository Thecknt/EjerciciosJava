/*
 * Elaborar un algoritmo en el cuál se ingrese una letra 
 * y se detecte si se trata de una vocal. 
 * Caso contrario mostrar un mensaje. 
 * Nota: investigar la función equals() de la clase String.
 */
package ejerciciosextra3y4;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class comprobarVocal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra, de manera de poder determinar si es una vocal o no");
        String letra;
        letra = leer.next();
        if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
            System.out.println("La letra ingresada es una vocal");
        } else {
            System.out.println("La letra ingresada no es una vocal");
        }
        
        
    }
    
}
