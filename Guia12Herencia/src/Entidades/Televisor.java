/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos: 
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos 
heredados. 
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.

Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase 
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos 
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente 
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se 
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará 
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico 
también deben afectar al precio
 */
package Entidades;

public class Televisor extends Electrodomestico{
    protected Integer resolucion; //pulgadas
    protected boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(Integer resolucion, boolean sintonizadorTDT, Double precio, String color, char consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

  
    @Override
    public String toString() {
        return "Televisor: "+ "\n Precio: "+precio + ", su Color es: "+color+"\n ConsumoEnergetico: "+ consumoEnergetico +", peso: "+peso+ " Kgs"+
                "\n  La pantalla es de: " + resolucion+" pulgadas " + ",tiene sintonizadorTDT: " + sintonizadorTDT;
    }
    

}
