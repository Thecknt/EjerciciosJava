/*

 */
package Entidades;

public class Empleados extends Persona{
    protected int anioIncorporacion;
    protected int numeroDespacho; //numero de despacho

    public Empleados() {
    }

    public Empleados(int anioIncorporacion, int numeroDespacho, String nombre, String apellido, int id, String estadoCivil) {
        super(nombre, apellido, id, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numeroDespacho = numeroDespacho;
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
    
    public void cambiarDesoacho(int numeroDespacho){
    this.numeroDespacho= numeroDespacho;
    }

    @Override
    public String toString() {
        return "Empleados{" + "anioIncorporacion=" + anioIncorporacion + ", numeroDespacho=" + numeroDespacho + '}';
    }
    
    
}
