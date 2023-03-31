/*
 Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores 
jugar un juego de adivinanza de números. El primer jugador elige un número 
y el segundo jugador intenta adivinarlo. 
El segundo jugador tiene un número limitado de intentos y 
recibe una pista de "más alto" o "más bajo" después de cada intento. 
El juego termina cuando el segundo jugador adivina el número o se queda sin intentos. 
Registra el número de intentos necesarios para adivinar el número 
y el número de veces que cada jugador ha ganado.
 */
package ClasesExtra;

import java.util.Scanner;

public class Juego {
    Scanner input = new Scanner(System.in);
    int jugador1;
    int jugador2;

    public Juego() {
    }

    public Juego(int jugador1, int jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }
    
    public String iniciar_juego(int jugador1, int jugador2){
   while(jugador1 != jugador2){
    System.out.println("Jugador 2: Por favor intente nuevamente");
    jugador2 = input.nextInt();
   };
        if(jugador1 < jugador2){
        return "Mas Abajo!";
    }else if(jugador1 > jugador2){
        return "Mas Arriba!";
    } else{
        return "Adivinaste!!";
    }

}
}
