/*

 */
package Servicios;

import Entidades.Hotel5Estrellas;
import Entidades.Hoteles;
import Util.CompararPorPrecio;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel5EstrellasService extends CompararPorPrecio{
Scanner input = new Scanner(System.in).useDelimiter("\n");
List<Hoteles> hoteles= new ArrayList();
        
    Hotel5Estrellas cinco;
    Hotel5Estrellas cinco1;

    public Hotel5Estrellas crearHotel5() {
        cinco = new Hotel5Estrellas();

        String nombreHotel = "Hotel Alvear Premium";
        cinco.setNombre(nombreHotel);
        String direccionHotel = "Av Huergo 2500";
        cinco.setDireccion(direccionHotel);
        String localidad = "Ciudad Autonoma de Buenos Aires";
        cinco.setLocalidad(localidad);
        String gerente = "Fernando Alonso";
        cinco.setGerente(gerente);
        int cantidadhabitaciones = 250;
        cinco.setCantHabitaciones(cantidadhabitaciones);
        int cantidadCamas = 480;
        cinco.setNumeroDeCamas(cantidadCamas);
        int capacidadRestaurant = 2000;
        cinco.setCapacidadRestaurant(capacidadRestaurant);
        int cantidadPisos = 15;
        cinco.setCantidadPisos(cantidadPisos);
        int cantidadSuites = 50;
        cinco.setCantidadSuites(cantidadSuites);
        int cantidadLimosinas = 15;
        cinco.setCantidadLimosinas(cantidadLimosinas);
        Double precioHabitacion = 25000.00;

        cinco.setPrecioHabitacion(precioHabitacion);
        String nombreRestaurant = "Gran Alvear";
        cinco.setNombreRestaurant(nombreRestaurant);

        char gimnasio = 'A';
        cinco.setGimnasio(gimnasio);
        int cantidadSalonesConferencia = 10;
        cinco.setCantidadSalonesConferencia(cantidadSalonesConferencia);

        //cinco = new Hotel5Estrellas(cantidadSalonesConferencia, cantidadSuites, cantidadLimosinas, gimnasio, nombreRestaurant, capacidadRestaurant, cantidadhabitaciones, cantidadCamas, cantidadPisos, precioHabitacion, nombreHotel, direccionHotel, localidad, gerente);
        hoteles.add(cinco);
        System.out.println(cinco);
        return cinco;
    }

    public void calcularPrecio(Hotel5Estrellas cinco) {
        Double precio = cinco.getPrecioHabitacion();
        Double precioFinal = null;
        int cantidadLimosinas = cinco.getCantidadLimosinas();
        if (cinco.getCapacidadRestaurant() < 30) {
            precioFinal = precio + 10.00 + 50.00 + cantidadLimosinas * 15.00;
            cinco.setPrecioHabitacion(precioFinal);

        } else if (cinco.getCapacidadRestaurant() >= 30 && cinco.getCapacidadRestaurant() <= 50) {
            precioFinal = precio + 30.00 + 50.00 + cantidadLimosinas * 15.00;
            cinco.setPrecioHabitacion(precioFinal);
        } else if (cinco.getCapacidadRestaurant() > 50) {
            precioFinal = precio + 50.00 + 50.00 + cantidadLimosinas * 15.00;
            cinco.setPrecioHabitacion(precioFinal);
        }
        System.out.println("*) El valor de la habitacion por noche es: $" + precioFinal
                + "\n*************************************************************************************");
    }

     public Hotel5Estrellas crearHotel5Dinamico(){
        cinco1 = new Hotel5Estrellas();
        System.out.println("Ingrese el nombre del Hotel*****");
        String nombreHotel = input.next();
        cinco1.setNombre(nombreHotel);
        System.out.println("Ingrese la direccion del Hotel");
        String direccionHotel = input.next();
        cinco1.setDireccion(direccionHotel);
        System.out.println("Ingrese la localidad");
        String localidad = input.next();
        cinco1.setLocalidad(localidad);
        System.out.println("Ingrese el nombre del/la Gerente responsable");
        String gerente = input.next();
        cinco1.setGerente(gerente);
        System.out.println("Ingrese la cantidad de habitaciones");
        int cantidadhabitaciones = input.nextInt();
        cinco1.setCantHabitaciones(cantidadhabitaciones);
        System.out.println("Ingrese el numero de camas totales");
        int cantidadCamas = input.nextInt();
        cinco1.setNumeroDeCamas(cantidadCamas);
       System.out.println("Ingrese el numero total de pisos");
        int cantidadPisos = input.nextInt();
        cinco1.setCantidadPisos(cantidadPisos);
        System.out.println("Ingrese el precio de la habitacion por noche:");
        System.out.println("Puede tomar como parametro la tarifa base de $50.00");
        Double precioHabitacion = input.nextDouble();
        cinco1.setPrecioHabitacion(precioHabitacion);
        System.out.println("Ingrese el nombre del Restaurant");
        String nombreRestaurant = input.next();
        cinco1.setNombreRestaurant(nombreRestaurant);
        char gimnasio = 'A';
        cinco1.setGimnasio(gimnasio);
        System.out.println("¿Que capacidad tendra el restaurant?");
        int capacidadRestaurant =input.nextInt();
         System.out.println("¿Cuantas Suites tendra?");
        int cantidadSuites =input.nextInt();
        cinco1.setCantidadSuites(cantidadSuites);
         System.out.println("¿Cuantas Limosinas se compraran?");
        int cantidadLimosinas =input.nextInt();
        cinco1.setCantidadLimosinas(cantidadLimosinas);
        cinco1.setCapacidadRestaurant(capacidadRestaurant);
         System.out.println("Cuantos salones para conferencia se haran?");
         int cantidadSalonesConferencia = input.nextInt();
        cinco1.setCantidadSalonesConferencia(cantidadSalonesConferencia);
        //cinco1 = new Hotel5Estrellas(cantidadSalonesConferencia, cantidadSuites, cantidadLimosinas, gimnasio, nombreRestaurant, capacidadRestaurant, cantidadhabitaciones, cantidadCamas, cantidadPisos, precioHabitacion, nombreHotel, direccionHotel, localidad, gerente);
        hoteles.add(cinco1);
        System.out.println("Nuestros Hoteles cuentan con las mejores Opciones de disponibilidad y servicio.");
        System.out.println("Les comentamos nuestras instalaciones y precios");
        System.out.println(cinco1);
        return cinco1;
    }
    

    @Override
    public int compare(Hoteles t, Hoteles t1) {
        
        boolean vacio = hoteles.isEmpty();
         if (vacio == true) {
             System.out.println("En este momento, no tenemos precios disponibles");
         }
         for (Hoteles aux : hoteles) {
             System.out.println("El hotel mas caro es: "+super.compare(t, t1)+aux.getNombre()+" $"+aux.getPrecioHabitacion());
        }
        return super.compare(t, t1);
    }
}
