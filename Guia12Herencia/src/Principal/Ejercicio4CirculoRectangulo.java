/*

 */
package Principal;

import Entidades.Circulo;
import Entidades.Rectangulo;
import java.util.Scanner;

public class Ejercicio4CirculoRectangulo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("..........................................................................");
        System.out.println(". En este ejercicio vamos a mostrar perimetros y areas de                ."
                + "\n.               distintas figuras Geometricas                            .");
        System.out.println("..........................................................................");
        System.out.println("             Vamos a calcular la del Circulo primero");
        System.out.println("       Ingrese el radio para calcular su Area y Perimetro");
        Double radio = input.nextDouble();

        Circulo cir = new Circulo(radio);

        cir.calcularArea();
        cir.calcularPerimetro();
        System.out.println(".................................................................");
        System.out.println(".         Vamos a ingresar los siguientes datos para poder      ."
                + "\n.           calcular el area y perimetro del Rectangulo         .");
        System.out.println(".................................................................");
        System.out.println("Ingrese la altura por favor");
        Double altura = input.nextDouble();
        System.out.println("Ahora ingrese la base");
        Double base = input.nextDouble();

        Rectangulo rec = new Rectangulo(altura, base);
        rec.calcularArea();

        rec.calcularPerimetro();
    }

}
