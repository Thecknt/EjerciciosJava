/*

 */
package Services;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class SimuladorService {

    List<String> apellidos = new ArrayList(Arrays.asList("Lopez", "Candia", "Moreira", "gonzalez", "Gago", "Rodriguez", "Castro",
            "Fernandez", "Gomez", "Diaz", "Gimenez", "Sanchez", "Romero", "Suarez", "sosa"));

    List<String> nombres = new ArrayList(Arrays.asList("Carla", "Lorena", "Hector", "Marisa", "Francisco", "Jorge", "Rodrigo",
            "Julio", "Claudia", "Nestor", "Julia", "Juan", "Miguel", "Marta", "Pedro"));

    List<Alumno> alumnos;
    Alumno alumno;

    Scanner input = new Scanner(System.in);

    int consultaAlumnos;

    Integer DNI;

    Random random = new Random();

    public void crearAlumno() {

        Collections.shuffle(apellidos);
        Collections.shuffle(nombres);
        alumnos = new ArrayList();
        // Integer voto = null;
        Integer aleatorioDni;
        int cantidadDeAlumnos = Math.min(nombres.size(), apellidos.size()); // se utiliza para determinar cuál es el número máximo de alumnos que se pueden crear, 
        // basandose en el tamaño de las listas de nombres y apellidos.
        // ya que no se pueden crear más alumnos de los que haya en la lista con menos elementos, en este caso son iguales, el resultado seria 15 el max de alumnos que se puede crear.
        // int cantidadDeseada = Math.min(cantidadDeAlumnos, consultaAlumnos);
        for (int i = 0; i < cantidadDeAlumnos; i++) {
            if (i < consultaAlumnos) {
                String nombre = nombres.get(i);
                String apellido = apellidos.get(i);
                aleatorioDni = generarDNI();
                alumno = new Alumno(nombre, apellido, aleatorioDni, 0);
                alumnos.add(alumno);
            }
        }
    }

    public int generarDNI() {

        DNI = random.nextInt(90000000) + 10000000; // Genero un numero random de hasta 8 cifras.
        return DNI;
    }

    public void consultaCantAlumnos() {
        System.out.println("¿Cuantos alumnos desea generar?");
        consultaAlumnos = input.nextInt();
        if (consultaAlumnos <= 0 || consultaAlumnos > 15) {
            System.out.println("Ingrese otro valor, debe ser entre 1 y 15");
        } else {
            System.out.println("creando alumnos...");
            crearAlumno();
            votacion(alumnos);
        }
    }

    public void mostrarAlumnos() {
        for (Alumno aux : alumnos) {
            System.out.println(aux);
        }
    }
    Set<Alumno> votosRealizados;

    public List<Alumno> votacion(List<Alumno> alumnos) {

        for (Alumno aux : alumnos) {
            votosRealizados = new HashSet();

            for (int i = 0; i < 3; i++) {
                Alumno alumnoVotado;

                do {
                    int indiceAleatorio = random.nextInt(alumnos.size());
                    alumnoVotado = alumnos.get(indiceAleatorio);
                } while (alumnoVotado.equals(aux) || votosRealizados.contains(alumnoVotado));

                votosRealizados.add(alumnoVotado);
                alumnoVotado.aumentarVotos();
            }
        }

        return alumnos;
    }

    public void mostrarResultados(List<Alumno> alumnos) {
        for (Alumno aux : alumnos) {
            System.out.println("Alumno: " + aux.getNombre() + ", Votos: " + aux.getVotos());
        }
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void recuentoDeVotos(List<Alumno> alumnos) {
        Collections.sort(alumnos, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno a1, Alumno a2) {
                return Integer.compare(a2.getVotos(), a1.getVotos()); // Orden descendente
            }
        });

        for (Alumno aux : alumnos) {
            System.out.println(aux.getNombre() + ": " + aux.getVotos());
        }
    }

}
