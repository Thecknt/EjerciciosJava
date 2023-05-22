/*
Desarrollar un simulador del sistema de votación de facilitadores en Egg.  
El sistema de votación de Egg tiene una clase llamada Alumno con los siguientes atributos:
nombre completo, DNI y cantidad de votos. Además, crearemos una clase Simulador que va a
tener los métodos para manejar los alumnos y sus votaciones. Estos métodos serán llamados
desde el main
 */
package Entidades;

public class Alumno {
    
  private String nombre; 
  private String apellido;
  private Integer DNI; 
  private Integer votos;

    public Alumno() {
    }
    
    public Alumno(String nombre, String apellido, Integer DNI, Integer votos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.votos = votos;
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

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }

     public void aumentarVotos() {
        this.votos++;
    }
     
    @Override
    public String toString() {
        return " Nombre: " + nombre + "\n Apellido: " + apellido + "\n DNI: " + DNI + "\n votos: " + votos+"\n *******************************************";
    }

}
