<<<<<<< HEAD
/*
 * Realizar un algoritmo que llene un vector con los 100 
 * primeros números enteros y los muestre por 
 * pantalla en orden descendente..
 */
package guia5;


/**
 *
 * @author santi
 */
public class rellenar100numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        
        int[] numbers = new int[100]; //Creo un array de 100 elementos

        for(int i = 0; i <100; i++) {
            numbers[i] = i + 1; // Asigno el valor de i + 1 al indice i del array

        }

        for (int i = 99; i > 0; i--) {    // con este for recorro nuevamente para mostrar en pantalla los numeros guardados en el array
            System.out.print(numbers[i] + " ");  // pero los muestro de manera descendente
        }

    }

}
=======
/*
 * Realizar un algoritmo que llene un vector con los 100 
 * primeros números enteros y los muestre por 
 * pantalla en orden descendente..
 */
package guia5;


/**
 *
 * @author santi
 */
public class rellenar100numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        
        int[] numbers = new int[100]; //Creo un array de 100 elementos

        for(int i = 0; i <100; i++) {
            numbers[i] = i + 1; // Asigno el valor de i + 1 al indice i del array

        }

        for (int i = 99; i > 0; i--) {    // con este for recorro nuevamente para mostrar en pantalla los numeros guardados en el array
            System.out.print(numbers[i] + " ");  // pero los muestro de manera descendente
        }

    }

}
>>>>>>> c70357b6a524489a3be1af6de8717370a7b2b176
