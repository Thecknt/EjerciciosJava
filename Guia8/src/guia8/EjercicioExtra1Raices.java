/*
 
 */
package guia8;

import guia8.Entidades.Raices;
import guia8.Servicio.RaicesServicio;

public class EjercicioExtra1Raices {

   
    public static void main(String[] args) {
       RaicesServicio sv = new RaicesServicio();
        Raices r = new Raices(2,3,1);
        
        sv.calcular(r);
    }
    
}
