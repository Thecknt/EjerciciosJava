/*

 */
package Ejercicios;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;

public class EjercicioPistola {

    public static void main(String[] args) {
        Revolver r = new Revolver();
        Juego j = new Juego();

        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

        for (int i = 0; i <= 5; i++) {
            Jugador j1 = new Jugador();
            j1.setId(i + 1);
            j1.setNombre("Jugador " + (i + 1));
            j1.setMojado(false);
            jugadores.add(j1);
        }

        j.llenarJuego();
        j.ronda();
    }
}
