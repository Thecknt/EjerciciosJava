/*
 * metodos y constructores
 */
package circunferenciayradio.newpackage;

import java.util.Scanner;

public class Radio {

    private double medida;
    
    public Radio(double medida){
    this.medida = medida;
    }
    
    public double getRadio(){
    return medida;
    }
    
    public void setRadio(double medida){
    this.medida = medida;
    }
    
    public void crearCircunferencia() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el radio de la circunferencia: ");
        double medida = input.nextDouble();
        this.medida = medida;
    }
    
    public double area(){
    return Math.PI * Math.pow(medida, 2);
    }
    
    public double perimetro(){
    return 2 * Math.PI * medida;
    }
}
/*
public class Pooejercprac2 {

    public static void main(String[] args) {
        Circunsferencia contorno = new Circunsferencia();
        double radiomain = contorno.crearCircunferencia(0);
        contorno.area(radiomain);
        System.out.println(contorno.area(radiomain));
        contorno.perimetro(radiomain);
        System.out.println(contorno.perimetro(radiomain));
    }
    
}
package pooejercprac2;

import java.util.Scanner;

public class Circunsferencia {

public Circunsferencia() {
    }
 /*Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖
π*radio〗^2).
e) Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio).*/
