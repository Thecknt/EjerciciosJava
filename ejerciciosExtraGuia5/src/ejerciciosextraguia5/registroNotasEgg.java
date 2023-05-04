/*
 * Los profesores del curso de programación de Egg 
 * necesitan llevar un registro de las notas adquiridas 
 * por sus 10 alumnos para luego obtener una cantidad de 
 * aprobados y desaprobados. Durante el período de cursado 
 * cada alumno obtiene 4 notas, 2 por trabajos prácticos 
 * evaluativos y 2 por parciales. Las ponderaciones de 
 * cada nota son:
 * Primer trabajo práctico evaluativo 10%
 * Segundo trabajo práctico evaluativo 15%
 * Primer Integrador 25%
 * Segundo integrador 50%
 * Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
 * Al final del programa los profesores necesitan obtener por pantalla la cantidad de 
 * aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos 
 * con promedio mayor o igual al 7 de sus notas del curso.
 */
package ejerciciosextraguia5;

import java.util.Scanner;

public class registroNotasEgg {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      double nota= 0;
      double promedio = 0;
      double arrayNotas[][]= new double[3][4];
      int aprobados = 0;
      int desaprobados = 0;
        for (int i = 0; i <3; i++) { //Se van a pedir 4 notas por cada alumno.
            System.out.println("Ingrese las notas para el Alumno " + (i+1) +":");
            for (int j = 0; j <4; j++) {
                System.out.println("Ingrese la nota del alumno " + (j+1)+":");
                nota=input.nextInt();
                //Ahora voy a validar la parte evaluativa
                 arrayNotas[i][j] = nota;
               
            }
        }
        System.out.print("Notas Ingresadas: ");
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <4; j++) { 
                System.out.print(arrayNotas[i][j] + " ");
            }
            System.out.println();
        }
        
      //Calcular el promedio y los aprobados y desaprobados  
        for (int i = 0; i <3; i++) {
            promedio = 0;
            for (int j = 0; j <4; j++) {
                promedio += arrayNotas[i][j];     
            }
            promedio /=4;
            if (promedio >=7){
            aprobados++;
           } else {
            desaprobados++;
            }
        }
        
        System.out.println("La cantidad de aprobados son: " + aprobados);
        System.out.println("La cantidad de desaprobados son: " + desaprobados);
    }
    }
    

