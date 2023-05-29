/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el 
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del 
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de 
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente 
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y 
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles, 
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y 
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los 
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el 
precio final de su alquiler.
 */
package Principal;

import Entidades.Barco;
import Entidades.Cliente;
import Servicios.BarcoMotorService;
import Servicios.BarcoService;
import Servicios.ClienteService;
import Servicios.VeleroService;
import Servicios.YateDeLujoService;
import java.util.Scanner;

public class Ejercicio1ExtraHerencia {
    
    public static void main(String[] args) {
        
        System.out.println("****************************************************************");
        System.out.println("* Bienvenido al sistema de alquiler del Puerto de Buenos Aires *");
        System.out.println("****************************************************************");
        
        Scanner input = new Scanner(System.in);
        ClienteService cs = new ClienteService();
        BarcoService bs = new BarcoService();
        Cliente cliente = cs.ingresarDatosClientes();
        Barco barco = bs.crearBarco(cliente);
        BarcoMotorService bms = new BarcoMotorService();
        VeleroService vele = new VeleroService();
        YateDeLujoService yate = new YateDeLujoService();

        //cs.alquilerBase(cliente, barco);
        int opcion;
        do {
            System.out.println("********************************************");
            System.out.println("*      Seleccione la opcion deseada:       *");
            System.out.println("*        ¿que tipo de barco tiene?         *");
            System.out.println("* 1) Barco                                 *");
            System.out.println("* 2) Barco con motor                       *");
            System.out.println("* 3) Velero                                *");
            System.out.println("* 4) Yate de Lujo                          *");
            System.out.println("* 5) Salir                                 *");
            System.out.println("********************************************");
            opcion = input.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("El valor a abonar por los dias ingresados, seran de: $");
                    cs.alquilerBase(cliente, barco);
                    break;
                case 2:
                    bms.alquilerBase(cliente, barco);
                    break;
                case 3:
                    vele.alquilerBase(cliente, barco);
                    break;
                case 4:
                    yate.alquilerBase(cliente, barco);
                    break;
                case 5:
                    System.out.println("Gracias por utilizar nuestro sistema de reservas");
                    break;
                default:
                    System.out.println("Ingrese una opcion Valida");
                
            }
            
        } while (opcion != 5);
    }
}
