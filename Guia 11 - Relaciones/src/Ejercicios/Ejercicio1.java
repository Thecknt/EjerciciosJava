/*
 Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package Ejercicios;

import Services.PersonaService;

public class Ejercicio1 {

    public static void main(String[] args) {
        PersonaService ps = new PersonaService();

        ps.crearUsuarios();
        ps.crearMascotas();
        ps.mostrarPersonaMascota();
    }

}
