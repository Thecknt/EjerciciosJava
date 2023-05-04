
import ClasesExtra.Rectangulo1;

/*
 * Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" 
 * y un método "calcular_area" que calcule y devuelva el área del rectángulo. 
 * Luego crea un objeto "rectangulo2" de la clase "Rectángulo" 
 * con lados de 4 y 6 y imprime el área del rectángulo.
 */

public class ejercicioExtra7 {

    public static void main(String[] args) { 
        Rectangulo1 rec = new Rectangulo1(4,6);
        
        System.out.println("El area del rectangulo es: " + rec.calcular_area());
    }  
}
