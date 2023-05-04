/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

22

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Ejercicios;

import Entidades.Pelicula;
import Services.PeliculaService;
import java.util.ArrayList;


public class EjercicioPelicula {

    public static void main(String[] args) {
        PeliculaService ps = new PeliculaService();
        ArrayList <Pelicula>peliculas= new ArrayList<>();
        System.out.println("Vamos a agregar unas Peliculas a la Biblioteca...");
        ps.cargarPelicula(peliculas);
        System.out.println("<-------------------------------------------------------->");
        System.out.println("Las peliculas en biblioteca son: ");
        ps.mostrarTodasPeliculas(peliculas);
        System.out.println("<-------------------------------------------------------->");
        System.out.println("Las peliculas mayores a una hora son: ");
        ps.mostrarPeliculasMayorUnaHora(peliculas);
        System.out.println("<-------------------------------------------------------->");
        System.out.println("El orden de duracion de mayor a menor de las peliculas es: ");
        ps.mostrarPeliculaOrdenaDuracionMayorMenor(peliculas);
        System.out.println("<-------------------------------------------------------->");
        System.out.println("Se muestra el orden de duracion de menor a mayor: ");
        ps.mostrarPeliculaOrdenaDuracionMenorMayor(peliculas);
        System.out.println("<-------------------------------------------------------->");
        System.out.println("Peliculas ordenadas por titulo alfabeticamente: ");
        ps.mostrarPeliculaOrdenaTitulo(peliculas);
        System.out.println("<-------------------------------------------------------->");
        System.out.println("Peliculas ordenadas por nombre de Director: ");
        ps.mostrarPeliculaOrdenaDirector(peliculas);
        System.out.println("Gracias por usar nuestra Biblioteca de Pelis :)");
    }
    
}
