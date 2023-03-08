/*
 * Escribir un programa que pida tu nombre, 
 * lo guarde en una variable y lo muestre por pantalla.
 */
package pedir.nombre;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class PedirNombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
        String nombre = "";
        
        nombre = leer.next();
        
        System.out.println("Su nombre " + nombre + " ha sido guardado correctamente");
        
    }
    
}
