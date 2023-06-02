/*

 */
package Servicios;

import Entidades.Camping;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CampingService {

    Scanner input = new Scanner(System.in);

    Camping camping;
    Camping camping2;
    
    List<Camping>campings = new ArrayList();
    
    public Camping crearCamping() {
        
        int capacidadMaximaCarpas = 40;
        int cantidadBanios = 20;
        String restaurantCamping = "si";
        String campingPrivado = "si";
        int cantidadMetros2 = 300;
        String nombre = "La promesa";
        String direccion = "Calle Falsa 624";
        String localidad = "Vicente Lopez, Buenos Aires";
        String gerente = "Carlos Valdez";
        //public Camping(int capacidadMaximaCarpas, int cantidadBanios, String restaurantCamping, String privado, int cantidadMetros2, String nombre, String direccion, String localidad, String gerente) {
        //   super(privado, cantidadMetros2, nombre, direccion, localidad, gerente);
        camping = new Camping(capacidadMaximaCarpas,cantidadBanios,restaurantCamping,campingPrivado,cantidadMetros2,nombre,direccion,localidad,gerente);
        campings.add(camping);
        System.out.println(camping);
        return camping;
    }
    
    public Camping crearCampingDinamico(){
        
        System.out.println("Ingrese la cantidad maxima de carpas");
        int capacidadMaximaCarpas= input.nextInt();
        System.out.println("¿cuantos baños desea crear?");
        int cantidadBanios =input.nextInt();
        System.out.println("¿Poseera un Restaurante propio?");
        String restaurantCamping= input.next();
        System.out.println("¿Este camping sera de acceso solo para socios? s/n");
        String campingPrivado=input.next();
        System.out.println("¿Cuantos Metros2 posee el predio?");
        int cantidadMetros2 = input.nextInt();
        System.out.println("Ingrese el nombre del Camping");
        String nombre=input.next();
        System.out.println("Ingrese la direccion del Camping");
        String direccion = input.next();
        System.out.println("¿En que localida se encontrara?");
        String localidad =input.nextLine();
        System.out.println("Ingrese el nombre del gerente/manager del Camping");
        String gerente=input.nextLine();
        
        camping2 = new Camping(capacidadMaximaCarpas,cantidadBanios,restaurantCamping,campingPrivado,cantidadMetros2,nombre,direccion,localidad,gerente);
        campings.add(camping2);
        return camping2;
    }
    
    public void tieneRestaurante(){
       String restaurant;
   
        for (Camping camp : campings) {
             restaurant = camp.getRestaurantCamping();
            if (restaurant.equalsIgnoreCase("si")) {
                System.out.println("El camping "+ camp.getNombre()+" tiene Restaurante dentro de sus instalaciones");
            } else {
                System.out.println("El camping "+camp.getNombre()+", no tiene Restaurante dentro de sus instalaciones");
            }
    
        }
    }
}
