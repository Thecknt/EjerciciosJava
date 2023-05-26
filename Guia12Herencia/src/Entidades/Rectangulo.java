
package Entidades;

public class Rectangulo implements CalculosFormas {
   private Double altura;
   private Double base;

    public Rectangulo() {
    }

    public Rectangulo(Double altura, Double base) {
        this.altura = altura;
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }
     
    @Override
    public void calcularArea() {
       Double area= base * altura;
        System.out.println("***********************************");
        System.out.println("* El area del Rectangulo es "+area+" *");
        System.out.println("***********************************");
    }

    @Override
    public void calcularPerimetro() {
       Double perimetro = (base + altura) * 2;
       System.out.println("****************************************");
        System.out.println("* El Perimetro del Rectangulo es: "+ perimetro+" *");
        System.out.println("****************************************");
    }
    
}
