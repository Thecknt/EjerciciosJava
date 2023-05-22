/*
• Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como atributos,
un objeto Alumno que será el alumno que vota y una lista de los alumnos a los que votó.
 */
package Entidades;


import java.util.HashSet;
import java.util.Set;

public class Voto {
    Alumno alumno = new Alumno();
    Set<Alumno> votosRealizados = new HashSet<>();

}
