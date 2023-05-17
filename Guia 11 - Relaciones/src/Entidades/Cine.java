/*
De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada
 */
package Entidades;

public class Cine {

private String tituloPelicula;
private int espectadores;
private double precioEntrada;

private Pelicula peli = new Pelicula();
private Espectador espectador = new Espectador();

    public Cine() {
    }

    public Cine(String tituloPelicula, int espectadores, double precioEntrada) {
        this.tituloPelicula = tituloPelicula;
        this.espectadores = espectadores;
        this.precioEntrada = precioEntrada;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public int getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(int espectadores) {
        this.espectadores = espectadores;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    @Override
    public String toString() {
        return "Cine{" + "tituloPelicula=" + tituloPelicula + ", espectadores=" + espectadores + ", precioEntrada=" + precioEntrada + ", peli=" + peli + ", espectador=" + espectador + '}';
    }

}
