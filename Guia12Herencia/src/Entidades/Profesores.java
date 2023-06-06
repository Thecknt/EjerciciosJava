/*
 */
package Entidades;

public class Profesores extends Empleados{
    private String departamento;

    public Profesores() {
    }

    public Profesores(String departamento, int anioIncorporacion, int numeroDespacho, String nombre, String apellido, int id, String estadoCivil) {
        super(anioIncorporacion, numeroDespacho, nombre, apellido, id, estadoCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public int getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(int numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }
    
    @Override
    public String toString() {
        return "El Profesor " + nombre + " "+ apellido+" de estado civil "+estadoCivil +" con la ID n°"+ id +", fue asignado al departamento de " +
                departamento + "\nSu año de asignacion es "+
                anioIncorporacion + ", podran encontrarlo/a en el despacho: " + numeroDespacho;
    }

    
    
    }
