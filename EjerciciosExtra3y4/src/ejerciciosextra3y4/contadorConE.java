/*
 * Necesitamos mostrar un contador con 3 dígitos (X-X-X), 
 que muestre los números del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca 
 un 3 lo sustituya por una E. Ejemplo:
 0-0-0
 0-0-1
 0-0-2
 0-0-E
 0-0-4
 0-1-2
 0-1-E
 Nota: investigar función equals() y como convertir números a String.
 */
package ejerciciosextra3y4;

/**
 *
 * @author santi
 */
public class contadorConE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String num1, num2, num3;
        
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                num1 = "E";
            } else {
                num1 = Integer.toString(i);
            }
            
            for (int j = 0; j < 10; j++) {
                if (j == 3) {
                    num2 = "E";
                } else {
                    num2 = Integer.toString(j);
                }
                
                for (int k = 0; k < 10; k++) {
                    if (k == 3) {
                        num3 = "E";
                    } else {
                        num3 = Integer.toString(k);
                    }
                    
                    System.out.println(num1 + "-" + num2 + "-" + num3);
                }
            }
        }
        
         // Otra forma de resolver, se colocaria al final de los 3 for
        // System.out.println((Integer.toString(i).equals("3") ? "E" : Integer.toString(i))
       //                               + "-" + (Integer.toString(j).equals("3") ? "E" : Integer.toString(j))
      //                                + "-" + (Integer.toString(k).equals("3") ? "E" : Integer.toString(k)));
      
    }
    
}
