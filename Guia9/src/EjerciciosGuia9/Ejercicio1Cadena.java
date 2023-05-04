
package EjerciciosGuia9;

import Entidades.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;

public class Ejercicio1Cadena {

 
    public static void main(String[] args) {
       CadenaServicio cs = new CadenaServicio();
       Scanner input = new Scanner(System.in).useDelimiter("\n");
       
        System.out.println("Ingrese una frase");
        String frase = input.next();
       Cadena c1 = new Cadena(frase);
       
       
       cs.mostrarVocales(c1);
       cs.invertirFrase(c1);
       
       cs.vecesRepetido("a", c1);
       
        System.out.println("Ingrese una nueva frase");
        String frase2 = input.next();
        
        if (cs.compararLongitud(frase2, c1)) {
            System.out.println("Las frases tienen la misma longitud");
        } else {
            System.out.println("Las frases NO tienen la misma longitud");
        }
        
        cs.unirFrases(frase2, c1);
        cs.reemplazar("$", c1);
        
        if (cs.contiene("a", c1)) {
            System.out.println("La frase contiene "+ "a");
        } else {
            System.out.println("La frase NO contiene " + "a");
        }
    }
    
}
