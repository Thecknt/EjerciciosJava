/*
 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. 
 * A continuación, realizar las instrucciones necesarias para que: 
 * B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. 
 * Mostrar los valores iniciales y los valores finales de cada variable. 
 * Utilizar sólo una variable auxiliar..
 */
package ejerciciosextra3y4;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class intercambiarValorVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a,b,c,d,aux;
        
        a = 2;
        b = 4;
        c = 6;
        d = 8;
        aux = 0;               
        System.out.println("Los valores iniciales son: a:" + a + ",b: " + b + ",c: " + c + ",d: " + " y " + "d: ." );
        
        for(int i = 2; i< 5; i++) {
        aux = a;
        a = b;
        b = c;
        c = a;
        d = aux;
        }
        System.out.println("Los nuevos valores son: a: " + a + ", b: " + b + ", c: "+ c + ", d: " + d);
    }
    
}
