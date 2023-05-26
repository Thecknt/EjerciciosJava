/*

 */
package Entidades;


public class Lavadora extends Electrodomestico{

    
    protected Integer carga;
    public Lavadora() {
    }

    public Lavadora(Integer carga, Double precio, String color, char consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    
    @Override
    public String toString() {
        return "Lavadora: "+ "\n Precio: "+precio + ", su Color es: "+color+"\n Consumo Energetico: "+ consumoEnergetico +", peso: "+peso+"Kgs"+
                "\n  Soporta una carga de: " + carga + "Kilos";
    }
   
    
}
