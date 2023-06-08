/*
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
 */
package Services;

import Entidades.EjerciciosAritmeticos;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjerciciosAritmeticosService {
    Scanner input = new Scanner(System.in);
EjerciciosAritmeticos ejer = new EjerciciosAritmeticos();

    public void division(){
    
         int division = 0;
        do {
            System.out.println("Ingrese el primer numero");
            String num1 = input.next();

            System.out.println("Ingrese el segundo numero");
            String num2 = input.next();
            try {

              int numA1 = Integer.parseInt(num1);
              ejer.setNumA(numA1);
             int numB1 = Integer.parseInt(num2);
               ejer.setNumB(numB1);
                division =ejer.getNumA() / ejer.getNumB();

                System.out.println("El resultado de la division es: " + division);

            } catch (InputMismatchException e) {
                System.out.println("El valor ingresado no es correcto --->" + e.getMessage());

            } catch(NumberFormatException e){
                System.out.println("Lo que ud ingreso no pueder ser convertido a numero ---->"+ e.getMessage());
            } catch(ArithmeticException e){
                System.out.println("El numero no puede ser divido por cero ---->" + e.getMessage());
            }
        } while (division <= 0);
        
    }
}
