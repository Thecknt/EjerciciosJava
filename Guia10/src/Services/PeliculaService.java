/*

 */
package Services;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class PeliculaService {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    private Pelicula crearPelicula() {
        System.out.print("Ingrese el Nombre de la Pelicula: ");
        String nombre = sc.next().toUpperCase();
        System.out.print("Ingrese el Director de la Pelicula: ");
        String director = sc.next().toUpperCase();
        System.out.print("Ingrese la Duracion de la Pelicula (En horas): ");
        double duracion = sc.nextDouble();
        return new Pelicula(nombre, director, duracion);

    }

    public void cargarPelicula(ArrayList<Pelicula> peliculas) {
        String salir = "N";
        do {
            peliculas.add(crearPelicula());
            System.out.print("Desea continuar cargando Peliculas? (S/N): ");
            salir = String.valueOf(sc.next().toUpperCase().charAt(0));
            salir = validarOpcion(salir);
        } while (salir.equalsIgnoreCase("S"));
    }

    private String validarOpcion(String op) {
        String retorno = "";
        do {
            if (op.equalsIgnoreCase("S") || op.equalsIgnoreCase("N")) {
                retorno = op;
            } else {
                System.out.print("Ingrese nuevamente la opcion (S/N): ");
                op = String.valueOf(sc.next().toUpperCase().charAt(0));
            }
        } while (retorno.equalsIgnoreCase(""));
        return retorno;
    }

    public void mostrarTodasPeliculas(ArrayList<Pelicula> peliculas) {
        for (Pelicula pl : peliculas) {
            System.out.println(pl);
        }
    }

    public void mostrarPeliculasMayorUnaHora(ArrayList<Pelicula> peliculas) {
        System.out.println("");
        System.out.println("Mostrar Peliculas de mas de 1 hora de duracion:");
        for (Pelicula p1 : peliculas) {
            if (p1.getDuracion() > 1) {
                System.out.println(p1);
            }
        }
    }

    public Comparator<Pelicula> compararDuracionMenorMayor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            if (p1.getDuracion() < p2.getDuracion()) {
                return -1;
            } else if (p1.getDuracion() > p2.getDuracion()) {
                return 1;
            } else {
                return 0;
            }
        }
    };

    public Comparator<Pelicula> compararDuracionMayorMenor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            if (p2.getDuracion() < p1.getDuracion()) {
                return -1;
            } else if (p2.getDuracion() > p1.getDuracion()) {
                return 1;
            } else {
                return 0;
            }
        }
    };

    public Comparator<Pelicula> compararTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    };

    public Comparator<Pelicula> compararDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };

    public void mostrarPeliculaOrdenaDuracionMenorMayor(ArrayList<Pelicula> peliculas) {
        peliculas.sort(compararDuracionMenorMayor);
        System.out.println("");
        System.out.println("Peliculas Ordenada de Menor a Mayor:");
        mostrarTodasPeliculas(peliculas);
    }

    public void mostrarPeliculaOrdenaDuracionMayorMenor(ArrayList<Pelicula> peliculas) {
        peliculas.sort(compararDuracionMayorMenor);
        System.out.println("");
        System.out.println("Peliculas Ordenada Mayor a Menor:");
        mostrarTodasPeliculas(peliculas);
    }

    public void mostrarPeliculaOrdenaTitulo(ArrayList<Pelicula> peliculas) {
        peliculas.sort(compararTitulo);
        System.out.println("");
        System.out.println("Peliculas Ordenada por Titulo:");
        mostrarTodasPeliculas(peliculas);
    }

    public void mostrarPeliculaOrdenaDirector(ArrayList<Pelicula> peliculas) {
        peliculas.sort(compararDirector);
        System.out.println("");
        System.out.println("Peliculas Ordenada por Director:");
        mostrarTodasPeliculas(peliculas);
    }

}
