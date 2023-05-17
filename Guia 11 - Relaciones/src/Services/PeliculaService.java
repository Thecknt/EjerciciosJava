/*

 */
package Services;

import Entidades.Cine;
import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.List;

public class PeliculaService {

    Pelicula peli = new Pelicula();
    Pelicula peli2 = new Pelicula();
    Pelicula peli3 = new Pelicula();
    List<Pelicula> peliculas = new ArrayList();
    Cine cine = new Cine();

    public void peliculasCartelera() {

        System.out.println("En cartelera tenemos los siguiente titulos\n"
                + "Tambien encontraras nuestros precios y duracion de las mismas");

        peli.setTituloPelicula("Matrix");
        peli.setDirector("Lana Wachowski");
        peli.setDuracion(120);
        peli.setEdadMinima(16);
        //System.out.println("Valor: " + cine.getPrecioEntrada());
        peliculas.add(peli);

        peli2.setTituloPelicula("Matrix Reload");
        peli2.setDirector("Lana Wachowski");
        peli2.setDuracion(150);
        peli2.setEdadMinima(16);
        peliculas.add(peli2);

        peli3.setTituloPelicula("'JOHN WICK 3: PARABELLUM");
        peli3.setDirector("Chad Stahelski");
        peli3.setDuracion(131);
        peli3.setEdadMinima(18);
        peliculas.add(peli3);

        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }
    }
}
