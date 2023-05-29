/*

 */
package Servicios;

import Entidades.Barco;
import Entidades.Cliente;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class BarcoService extends ClienteService{
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    Date fechaHecho= null;
    Barco barco;
    
    public Barco crearBarco(Cliente cliente){
        barco= new Barco();
        System.out.println("Ingrese la matricula del Barco...............>");
        Integer matricula = input.nextInt();
        barco.setMatricula(matricula);
        System.out.println("Ingrese los metros de eslora...............>");
        Integer eslora = input.nextInt();
        barco.setEslora(eslora);
        System.out.println("Ingrese la fecha de fabricacion - dd/MM/yyyy...............>");
        String fechaFabricacion = input.next();
        
        try {
        fechaHecho = simpleDate.parse(fechaFabricacion);
        barco.setFechaFabricacion(fechaHecho);
    } catch (ParseException e) {
        System.out.println("Fecha incorrecta. Intente nuevamente <................");
        // Manejo del error o salida del programa si la fecha no se puede analizar correctamente
    }
        barco = new Barco(matricula,eslora,fechaHecho);
        System.out.println("datos " + cliente + barco);
        return barco; 
        
    }
    
     public Barco getBarco() {
        return barco;
    }
 
}
