/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y 
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package Entidades;

import java.util.ArrayList;

public class Juego {

    private Revolver revolver;
    private ArrayList<Jugador> jugadores;

    public Juego() {
        this.jugadores = new ArrayList<>();
        this.revolver = new Revolver();
    }

    public void llenarJuego() {
        int cant = 5;

        for (int i = 0; i < cant; i++) {
            Jugador j1 = new Jugador();
            j1.setId(i + 1);
            j1.setNombre("Jugador " + (i + 1));
            j1.setMojado(false);
            // System.out.println(j1);
            jugadores.add(j1);

        }
        // System.out.println("Array" + jugadores);
    }

    public void ronda() {
        System.out.println("que comience el Juego...");
        System.out.println("Cargando la pistola...");
        boolean resultado = false;
        System.out.println(revolver.getPosicionActual()+"--" +revolver.getPosicionAgua());
        do {
            for (Jugador jugador : jugadores) {
                revolver.llenarRevolver();
                System.out.println("Dispara el " + jugador.getNombre());
                resultado = jugador.disparo(revolver, jugador);
                jugador.setMojado(resultado);
                //  System.out.println(jugador);
                if (resultado == true) {
                    break;
                }
            }
            
        } while (!resultado);

    }
}
