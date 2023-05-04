/*
 Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos: 
nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura. 

Si desea añadir algún otro atributo, puede hacerlo. 

Agregar constructores, getters y setters.

En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:

Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.

Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario 

y después se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, 

comprueba que el sexo introducido sea correcto, es decir, H, M o O. 

Si no es correcto se deberá mostrar un mensaje

Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 

Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso 

ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), 

significa que la persona está en su peso ideal y la función devuelve un 0. 

Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso,

y la función devuelve un 1.

A continuación, en la clase main hacer lo siguiente:

Crear 4 objetos de tipo Persona con distintos valores, a continuación, 

llamaremos todos los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, 

tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.

Por último, guardaremos los resultados de los métodos calcularIMC y 

esMayorDeEdad en distintas variables(arrays), para después calcular un porcentaje de esas 4 personas 

cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, 

y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. 

Para esto, podemos crear unos métodos adicionales.

 */
package guia8.Servicio;

import guia8.Entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {

//String nombre, int edad, String sexo, double peso, double altura
    private Scanner input = new Scanner(System.in);
    Persona p1 = new Persona();

    public void crearPersona(Persona p1) {

        System.out.println("Para utilizar nuestro servicio es necesario agregar algunos datos");
        System.out.println("Ingrese su Nombre: ");
        String nombre = input.next();
        System.out.println("Ingrese su Edad: ");
        int edad = input.nextInt();

        System.out.println("Ingrese su sexo (M/F/O)");
        String sexo = "";
        while (!sexo.equals("m") && !sexo.equals("f") && !sexo.equals("o")) {
            sexo = input.next().toLowerCase();
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
        int edad = p1.getEdad();
        if (edad <= 18) {
            return false;
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
