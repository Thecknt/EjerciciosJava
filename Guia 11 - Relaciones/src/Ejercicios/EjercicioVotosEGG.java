/*
 
 */
package Ejercicios;

import Entidades.Alumno;
import Services.SimuladorService;
import java.util.List;

public class EjercicioVotosEGG {

    public static void main(String[] args) {

        SimuladorService as = new SimuladorService();
        System.out.println("************************************************");
        System.out.println("*   Bienvenido al sistema de Votos de EGG      *");
        System.out.println("************************************************");
        System.out.println("*                                              *");
        System.out.println("*                                              *");
        System.out.println("************************************************");
        as.consultaCantAlumnos();
        List<Alumno> alumnos;
        alumnos = as.getAlumnos();
        as.mostrarAlumnos();
        if (!alumnos.isEmpty()) {
            as.votacion(alumnos);
            System.out.println("***************************************");
            System.out.println("Mostrando el resultado de la votación:");
            as.mostrarResultados(alumnos);
        } else {
            System.out.println("No hay alumnos para realizar la votación.");
        }
       System.out.println("*****************************************************************************");
        System.out.println("              votos Ordenados            ");
        System.out.println("         -------------------------          ");
        System.out.println("Los Primeros 5 Alumnos seran los nuevos facilitadores en EGG");
        System.out.println("Los siguientes 5 de la lista quedaran como suplentes, ante cualquier enventualidad");
        System.out.println("****************************************************************************");
        as.recuentoDeVotos(alumnos);
    }

}
