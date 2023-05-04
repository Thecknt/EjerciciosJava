/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import metodos.rectangulos;


public class Ejercicio3 {

   
    public static void main(String[] args) {
        rectangulos r1 = new rectangulos();
        r1.crearRectangulo();
        System.out.println("perimetro: " + r1.perimetro());
        System.out.println("Superficie: " + r1.superficie());
        r1.dibujar();
    }
    
}
