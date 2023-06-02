/*
. Realizar un programa en el que se representen todas las relaciones 
descriptas. 
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios: 
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
 */
package Servicios;

import Entidades.Hotel4Estrellas;
import Entidades.Hoteles;
import Util.CompararPorPrecio;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel4EstrellasService extends CompararPorPrecio{
Scanner input = new Scanner(System.in);
   List<Hoteles> hoteles= new ArrayList();
    Hotel4Estrellas cuatro;
    Hotel4Estrellas cuatro1;

    public Hotel4Estrellas crearHotel4() {
        cuatro = new Hotel4Estrellas();
        String nombreHotel = "Hotel El Salvador";
        cuatro.setNombre(nombreHotel);
        String direccionHotel = "Av Corrientes 3800";
        cuatro.setDireccion(direccionHotel);
        String localidad = "Ciudad Autonoma de Buenos Aires";
        cuatro.setLocalidad(localidad);
        String gerente = "Ricardo Lopez";
        int cantidadhabitaciones = 50;
        cuatro.setCantHabitaciones(cantidadhabitaciones);
        int cantidadCamas = 80;
        cuatro.setNumeroDeCamas(cantidadCamas);
        int cantidadPisos = 10;
        cuatro.setCantidadPisos(cantidadPisos);
        Double precioHabitacion = 10500.00;
        cuatro.setPrecioHabitacion(precioHabitacion);
        String nombreRestaurant = "Don Carlos 4to";
        cuatro.setNombreRestaurant(nombreRestaurant);
        char gimnasio = 'B';
        cuatro.setGimnasio(gimnasio);
        int capacidadRestaurant = 50;
        cuatro.setCapacidadRestaurant(capacidadRestaurant);
        cuatro = new Hotel4Estrellas(gimnasio, nombreRestaurant, capacidadRestaurant, cantidadhabitaciones, cantidadCamas, cantidadPisos, precioHabitacion, nombreHotel, direccionHotel, localidad, gerente);
        System.out.println("Nuestros Hoteles cuentan con las mejores Opciones de disponibilidad y servicio.");
        System.out.println("Les comentamos nuestras instalaciones y precios");
        System.out.println(cuatro);
        hoteles.add(cuatro);
        return cuatro;
    }

    public void calcularPrecio(Hotel4Estrellas cuatro) {
        Double precio = cuatro.getPrecioHabitacion();
        Double precioFinal = null;
//int cantidadLimosinas = cuatro.getCantidadLimosinas();
        if (cuatro.getCapacidadRestaurant() < 30) {
            precioFinal = precio + 10.00 + 30.00;
            cuatro.setPrecioHabitacion(precioFinal);

        } else if (cuatro.getCapacidadRestaurant() >= 30 && cuatro.getCapacidadRestaurant() <= 50) {
            precioFinal = precio + 30.00 + 30.00;
            cuatro.setPrecioHabitacion(precioFinal);
        } else if (cuatro.getCapacidadRestaurant() > 50) {
            precioFinal = precio + 50.00 + 30.00;
            cuatro.setPrecioHabitacion(precioFinal);
        }
        System.out.println("*) El valor de la habitacion por noche es: $" + precioFinal +
                "\n*************************************************************************************");
    }
    
    public Hotel4Estrellas crearHotel4Dinamico(){
        
        System.out.println("Ingrese el nombre del Hotel****");
        String nombreHotel = input.nextLine();
        cuatro1.setNombre(nombreHotel);
        System.out.println("Ingrese la direccion del Hotel");
        String direccionHotel = input.nextLine();
        cuatro1.setDireccion(direccionHotel);
        System.out.println("Ingrese la localidad");
        String localidad = input.nextLine();
        cuatro1.setLocalidad(localidad);
        System.out.println("Ingrese el nombre del/la Gerente responsable");
        String gerente = input.nextLine();
        System.out.println("Ingrese la cantidad de habitaciones");
        int cantidadhabitaciones = input.nextInt();
        cuatro1.setCantHabitaciones(cantidadhabitaciones);
        System.out.println("Ingrese el numero de camas totales");
        int cantidadCamas = input.nextInt();
        cuatro1.setNumeroDeCamas(cantidadCamas);
       System.out.println("Ingrese el numero total de pisos");
        int cantidadPisos = input.nextInt();
        cuatro1.setCantidadPisos(cantidadPisos);
        System.out.println("Ingrese el precio de la habitacion por noche:");
        System.out.println("Puede tomar como parametro la tarifa base de $50.00");
        Double precioHabitacion = input.nextDouble();
        cuatro1.setPrecioHabitacion(precioHabitacion);
        System.out.println("Ingrese el nombre del Restaurant");
        String nombreRestaurant = input.nextLine();
        cuatro1.setNombreRestaurant(nombreRestaurant);
        char gimnasio = 'B';
        cuatro1.setGimnasio(gimnasio);
        System.out.println("¿Que capacidad tendra el restaurant?");
        int capacidadRestaurant =input.nextInt();
        cuatro1.setCapacidadRestaurant(capacidadRestaurant);
        cuatro1 = new Hotel4Estrellas(gimnasio, nombreRestaurant, capacidadRestaurant, cantidadhabitaciones, cantidadCamas, cantidadPisos, precioHabitacion, nombreHotel, direccionHotel, localidad, gerente);
        System.out.println("Nuestros Hoteles cuentan con las mejores Opciones de disponibilidad y servicio.");
        System.out.println("Les comentamos nuestras instalaciones y precios");
        System.out.println(cuatro1);
        hoteles.add(cuatro1);
        return cuatro1;
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

/*
char gimnasio, String nombreRestaurant, int capacidadRestaurant, int cantHabitaciones, int numeroDeCamas, int cantidadPisos, Double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, numeroDeCamas, cantidadPisos, precioHabitacion, nombre, direccion, localidad, gerente);
*/
