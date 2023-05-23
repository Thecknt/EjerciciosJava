/*
EJERCICIO ANIMAL
Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo 
“Hola”. Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el 
método hacerRuido() con el ruido que corresponda a cada uno. Luego, en el main vamos a crear 
un ArrayList de animales y los siguientes animales
Animal a = new Animal();
Animal b = new Perro();
Animal c = new Gato();
Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al 
método hacerRuido() de cada ítem.
 */
package Principal;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;
import java.util.ArrayList;
import java.util.List;

public class EjercicioAnimal {

 
    public static void main(String[] args) {
        List<Animal>animales = new ArrayList();
    Animal perro1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
    perro1.alimento();
    Animal perro2 = new Perro("Teddy","Croquetas",10,"Chihuahua");
    perro2.alimento();
    
    Animal gato1 = new Gato("Pelusa","Galletas",15,"Siamés");
    gato1.alimento();
    
   Animal caballo = new Caballo("Spark","Pasto",25,"Fino");
    animales.add(perro1);
    animales.add(perro2);
    animales.add(gato1);
    animales.add(caballo);
    
        for (Animal aux : animales) {
            System.out.println(aux.hacerRuido());
            System.out.println(aux.alimento());
        }
    }
    
}
