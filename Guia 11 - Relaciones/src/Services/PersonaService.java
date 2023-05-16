/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package Services;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonaService {
    
    Perro perro = new Perro();
    List<Perro> perros = new ArrayList();
    List<Persona> personas = new ArrayList<Persona>();
    Scanner input = new Scanner(System.in);
    Persona per = new Persona();
    
    public void mascotasAgregadas() {
        
    }
    
    public void crearUsuarios() {
        int cant;
        System.out.println("¿Cuantos usuarios desea agregar?");
        cant = input.nextInt();
        String nombre, apellido;
        int edad, documento;
        for (int i = 0; i < cant; i++) {
            System.out.println("ingrese el nombre de las persona: " + (i + 1));
            per.setNombre(input.next());
            System.out.println("ingrese el apellido: ");
            per.setApellido(input.next());
            System.out.println("Ingrese la edad: ");
            per.setEdad(input.nextInt());
            System.out.println("ingrese el DNI, sin puntos: ");
            per.setDocumento(input.nextInt());
            
            personas.add(per);
        }
    }
    
    public void crearMascotas() {
        String opcion, nombreMascota;
        perros.add(new Perro("loco", "Border Collie", 1, "mediano"));
        perros.add(new Perro("corchito", "Bulldog", 5, "mediano"));
        perros.add(new Perro("campeon", "Golden", 5, "Grande"));
        
        System.out.println("¿Desea adoptar una mascota? s/n");
        opcion = input.next();
        if (opcion.equalsIgnoreCase("s")) {
            System.out.println("ingrese el nombre de la Mascota que desea aceptar:");
            nombreMascota = input.next();
            
            boolean mascotaEncontrada = false;
            for (Perro perro : perros) {
                if (nombreMascota.equalsIgnoreCase(perro.getNombre())) {
                    mascotaEncontrada = true;
                    break;
                }
            }
            
            if (mascotaEncontrada) {
                System.out.println("La mascota ya se encuentra con una familia.");
            } else {
                System.out.println("La mascota está disponible y ahora formará parte de su familia.");
                System.out.println("Complete el formulario con los datos de la Mascota:");
                Perro perro = new Perro();
                perro.setNombre(nombreMascota);
                System.out.println("Ingrese la raza de " + perro.getNombre());
                perro.setRaza(input.next());
                System.out.println("Ingrese la edad de " + perro.getNombre());
                perro.setEdad(input.nextInt());
                System.out.println("Ingrese el tamaño de " + perro.getNombre());
                perro.setTamanio(input.next());
                per.setPerro(perro);
                perros.add(perro);
                
                System.out.println(perro.getNombre() + " ha sido registrado en su familia. ¡Felicitaciones!");
            }
            
        }
    }
    
    public void mostrarPersonaMascota() {
        for (Persona perso : personas) {
            System.out.println(perso);
        }
    }
}
