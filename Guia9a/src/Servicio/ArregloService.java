/*
Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:

Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.

Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.

Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.

Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
Luego llenar las últimas 10 posiciones del arreglo B con 0.5.

 */
package Servicio;

import java.util.Arrays;

public class ArregloService {

    public static void inicializarA(double[] arregloA) {
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = Math.random() * 100;
        }
    }

    public static void mostrar(double[] arregloA) {
        System.out.println(Arrays.toString(arregloA));
    }

    public static void ordenar(double[] arregloA) {
        Arrays.sort(arregloA);
        double[] alreves = new double[arregloA.length];
        for (int i = 0; i < arregloA.length; i++) {
            alreves[i] = arregloA[arregloA.length - i - 1];
        }
        System.out.println(Arrays.toString(alreves));
    }

    double[] arregloB = new double[20];

    public static void inicializarB(double[] arregloA, double[] arregloB) {
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
        Arrays.fill(arregloB, 10, 20, 0.5);
        System.out.println( Arrays.toString(arregloB));
    }
}
