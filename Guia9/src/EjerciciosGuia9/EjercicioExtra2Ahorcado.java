/*

 */
package EjerciciosGuia9;

import Entidades.Ahorcado;
import Servicio.AhorcadoService;
import java.util.Scanner;

public class EjercicioExtra2Ahorcado {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        AhorcadoService ahorcado = new AhorcadoService();
        Ahorcado a = new Ahorcado();
        ahorcado.juego();
    }

}
