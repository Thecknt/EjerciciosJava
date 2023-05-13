/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package Services;

import Entidades.carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServicioCarta {

    public ArrayList<carta> Baraja() {

        ArrayList<carta> cartaS = new ArrayList();

        // Crear las 40 cartas de la baraja
        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {
                cartaS.add(new carta(i, "espadas"));
                cartaS.add(new carta(i, "bastos"));
                cartaS.add(new carta(i, "oros"));
                cartaS.add(new carta(i, "copas"));
            }
        }

        Collections.shuffle(cartaS);

        return cartaS;
    }

    public void siguienteCarta(ArrayList<carta> mazo) {

        System.out.println(mazo.get(0));

        mazo.remove(0);

        System.out.println(mazo.size());

        System.out.println(mazo.isEmpty());

    }

    public void darCartas(ArrayList<ArrayList> mazo) {
        Scanner Leer = new Scanner(System.in);
        System.out.println("Cuantas cartas quieres?");
        int cantidadCartas = Leer.nextInt();
        
        for (int j = 0; j < cantidadCartas; j++) {
            
            System.out.println(mazo.get(0).remove(0));   
        }   
 
       
    }
    
    

}
