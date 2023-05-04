/*
 * Realizar un programa que llene una matriz de tamaño NxM 
 * con valores aleatorios y muestre la suma de sus 
 * elementos..
 */
package ejerciciosextraguia5;


public class matrizNxM {

    public static void main(String[] args) {
        int array[][] = new int[3][3];
        int suma= 0;
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                array[i][j] =(int) (Math.random()* 5);
                suma += array[i][j];
            }
        } System.out.println("La suma de los numeros dentro del array es: " + suma);
        
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                System.out.print(array[i][j]);   
            }
            System.out.println(" ");
        }
    }
}
