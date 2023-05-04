/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mostrar.nombre.por.pantalla;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class MostrarNombrePorPantalla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner leer = new Scanner(System.in);
       String nombre;
       
       System.out.println("Ingrese su Nombre");
       nombre = leer.next();
       
       System.out.println("El nombre guardado en la variable es: " + nombre);
       
       
    }
    
}
