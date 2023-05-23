/*

 */
package Entidades;

public class Caballo extends Animal{

    public Caballo(String nombre, String alimento, int edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }

    @Override
    public String alimento() {
        return "Me alimento de "+ alimento;
    }
    
    
}
