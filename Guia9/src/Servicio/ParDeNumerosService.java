/*
Método mostrarValores: que muestra cuáles son los dos números guardados.

Método devolverMayor: para retornar cuál de los dos atributos tiene el mayor valor.

Método calcularPotencia: para calcular la potencia del mayor valor de la clase elevado al menor número. 
Previamente se deben redondear ambos valores.

Método calculaRaiz: para calcular la raíz cuadrada del menor de los dos valores. 
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Servicio;

import Entidades.ParDeNumeros;

public class ParDeNumerosService {

    ParDeNumeros pn = new ParDeNumeros();

    public void mostrarValores(ParDeNumeros pn) {
        System.out.println("Los numeros guardados son: \n" + "Numero 1: " + pn.getNum1() + "\n" + "Numero 2: " + pn.getNum2());
    }

    public double devolverMayor(ParDeNumeros pn) {
        return Math.max(pn.getNum1(), pn.getNum2());
    }

    public double calcularPotencia(ParDeNumeros pn) {
        double num1 = Math.round(pn.getNum1());
        double num2 = Math.round(pn.getNum2());

        if (pn.getNum1() > pn.getNum2()) {
            return Math.sqrt(Math.abs(num2));
        } else {
            return Math.sqrt(Math.abs(num1));
        }
    }

    public double calculaRaiz(ParDeNumeros pn) {
        double num1 = Math.round(pn.getNum1());
        double num2 = Math.round(pn.getNum2());
        if (pn.getNum1() > pn.getNum2()) {
            return Math.sqrt(Math.abs(num2));
        } else {
            return Math.sqrt(Math.abs(num2));
        }
    }
}
