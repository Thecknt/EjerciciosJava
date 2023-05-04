/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedionotas;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class PromedioNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Alumno para calcular el promedio");
        String name;
        name = leer.next();
        System.out.println("Ingrese las 3 notas en orden, 2 parcial,1 final");
        int nota1;
        int nota2;
        int nFinal;
        nota1 = leer.nextInt();
        nota2 = leer.nextInt();
        nFinal = leer.nextInt();
        int promedio = (nota1 + nota2 + nFinal)/3;
        System.out.println("El promedio final del Alumno " + name + " es: " + promedio );
        
    }
    
}
