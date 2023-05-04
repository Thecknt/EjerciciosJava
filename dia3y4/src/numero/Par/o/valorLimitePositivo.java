/*
 * Escriba un programa en el cual se ingrese un valor limite positivo, 
 * y a continuación solicite números al usuario hasta que la suma 
 * de los numeros introducidos supere el limite inicial..
 */
package numero.Par.o;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class valorLimitePositivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor como tope");
        int limite,suma,num;
        suma = 0;
        limite = leer.nextInt();
        
        while (suma <= limite) {
            System.out.println("Ingrese un numero para sumar");
            num = leer.nextInt();
            suma +=num;
        }
        
        System.out.println("La suma de los numeros ingresados es: " + suma);
            }
        } 
    
    

