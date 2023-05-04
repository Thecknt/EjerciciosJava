/*
 * Desarrollar una clase Cancion con los siguientes atributos: 
 * título y autor. Se deberá́ definir además dos constructores: 
 * uno vacío que inicializa el título y el autor a cadenas vacías 
 * y otro que reciba como parámetros el título y el autor de la canción. 
 * Se deberán además definir los métodos getters y setters correspondientes.
 */
package ejercicio3;

import metodos.Cancion;

public class extraUno {

    public static void main(String[] args) {
      
        Cancion c1 = new Cancion("bella","Ricky Martin");
        
        System.out.println("El autor es: " + c1.getAuthor() + ", de la cancion " +c1.getSong());
    }

   
    
}
