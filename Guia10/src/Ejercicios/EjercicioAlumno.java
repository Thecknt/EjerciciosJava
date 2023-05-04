/*

 */
package Ejercicios;

import Services.AlumnoService;
import java.util.Scanner;

public class EjercicioAlumno {

    public static void main(String[] args) {
       AlumnoService alu = new AlumnoService();
       Scanner input = new Scanner(System.in);
       alu.crearAlumno();
      System.out.println("Ingrese el nombre del alumno, que desee saber su nota:");
        
 alu.notaFinal(input.nextLine());
    }
    
}
