/*
 Implemente un programa para una Librería haciendo uso de un HashSet para evitar
datos repetidos. Para ello, se debe crear una clase llamada Libro que guarde la
información de cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
se le pregunta al usuario si quiere crear otro Libro o no.
La clase Librería contendrá además los siguientes métodos:
• Constructor por defecto.
• Constructor con parámetros.
• Métodos Setters/getters

• Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
método. El método se incrementa de a uno, como un carrito de compras, el
atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
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
package Services;

import Entidades.Libreria;
import java.util.HashSet;
import java.util.Scanner;

public class LibroService {

    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    HashSet<Libreria> libreria = new HashSet<>();

    public HashSet<Libreria> crearLibro() {
        String opcion;
        do {
            Libreria p = new Libreria();
            System.out.println("ingrese el nombre del Libro: ");
            p.setTitulo(input.next());
            System.out.println("Ingrese el nombre del Autor: ");
            p.setAutor(input.next());
            System.out.println("Ingrese la cantidad de Libros que hay en la Biblioteca: ");
            p.setNumeroLibros(input.nextInt());
            System.out.println("Ingrese si hay algun libro prestado, si no hay solo ponga 0");
            p.setLibrosPrestados(input.nextInt());
            System.out.println("¿Desea agregar Un nuevo Libro? s/n");
            opcion = input.next();
            libreria.add(p);
        } while (opcion.equalsIgnoreCase("s"));
        return libreria;
    }

    public void mostraLibros() {
        for (Libreria aux : libreria) {
            System.out.println("**********************************************");
            System.out.println(aux);
        }
        System.out.println("**********************************************");
    }

    public void prestamo() {
        String prestamo, opcion = "";
        int librosGuardados, cant;
        for (Libreria l : libreria) {
            librosGuardados = l.getNumeroLibros();
            System.out.println("*****************************************************");
            System.out.println("Bienvenido al Sistema de prestamos de Libros en la Biblioteca");
            System.out.println("Ingrese El nombre del Libro que desea pedir prestado");
            prestamo = input.next();
            if (l.getTitulo().equals(prestamo) && l.getLibrosPrestados() >= l.getNumeroLibros()) {
                System.out.println("El libro no tiene stock");
            } else {
                System.out.println("Ingrese la cantidad que desea pedir prestado");
                cant = input.nextInt();
                System.out.println("El libro sera prestado! Devolver dentro de las 48hs");
                int resta = librosGuardados - cant;
                int librosPrestados = cant + l.getLibrosPrestados();
                l.setNumeroLibros(resta);
                l.setLibrosPrestados(librosPrestados);
                break;
            }
        }
    }

    public void devolucion() {
        String devolucion, opcion = "";
        int librosGuardados, cant;
        boolean libroEncontrado = false;
        for (Libreria l : libreria) {
            librosGuardados = l.getNumeroLibros();
            System.out.println("*****************************************************");
            System.out.println("Bienvenido al Sistema de Devolucion de Libros en la Biblioteca");
            System.out.println("Ingrese El nombre del Libro que desea devolver");
            devolucion = input.next();
            if (l.getTitulo().equals(devolucion)) {
                libroEncontrado = true;
                System.out.println("Ingrese la cantidad de libros que va a devolver:");
                cant = input.nextInt();
                if (cant <= l.getLibrosPrestados()) {
                    System.out.println("El/Los Libros han sido satisfactoriamente devueltos. Gracias");
                    int suma = librosGuardados + cant;
                    l.setNumeroLibros(suma);
                    int restantes = l.getLibrosPrestados() - cant;
                    l.setLibrosPrestados(restantes);
                } else {
                    System.out.println("La cantidad ingresada supera la cantidad de libros prestados.");
                }
                break;
            }
        }
        if (!libroEncontrado) {
            System.out.println("El libro no se encuentra en la lista de prestados.");
        }
    }
    
}
