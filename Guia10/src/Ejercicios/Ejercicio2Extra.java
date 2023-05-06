/*
Crear una clase llamada CantanteFamoso. 

Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.

Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.

Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. 

Al final se deberá mostrar la lista con todos los cambios.
 */
package Ejercicios;

//import Entidades.CantanteFamoso;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2Extra {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        //CantanteFamoso cantante = new CantanteFamoso();
        // Al final no use el objeto CantanteFamoso, hice todo en el main.
        HashMap<String, String> cantantes = new HashMap();

        cantantes.put("Linkin Park", "Meteora");
        cantantes.put("Audioslave", "Revelations");
        cantantes.put("U2", "All That You Can't Leave Behind");
        cantantes.put("Guns N' Roses", "Appetite for destruction");
        cantantes.put("Depeche Mode", "Violator");

        boolean fin = true;
        int opcion;
        do {
            System.out.println("************************************");
            System.out.println("*   Bienvenido a la Rockola...     *");
            System.out.println("*                                  *");
            System.out.println("*    Ingrese la opcion deseada:    *");
            System.out.println("*                                  *");
            System.out.println("* 1) Agregar Cantante              *");
            System.out.println("* 2) Eliminar Interprete           *");
            System.out.println("* 3) Mostrar listado de interpretes*");
            System.out.println("* 4) Salir                         *");
            System.out.println("************************************");

            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("¿Que Interprete desea agregar a la lista?");
                    String cantante = input.next();
                    System.out.println("¿Cual fue su disco mas vendido?");
                    String album = input.next();
                    cantantes.put(cantante, album);
                    break;
                case 2:
                    System.out.println("¿Que interprete desea Eliminar?");
                    String eliminar = input.next();
                    if (cantantes.containsKey(eliminar)) {
                        cantantes.remove(eliminar);
                        System.out.println("Interprete removido exitosamente!");
                    } else {
                        System.out.println("El Interprete no se encuentra en la lista");
                    }
                    break;
                case 3:
                    for (Map.Entry<String, String> entry : cantantes.entrySet()) {
                        String allCantante = entry.getKey();
                        String allAlbum = entry.getValue();
                        System.out.println(allCantante + " - " + allAlbum);
                    }
                    input.skip("\n");
                    break;
                case 4:
                    System.out.println("Gracias por utilizar nuestra Rockola");
                    fin = false;
                    System.exit(4);
                default:
                    System.out.println("Opcion invalida, reintente nuevamente");
                    break;
            }
        } while (fin);
    }

}
