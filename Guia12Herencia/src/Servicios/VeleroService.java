/*

 */
package Servicios;

import Entidades.Barco;
import Entidades.Cliente;
import Entidades.Velero;
import java.util.Scanner;

public class VeleroService extends BarcoService {
Scanner input = new Scanner(System.in);

Velero vele;

    @Override
    public void alquilerBase(Cliente cliente, Barco barco) {
        super.alquilerBase(cliente, barco); 
        vele = new Velero();
        System.out.println("Ingrese el numero de mastiles del Velero...............>");
        Integer numeroMastiles = input.nextInt();
        
        vele.setNumeroMastiles(numeroMastiles);
        Double precioMastiles = this.alquilerBase + numeroMastiles;
        System.out.println("El valor a abonar por los dias ingresados, seran de: $"+precioMastiles);
    }
    
    
}
