/*

 */
package Entidades;

public class PersonalDeServicio extends Empleados{
    
    private String seccion;

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(String seccion, int anioIncorporacion, int numeroDespacho, String nombre, String apellido, int id, String estadoCivil) {
        super(anioIncorporacion, numeroDespacho, nombre, apellido, id, estadoCivil);
        this.seccion = seccion;
    }

   
    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
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
        return " "+ nombre+ " "+ apellido+ "de estado civil "+ estadoCivil +" se acaba de incorporar al persona de servicio "+
                " con ID n°"+ id +"\nAsiganado a la seccion " + seccion + "año de incorporacion "+ anioIncorporacion + 
                "\n A"+nombre+" se lo podra encontrar en el despacho numero" + numeroDespacho ;
    }
 
}
