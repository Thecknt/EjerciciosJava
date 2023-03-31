/*
 * Realice un programa que compruebe si una matriz dada es antisimétrica. 
*Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia 
*traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
*La matriz traspuesta de una matriz A se denota por AT y se obtiene 
*cambiando sus filas por columnas (o viceversa).
 */
package guia5;

/**
 *
 * @author santi
 */
public class matrizTraspuestaCambiandoSigno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[][] matriz = {{0,-2,4},{2,0,2},{-4,-2,0}};
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]  ");
            }
            System.out.println("");
        }
        System.out.println("--------------------------------------");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[j][i] + "]  ");
            }
            System.out.println("");
        }
        
        boolean logic = true;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                /* se usa if para saber si es falsono verdadero y lo multiplico 
                por -1 para cambiar el signo, salvo el 0 */
                if (matriz[i][j] != (matriz[j][i] * -1) ) {
                    logic = false;
                    break;
                }
            } if (logic == false){
                break;
            }
        }
        
        System.out.println("La Matriz Es Antisimétrica: " + logic );
    }   
}
