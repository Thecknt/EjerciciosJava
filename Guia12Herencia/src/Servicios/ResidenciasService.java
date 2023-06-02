/*
 
 */
package Servicios;

import Entidades.Residencias;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ResidenciasService {

    Scanner input = new Scanner(System.in);

    List<Residencias> residencias = new ArrayList();
    Residencias residencia1, residencia2;

    public Residencias crearResidencia() {

        int cantidadHabitaciones = 30;
        String descuentosGremios = "si";
        String campoDeportivo = "si";
        String residenciaPrivada = "si";
        int cantidadMetros2 = 250;
        String nombre = "La Morenita";
        String direccion = "Carlos Casares 256";
        String localidad = "Tigre, Provincia de Buenos Aires";
        String gerente = "Carlos Aparicio";

        residencia1 = new Residencias(cantidadHabitaciones, descuentosGremios, campoDeportivo, residenciaPrivada, cantidadMetros2, nombre, direccion, localidad, gerente);
        residencias.add(residencia1);
        System.out.println(residencia1);

        return residencia1;
    }

    public Residencias crearResidenciaDinamica() {

        System.out.println("Ingrese la cantidad de Habitaciones que hay en la Residencia");
        int cantidadHabitaciones = input.nextInt();
        System.out.println("¿Posee descuentos para Gremios?");
        String descuentosGremios = input.next();
        System.out.println("¿Posee un campo Deportivo propio?");
        String campoDeportivo = input.next();
        System.out.println("¿Esta Residencia es privada? s/n");
        String residenciaPrivada = input.next();
        System.out.println("¿Cuantos Metros2 posee el predio?");
        int cantidadMetros2 = input.nextInt();
        System.out.println("Ingrese el nombre de La Residencia");
        String nombre = input.next();
        System.out.println("Ingrese la direccion de La Residencia");
        String direccion = input.next();
        System.out.println("¿En que localida se encuentra?");
        String localidad = input.nextLine();
        System.out.println("Ingrese el nombre del gerente/manager de La Residencia");
        String gerente = input.nextLine();

        residencia2 = new Residencias(cantidadHabitaciones, descuentosGremios, campoDeportivo, residenciaPrivada, cantidadMetros2, nombre, direccion, localidad, gerente);
        residencias.add(residencia2);
        return residencia2;
    }

    public void tieneDescuento() {
        String descuento;
        boolean vacio = residencias.isEmpty();
        if (vacio == true) {
            System.out.println("No hay descuentos en este momento");
        }
        for (Residencias aux : residencias) {
            descuento = aux.getDescuentosGremios();
            if (descuento.equalsIgnoreCase("si")) {
                //System.out.println("En este momento no poseemos descuentos");
                System.out.println("La Residencia " + aux.getNombre() + " tiene descuentos para Gremios");
            }
        }
    }
}
