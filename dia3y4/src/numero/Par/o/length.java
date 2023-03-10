/*
 * Realizar un programa que solo permita introducir solo frases
 * o palabras de 8 de largo. Si el usuario ingresa una frase o 
 * palabra de 8 de largo se deberá de imprimir un mensaje por pantalla 
 * que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
 * Nota: investigar la función Lenght() en Java.
.
 */
package numero.Par.o;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class length {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String frase = "";
        System.out.println("Ingrese una frase por favor, no debe tener mas de 8 caracteres");
        frase = leer.nextLine();
        int total = frase.length();
        
        if (total == 8) {
            System.out.println("Usted ingreso la cantidad de caracteres correctos");
        } else {
            System.out.println("Ingrese la cantidad de caracteres que se solicitan, por favor");
        }
    }
    
}
