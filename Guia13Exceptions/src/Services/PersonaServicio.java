package Services;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {

    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    Persona p1 = new Persona();
    int edad = 0;

    public void crearPersona(Persona p1) {

        System.out.println("Para utilizar nuestro servicio es necesario agregar algunos datos");
        System.out.println("Ingrese su Nombre: ");
        String nombre = input.next();
        do {
            try {
                System.out.println("Ingrese su Edad: ");
               edad = input.nextInt();
            } catch (Exception e) {
                System.out.println(" Error: valor incorrecto -->" + e.getMessage());
                input.nextLine();
            }
        } while (edad <= 0);

        System.out.println("Ingrese su sexo (M/F/O)");
        String sexo = "";
        sexo = input.next();
        if (!sexo.equals("m") && !sexo.equals("f") && !sexo.equals("o")) {
            p1.setSexo(sexo);
        } else {
            if (!sexo.equals("m") && !sexo.equals("f") && !sexo.equals("o")) {
                System.out.println("Ingrese un valor valido");
            }
        }
        System.out.println("Ingrese su Peso(Kgs): ");
        double peso = input.nextDouble();
        System.out.println("Ingrese su Altura(cms): ");
        double altura = input.nextDouble();

        p1.setNombre(nombre);
        p1.setEdad(edad);
        p1.setSexo(sexo);
        p1.setPeso(peso);
        p1.setAltura(altura);

        //podrias haber creado en vez de void como public Persona crearPersona(){
        //return new Persona(nombre, edad, sexo, peso, altura);}
    }

    public void mostrarPersona(Persona p1) {
        String nombre = p1.getNombre();
        int edad = p1.getEdad();
        String sexo = p1.getSexo();
        double peso = p1.getPeso();
        double altura = p1.getAltura();

        System.out.println("Los datos ingresados son: " + nombre + ", " + edad + ", " + sexo + ", " + peso + ", " + altura);
    }

    public boolean esMayorDeEdad(Persona p1) {
        try {
            edad = p1.getEdad();
            if (edad <= 18) {
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error --> "+e.getMessage());
        }
        return true;
    }

    public double calcularIMC(Persona p1) {
        double peso = p1.getPeso();
        double altura = p1.getAltura();
        double imc = peso / Math.pow(altura, 2);

        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
}
