/*
* Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
* sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. 
* Generar un objeto puntos usando un método crearPuntos() 
* que le pide al usuario los dos números y los ingresa en los atributos del objeto. 
* Después, a través de otro método calcular y devolver la distancia que existe 
* entre los dos puntos que existen en la clase Puntos. Para conocer como calcular 
* la distancia entre dos puntos consulte el siguiente link:
* http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
*/
package ejercicio3;

import java.util.Scanner;
import metodos.Puntos;


public class extra2 {


    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        
      double x1,x2,y1,y2;
        System.out.println("Ingrese el primer numero");
        x1=input.nextDouble();
        System.out.println("Ingrese el segundo numero");
        x2  = input.nextDouble();
        System.out.println("Ingrese el tercer numero");
        y1 = input.nextDouble();
        System.out.println("Ingrese el cuarto y ultimo numero");
        y2 = input.nextDouble();
        
        Puntos point = new Puntos(x1,x2,y1,y2);
        
        System.out.println("La distancia entre los puntos es: " + point.calcularDistancia());
    }
    
}
