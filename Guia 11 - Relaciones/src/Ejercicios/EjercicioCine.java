/*

 */
package Ejercicios;

import Services.CineService;
import Services.EspectadorService;

public class EjercicioCine {

    public static void main(String[] args) {

        EspectadorService es = new EspectadorService();
        CineService cs = new CineService();
        cs.sala1();
        System.out.println("*******************************************************************************");
        es.mostrarDatosEspectadores();
        System.out.println("************************************************");
        es.espectadores();
    }

}
