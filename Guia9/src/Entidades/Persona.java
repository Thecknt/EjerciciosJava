/*
 Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), 
constructor vacío, constructor parametrizado, get y set. 
 */
package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona {

    private String nombre;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
       //         Formatear la fecha
       String fechaFormateada = formato.format(fechaNacimiento);
        return "El nombre de la persona es: " + nombre + ", y su fechaNacimiento es: " + fechaFormateada;
    }
    

}
