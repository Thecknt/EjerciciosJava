/*
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición 
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del 
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package Entidades;

import java.util.Random;

public class Revolver {

    private Random random = new Random();
    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
    }

    public void llenarRevolver() {
        posicionActual = random.nextInt(7);
        posicionAgua = random.nextInt(7);
    }

    public boolean mojar() {
        if (posicionActual == posicionAgua) {
            return true;
        }
        return false;
    }

    public void siguienteChorro() {
        if (posicionActual == 6) {
            posicionActual = 1;
        }
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "random=" + random + ", posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }

}
