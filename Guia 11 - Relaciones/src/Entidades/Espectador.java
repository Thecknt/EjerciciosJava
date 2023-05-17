/*
del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible
 */
package Entidades;

public class Espectador {

    private String nombre;
    private int edad;
    private double dineroDisponible;

    public Espectador() {
    }

    public Espectador(String nombre, int edad, double dineroDisponible) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisponible = dineroDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDineroDisponible() {
        return dineroDisponible;
    }

    public void setDineroDisponible(double dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

    @Override
    public String toString() {
        return " Nombre: " + nombre + "\n edad: " + edad + " años" + "\n dinero Disponible: $" + dineroDisponible;
    }

}
