
import ClasesExtra.Juego;
import java.util.Scanner;

/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores 
jugar un juego de adivinanza de números. 
El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
El segundo jugador tiene un número limitado de intentos y 
recibe una pista de "más alto" o "más bajo" después de cada intento. 
El juego termina cuando el segundo jugador adivina el número o se queda sin intentos. 
Registra el número de intentos necesarios para adivinar el número 
y el número de veces que cada jugador ha ganado.
 */

public class EjercicioExtra3 {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        System.out.println("Iniciando juego....");
        System.out.println("-----------------------------");
        System.out.println("Adivine el numero del Jugagor 1");
        System.out.println("Jugador 1: Ingrese su numero:");
        int jugador1= input.nextInt();
        System.out.println("Jugador 2: Ingrese el numero que considere\n que ingreso el Jugador1");
        int jugador2 = input.nextInt();
        
        Juego inicio = new Juego();
        System.out.println(inicio.iniciar_juego(jugador1, jugador2));
               
    }
    
}
