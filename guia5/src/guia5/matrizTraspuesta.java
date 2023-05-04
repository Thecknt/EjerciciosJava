<<<<<<< HEAD
/*
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
 * muestre la traspuesta de la matriz. La matriz traspuesta de una 
 * matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package guia5;

/**
 *
 * @author santi
 */
public class matrizTraspuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arrayA[][] = new int[4][4];
        int arrayB[][] = new int[4][4]; // Esta esta de mas, porque al final solo intercambio [I]

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arrayA[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + arrayA[i][j] + "]");
            }
            System.out.println(" ");
        }
        System.out.println("-------------");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + arrayA[j][i] + "]");
            }
            System.out.println("");
        }
    }
}
}
=======
/*
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
 * muestre la traspuesta de la matriz. La matriz traspuesta de una 
 * matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package guia5;

/**
 *
 * @author santi
 */
public class matrizTraspuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arrayA[][] = new int[4][4];
        int arrayB[][] = new int[4][4]; // Esta esta de mas, porque al final solo intercambio [I]

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arrayA[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + arrayA[i][j] + "]");
            }
            System.out.println(" ");
        }
        System.out.println("-------------");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + arrayA[j][i] + "]");
            }
            System.out.println("");
        }
    }
}
}
>>>>>>> c70357b6a524489a3be1af6de8717370a7b2b176
