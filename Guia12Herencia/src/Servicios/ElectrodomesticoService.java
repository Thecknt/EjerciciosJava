
package Servicios;

import Entidades.Electrodomestico;
import java.util.Scanner;

public class ElectrodomesticoService {
    
    Scanner input = new Scanner(System.in);
    Electrodomestico elec;
    
    public void comprobarConsumoEnergetico(char letra) {
        // Comprobar que la letra es válida (A, B, C, D, E, F)
        if (letra >= 'A' && letra <= 'F') {
            elec.setConsumoEnergetico(letra);
        } else {
            elec.setConsumoEnergetico('F'); //Uso F por defecto
        }
    }
    
    public void comprobarColor(String color) {
        String colores = color.toLowerCase();
        if (colores.equalsIgnoreCase("negro")  || colores.equalsIgnoreCase("rojo") || colores.equalsIgnoreCase("azul") || colores.equalsIgnoreCase("gris")) {
            elec.setColor(color);     
        } else {
            elec.setColor("blanco");
     
        }
        
    }
    
    public Electrodomestico crearElectrodomestico() {
        elec = new Electrodomestico();
        elec.setPrecio(1000.00);
        comprobarColor(input.next());
        System.out.println("Ingrese la letra respectiva al consumo electrico");
      String letra = input.next().toUpperCase();
        char caracter = letra.charAt(0);
        elec.setConsumoEnergetico(caracter);
        comprobarConsumoEnergetico(caracter);
        System.out.println("Ingrese el peso del producto");
        elec.setPeso(input.nextInt());
    return elec;
    }
    
    public void precioFinal() {
        
        char letra = elec.getConsumoEnergetico();
        switch (letra) {
            
            case 'A':
                if (elec.getPeso() >= 80) {
                  elec.setPrecio(elec.getPrecio()+3000.00);
                  break;
                } else if (elec.getPeso() <=79 || elec.getPeso() >= 50) {
                    elec.setPrecio(elec.getPrecio()+2800.00);
                    break;
                } else if (elec.getPeso() <= 49 || elec.getPeso() >=20 ) {
                    elec.setPrecio(elec.getPrecio()+2500.00);
                    break;
                } else if (elec.getPeso() <= 19 || elec.getPeso() >=1) {
                    elec.setPrecio(elec.getPrecio()+2100.00);
                }
                break;
            case 'B':
                if (elec.getPeso() >= 80) {
                    elec.setPrecio(elec.getPrecio()+1800d);
                    break;
                } else if (elec.getPeso() <=79 || elec.getPeso() >= 50 ) {
                    elec.setPrecio(elec.getPrecio()+1600d);
                    break;
                } else if (elec.getPeso() <= 49 || elec.getPeso() >=20) {
                    elec.setPrecio(elec.getPrecio()+1300d);
                    break;
                } else if (elec.getPeso() <= 19 || elec.getPeso() >=1 ) {
                    elec.setPrecio(elec.getPrecio()+900d);
                }
                break;
            case 'C':
                if (elec.getPeso() >= 80) {
                    elec.setPrecio(elec.getPrecio()+1600d);
                    break;
                } else if (elec.getPeso() <=79 || elec.getPeso() >= 50) {
                    elec.setPrecio(elec.getPrecio()+1400d);
                    break;
                } else if (elec.getPeso() <= 49 || elec.getPeso() >=20 ) {
                    elec.setPrecio(elec.getPrecio()+1100d);
                    break;
                } else if (elec.getPeso() <= 19 || elec.getPeso() >=1) {
                    elec.setPrecio(elec.getPrecio()+700d);
                }
                break;
            case 'D':
                if (elec.getPeso() >= 80) {
                    elec.setPrecio(elec.getPrecio()+1500d);
                    break;
                } else if (elec.getPeso() <=79 || elec.getPeso() >= 50) {
                   elec.setPrecio(elec.getPrecio()+1300d);
                   break;
                } else if (elec.getPeso() <= 49 || elec.getPeso() >=20) {
                    elec.setPrecio(elec.getPrecio()+1000d);
                    break;
                } else if (elec.getPeso() <= 19 || elec.getPeso() >=1) {
                    elec.setPrecio(elec.getPrecio()+600d);
                }
                break;
            case 'E':
                if (elec.getPeso() >= 80) {
                    elec.setPrecio(elec.getPrecio()+1300d);
                } else if (elec.getPeso() <=79 || elec.getPeso() >= 50) {
                    elec.setPrecio(elec.getPrecio()+1100d);
                } else if (elec.getPeso() <= 49 || elec.getPeso() >=20) {
                    elec.setPrecio(elec.getPrecio()+800d);
                } else if (elec.getPeso() <= 19 || elec.getPeso() >=1) {
                    elec.setPrecio(elec.getPrecio()+400d);
                }
                break;
            default:
                if (elec.getPeso() >= 80) {
                    elec.setPrecio(elec.getPrecio()+1100d);
                } else if (elec.getPeso() <=79 || elec.getPeso() >= 50) {
                    elec.setPrecio(elec.getPrecio()+900d);
                } else if (elec.getPeso() <= 49 || elec.getPeso() >=20) {
                    elec.setPrecio(elec.getPrecio()+600d);
                } else if (elec.getPeso() <= 19 || elec.getPeso() >=1) {
                   elec.setPrecio(elec.getPrecio()+200d);
                }
                break;
        }
    }
    
}
