
import ClasesExtra.Cuenta;
import java.util.Scanner;

/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, 
crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta. 
Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 */
public class EjercicioExtra5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double retiro = 0;

        System.out.println("Ingrese su nombre de titular");
        String titular = input.nextLine();
        System.out.println("Cuanto dinero desea ingrear?");
        double saldo = input.nextDouble();

        Cuenta cajero = new Cuenta(saldo, titular);

        System.out.println("Ingrese la cantidad de dinero que desee retirar: ");
        retiro = input.nextDouble();
        cajero.retirar_dinero(retiro);

        System.out.println("El saldo restante de: " + cajero.getTitular() + " es de: $" + cajero.getSaldo());
    }
}
