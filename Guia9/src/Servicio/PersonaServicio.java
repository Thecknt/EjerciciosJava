/*

Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.

Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.

Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.

Método mostrarPersona que muestra la información de la persona deseada.

 */
package Servicio;

import Entidades.Persona;

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class PersonaServicio {

    public Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {

        System.out.println("Ingrese su Nombre por favor");
        String nombre = input.nextLine();
        System.out.println("Ingrese su año de nacimiento:");
        int anio = input.nextInt();
        System.out.println("Ingrese su mes de nacimiento:");
        int mes = input.nextInt();
        System.out.println("Ingrese su dia de nacimiento:");
        int dia = input.nextInt();

        Date fechaNacimiento = new Date(anio - 1900, mes - 1, dia);

        Persona persona = new Persona(nombre, fechaNacimiento);
        return persona;
    }

    public void mostrarPersona(Persona persona) {
        System.out.println(persona.toString());
    }

    Date fechaActual = new Date();

    public Date fechaActual() {
        return fechaActual;
    }

    public long calcularEdad(Persona persona) {
        Date fechaA = new Date();
        long edad = Math.abs(fechaA.getTime() - persona.getFechaNacimiento().getTime());
        long diferencia = TimeUnit.DAYS.convert(edad, TimeUnit.MILLISECONDS) / 365;
        //diferencia /=365;
        return diferencia;
    }
    /*
    Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
     */
}
