/*
 * Una obra social tiene tres clases de socios:
 * Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
 * Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos 
 * que los socios del tipo A.
 * Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
 * Solicite una letra (carácter) que representa la clase de un socio, 
 * y luego un valor real que represente el costo del tratamiento (previo al descuento) 
 * y determine el importe en efectivo a pagar por dicho socio.
 */
package ejerciciosextra3y4;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class obraSocial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese que tipo de socio que es, asi calculamos el descuento. "
                + "Para Premium: p, "
                + "Para Gold: g, "
                + "Para Silver s, ");
        String opc;
        String premium = "p";
        String gold = "g";
        String silver = "s";
        int price;
        //float descP;
        
        opc = leer.next();
        
        if(opc.equalsIgnoreCase("p") || opc.equalsIgnoreCase("g") || opc.equalsIgnoreCase("s")) {
        switch(opc) {
                case "p":
                    System.out.println("Ingrese el monto total del producto");
                    price = leer.nextInt();
                    float descP;
                    descP = (int) (price*0.50);
                    System.out.println("Por ser un usuario premiun, abonara un valor final del producto de: $" + descP);
                    break;
                case "g":
                    System.out.println("Ingrese el monto total del producto");
                    price = leer.nextInt();
                    descP = (int) (price*0.35);
                    System.out.println("Por ser un usuario Gold, abonara un valor final del producto de: $" + descP);
                    break;
                case "s":
                    System.out.println("Ingrese el monto total del producto");
                    price = leer.nextInt();
                    descP = price;
                    System.out.println("Por ser un usuario Silver, abonara el mismo valor final del producto de: $" + descP + " ,le recomendamos que haga un update de su cobertura");
                    break;
                default:
                    System.out.println("el valor ingresado no corresponde a socio");
                    break;
        } 
        }           
        }
        
    }
    

