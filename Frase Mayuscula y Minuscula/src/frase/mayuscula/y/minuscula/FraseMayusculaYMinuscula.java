/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frase.mayuscula.y.minuscula;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class FraseMayusculaYMinuscula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
    
    String frase;
    
    System.out.println("Ingrese una frase a continuacion...");
    
    frase = leer.nextLine();
    
    System.out.println(frase.toUpperCase());
    System.out.println(frase.toLowerCase());
    }
    
}
