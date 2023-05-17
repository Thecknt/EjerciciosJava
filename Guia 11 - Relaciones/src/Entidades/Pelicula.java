/*
de las películas nos interesa saber
el título, duración, edad mínima y director
 */
package Entidades;

public class Pelicula {

    private String tituloPelicula;
    private int duracion;
    private int edadMinima;
    private String Director;

    public Pelicula() {
    }

    public Pelicula(String tituloPelicula, int duracion, int edadMinima, String Director) {
        this.tituloPelicula = tituloPelicula;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.Director = Director;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    @Override
    public String toString() {
        return "--------------------------" + "\n Pelicula: " + tituloPelicula + "\n duracion: " + duracion + "\n min" + ", edad Minima: " + edadMinima + " años" + "\n Director: " + Director;
    }

}
