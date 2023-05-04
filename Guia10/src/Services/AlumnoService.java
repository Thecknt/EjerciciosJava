/*

 */
package Services;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {

    private ArrayList<Alumno> listaAlumno = new ArrayList<>();
    private Scanner input = new Scanner(System.in);


    public void crearAlumno() {
        String opcion;
        String nombre;
        ArrayList<Integer> notas = new ArrayList();
        do {
            System.out.println("Ingrese el nombre del alumno: ");
            nombre = input.nextLine();

            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota: " + (i + 1) + ": ");
                notas.add(input.nextInt());
                input.nextLine();
            }
            System.out.println("¿Desea ingresar otro Alumno?");
            opcion = input.next();
        } while (!opcion.equalsIgnoreCase("n"));

        Alumno alumno = new Alumno(nombre, notas);

        listaAlumno.add(alumno);
       

        for (Integer nota : notas) {
            System.out.println(nota);
        }
    }

    public void notaFinal(String alumno) {
        double notaFinal = 0.0;
        int sumaNotas = 0;
        for (Alumno alumno1 : listaAlumno) {
            if (alumno1.getNombre().equalsIgnoreCase(alumno)) {
                ArrayList<Integer> notas = alumno1.getNotas();

                for (int i = 0; i < notas.size(); i++) {
                    sumaNotas += notas.get(i);
                }
                notaFinal = sumaNotas / 3;
            }
        }
        if (listaAlumno.equals(alumno)) {
            System.out.println(sumaNotas);
            System.out.println(notaFinal);
        } else {
            System.out.println("el alumno ingresado no se encuentra en la lista");
        }
    }
}

