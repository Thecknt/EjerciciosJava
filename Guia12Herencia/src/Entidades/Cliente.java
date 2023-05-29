/*

 */
package Entidades;

import java.util.Date;

public class Cliente {

    protected String nombre;
    protected Integer DNI;
    protected Date fechaAlquiler;
    protected Date fechaDevolucion;
    protected Integer posicionAmarre;
    protected Barco barco = new Barco();

    public Cliente() {
    }

    public Cliente(String nombre, Integer DNI, Date fechaAlquiler, Date fechaDevolucion, Integer posicionAmarre) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Integer getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Integer posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Los datos del cliente son: " + "\n Nombre: " + nombre + " - DNI;" + DNI + " - fecha de Alquiler: " + fechaAlquiler + "\n fecha de Devolucion: " + fechaDevolucion + " - posicion de Amarre: " + posicionAmarre;
    }

}
