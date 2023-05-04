/*
 * Recorrer un vector de N enteros contabilizando 
 * cuántos números son de
 * 1 dígito, cuántos de 2 dígitos, 
 * etcétera (hasta 5 dígitos).
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author santi
 */
 * public class contabilizarDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Iniciando el array... ");
        int size[] = new int[6]; //Si o si se define la cantidad
        int array[] = {2, 3525, 10, 62547, 99, 5, 100}; //Defino los numeros que va a tener mi array
        

        for (int i = 0; i < array.length; i++) {
            
            int cantDig =1;
            int numActual= array[i];
            while (numActual >=10){
            cantDig++;
            numActual /=10;
            }
            
            size[cantDig]++;
        }
        
        System.out.println("Cantidad de numeros por cantidad de digitos: ");
        for (int i = 0; i <=5; i++) {
            System.out.printf("%d digitos: %d%n", i, size[i]);   
        }
    }
}

/*public static void main(String[] args) {
    int[] numeros = {12, 345, 6789, 3, 9, 10, 99999};
    int[] digitos = new int[6]; //vector para almacenar la cantidad de numeros por digitos
    
    for (int i = 0; i < numeros.length; i++) {
        int cantidadDigitos = 1;
        int numeroActual = numeros[i];
        while (numeroActual >= 10) {
            cantidadDigitos++;
            numeroActual /= 10;
        }
        digitos[cantidadDigitos]++;
    }
    
    System.out.println("Cantidad de numeros por cantidad de digitos:");
    for (int i = 1; i <= 5; i++) {
        System.out.printf("%d digitos: %d%n", i, digitos[i]);
    }
}
}*/