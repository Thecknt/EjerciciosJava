/*
 * Crear una clase llamada Libro que contenga los siguientes atributos: 
 * ISBN, Título, Autor, Número de páginas, 
 * y un constructor con todos los atributos pasados por parámetro y 
 * un constructor vacío. 
 * Crear un método para cargar un libro pidiendo los datos al usuario y 
 * luego informar mediante otro método el número de ISBN, el título, /*
 * Crear una clase llamada Libro que contenga los siguientes atributos: 
 * ISBN, Título, Autor, Número de páginas, 
 * y un constructor con todos los atributos pasados por parámetro y 
 * un constructor vacío. 
 * Crear un método para cargar un libro pidiendo los datos al usuario y 
 * luego informar mediante otro método el número de ISBN, el título, 
 * el autor del libro y el número de páginas.
 */

import java.util.Scanner;
import libroCaracteristicas.Propiedad;

public class LibroAPP {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese los siguientes datos: ");
        System.out.println("Ingrese el isbn: ");
        int ISBN = input.nextInt();

        System.out.println("Ingrese el titulo: ");
        input.nextLine();
        String Titulo = input.nextLine();

        System.out.println("Ingrese las paginas del libro: ");
        int paginas = input.nextInt();
        input.nextLine();

        System.out.println("Ingrese el autor: ");
        String Autor = input.nextLine();

        Propiedad azul = new Propiedad(ISBN, Autor, Titulo, paginas);

        System.out.println("De acuerdo a lo ingresado, te comento que el libro se llama: " + azul.Titulo);
        System.out.println("tiene " + azul.paginas + " paginas." + " Su autor es: " + azul.Autor);
        System.out.println("y si deseas consultar su ISBN es: " + azul.ISBN);
    }

}
