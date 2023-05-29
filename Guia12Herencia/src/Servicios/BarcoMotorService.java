/*

 */
package Servicios;

import Entidades.Barco;
import Entidades.BarcoMotor;
import Entidades.Cliente;
import java.util.Scanner;

public class BarcoMotorService extends BarcoService {
Scanner input = new Scanner(System.in);
    BarcoMotor bm;
    
    
    @Override
    public void alquilerBase(Cliente cliente, Barco barco) {
        super.alquilerBase(cliente, barco);
        System.out.println("Ingrese los cvs de su motor:...............>");
        bm = new BarcoMotor();
        bm.setPotenciaMotor(input.nextInt());
      Double totalMotor = this.alquilerBase += bm.getPotenciaMotor();
        System.out.println("El valor a abonar por los dias ingresados, seran de: $"+totalMotor);
    }
    
    
}
