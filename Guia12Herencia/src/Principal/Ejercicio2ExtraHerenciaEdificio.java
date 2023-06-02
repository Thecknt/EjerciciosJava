/*
 Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase 
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico. 
Estos métodos serán abstractos y los implementarán las siguientes clases: 
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o 
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre. 
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas 
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y 
los atributos del padre. 
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el 
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso 
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre 
cuantas personas entrarían en un piso y cuantas en todo el edificio.
16
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener 
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los 
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la 
superficie y el volumen de cada edificio. 
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son 
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método 
cantPersonas() y mostrar los resultados de cada edificio de oficinas
 */
package Principal;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import Servicios.EdificioDeOficinasService;
import Servicios.PolideportivoService;
import java.util.ArrayList;
import java.util.List;


public class Ejercicio2ExtraHerenciaEdificio {

    public static void main(String[] args) {

        List<Edificio> edificios = new ArrayList();
        PolideportivoService ps = new PolideportivoService();
        EdificioDeOficinasService edi = new EdificioDeOficinasService();
        Polideportivo poli;
        EdificioDeOficinas ediOffice;
        System.out.println("***********************************************************************");
        System.out.println("*     Bienvenido al Gestor de Edificios y Oficinas de la Ciudad       *");
        System.out.println("***********************************************************************");
        System.out.println("*          Vamos a cargar 2 polideportivos y 2 oficinas               *");
        int sumaTechado = 0;
        int sumaSinTecho = 0;
        for (int i = 0; i < 2; i++) {
            System.out.println("___________________________");
            System.out.println(" ");
            System.out.println("Cargando Polideportivo " + (i + 1));
            System.out.println("___________________________");
            poli = ps.crearPolideportivo();
            edificios.add(poli);
            if (poli.getTipoInstalacion().equalsIgnoreCase("techado")) {
                sumaTechado++;
            } else {
                sumaSinTecho++;
            }

            System.out.println("___________________________");
            System.out.println(" ");
            System.out.println("Cargando Oficina " + (i + 1));
            System.out.println("___________________________");
            ediOffice = edi.crearEdificio();
            edificios.add(ediOffice);
        }
            System.out.println("************************************************");
        System.out.println("La cantidad de Polideportivos techado es: "+sumaTechado);
        System.out.println("La cantidad de Polideportivos sin techo es: "+sumaSinTecho);

        System.out.println("************************************************");

        for (Edificio aux : edificios) {
            aux.calcularSuperficie();
            System.out.println("-------------------------------------------");
            aux.calcularVolumen();
            System.out.println("--------------------------------------------");

        }

        System.out.println("*************************************************");

        edi.cantPersonas();
    }

}
