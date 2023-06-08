/*
3) Defina una clase llamada EjerciciosAritmeticos. En el método main utilice un Scanner para leer dos 
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer, 
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar 
una división con los dos numeros y mostrar el resultado. 

4)Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
 */
package Principal;

import Services.EjerciciosAritmeticosService;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        String numA, numB;
       EjerciciosAritmeticosService ejer = new EjerciciosAritmeticosService();
//        System.out.println("Ingrese el primer numero ...>");
//        numA= input.next();
//        System.out.println("Ingrese el segundo numero");
//        numB = input.next();
     
        ejer.division();
    }

}
