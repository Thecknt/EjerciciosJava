/*
8 A X |  8 B X | 8 C X | 8 D     | 8 E X | 8 F X
7 A X |  7 B X | 7 C X | 7 D X | 7 E     | 7 F X
6 A X |  6 B X | 6 C    | 6 D X | 6 E X  | 6 F 
5 A X |  5 B X | 5 C X | 5 D X | 5 E X | 5 F X
4 A X |  4 B X | 4 C X | 4 D X | 4 E X | 4 F X
3 A X |  3 B X | 3 C X | 3 D    | 3 E X | 3 F X
2 A X |  2 B    | 2 C X | 2 D X | 2 E X | 2 F 
1 A X |  1 B X | 1 C X | 1 D X | 1 E X | 1 F X
 */
package Services;

import Entidades.Espectador;
import java.util.ArrayList;
import java.util.List;

public class EspectadorService {

    int filas = 8;
    int columnas = 6;
    String[][] sala = new String[filas][columnas];
    Espectador esp = new Espectador();
    Espectador esp1 = new Espectador();
    Espectador esp2 = new Espectador();
    List<Espectador> espectadores = new ArrayList();

    char letra = 'A';
    char ocupado = 'X';

    public void espectadores() {
        System.out.println("Ingresando 48 espectadores a la Sala, los lugares marcados con X\n"
                + "representan los lugares ocupados");

        int posicion = 0;
        System.out.println("-------------------------------------------");
        System.out.println("|                 PANTALLA                |");
        System.out.println("-------------------------------------------");
        for (int i = sala.length - 1; i >= 0; i--) {
            for (int j = sala[i].length - 1; j >= 0; j--) {
                String concatenarLetraYNumero = (j + 1) + "" + letra;;

                posicion = i + j;
                if (posicion % 2 != 0) {
                    concatenarLetraYNumero += ocupado;
                }
                sala[i][j] = concatenarLetraYNumero;
            }
            letra++;
        }

        for (int i = sala.length - 1; i >= 0; i--) {
            for (int j = sala[i].length - 1; j >= 0; j--) {

                System.out.print(sala[i][j] + "  |  ");
            }
            System.out.println();
        }
    }

    public void mostrarDatosEspectadores() {
        esp.setNombre("Mariano");
        esp.setEdad(35);
        esp.setDineroDisponible(1200);
        espectadores.add(esp);

        esp1.setNombre("Fernando");
        esp1.setEdad(15);
        esp1.setDineroDisponible(800);
        espectadores.add(esp1);

        esp2.setNombre("Sara");
        esp2.setEdad(18);
        esp2.setDineroDisponible(1800);
        espectadores.add(esp2);

        System.out.println("Para sacar la entrada estan: ");
        for (Espectador aux : espectadores) {
            System.out.println(aux);
        }
    }
}
