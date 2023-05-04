/*
 * Crear una función rellene un vector con números aleatorios, 
 * pasándole un arreglo por parámetro. 
 * Después haremos otra función o procedimiento que imprima el vector.
 */
package ejerciciosextraguia5;

/**
 *
 * @author santi
 */
public class numerosAleatoriosConFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 5;
        int array[] = new int[n];
        rellenarArray(array);
        
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+ " ");
        }
    }

    public static int[]rellenarArray(int array[]){  //En el método rellenarArray, 
        // se itera sobre el arreglo que se le pasa como argumento y se le asigna a 
        // cada elemento un número aleatorio generado por Math.random() * 5. 
        // Luego se imprime "El array es:" y se devuelve el arreglo completo.
            for (int i = 0; i < array.length; i++) {
            int n = (int)(Math.random()*5);
            array[i] = n;
        }
            System.out.println("El array es: ");
            return array; 
         
    } 
}

