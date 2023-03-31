/*
 * Realizar un algoritmo que llene un vector de tamaño N con valores
 * aleatorios y le pida al usuario un número a buscar en el vector. El
 * programa mostrará dónde se encuentra el numero y si se encuentra
 * repetido.
 */
package guia5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class hallarUnNumeroEnElVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rNumber = new Random(); // Importo esta funcion que me brinda un numero aleatorio
        int n;
        System.out.println("Ingrese el tamaño del vector: ");
        n = input.nextInt();
        int[] array = new int[n];

        //Con este ciclo for voy a rellenar de valores aleatorios
        for (int i = 0; i < n; i++) {
            array[i] = rNumber.nextInt(50); //Aca se genera un numero randon hasta 50 por ejemplo
        }

        //System.out.println("El vector/array completado es: " + Arrays.toString(array)); //muestro este sout
        // para ver si esta correcto el primer for para encontrar el numero
        // Esta es una funcion que tiene el array, por eso se importa como el scanner
        //  permite mostrar el array lleno,como una cadena de texto asi se muestra [1,2,3]
        
        //Ahora vamos a preguntar al usuario que valor quiere buscar
        System.out.println("¿Que numero desea encontrar?");
        int search = input.nextInt(); // en la misma linea defino y busco la variable buscar
        
        
        boolean find = false;  // Lo defino como booleano de manera que luego pueda compara
        for (int i = 0; i <array.length; i++) {
            if (array[i] == search) {
                System.out.println("El numero buscado " + search + " esta en la posicion: " + "[" + i + "]");
                find = true;
            } 
   
        }
        if(!find){ 
            System.out.println("El numero no se encuentra en el vector/Array");
        }
    }
  
}

/*
 Scanner leer = new Scanner(System.in);
        
        System.out.println("ingresar el tamaño que quieras que sea el vector ");
        int N = leer.nextInt();
        
        int[] numeroAleatorio = new int [N];        
        
        for (int i=0 ; i < numeroAleatorio.length ; i++){
            
            numeroAleatorio[i] = (int) (Math.random()*100) ;
            
        }
        System.out.println("que numero quieres buscar en la lista de valores:   ");
        int valorBuscado = leer.nextInt();
        int contdor=0;
        
       
        
        for (int i = 0 ; i < numeroAleatorio.length ; i++ ){
            
            if (valorBuscado == numeroAleatorio[i] ){
                
                 contdor = contdor +1 ;
                 System.out.println(" lugar encontrado "+i);
                         
                        
                
            }
                
            
        }
        
        System.out.println("el resultado "+ valorBuscado + " se encontro " + contdor);  
    }

}
*/