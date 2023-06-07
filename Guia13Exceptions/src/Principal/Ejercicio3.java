/*
3) Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos 
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer, 
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar 
una división con los dos numeros y mostrar el resultado. 
 */
package Principal;

import Entidades.DivisionNumero;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DivisionNumero divi = new DivisionNumero();

        int division = 0;
        do {
            System.out.println("Ingrese el primer numero");
            String num1 = input.next();

            System.out.println("Ingrese el segundo numero");
            String num2 = input.next();
            try {

                int numA = Integer.parseInt(num1);
                divi.setNumA(numA);
                int numB = Integer.parseInt(num2);
                divi.setNumB(numB);
                division = divi.getNumA() / divi.getNumB();

                System.out.println("El resultado de la division es: " + division);

            } catch (NumberFormatException e) {
                System.out.println("El valor ingresado no es correcto --->" + e.getMessage());

            }
        } while (division <= 0);

    }

}
