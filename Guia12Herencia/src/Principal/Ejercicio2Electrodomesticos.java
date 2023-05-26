/*
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar 
el precio final de los dos electrodomésticos. 
 */
package Principal;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import Servicios.LavadoraService;
import Servicios.TelevisorService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2Electrodomesticos {

    public static void main(String[] args) {

        LavadoraService ls = new LavadoraService();
        TelevisorService ts = new TelevisorService();
        Scanner input = new Scanner(System.in);
        List<Electrodomestico> electrodomesticos = new ArrayList();
        Televisor tele;
        Lavadora lava;

        int opcion = 0;

        do {
            System.out.println("****************Menu******************");
            System.out.println("*    Bienvenido a su tienda digital  *");
            System.out.println("*    Ingrese la opcion deseada:      *");
            System.out.println("* 1) Comprar Televisor               *");
            System.out.println("* 2) Comprar Lavadora                *");
            System.out.println("* 3) Comprar Ambos                   *");
            System.out.println("* 4) Mostrar Electrodomesticos       *"
                    + "\n*           en el carrito            *");
            System.out.println("* 5) ¿Quiere saber el total de       *"
                    + "\n*       los Productos en el carrito? *");
            System.out.println("* 6) Salir                           *");
            System.out.println("**************************************");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Elija el color de su Televisor, en caso de no haber stock,"
                            + "\n se le entregara un producto en color blanco");
                    tele = ts.crearTelevisor();
                    ts.precioFinal();
                    electrodomesticos.add(tele);
                    break;
                case 2:
                    System.out.println("Elija el color de su Lavadora, en caso de no haber stock, "
                            + "\n se le entregara un producto en color blanco");
                    lava = ls.crearLavadora();
                    ls.precioFinal();
                    electrodomesticos.add(lava);
                    break;
                case 3:
                    System.out.println("Elija el color de su Televisor, en caso de no haber stock,"
                            + "\n se le entregara un producto en color blanco");
                    tele = ts.crearTelevisor();
                    ts.precioFinal();
                    electrodomesticos.add(tele);
                    System.out.println("*********************↓↓↓↓↓↓↓↓↓↓********************");
                    System.out.println("Elija el color de su Lavadora, en caso de no haber stock, "
                            + "\n se le entregara un producto en color blanco");
                    lava = ls.crearLavadora();
                    ls.precioFinal();
                    electrodomesticos.add(lava);
                    break;
                case 4:
                    if (electrodomesticos.isEmpty()) {
                        System.out.println("No hay aun, Productos en el carrito");
                    } else {
                        System.out.println("En el carrito tiene los siguiente electrodomesticos: ");
                        for (Electrodomestico aux : electrodomesticos) {
                            System.out.println(aux);
                        }
                    }
                    break;
                case 5:
                    Double sumaTotal = 0d;
                    if (electrodomesticos.isEmpty()) {
                        System.out.println("Aun no tenes nada en el Carrito de compras");
                    } else {
                    for (Electrodomestico aux : electrodomesticos) {
                        sumaTotal = sumaTotal + aux.getPrecio();
                        
                    }
                    System.out.println("Hasta ahora vamos...$"+sumaTotal);
                    }
                    
                    break;
                case 6: 
                    System.out.println("*************************************************");
                    System.out.println("*  Gracias por visitar nuestra tienda digital   *");
                    System.out.println("*************************************************");
                    break;
                default:
                    System.out.println("Valor incorrecto, elija dentro de las opciones indicadas");
                    break;
            }
        } while (opcion != 6);

    }

}
