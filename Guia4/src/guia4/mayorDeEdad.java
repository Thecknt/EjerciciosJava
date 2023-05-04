/*
 * Diseñe una función que pida el nombre y la edad de N personas e
 * imprima los datos de las personas ingresadas por teclado e indique si
 * son mayores o menores de edad. Después de cada persona, el programa
 * debe preguntarle al usuario si quiere seguir mostrando personas y frenar
 * cuando el usuario ingrese la palabra “No”.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class mayorDeEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String answer = "si"; // creo una variable de respuesta
        
        while(answer.equalsIgnoreCase("si")){ //con esta linea logro que la persona 
            //ponga mayuscula o minuscula no diferencie, lo pasa todo a minuscula.
            System.out.println("Ingrese el nombre de la persona");
            String name = input.nextLine();
            
            System.out.println("Ingrese la edad de "+ name);
            int age = input.nextInt();
            input.nextLine(); // con este comando limpio el buffer del scanner, para 
            // que no capture algun dato/caracter que haya quedado guardado aun.
            
            System.out.println(dataPerson(name,age)); // Aca llamo a la funcion antes de preguntar 
            //si quiero agregar a alguien mas
            
            System.out.println("¿Desea ingresar otra persona? Si/No");
            answer = input.nextLine();     
        }
    }
    
    
     public static String dataPerson(String name, int age) {
     String result = name + " tiene " + age + " años y es ";
     
     if(age>=18){
         result = result + "mayor de edad"; //Aca concateno con el string de arriba.
     } else {
        result = result + "menor de edad";
     }
     return result;
     }
}
