/*
 * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
 * Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
 * en caso contrario, se deberá imprimir “INCORRECTO”. 
 * Nota: investigar la función Substring y equals() de Java..
 */
package numero.Par.o;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class validarPrimerLetra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase o letra, vamos a compara el primer caracter");
        
        String letra1 = "a";
        
        String letra2 = "";
        
        letra2 = leer.next();
        
        letra2 = letra2.substring(0,1);
        
        if (letra1.equals(letra2)) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
    
}
