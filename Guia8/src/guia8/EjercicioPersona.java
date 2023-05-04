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
package guia8;

import guia8.Entidades.Persona;
import guia8.Servicio.PersonaServicio;

public class EjercicioPersona {

    public static void main(String[] args) {
        
        /*
        personaservice ps1 = new personaservice();
        aca guardo el objeto dentro de la variable p1
        y borro los parametros de crearPersona;
		persona p1 = ps1.crearPersona();
        */

        //String nombre, int edad, String sexo, double peso, double altura
        PersonaServicio ps = new PersonaServicio();
        Persona p1 = new Persona();
        Persona p2 = new Persona("carlos", 36, "m", 80.0, 1.78);
        Persona p3 = new Persona("Maria", 36, "o", 75.0, 1.60);
        Persona p4 = new Persona("Lorena", 15, "f", 60.0, 1.55);
        ps.crearPersona(p1);

        //Creo el array de personas
        Persona[] personas = {p1, p2, p3, p4};

        //Creo el array de Indice de Masa Corporal
        double[] imc = new double[4];

        // Calculo el IMC para cada objeto Persona y lo guardamos en el array de IMC
        for (int i = 0; i < personas.length; i++) {
            imc[i] = ps.calcularIMC(personas[i]);
        }

        //Creo un contador para cada uno de los estados.
        int bajoPeso = 0;
        int pesoNormal = 0;
        int sobrePeso = 0;
        for (int i = 0; i < imc.length; i++) {
            if (imc[i] == -1) {
                bajoPeso++;
            } else if (imc[i] == 0) {
                pesoNormal++;
            } else {
                sobrePeso++;
            }
        }

        //Aca creo el array solo de edad
        int[] edad = new int[4];
        for (int i = 0; i < personas.length; i++) {
            edad[i] = personas[i].getEdad();
        }

        //Hago un ciclo for para obtener la cantidad de mayores y menores de edad
        int mayorDeEdad = 0;
        int menorDeEdad = 0;

        for (int i = 0; i < edad.length; i++) {
            if (edad[i] >= 18) {
                mayorDeEdad++;
            } else {
                menorDeEdad++;
            }
        }

        //Saco el promedio
        double promedioMayorDeEdad = (double) (mayorDeEdad * 100) / 4;
        double promedioMenorDeEdad = (double) (menorDeEdad * 100) / 4;

        System.out.println("La cantidad de personas en bajo peso son: " + bajoPeso);
        System.out.println("La cantidad de personas con peso normal son: " + pesoNormal);
        System.out.println("La cantidad de personas con sobrepeso son: " + sobrePeso);
        System.out.println("El promedio de mayores de edad son: " + promedioMayorDeEdad + "%");
        System.out.println("El promedio de mayores de edad son: " + promedioMenorDeEdad + "%");
    }
}
