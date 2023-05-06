/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package Ejercicios;

import Services.Extra1Service;

public class EjercicioExtra1 {

    public static void main(String[] args) {
        Extra1Service extra = new Extra1Service();

        extra.ingresarNumeros();
        System.out.println("-------------------------------------");
        extra.mostraValores();
        System.out.println("-------------------------------------");
        extra.resultadoSuma();
        System.out.println("-------------------------------------");
        extra.promedio();
        System.out.println("-------------------------------------");
    }
}
