/*

 */
package Principal;

import Entidades.Interfaz;
import Entidades.ImplementarInterfaz;

public class EjercicioInterface {

    public static void main(String[] args) {
 
        Interfaz imple = new ImplementarInterfaz();
        
        imple.metodo();
        
        System.out.println("Implementando el segundo Metodo: "+ imple.sumar());
        
    }
    
}
