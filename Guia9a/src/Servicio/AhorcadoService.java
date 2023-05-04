/*
Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del usuario, pone la longitud de la palabra, 
como la longitud del vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en un índice del vector. 
Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.

Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.

Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la palabra o no. 
También informará si la letra estaba o no.

Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han sido encontradas y cuántas le faltan. 
Este método además deberá devolver true si la letra estaba y false si la letra no estaba, 
ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.

Método intentos(): para mostrar cuántas oportunidades le queda al jugador.

Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará cuando el usuario descubra 
toda la palabra o se quede sin intentos. Este método se llamará en el main.
 */
package Servicio;

import Entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {

    public Scanner input = new Scanner(System.in);

    public void crearJuego(Ahorcado a) {

        System.out.println("Ingrese la Palabra secreta: ");
        String frase = input.next();
        String[] palabra = new String[frase.length()];
        System.out.println("Ingrese la cantidad de Jugadas maximas, para adivinar: ");
        int cantJugadasMaximas = input.nextInt();

        for (int i = 0; i < frase.length(); i++) {
            palabra[i] = frase.substring(i, i + 1);
        }

        a.setFrase(palabra);
        a.setPalabra(palabra);
        a.setCantJugadasMaximas(cantJugadasMaximas);
    }

    public void longitud(Ahorcado a) {
        System.out.println("La longitud de la palabra es: " + a.getPalabra().length);

    }

    public void buscar(Ahorcado a, String letra) {

        int cont = 0;
        String[] palabra = a.getPalabra();
        
        do {
            for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].equals(letra)) {
                System.out.println("la letra se encuentra en la palabra secreta ");
                return; // Si se encontró la letra, se sale del método.
            }

        }
        System.out.println("La letra ingresada no se encuentra");
        cont++;
        } while (cont == a.getCantJugadasMaximas());
        
    }

    public void encontradas(Ahorcado a, String letra) {
        String[] palabra = a.getPalabra();
        int cont = 0;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].equals(letra)) {
                cont++;
            }
        }
        System.out.println("La letra se encuentra repetida " + cont + " veces.");
    }

    public void juego() {
        Ahorcado ahorcado = new Ahorcado();
        crearJuego(ahorcado);
        longitud(ahorcado);
        System.out.println("Ingrese la letra para saber si se encuentra en la palabra oculta: ");
        String letra = input.next();
        buscar(ahorcado, letra);
        encontradas(ahorcado, letra);
    }

}
