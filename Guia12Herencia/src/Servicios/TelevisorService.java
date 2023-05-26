/*
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase 
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos 
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente 
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se 
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará 
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico 
también deben afectar al precio
 */
package Servicios;

import Entidades.Electrodomestico;
import Entidades.Televisor;
import java.util.Scanner;

public class TelevisorService extends ElectrodomesticoService {

    Scanner input = new Scanner(System.in);
    Electrodomestico el;
    Televisor tele;

    public Televisor crearTelevisor() {
        el = crearElectrodomestico();
        tele = new Televisor();
       String color = el.getColor();
        Double precio = el.getPrecio();
        char consumoEnergetico = el.getConsumoEnergetico();
        Integer peso = el.getPeso();
        
        System.out.println("Ingrese las pulgadas del televisor ");
        tele.setResolucion(input.nextInt());
        System.out.println("¿Tiene TDT?");
        String result = input.next();
        boolean sintonizadorTDT = tele.isSintonizadorTDT();
        if (result.equalsIgnoreCase("si")) {
            sintonizadorTDT = true;
            
        } else {
        tele.setSintonizadorTDT(sintonizadorTDT);
        }
        
        Integer resolucion = tele.getResolucion();
        
        tele = new Televisor(resolucion,sintonizadorTDT,precio,color,consumoEnergetico, peso);
return tele;
    }
    

Double nuevoPrecio;
    @Override
    public void precioFinal() {
        super.precioFinal();
        
        
        if (tele.getResolucion()>=40 && tele.isSintonizadorTDT()) {
            nuevoPrecio = (elec.getPrecio() * 30/100)+ elec.getPrecio() + 500.00;
            tele.setPrecio(nuevoPrecio);
                System.out.println("El precio final de la tele es: "+nuevoPrecio);
        } else{
            nuevoPrecio = elec.getPrecio() + tele.getPrecio();
        tele.setPrecio(nuevoPrecio);
        System.out.println("El precio final del Televisor es: "+ tele.getPrecio());
        }  
    }
    
    
}
