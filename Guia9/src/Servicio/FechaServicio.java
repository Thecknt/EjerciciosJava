/*
 Vamos a usar la clase Date que ya existe en Java. 

Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:

Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 

Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date.

Ejemplo fecha: Date fecha = new Date(anio, mes, dia);

Método fechaActual que cree un objeto fecha con el día actual. 

Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();

El método debe retornar el objeto Date.

Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).

Si necesiten acá tienen más información en clase Date: Documentacion Oracle
 */
package Servicio;


import java.util.Date;
import java.util.Scanner;

public class FechaServicio {

    Scanner input = new Scanner(System.in);

    Date fechaActual = new Date();

    public Date fechaActual() {
        return fechaActual;
    }

     int anio;
    public Date fechaNacimiento() {

        System.out.println("Ingrese su año de nacimiento: ");
        anio = input.nextInt();
        System.out.println("Ingrese su mes de nacimiento: ");
        int mes = input.nextInt();
        System.out.println("Ingrese su dia de nacimiento: ");
        int dia = input.nextInt();

        Date fecha = new Date(anio - 1900, mes - 1, dia);
        //Se le resta 1900 porque java posee un metodo absoleto, sino da mal el año, lo mismo con el mes.

    
        return fecha;

        //System.out.println("La fecha de nacimiento es: " + fecha);
    }

    public boolean diferencia(Date fechaActual, int anio) {
        return fechaActual.equals(anio);
    }

}
