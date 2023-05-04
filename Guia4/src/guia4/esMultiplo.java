/*
 * Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
 * validando que el primer número múltiplo del segundo e imprima si el primer número 
 * es múltiplo del segundo, sino informe que no lo son
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class esMultiplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1,num2,resultado;
        System.out.println("Ingrese sus 2 numeros");
        num1=leer.nextInt();
        num2=leer.nextInt();
        resultado=num1%num2;
        esMultiplo(resultado);
    }
      public static void esMultiplo(int resultado){
          if (resultado == 0) {
              System.out.println("Es multiplo");
              
          }else {
              System.out.println("No es multiplo");
          }
        
    }   
  }
