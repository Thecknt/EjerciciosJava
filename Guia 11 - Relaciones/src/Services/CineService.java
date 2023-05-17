/*
. De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada
 */
package Services;

import Entidades.Cine;
import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.List;

public class CineService {
    
    PeliculaService ps = new PeliculaService();
    Pelicula peli = new Pelicula();
    List<Pelicula> peliculas = new ArrayList();
    Cine cine = new Cine();

    public void sala1() {
        cine.setPrecioEntrada(750);
        ps.peliculasCartelera();
        double precioPeli = cine.getPrecioEntrada();
        cine.setEspectadores(48);
        int espectadores = cine.getEspectadores();
        System.out.println("*******************************************************************************");
        System.out.println("Las entradas tienen un valor de: $" + precioPeli + " Actualmente hay " + espectadores + " personas.");
    
    }

}
