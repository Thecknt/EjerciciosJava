/*

 */
package Servicios;

import Entidades.Barco;
import Entidades.Cliente;
import Entidades.YateDeLujo;
import java.util.Scanner;

public class YateDeLujoService extends BarcoService {
    Scanner input = new Scanner(System.in);
    
    YateDeLujo yate;

    @Override
    public void alquilerBase(Cliente cliente, Barco barco) {
        super.alquilerBase(cliente, barco); 
        yate = new YateDeLujo();
        System.out.println("Ingrese la Potencia del motor en Cv´s...............>");
        Integer potenciaMotor = input.nextInt();
        yate.setPotenciaMotor(potenciaMotor);
        System.out.println("Ingrese la cantidad de Camarotes que posee su yate...............>");
        Integer camarotes = input.nextInt();
        yate.setNumeroCamarotes(camarotes);
        
        Double precioLujo= this.alquilerBase + potenciaMotor + camarotes;
        System.out.println(precioLujo);
    }
    
    
    
}
