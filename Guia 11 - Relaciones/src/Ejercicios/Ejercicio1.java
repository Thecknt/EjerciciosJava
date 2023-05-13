/*
 Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package Ejercicios;

import Entidades.Perro;
import Entidades.Persona;

public class Ejercicio1 {

    public static void main(String[] args) {

        Persona p1 = new Persona();
        Perro pe1 = new Perro();
        Persona p2 = new Persona();
        Perro pe2 = new Perro();

        p1.setNombre("Carlos");
        p1.setApellido("Mujica");
        p1.setEdad(35);
        p1.setDocumento(32845963);

        pe1.setNombre("Corchito");
        pe1.setEdad(2);
        pe1.setTamanio("Mediana");
        pe1.setRaza("Fox Terrier");

        p1.setPerro(pe1);
        System.out.println(p1);

        p2.setNombre("Damian");
        p2.setApellido("Valentin");
        p2.setEdad(18);
        p2.setDocumento(45855963);

        pe2.setNombre("Cody");
        pe2.setEdad(1);
        pe2.setTamanio("Mediana");
        pe2.setRaza("Border Collie");

        p2.setPerro(pe2);
        System.out.println(p2);
    }

}
