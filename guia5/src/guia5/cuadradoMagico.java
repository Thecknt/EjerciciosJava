/*
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
Crear un programa que permita introducir un cuadrado por teclado y determine 
si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos 
son correctos, es decir, están entre el 1 y el 9.
.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class cuadradoMagico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
        int matriz[][] = new int [3][3];
        
        System.out.println("Ingrese Números Entre 1 y 9");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = entrada.nextInt();
                
                if (matriz[i][j] > 9 || matriz[i][j] < 1){
                    do {
                    System.out.println("EL Número NO Esta Dentro De Los Parametros \n"
                            +"Ingrese Nuevamente Un Numero Entre 1 y 9");
                    matriz[i][j] = entrada.nextInt();
                    } while (matriz[i][j]< 1 || matriz[i][j] > 9);
                }
                
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]  ");
            }
            System.out.println("");
        }
    }
    
}
