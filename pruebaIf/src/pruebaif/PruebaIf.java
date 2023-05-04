/*
 *  Pide por teclado el nombre, edad y salario y muestra el salario.

    Si es menor de 16 no tiene edad para trabajar
    Entre 19 y 50 años el salario es un 5 por ciento más
    Entre 51 y 60 años el salario es un 10 por ciento más
    Si es mayor de 60 el salario es un 15 por ciento más
 */
package pruebaif;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class PruebaIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su Nombre por favor");
        String name;
        name = leer.next();
        
        System.out.println("Ingrese su Edad por favor");
        int edad;
         edad = leer.nextInt();
         
         System.out.println("Ahora ingrese su Salario por favor");
         double salario;
         salario = leer.nextInt();
         
         double salario5 = salario + (salario * 5 /100);
         double salario10 = salario + (salario * 10 / 100);
         double salario15 = salario + (salario * 15 / 100);
         
         if (edad > 18 ){
               System.out.println(name + " podes trabajar, ademas ");     
    } else {
             System.out.println(name + " No deberias trabajar por ser menor de edad");               
    }   
         if( edad > 19 && edad < 50){
         System.out.println("vas a recibir un incremento del 5% en tu sueldo, resultando como final: $" + salario5 );
        }
         
         else if(edad >51 && edad <60) {
             System.out.println("vas a recibir un incremento del 10% en tu sueldo, resultando como final: $" + salario10);
         }
         else if (edad > 60) {
             System.out.println("vas a recibir un incremento del 15% en tu sueldo, resultando como final: $" + salario15 );
         }
         }   
}
 
