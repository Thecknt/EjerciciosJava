/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

/**
 *
 * @author santi
 */
public class explicacionPaises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String paises[];
        paises = new String[10];

        //Ahora vamos a asignar manualmente en cada posicion un pais:
        paises[0] = "Argentina";
        paises[1] = "Brasil";
        paises[2] = "chile";
        paises[3] = "Colombia";
        paises[4] = "Venezuela";

        //vamos a mostrar por pantalla los paises de la manera mas larga
        //es decir, menos practica:
        System.out.println("El primer pais es: " + paises[0]);
        System.out.println("El segundo pais es: " + paises[1]);
        System.out.println("El tercer pais es: " + paises[2]);
        System.out.println("El cuarto pais es: " + paises[3]);
        System.out.println("El quinto pais es: " + paises[4]);
        System.out.println("El sexto pais es: " + paises[5]);

        //el quinto nos va a dar null ya que no tenemos ningun pais asignado
        // si fuese numero, nos devolveria 0.
        System.out.println(" "); // vamos a imprimir un espacio vacio, asi
        //no estan pegados
        //Ahora la manera mas practica de mostrar todos los paises,
        // es con un ciclo for, ya que es un array de una sola dimension:

        for (int i = 0; i < paises.length; i++) {
            System.out.println("Los paises guardados son: " + paises[i]); // paises[i]
            //nos va a mostrar por cada vuelta un pais diferente
            //hasta llegar a su final, es decir paises.length
        }
        
        //Ahora vamos a declarar e inicializar directamente:
        
        System.out.println(" "); // Imprimimos un espacio por la linea anterior
        
        String paisesEuropeos []= {"España","Francia","Alemania","Italia"};
        
        //vamos a hacer un ciclo for para mostrarlos:
        
        for (int i = 0; i < paisesEuropeos.length; i++) {
            System.out.println("Los paises son: "+ paisesEuropeos[i]);
        }
    }

}
