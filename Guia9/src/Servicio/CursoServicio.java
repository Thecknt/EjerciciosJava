/*
 Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases. 

Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el nombre de cada alumno.

Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Curso. 

En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos

Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. 

Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.
 */
package Servicio;

import Entidades.Curso;
import java.util.Scanner;

public class CursoServicio {

    public Scanner input = new Scanner(System.in);

    public void cargarAlumnos(Curso curso) {
        String nombre;
        String[] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese el nombre del Alumno: " + (i + 1));
            nombre = input.next();
            array[i] = nombre;

            curso.setAlumnos(array);
        }
    }

    public void crearCurso(Curso curso) {
        System.out.println("Ingrese el nombre del curso: ");
        curso.setNombreCurso(input.next());
        System.out.println("Ingrese la cantidad de hs por dia: ");
        curso.setCantidadHorasPorDia(input.nextInt());
        System.out.println("Ahora la cantidad de hs, por semana: ");
        curso.setCantidadDiasPorSemana(input.nextInt());
        System.out.println("Ingrese el turno: (mañana/tarde)");
        curso.setTurno(input.next());
        System.out.println("Ingrese el Precio por Hora: ");
        curso.setPrecioPorHora(input.nextDouble());
        cargarAlumnos(curso);
    }

    public double calcularGananciaSemanal(Curso curso) {
        double ganancia = curso.getCantidadHorasPorDia() * curso.getPrecioPorHora() * curso.getCantidadDiasPorSemana() * 5;
        return ganancia;
    }

}
