/*
1)
Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de invocar el 
método esMayorDeEdad() a través de ese objeto. Luego, englobe el código con una cláusula 
try-catch para probar la nueva excepción que debe ser controlada.

2)
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para 
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera 
de rango)
 */
package Principal;

import Entidades.Persona;
import Services.PersonaServicio;

public class Ejercicio1Y2Persona {

    public static void main(String[] args) {
       PersonaServicio ps = new PersonaServicio();
        Persona p1 = new Persona();
        Persona p2 = new Persona("carlos", 36, "m", 80.0, 1.78);
        Persona p3 = new Persona("Maria", 36, "o", 75.0, 1.60);
        Persona p4 = new Persona("Lorena", 15, "f", 60.0, 1.55);
        Persona p5 = new Persona();
        ps.crearPersona(p1);

        //Creo el array de personas
        Persona[] personas = {p1, p2, p3, p4,p5};

        //Creo el array de Indice de Masa Corporal
        double[] imc = new double[5];

        // Calculo el IMC para cada objeto Persona y lo guardamos en el array de IMC
        try{ 
        for (int i = 0; i <= imc.length; i++) {
            imc[i] = ps.calcularIMC(personas[i]);
        }
 } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("*******************************************************************************");
            System.out.println("*    Indice del Array fuera de rango, se ejecutara en base a lo dispuesto     *");
            System.out.println("*******************************************************************************");
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
        int[] edad = new int[5];
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
    
