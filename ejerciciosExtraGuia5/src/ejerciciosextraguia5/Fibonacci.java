/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextraguia5;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("ingresar la cantidad de valores que queres analizar ");
        int N = leer.nextInt();

        int fibonaccin;

        int aux1;
        int aux2;
        aux1 = 0;
        aux2 = 1;
        System.out.println("0 \n1  \n2");
        for (int i = 0; i < N; i++) {

            fibonaccin = aux1 + aux2;
            aux1 = aux2;
            aux2 = fibonaccin;
            System.out.println(aux1 + aux2 + fibonaccin);
        }

    }
}
    
