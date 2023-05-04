/*
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales
 * (la comparación deberá detenerse en cuanto se detecte 
 * alguna diferencia entre los elementos).
 */
package ejerciciosextraguia5;

/**
 *
 * @author santi
 */
public class compararNumerosEnElArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arrayA[] = {1, 6, 8, 2};
        int arrayB[] = {2, 5, 4, 3};
        boolean sonIguales = false;

        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; i++) {
              if(arrayA[i] == arrayB[j]){
              sonIguales = true;
              break;
              }
              if(sonIguales){ // Ejecuto este segundo if para que se detenga el for de recorrer apenas encuentre una coincidencia
                  break;
              }
            }
            if(sonIguales==true){
                System.out.println("El Array 'A' y el Array 'B' tienen elementos iguales");
            } else {
                System.out.println("El Array 'A' y el Array 'B' NO tienen elementos iguales");
            }

        }

    }
}
