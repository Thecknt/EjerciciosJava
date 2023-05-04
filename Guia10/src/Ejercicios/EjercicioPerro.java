/*
 
 */
package Ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class EjercicioPerro {

    public static void main(String[] args) {
        ArrayList<String> razas = new ArrayList();
        Scanner input = new Scanner(System.in);
        int contador = 1;
        String raza;
        String opcion;
        for (int i = 0; i < contador; i++) {
            System.out.println("Ingrese Una raza: ");
            raza = input.nextLine();
            razas.add(raza);
            
            System.out.println("¿desea ingresar otra raza?");
            opcion = input.nextLine();
            if (opcion.equalsIgnoreCase("s")) {
                contador++;
            } else {
                break;
            }
        }
System.out.println("Elija una raza: ");
        for (String aux : razas) {
            System.out.println(aux);
        }
        
        String eliminarRaza = input.nextLine();
        Iterator <String> itera = razas.iterator();
        while(itera.hasNext()) {
        String aux = itera.next();
            if (aux.equalsIgnoreCase(eliminarRaza)) {
                itera.remove();
            }
        }
        Collections.sort(razas);
        
        for (String aux: razas) {
            System.out.println(aux);
        }
    }

}
