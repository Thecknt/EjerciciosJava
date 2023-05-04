
import ClasesExtra.Empleado;
import java.util.Scanner;

/*
* Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
 * Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un 
 * empleado en función de su edad y salario actual. El aumento salarial debe ser 
 * del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
public class ejercicioExtra6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Empleado emp1 = new Empleado();
        String name;
        System.out.println("Ingrese su nombre");
        name = input.nextLine();
        emp1.setNombre(name);
        double suel;
        System.out.println("Ingrese su sueldo($)");
        suel = input.nextDouble();
        emp1.setSalario(suel);
        int año;
        System.out.println("Ingrese su edad:");
        año = input.nextInt();
        emp1.setEdad(año);
        
        System.out.println("su sueldo final sera de: $" + emp1.calcular_aumento());
    }

}
