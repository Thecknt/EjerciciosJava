/*
 * Realizar un programa que pida dos números enteros positivos por teclado 
 * y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción 
 * y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
 * El programa deberá ejecutarse hasta que se elija la opción 5. 
 * Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
 * se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)?
 * Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.


 */
package numero.Par.o;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros enteros");
        int num = 0;
        num = leer.nextInt();
        int count = 0;
        
        while(leer.hasNextInt() && count < 2){
        //num = leer.nextInt();
        
            count++; 
        }
        if ( count == 2) {
            System.out.println("De este menu elija la opcion que desee");
        } else {
            System.out.println("Imgrese dos numeros");
        }
    }
    
}
