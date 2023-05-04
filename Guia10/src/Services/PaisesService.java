/*
 Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. 

El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)

Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.

Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package Services;

import Entidades.Paises;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PaisesService {

    private Scanner input = new Scanner(System.in);
    Set<String> paises = new HashSet<>();
    List<Paises> arrayPais = new ArrayList();

    public void guardarPaises() {
        String opcion;

        do {
            System.out.println("Ingrese un Pais, por favor: ");
            String pais = input.nextLine();

            if (!paises.add(pais)) {
                System.out.println("El Pais ya fue ingresado");
            }

            System.out.println("¿Desea Ingresar un nuevo pais? S/N");
            opcion = input.nextLine();
            
        } while (opcion.equalsIgnoreCase("s"));

        for (String aux : paises) {
            System.out.println("Los paises ingresados son: " + aux);
        }
        System.out.println("------------------------------------------------------");
    }

    public void ordenarAlfabeticamente() {
        Set<String> paisesOrdenados = new TreeSet<>(paises);
        for (String var : paisesOrdenados) {
            System.out.println("Aca estan los paises del hash Ordenados: " + var);
        }
        System.out.println("----------------------------------------------------------");
    }

    public void eliminarPais() {
        Iterator<String> eliminarPaises = paises.iterator();

        String opcion = "";
        String paisABuscar;
        do {
            System.out.println("¿Desea consultar si hay un pais repetido dentro de la biblioteca? S/N");
            opcion = input.next();

            System.out.println("Ingrese el pais a consultar: ");
            paisABuscar = input.next();

            while (eliminarPaises.hasNext()) {
                String pais = eliminarPaises.next();
                if (pais.equalsIgnoreCase(paisABuscar)) {
                    eliminarPaises.remove();
                    System.out.println("El pais " + pais + " ha sido eliminado de la bibiloteca");
                    break;
                }

            }

            if (!paises.contains(paisABuscar)) {
                System.out.println("El pais ingresado " + paisABuscar + ", no se encuentra en la biblioteca");
            }

            System.out.println("¿Desea consultar otro pais?");
            opcion = input.next();
            
        } while (opcion.equalsIgnoreCase("s"));

    }
}
