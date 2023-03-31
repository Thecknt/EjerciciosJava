/*
 * Crea un vector llamado "Equipo" cuyda dimension sea la cantidad
 * de compañeros de equipo y define su tipo de dato de tal manera
 * que te permita alojar sus nombres mas adelante.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class equipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int numeroDeEquipo;
        System.out.print("ingresa la cantidad de integrantes del equipo:  ");
        numeroDeEquipo = leer.nextInt();

        String[] listaDeNombres = new String[numeroDeEquipo];

        int contador = 0;
        for (int i = 0; i < numeroDeEquipo; i++) {
            contador = contador + 1;
            System.out.println("ingresar el nombre de la persona numero " + contador);
            listaDeNombres[i] = leer.next();
        }

        for (int i = 0; i < numeroDeEquipo; i++) {

            System.out.println("Los nombres ingresados son " + listaDeNombres[i]);
        }
    }
     