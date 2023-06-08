/*
 
 */
package Services;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeroServicio {

    Scanner input = new Scanner(System.in);
    int numRandom;
    int numUser;
    int count = 5;

    public void iniciarJuego() {
        boolean fin = false;
        numRandom = (int) (Math.random()* 10+1);
        System.out.println("numero random: " + numRandom);
        System.out.println("*****************************************************************");
        System.out.println("*     Bienvenido al juego de adivinar el numero escondido       *"
                + "\n*             solo tendras 5 Oportunidades                      *");
        System.out.println("*****************************************************************");
        do {
            try {   
                    System.out.println("Ingrese un numero aleatorio");
                    numUser = input.nextInt();

                    if (numUser == numRandom) {
                        System.out.println("**************************************************");
                        System.out.println("*  Adivinaste!!! luego de intentar " + count + " veces       *");
                        System.out.println("**************************************************");                       
                        fin = true;
                    } else {
                        System.out.println("Segui intentando, veces restantes "+ count);
                        if (numUser>numRandom) {
                            System.out.println("__________________________________________________________________________");
                            System.out.println("|                                                                         |");
                            System.out.println("| MMM no, no, no! Proba bajando el numero, recorda que es del uno al 10!  |");
                            System.out.println("|_________________________________________________________________________|");
                            count--;
                        } else {
                            System.out.println("_____________________________________________________________________________");
                            System.out.println("|                                                                            |");
                            System.out.println("| MMM no, no, no!!! Proba subiendo tu numero, recorda que es del uno al 10!  |");
                            System.out.println("|____________________________________________________________________________|");
                            count--;
                        }
                        
                        fin = false;
                        System.out.println("¿Vamos de nuevo? ...  ----->");
                    }
                if (count <0) {
                    System.out.println("_____________________________");
                    System.out.println("*****************************");
                    System.out.println("*      Game Over :C         *");
                    System.out.println("*        You Lost!          *");
                    System.out.println("*___________________________*");
                    System.out.println("*****************************"); 
                    fin = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingreso un valor incorrecto");
                System.out.println("Segui intentando, veces restantes "+ count);
                count--;
                System.out.println("Vamos de nuevo...  ----->");
                input.next();
            }
        } while (!fin);

    }

}
