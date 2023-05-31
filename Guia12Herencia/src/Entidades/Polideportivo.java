/*
Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o 
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
 */
package Entidades;

public class Polideportivo extends Edificio {

    private String nombre;
    private String tipoInstalacion;
    private int superficie;
    private int volumen;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String tipoInstalacion, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen del edificio es: ");
        volumen = (largo * ancho) * alto;
        System.out.println(volumen + " mts3.");
    }

    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie del edificio es: ");
        superficie = ancho * largo;
        System.out.println(superficie + " mts2.");
    }

    @Override
    public String toString() {
        return "**************************************************************************************"
                + "\n El nombre del Polideportivo es: " + nombre + "\n su tipo de cobertura es: " + tipoInstalacion + "\n El frente del edificio es de: " + ancho + " mts"
                + "\n El largo del edificio es de: " + largo + " mts" + "\n El alto de cada piso es de: " + alto + " mts"
                + "\n **************************************************************************************";

    }

}
