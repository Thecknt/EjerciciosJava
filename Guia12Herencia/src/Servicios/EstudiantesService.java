/*

 */
package Servicios;

import Entidades.Estudiantes;
import java.util.Scanner;

public class EstudiantesService {

    Scanner input = new Scanner(System.in).useDelimiter("\n");
    Estudiantes estudiante;
    String usuario;
    String password;

    public Estudiantes crearEstudiante() {
        System.out.println("Ingrese su Usuario y Contraseña, "
                + "\nen caso de que sea incorrecta se le sera solicitada nuevamente");
        do {
            System.out.println("Ingrese el nombre de Usuario");
            usuario = input.next();
            System.out.println("Ingrese la contraseña");
            password = input.next();
        } while (!usuario.equals("admin") || !password.equals("12345admin"));
        System.out.println("Bienvenido/a");
        estudiante = new Estudiantes();
        System.out.println("Ingrese el Nombre del estudiante.");
        estudiante.setNombre(input.next());
        System.out.println("ingrese el Apellido");
        estudiante.setApellido(input.next());
        System.out.println("Ingrese el numero de Identificacion del Estudiante");
        estudiante.setId(input.nextInt());
        System.out.println("¿Estado Civil del Estudiante? soltero/casado/otro");
        estudiante.setEstadoCivil(input.next());
        System.out.println("Ingrese el curso en el que se matriculara el Estudiante.");
        estudiante.setCurso(input.next());
        System.out.println(estudiante);
        return estudiante;
    }

    public void cambioDeCurso(Estudiantes estudiante) {
        System.out.println("Ingrese su Usuario y Contraseña, "
                + "\nen caso de que sea incorrecta se le sera solicitada nuevamente");
        do {
            System.out.println("Ingrese el nombre de Usuario");
            usuario = input.next();
            System.out.println("Ingrese la contraseña");
            password = input.next();
        } while (!usuario.equals("admin") || !password.equals("12345admin"));
        System.out.println("Bienvenido/a");
        System.out.println("Ingrese a que Curso se desea cambiar:");
        estudiante.setCurso(input.next());

        System.out.println("El Alumno " + estudiante.getNombre() + ", ha cambiado satisfactoriamente al Curso de " + estudiante.getCurso());
    }

    public void cambiarEstadoCivil(Estudiantes estudiante) {
        System.out.println("Ingrese su Usuario y Contraseña, "
                + "\nen caso de que sea incorrecta se le sera solicitada nuevamente");
        do {
            System.out.println("Ingrese el nombre de Usuario");
            usuario = input.next();
            System.out.println("Ingrese la contraseña");
            password = input.next();
        } while (!usuario.equals("admin") || !password.equals("12345admin"));
        System.out.println("Bienvenido/a");
        System.out.println("A que estado civil desea cambiar al alumno " + estudiante.getNombre());
        estudiante.setEstadoCivil(input.next());

        System.out.println("El estudiante " + estudiante.getNombre() + " fue modificado exitosamente a: estado civil " + estudiante.getEstadoCivil());
    }
}
