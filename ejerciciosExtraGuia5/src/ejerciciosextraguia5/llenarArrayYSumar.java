/*
 * Realizar un algoritmo que calcule la suma 
 * de todos los elementos de un vector de tamaño N, 
 * con los valores ingresados por el usuario.
 */
package ejerciciosextraguia5;

import java.util.Scanner;

public class llenarArrayYSumar {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n; // n va a ser el numero a numero que vaya ingresando por pantalla
        int nums; // nums va a ser el tamaño del array
        int suma = 0;
        
        System.out.println("ingrese el tamaño del array:");
        nums = input.nextInt();
        int array[] = new int[nums];

        for (int i = 0; i < nums; i++) { //Este for es para ir llenando el array. y cada numero que ingrese el usuario 
            //lo asigno a la posicion i de cada vuelta que pegue el ciclo for
            System.out.println("Ingrese un numero");
            n = input.nextInt(); 
            array[i] = n;
        } 

        for (int i = 0; i <array.length; i++) { // con este for sumo cada numeros del array
            suma += array[i];    
        } System.out.println("La suma es: "+ suma);

    }

}
