/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.Scanner;

public class rectangulos {

    private double base, altura;
    
    public rectangulos() {
    }

    public rectangulos(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la Base: ");
        this.base = input.nextDouble();
        System.out.println("Ingrese la Altura: ");
        this.altura = input.nextDouble();
    }
    
    public double superficie(){
    return base*altura;
    }
    
    public double perimetro(){
    return (base + altura)*2;
    }
    
    public void dibujar(){
        for (int i = 0; i <altura; i++) {
            for (int j = 0; j <base; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
