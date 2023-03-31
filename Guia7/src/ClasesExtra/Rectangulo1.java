/*
* Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y 
* un método "calcular_area" que calcule y devuelva el área del rectángulo. 
* Luego crea un objeto "rectangulo2" de la clase "Rectángulo" 
* con lados de 4 y 6 y imprime el área del rectángulo.
*/
package ClasesExtra;

public class Rectangulo1 {
    
   public int lado1;
   public int lado2;
   
   int area;
   
    public Rectangulo1(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

  public int calcular_area(){
     area = lado1 * lado2;
     return area;
  } 

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
  
 
}
