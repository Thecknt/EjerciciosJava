/*
. Una compañía de promociones turísticas desea mantener información sobre la infraestructura 
de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de 
acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección, 
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de 
alojamientos: Hoteles y Alojamientos Extrahoteleros. 
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de 
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las 
características de las distintas categorías son las siguientes: 
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio, 
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones. 
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio, 
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de 
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones. 
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de 
acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier 
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro 
será. 
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula: 
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor 
agregado por gimnasio) + (valor agregado por limosinas). 
Donde: 
Valor agregado por el restaurante: 
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas. 
• $50 si es mayor de 50. 
Valor agregado por el gimnasio: 
• $50 si el tipo del gimnasio es A. 
• $30 si el tipo del gimnasio es B. 
Valor agregado por las limosinas: 
• $15 por la cantidad de limosinas del hotel.
17
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los 
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada 
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros 
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las 
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños 
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se 
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no 
campo deportivo. Realizar un programa en el que se representen todas las relaciones 
descriptas. 
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios: 
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento. 
 */
package Principal;

import Entidades.Camping;
import Entidades.Hotel4Estrellas;
import Entidades.Hotel5Estrellas;
import Entidades.Hoteles;
import Entidades.Residencias;
import Servicios.CampingService;
import Servicios.Hotel4EstrellasService;
import Servicios.Hotel5EstrellasService;
import Servicios.ResidenciasService;
import Util.CompararPorPrecio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3ExtraHerenciaHoteles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        List<Camping> campings= new ArrayList();;
        Camping camping = new Camping();
        List<Hoteles> hoteles = new ArrayList();
        List<Residencias> residencias = new ArrayList();
        Hotel4EstrellasService h4 = new Hotel4EstrellasService();
        Hotel4Estrellas cuatro = new Hotel4Estrellas();
        Hotel5EstrellasService h5 = new Hotel5EstrellasService();
        Hotel5Estrellas cinco = new Hotel5Estrellas();
        ResidenciasService rs = new ResidenciasService();
        CampingService cs = new CampingService();
        Residencias resi = new Residencias();
        String respuesta;
        int seleccion;
        Collections.sort(hoteles, new CompararPorPrecio());
        Hoteles hotelMasCaro = null;

        int opcion = 0;
        do {
            System.out.println("*********************************************************************************************");
            System.out.println("*             Bienvenido al Sistema de Reservas Numero 1 en EGG                             *");
            System.out.println("*         <-Seleccione del menu, las diferentes opciones de estadia --->                    *");
            System.out.println("*  1) Viva unas miticas vacaciones                                   --->Hotel de Lujo***** *");
            System.out.println("*  2) Viva un tour exquisito por nuestra Avenida mas tradicional     --->Hotel****          *");
            System.out.println("*  3) ¿Desea alojarse en un lugar pensado para la familia?           --->Residencias        *");
            System.out.println("*  4) ¿Queres estar en contacto con nuestra Naturaleza?              --->Campings           *");
            System.out.println("*  5) ¿Queres consultar por descuentos?                              --->Descuentos         *");
            System.out.println("*  6) Proveedores                                                                           *");
            System.out.println("*  7) Indicar cual es la propuesta mas exclusiva                                            *");
            System.out.println("*  8) Mostrar todos los Hoteles                                                             *");
            System.out.println("*  9) Mostrar todas los Residencias                                                         *");
            System.out.println("* 10) Mostrar todos los Campings                                                            *");
            System.out.println("* 11) Salir                                                                                 *");
            System.out.println("*********************************************************************************************");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    cinco = h5.crearHotel5();
                    h5.calcularPrecio(cinco);
                    hoteles.add(cinco); // Agregar el hotel a la lista
                    hotelMasCaro = Collections.max(hoteles, new CompararPorPrecio()); // Actualizar hotelMasCaro
                    System.out.println("volviendo al menu principal...");
                    System.out.println(" ");
                    break;
                case 2:
                    cuatro = h4.crearHotel4();
                    h4.calcularPrecio(cuatro);
                    hoteles.add(cuatro); // Agregar el hotel a la lista
                    hotelMasCaro = Collections.max(hoteles, new CompararPorPrecio()); // Actualizar hotelMasCaro
                    System.out.println("volviendo al menu principal...");
                    System.out.println(" ");
                    break;
                case 3:
                    resi = rs.crearResidencia();
                    residencias.add(resi);
                    System.out.println("volviendo al menu principal...");
                    System.out.println(" ");
                    break;
                case 4:
                    camping = cs.crearCamping();
                    campings.add(camping);
                    System.out.println("¿Desea saber que campings tienen restaurantes propios?");
                    System.out.println("Presione 1, de lo contrario presione 2");
                    seleccion = input.nextInt();
                    if (seleccion == 1) {
                        cs.tieneRestaurante();
                    }
                    System.out.println("volviendo al menu principal...");
                    System.out.println(" ");
                    break;
                case 5:
                    System.out.println("Desea conocer que Residencia tiene descuentos?");
                    System.out.println("¿Estas interesado/a? s/n");
                    respuesta = input.next();
                    if (respuesta.equalsIgnoreCase("s")) {
                        rs.tieneDescuento();
                        System.out.println("volviendo al menu principal...");
                        System.out.println(" ");
                    } else {
                        System.out.println("Lamentamos que en este caso no haya sido de tu agrado... :(");
                        System.out.println("Seguimos trabajando para brindarte los mejores descuentos!");
                        System.out.println("volviendo al menu principal...");
                        System.out.println(" ");
                    }
                    break;
                case 6:
                    System.out.println("En este sector vamos a crear Hoteles, campings y residencias");
                    System.out.println("Selecciona la opcion deseada:         --->");
                    int eleccion = 0;
                    do {
                        System.out.println("----------------------------------------------------------");
                        System.out.println("| 1) ¿Desea crear dinamicamente un Hotel 5*?             |");
                        System.out.println("| 2) ¿Desea crear dinamicamenre un Hotel 4*?             |");
                        System.out.println("| 3) ¿Desea crear dinamicamente un Residencia?           |");
                        System.out.println("| 4) ¿Desea crear dinamicamentre un camping?             |");
                        System.out.println("| 5) volver al menu principal                      ----->|");
                        System.out.println("----------------------------------------------------------");
                        eleccion = input.nextInt();
                        switch (eleccion) {
                            case 1:
                                cinco = h5.crearHotel5Dinamico();
                                hoteles.add(cinco); // Agregar el hotel a la lista
                                hotelMasCaro = Collections.max(hoteles, new CompararPorPrecio()); // Actualizar hotelMasCaro
                                System.out.println("volviendo al menu principal...");
                                break;
                            case 2:
                                cuatro = h4.crearHotel4Dinamico();
                                hoteles.add(cuatro); // Agregar el hotel a la lista
                                hotelMasCaro = Collections.max(hoteles, new CompararPorPrecio()); // Actualizar hotelMasCaro
                                System.out.println(" ");
                                System.out.println("Volviendo al menu Anterior");
                                System.out.println(" ");
                                hotelMasCaro = hoteles.get(hoteles.size() - 1);
                                break;
                            case 3:
                                resi =rs.crearResidenciaDinamica();
                                residencias.add(resi);
                                System.out.println("volviendo al menu principal...");
                                break;
                            case 4:
                                camping =  cs.crearCampingDinamico();
                                campings.add(camping);
                                System.out.println(" ");
                                System.out.println("Volviendo al menu Anterior");
                                System.out.println(" ");
                                break;
                            case 5: 
                                System.out.println(" ");
                                System.out.println("Volviendo al menu Anterior");
                                System.out.println(" ");
                                break;
                            default:
                                System.out.println("Opcion incorrecta");
                                System.out.println("volviendo al menu principal...");
                                break;
                        }
                        hotelMasCaro = hoteles.get(hoteles.size() - 1);

                    } while (eleccion != 5);

                    break;
                case 7:
                    if (hotelMasCaro != null) {
                        System.out.println("El Hotel mas caro es: " + hotelMasCaro.getNombre() + " Sus habitaciones tienen un valor de: $"+ hotelMasCaro.getPrecioHabitacion());
                    } else {
                        System.out.println("No hay hoteles disponibles");
                    }
                    System.out.println("volviendo al menu principal...");
                    break;
                case 8:
                    if (hoteles.isEmpty()) {
                        System.out.println("En este momento el sistema no puede mostrar los Hoteles disponibles.");
                    } else { 
                        System.out.println("Eston son nuestros Hoteles:" + "\n");
                    for (Hoteles arg : hoteles) {
                        System.out.println( arg);
                    }}
                   
                    System.out.println(" ");
                    System.out.println("volviendo al menu principal...");
                    System.out.println(" ");
                    break;
                case 9:
                    if (residencias.isEmpty()) {
                        System.out.println("En este momento el sistema no puede mostrar las Residencias disponibles.");
                    }
                    for (Residencias arg : residencias) {
                        System.out.println(arg);
                    }
                    System.out.println(" ");
                    System.out.println("volviendo al menu principal...");
                    System.out.println(" ");
                    break;
                case 10:
                    if (campings.isEmpty()) {
                        System.out.println("En este momento el sistema no puede mostrar los Campings disponibles.");
                    }
                    for (Camping arg : campings) {
                        System.out.println(arg);
                    }
                    System.out.println(" ");
                    System.out.println("volviendo al menu principal...");
                    System.out.println(" ");
                    break;
                case 11:
                    System.out.println("Te esperamos nuevamente!");
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion incorrecta, elija nuevamente");
                    break;

            }
        } while (opcion != 11);

    }

}
