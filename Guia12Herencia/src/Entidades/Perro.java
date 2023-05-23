package Entidades;

public class Perro extends Animal {

    
    public Perro(String nombre, String alimento, int edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }
    
    @Override
    public String hacerRuido() {
        return "Soy un Perro, Guau, Guau";
    }

    @Override
    public String alimento() {
        return "Me alimento de " + alimento;
    }
    
    
}
