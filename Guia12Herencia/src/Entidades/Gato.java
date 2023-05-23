package Entidades;

public class Gato extends Animal {

    public Gato(String nombre, String alimento, int edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }

    @Override
    public String hacerRuido() {
        return "Soy un Gato! Miau, Miau";
    }

    @Override
    public String alimento() {
        return "Me alimento de " + alimento;
    }

}
