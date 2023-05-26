/*

 */
package Entidades;

public class Circulo implements CalculosFormas {

    private Double radio;

    public static Double getPi() {
        return pi;
    }
    
   public void Circulo(){
   }
   
  public Circulo(Double radio) {
        this.radio = radio;
    }
    
    @Override
    public void calcularArea() {
       Double area =pi * Math.pow(radio, 2);
       System.out.println("**********************************");
        System.out.println("* El area resultante es "+area+" *");
        System.out.println("**********************************");
    }

    @Override
    public void calcularPerimetro() {
    Double perimetro = pi * (radio * 2);
    System.out.println("***************************************");
        System.out.println("* El Perimetro del Circulo es "+perimetro+" *");
        System.out.println("***************************************");
    }

//Diametro es radio x 2

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    
    
}
