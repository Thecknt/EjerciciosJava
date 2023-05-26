/*
 • Método crearLavadora (): este método llama a crearElectrodomestico() de la clase 
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos 
el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente 
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la 
carga es menor o igual, no se incrementará el precio. Este método debe llamar al 
método padre y añadir el código necesario. Recuerda que las condiciones que hemos 
visto en la clase Electrodoméstico también deben afectar al precio
 */
package Servicios;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import java.util.Scanner;

public class LavadoraService extends ElectrodomesticoService {

    Scanner input = new Scanner(System.in);
    Lavadora lava;
    Electrodomestico el;

    public Lavadora crearLavadora() {
        el = crearElectrodomestico();
        lava = new Lavadora();
        String color = el.getColor();
        Double precio = el.getPrecio();
        char consumoEnergetico = el.getConsumoEnergetico();
        Integer peso = el.getPeso();
        System.out.println("¿Cual es su capacidad de carga?");
        lava.setCarga(input.nextInt());
        Integer carga = lava.getCarga();
        lava = new Lavadora(carga, precio, color, consumoEnergetico, peso);
        return lava;
    }
    Double nuevoPrecio;

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (lava.getCarga() >= 30) {
            nuevoPrecio = lava.getPrecio()+elec.getPrecio() + 500.00;
            lava.setPrecio(nuevoPrecio);
            System.out.println("El precio final de la Lavadora es: " + nuevoPrecio);
        } else{
            nuevoPrecio = elec.getPrecio() + lava.getPrecio();
            System.out.println("El precio final de la Lavadora es: " + nuevoPrecio);
        }     
    }

    public void mostrarLavadora() {
        System.out.println(lava);
    }

}
