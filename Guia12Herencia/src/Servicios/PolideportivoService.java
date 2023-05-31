
package Servicios;

import Entidades.Polideportivo;
import java.util.Scanner;

public class PolideportivoService {

    Scanner input = new Scanner(System.in).useDelimiter("\n");
    Polideportivo poli;
    int anchoP;
    int largoP;
    int altoP;
    String tipoDeInstalacion;
    String nombre;

    public Polideportivo crearPolideportivo() {
        poli = new Polideportivo();
        System.out.println("Ingrese los siguientes datos:------->");
        System.out.println("Ingrese en mts el frente del edificio: ");
        anchoP = input.nextInt();
        poli.setAncho(anchoP);
        System.out.println("Ingrese ahora en mts el largo del edificio");
        largoP = input.nextInt();
        poli.setLargo(largoP);
        System.out.println("Cuantos mts mide cada piso?");
        altoP = input.nextInt();
        poli.setAlto(altoP);
        System.out.println("El Polideportivo es techado/abierto?");
        tipoDeInstalacion = input.next();
        poli.setTipoInstalacion(tipoDeInstalacion);
        System.out.println("Ingrese el nombre del Polideportivo: ");
        nombre = input.next();
        poli.setNombre(nombre);

        poli = new Polideportivo(nombre, tipoDeInstalacion, anchoP, largoP, altoP);

        return poli;
    }

    public void calcularSuperficie() {
        System.out.println("La superfie del Instituto " + poli.getNombre() + ", es: ");
        poli.calcularSuperficie();
    }

    public void calcularVolumen() {
        System.out.println("El volumen del Instituto " + poli.getNombre() + ", es: ");
        poli.calcularVolumen();

    }

}
