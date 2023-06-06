/*

 */
package Servicios;

import Entidades.PersonalDeServicio;
import java.util.Scanner;

public class PersonalService {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    PersonalDeServicio personal;
    String usuario;
    String password;

    public PersonalDeServicio crearEmpleadoDeServicio() {
        System.out.println("Ingrese su Usuario y Contraseña, "
                + "\nen caso de que sea incorrecta se le sera solicitada nuevamente");
        do {
            System.out.println("Ingrese el nombre de Usuario");
            usuario = input.next();
            System.out.println("Ingrese la contraseña");
            password = input.next();
        } while (!usuario.equals("admin") || !password.equals("12345admin"));
        System.out.println("Bienvenido/a");

        personal = new PersonalDeServicio();
        System.out.println("Ingrese el nombre");
        personal.setNombre(input.next());
        System.out.println("Ingrese el apellido");
        personal.setApellido(input.next());
        System.out.println("Ingrese el id asignado");
        personal.setId(input.nextInt());
        System.out.println("Ingrese el estado civil");
        personal.setEstadoCivil(input.next());
        personal.setAnioIncorporacion(2023);
        System.out.println("Ingrese la seccion que se le será asignado");
        personal.setSeccion(input.next());
        System.out.println("Ingrese el despacho, en caso de no ser docent, solamente ingrese 0");
        personal.setNumeroDespacho(input.nextInt());
        System.out.println(personal);
        return personal;
    }

    public void cambiarDeSeccion(PersonalDeServicio personal) {
        System.out.println("Ingrese su Usuario y Contraseña, "
                + "\nen caso de que sea incorrecta se le sera solicitada nuevamente");
        do {
            System.out.println("Ingrese el nombre de Usuario");
            usuario = input.next();
            System.out.println("Ingrese la contraseña");
            password = input.next();
        } while (!usuario.equals("admin") || !password.equals("12345admin"));
        System.out.println("Bienvenido/a");

        System.out.println("Ingrese a que seccion desea cambiar al empleado");
        personal.setSeccion(input.next());

        System.out.println(personal.getNombre() + " ha sido cambiado exitosamente a: " + personal.getSeccion());
    }

    public void cambiarEstadoCivil(PersonalDeServicio personal) {
        System.out.println("Ingrese su Usuario y Contraseña, "
                + "\nen caso de que sea incorrecta se le sera solicitada nuevamente");
        do {
            System.out.println("Ingrese el nombre de Usuario");
            usuario = input.next();
            System.out.println("Ingrese la contraseña");
            password = input.next();
        } while (!usuario.equals("admin") || !password.equals("12345admin"));
        System.out.println("Bienvenido/a");
        System.out.println("A que estado civil desea cambiar al alumno " + personal.getNombre());
        personal.setEstadoCivil(input.next());

        System.out.println("El estudiante " + personal.getNombre() + " fue modificado exitosamente a: estado civil " + personal.getEstadoCivil());
    }

    public void cambiarDeDespacho(PersonalDeServicio personal) {
        System.out.println("Ingrese su Usuario y Contraseña, "
                + "\nen caso de que sea incorrecta se le sera solicitada nuevamente");
        do {
            System.out.println("Ingrese el nombre de Usuario");
            usuario = input.next();
            System.out.println("Ingrese la contraseña");
            password = input.next();
        } while (!usuario.equals("admin") || !password.equals("12345admin"));
        System.out.println("Bienvenido/a");
        System.out.println("ingrese el nuevo despacho del personal");
        personal.setNumeroDespacho(input.nextInt());
        System.out.println("El nuevo Despacho asignado al personal " + personal.getNombre() + " es " + personal.getNumeroDespacho());

    }
}
