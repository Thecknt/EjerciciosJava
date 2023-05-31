/*
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el 
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso 
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre 
cuantas personas entrarían en un piso y cuantas en todo el edificio.
 */
package Servicios;

import Entidades.EdificioDeOficinas;
import java.util.Scanner;

public class EdificioDeOficinasService {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    EdificioDeOficinas edi;
    int ancho, largo, alto, oficinas,personas, totalPersonasPorPiso, totalPersonasEdificio;
   
    public EdificioDeOficinas crearEdificio(){
        edi = new EdificioDeOficinas();
        System.out.println("Vamos a Ingresar los datos de las oficinas para poder calcular las medidas");
        System.out.println("Ingrese el ancho del edificio: ");
        ancho = input.nextInt();
        edi.setAncho(ancho);
        System.out.println("Ingrese ahora el largo del edificio");
        largo = input.nextInt();
        edi.setLargo(largo);
        System.out.println("Cuantos mts mide cada piso?");
        alto = input.nextInt();
        edi.setAlto(alto);
        System.out.println("Ingrese el numero de pisos:"); // o me dice la cantidad de oficinas o la cantidad de pisos
        oficinas= input.nextInt();
        edi.setNumerosDeOficinas(oficinas);
        System.out.println("¿Cuantas personas entran en cada Oficina?");
        personas = input.nextInt();
        edi.setCantidadDePersonas(personas);
        edi = new EdificioDeOficinas(oficinas,personas,ancho,alto,largo);
        return edi;
    }
    
    public void cantPersonas(){
    totalPersonasPorPiso = edi.getCantidadDePersonas();
    totalPersonasEdificio = edi.getCantidadDePersonas() * edi.getNumerosDeOficinas();
    
        System.out.println("Las personas por piso, son: " +totalPersonasPorPiso+ " personas." +"\n"
                + "El total de personas en el edificio es de: "+ totalPersonasEdificio+" personas.");
    }
    
    public void calcularSuperficie() {
        System.out.println("La superfie del edificio de oficinas es: ");
        edi.calcularSuperficie();
    }
    
    public void calcularVolumen() {
        System.out.println("El volumen del edificio es: ");
        edi.calcularVolumen();
    }
}
