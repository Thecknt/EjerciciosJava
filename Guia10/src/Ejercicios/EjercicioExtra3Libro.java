/*
 Implemente un programa para una Librería haciendo uso de un HashSet para evitar
datos repetidos. Para ello, se debe crear una clase llamada Libreria que guarde la
información de cada uno de los libros de una Biblioteca. La clase Libreria debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libreria que guardará todos los libros
creados.

En el main tendremos un bucle que crea un objeto Libreria pidiéndole al usuario todos
sus datos y los seteandolos en el Libreria. Despues, ese Libreria se guarda en el conjunto y
se le pregunta al usuario si quiere crear otro Libreria o no.
La clase Librería contendrá además los siguientes métodos:
• Constructor por defecto.
• Constructor con parámetros.
• Métodos Setters/getters
• Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libreria al
método. El método se incrementa de a uno, como un carrito de compras, el
atributo ejemplares prestados, del libro que ingresó el usuario. 
Esto sucederá cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
que no queden ejemplares disponibles para prestar. Devuelve true si se ha
podido realizar la operación y false en caso contrario.
• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
El método decrementa de a uno, como un carrito de compras, el atributo
ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
vez que se produzca la devolución de un libro. No se podrán devolver libros
donde que no tengan ejemplares prestados. Devuelve true si se ha podido
realizar la operación y false en caso contrario.
• Método toString para mostrar los datos de los libros.
 */
package Ejercicios;

import Entidades.Libreria;
import Services.LibroService;
import java.util.HashSet;
import java.util.Scanner;

public class EjercicioExtra3Libro {

    public static void main(String[] args) {
Scanner input= new Scanner(System.in);
        System.out.println("**********************************************");
        System.out.println("Bienvenido/a a la Libreria del Colegio");
        System.out.println("");
        LibroService ls = new LibroService();
        Libreria libreria = new Libreria();
        
        boolean salir = false;
//        int opcion;
        do {
            System.out.println("Bienvenido a la Biblioteca Escolar");
            System.out.println(" --------------------------------");
            System.out.println("Ingrese la opcion deseada:");
            System.out.println(" 1) Agregar un/unos Libros a la Biblioteca");
            System.out.println(" 2) ¿Desea solicitar un Libro prestado?");
            System.out.println(" 3) Mostrar Libros guardados en la Biblioteca");
            System.out.println(" 4) ¿Desea devolver un Libro? ");
            System.out.println(" 5) Salir");
            int opcion= input.nextInt();
            switch (opcion) {
                case 1:
                    HashSet<Libreria> p = ls.crearLibro();
                    break;
                case 2:
                    ls.prestamo();
                    break;
                case 3:
                    ls.mostraLibros();
                    break;
                case 4:
                    ls.devolucion();
                    break;
                case 5:
                    System.out.println("Gracias por utilizar nuestra Biblioteca");
                    salir = true;
                    break;
                default:
                    System.out.println("opcion invalida");
                    break;
            }
        } while (!salir);
    }
}
