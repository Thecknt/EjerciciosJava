<<<<<<< HEAD
/*
 * Crea una aplicación que a través de una función nos convierta una
 * cantidad de euros introducida por teclado a otra moneda, estas pueden
 * ser a dólares, yenes o libras. La función tendrá como parámetros, la
 * cantidad de euros y la moneda a convertir que será una cadena, este no
 * devolverá ningún valor y mostrará un mensaje indicando el cambio
 * (void).
 * El cambio de divisas es:
 * i.   * 0.86 libras es un 1 €
 * ii.  * 1.28611 $ es un 1 €
 * iii. * 129.852 yenes es un 1 €
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class convertidorDeMonedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //double euros;
        //String coin;
        System.out.println("Ingrese la cantidad de Euros");
        double euros = input.nextDouble();

        //Scanner.nextLine(); // uso un salto de linea
        System.out.print("Elige la moneda que desees convertir (libras/dolares/yenes): ");
        String coin = input.next();

        switch (coin.toLowerCase()) {
            case "libras":
                eurosToCoin(euros, 0.86, "libras"); //el valor de las libras es tasa en el procedimiento
                break;
            case "dolares":
                eurosToCoin(euros, 1.28611, "dolares");
                break;
            case "yenes":
                eurosToCoin(euros, 129.852, "yenes");
                break;
            default:
                System.out.println("Ingrese una moneda valida");
                break;
        }

    }

    public static void eurosToCoin(double euros, double tasa, String coin) {
        double convert = euros * tasa;
        System.out.println(euros + " euros son " + convert + " " + coin);
    }
}

//psvm y hacer tab para que lo autocomplete

/*Otro ejemplo
Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros a convertir");
        double euro = leer.nextDouble();
        System.out.println("Ingrese a qué moneda quiere hacer la conversión");
        String moneda = leer.next();
        CambiarMoneda(euro, moneda);
    }

    public static void CambiarMoneda(double euro, String moneda) {
        double resultado;
        switch (moneda) {
            case "dolar":
                resultado = euro * 1.28611;
                System.out.println("El valor del cambio es " + resultado);
                break;
            case "yen":
                resultado = euro * 129.852;
                System.out.println("El valor del cambio es " + resultado);
                break;
            case "libras":
                resultado = euro * 0.86;
                System.out.println("El valor del cambio es " + resultado);
                break;
            default: 
                System.out.println("Opción incorrecta");

        }
     }
*/
=======
/*
 * Crea una aplicación que a través de una función nos convierta una
 * cantidad de euros introducida por teclado a otra moneda, estas pueden
 * ser a dólares, yenes o libras. La función tendrá como parámetros, la
 * cantidad de euros y la moneda a convertir que será una cadena, este no
 * devolverá ningún valor y mostrará un mensaje indicando el cambio
 * (void).
 * El cambio de divisas es:
 * i.   * 0.86 libras es un 1 €
 * ii.  * 1.28611 $ es un 1 €
 * iii. * 129.852 yenes es un 1 €
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class convertidorDeMonedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //double euros;
        //String coin;
        System.out.println("Ingrese la cantidad de Euros");
        double euros = input.nextDouble();

        //Scanner.nextLine(); // uso un salto de linea
        System.out.print("Elige la moneda que desees convertir (libras/dolares/yenes): ");
        String coin = input.next();

        switch (coin.toLowerCase()) {
            case "libras":
                eurosToCoin(euros, 0.86, "libras"); //el valor de las libras es tasa en el procedimiento
                break;
            case "dolares":
                eurosToCoin(euros, 1.28611, "dolares");
                break;
            case "yenes":
                eurosToCoin(euros, 129.852, "yenes");
                break;
            default:
                System.out.println("Ingrese una moneda valida");
                break;
        }

    }

    public static void eurosToCoin(double euros, double tasa, String coin) {
        double convert = euros * tasa;
        System.out.println(euros + " euros son " + convert + " " + coin);
    }
}

//psvm y hacer tab para que lo autocomplete

/*Otro ejemplo
Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros a convertir");
        double euro = leer.nextDouble();
        System.out.println("Ingrese a qué moneda quiere hacer la conversión");
        String moneda = leer.next();
        CambiarMoneda(euro, moneda);
    }

    public static void CambiarMoneda(double euro, String moneda) {
        double resultado;
        switch (moneda) {
            case "dolar":
                resultado = euro * 1.28611;
                System.out.println("El valor del cambio es " + resultado);
                break;
            case "yen":
                resultado = euro * 129.852;
                System.out.println("El valor del cambio es " + resultado);
                break;
            case "libras":
                resultado = euro * 0.86;
                System.out.println("El valor del cambio es " + resultado);
                break;
            default: 
                System.out.println("Opción incorrecta");

        }
     }
*/
>>>>>>> c70357b6a524489a3be1af6de8717370a7b2b176
