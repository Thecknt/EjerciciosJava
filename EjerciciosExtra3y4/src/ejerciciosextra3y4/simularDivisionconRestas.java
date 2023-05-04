/*
 * Simular la división usando solamente restas. 
 * Dados dos números enteros mayores que uno, 
 * realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. 
 * Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, 
 * este resultado es el residuo, y el número de restas realizadas es el cociente.
 * Por ejemplo: 50 / 13:
 * 50 – 13 = 37     una resta realizada
 * 37 – 13 = 24     dos restas realizadas
 * 24 – 13 = 11     tres restas realizadas
 * dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
 * ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
package ejerciciosextra3y4;

import java.util.Scanner;


/**
 *
 * @author santi
 */
public class simularDivisionconRestas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int dividendo, divisor;
        
        System.out.println("dividendo:");
        dividendo = leer.nextInt(); //ingresa nro 1
        System.out.println("divisor:");
        divisor = leer.nextInt(); //ingresa nro 2
        
        int aux = dividendo;
        int cociente = 0;
        
        do {            
            System.out.println(dividendo + " - " + divisor + " = " + (dividendo - divisor));
            dividendo -= divisor;
            cociente ++;
        } while (dividendo > divisor);
        
        System.out.println("El residuo es " + dividendo + " y el cociente es " + cociente);
    }
    
}
