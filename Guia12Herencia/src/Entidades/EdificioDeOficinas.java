/*
 Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas 
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y 
los atributos del padre. 
 */
package Entidades;

public class EdificioDeOficinas extends Edificio {

    private int numerosDeOficinas;
    private int cantidadDePersonas;
    private int superficie;
    private int volumen;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numerosDeOficinas, int cantidadDePersonas, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.numerosDeOficinas = numerosDeOficinas;
        this.cantidadDePersonas = cantidadDePersonas;
    }

    public int getNumerosDeOficinas() {
        return numerosDeOficinas;
    }

    public void setNumerosDeOficinas(int numerosDeOficinas) {
        this.numerosDeOficinas = numerosDeOficinas;
    }

    public int getCantidadDePersonas() {
        return cantidadDePersonas;
    }

    public void setCantidadDePersonas(int cantidadDePersonas) {
        this.cantidadDePersonas = cantidadDePersonas;
    }

    @Override
    public void calcularVolumen() {
    System.out.println("El volumen del edificio de Oficinas es: ");    
        volumen = (ancho * largo) * alto;
        System.out.println(volumen + " mts3.");
    }

    @Override
    public void calcularSuperficie() {
        System.out.println("La superfie del edificio de oficinas es: ");
        superficie = ancho * largo;
        System.out.println(superficie + " mts2.");
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

    @Override
    public String toString() {
        return "**************************************************************************************"
                + "\n El Edificio De Oficinas tiene: " + numerosDeOficinas + " Oficinas" + "\n La Cantidad De Personas por piso es: " + cantidadDePersonas + "\n Posee " + numerosDeOficinas + " pisos"
                + "\n El frente del edificio de Oficinas es: " + ancho + " mts"
                + "\n El largo del edificio de oficinas es: " + largo + " mts" + "\n El alto de cada Oficina es: " + alto + " mts"
                + "\n *************************************************************************************";
    }

}
