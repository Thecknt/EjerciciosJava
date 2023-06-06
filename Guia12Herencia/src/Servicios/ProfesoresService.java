/*
 */
package Servicios;

import Entidades.Profesores;
import java.util.Scanner;

public class ProfesoresService {

    Scanner input = new Scanner(System.in).useDelimiter("\n");
    Profesores profesor;
    String usuario;
    String password;

    public Profesores crearProfesor() {
        System.out.println("Ingrese su Usuario y Contraseña, "
                + "\nen caso de que sea incorrecta se le sera solicitada nuevamente");
        do {
            System.out.println("Ingrese el nombre de Usuario");
            usuario = input.next();
            System.out.println("Ingrese la contraseña");
            password = input.next();
        } while (!usuario.equals("admin") || !password.equals("12345admin"));
        System.out.println("Bienvenido/a");
        profesor = new Profesores();
        System.out.println("Ingrese su nombre");
        profesor.setNombre(input.next());
        System.out.println("Ingrese su apellido");
        profesor.setApellido(input.next());
        System.out.println("Ingrese su numero de Id");
        profesor.setId(input.nextInt());
        System.out.println("ingrese su estado Civil");
        profesor.setEstadoCivil(input.next());
        System.out.println("Ingrese el Departamento al cual fue asignado");
        profesor.setDepartamento(input.next());
        profesor.setAnioIncorporacion(2023);
        System.out.println("Ingrese el numero de Despacho que le fue asignado");
        profesor.setNumeroDespacho(input.nextInt());
        System.out.println(profesor);
        return profesor;
    }

    public void cambiarDeDespacho(Profesores profesor) {
        System.out.println("Ingrese su Usuario y Contraseña, "
                + "\nen caso de que sea incorrecta se le sera solicitada nuevamente");
        do {
            System.out.println("Ingrese el nombre de Usuario");
            usuario = input.next();
            System.out.println("Ingrese la contraseña");
            password = input.next();
        } while (!usuario.equals("admin") || !password.equals("12345admin"));
        System.out.println("Bienvenido/a");
        System.out.println("ingrese el nuevo despacho del profesor");
        profesor.setNumeroDespacho(input.nextInt());
        System.out.println("El nuevo Despacho asignado al profesor " + profesor.getNombre() + " es " + profesor.getNumeroDespacho());

    }

    public void CambioDepartamento(Profesores profesor) {
        System.out.println("Ingrese su Usuario y Contraseña, "
                + "\nen caso de que sea incorrecta se le sera solicitada nuevamente");
        do {
            System.out.println("Ingrese el nombre de Usuario");
            usuario = input.next();
            System.out.println("Ingrese la contraseña");
            password = input.next();
        } while (!usuario.equals("admin") || !password.equals("12345admin"));
        System.out.println("Bienvenido/a");
        System.out.println("Ingrese el nuevo Departamento del Profesor " + profesor.getNombre());
        profesor.setDepartamento(input.next());

        System.out.println("El profesor " + profesor.getNombre() + " ha sido cambiado de despacho (" + profesor.getDepartamento() + ") exitosamente.");
    }

    public void cambiarEstadoCivil(Profesores profesor) {
        System.out.println("Ingrese su Usuario y Contraseña, "
                + "\nen caso de que sea incorrecta se le sera solicitada nuevamente");
        do {
            System.out.println("Ingrese el nombre de Usuario");
            usuario = input.next();
            System.out.println("Ingrese la contraseña");
            password = input.next();
        } while (!usuario.equals("admin") || !password.equals("12345admin"));
        System.out.println("Bienvenido/a");
        System.out.println("A que estado civil desea cambiar al alumno " + profesor.getNombre());
        profesor.setEstadoCivil(input.next());

        System.out.println("El estudiante " + profesor.getNombre() + " fue modificado exitosamente a: estado civil " + profesor.getEstadoCivil());
    }
}
