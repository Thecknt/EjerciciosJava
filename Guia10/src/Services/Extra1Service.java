package Services;

import java.util.ArrayList;
import java.util.Scanner;

public class Extra1Service {

    ArrayList<Integer> numA = new ArrayList();
    Integer suma;
    Integer promedio;

    private Scanner input = new Scanner(System.in);

    public void ingresarNumeros() {

        int num;
        Integer numB = null;

        System.out.println("Agregue su numero por favor, para finalizar debera ingresar -99");

        do {
            System.out.println("Ingrese el numero");
            numB = input.nextInt();
            numA.add(numB);

            if (numB == -99) {
                numA.remove(Integer.valueOf(-99));
                System.out.println("Gracias por usar la terminal");
                break;
            } else {
                suma = 0;
                for (int i = 0; i < numA.size(); i++) {
                    System.out.println("Ingrese otro numero");
                    numB = input.nextInt();
                    numA.add(numB);

                    suma += numA.get(i);

                    if (numB.equals(-99)) {
                        numA.remove(Integer.valueOf(-99));
                        System.out.println("Gracias por usar la terminal");
                        break;
                    }
                }
            }

        } while (numB != -99);
    }

    public void mostraValores() {
        for (Integer integer : numA) {
            System.out.println("Los numeros ingresados son: " + integer);
        }
    }

    public void resultadoSuma() {
        System.out.println("El resultado de la suma es: " + suma);

    }

    public void promedio() {
        promedio = suma / numA.size();
        System.out.println("El promedio de todos los numeros ingresador es: " + promedio);
    }
}
