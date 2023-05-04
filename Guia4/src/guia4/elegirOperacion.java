<<<<<<< HEAD
/*
 * Crea una aplicación que le pida dos números al usuario 
 * y este pueda elegir entre sumar, restar, multiplicar y dividir. 
 * La aplicación debe tener una función para cada operación matemática 
 * y deben devolver sus resultados para imprimirlos en el main. 
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class elegirOperacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = 0, num2=0;
        
        
        System.out.println("Ingrese 2 numeros, por favor");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        int opc;
        do{
        System.out.println("Ingrese la opcion deseada");
        System.out.println("1)Sumar dichos numeros");
        System.out.println("2)Restar dichos numeros");
        System.out.println("3)Multiplicar dichos numeros");
        System.out.println("4)Dividir dichos numeros");
        System.out.println("5)Finalizar");
        opc = leer.nextInt();
        
        
        int resultadoS = Suma(num1,num2);
        int resultadoR = Resta(num1,num2);
        int resultadoM = Multi(num1,num2);
        float resultadoD = Divi(num1,num2);
        
        switch(opc){
            case 1:
                System.out.println("El resultado es: " + resultadoS);
                break;
            case 2:
                System.out.println("El resultado es:" + resultadoR);
                break;
            case 3:
                System.out.println("El resultado es:" + resultadoM);
                break;
             case 4:
                System.out.println("El resultado es:" + resultadoD);
                break;
             case 5:
                 System.out.println("Saliendo...");
                 break;
            default:
                System.out.println("La opcion no es valida");
                break;
        }
    }
      while(opc<= 4);
    }
    public static int Suma(int num1 , int num2){
        int resultadoS = num1 + num2;
        return resultadoS;
    }
    
    public static int Resta(int num1, int num2){
    int resultadoR = num1 - num2;
    return resultadoR;
    }
    
    public static int Multi(int num1, int num2){
    int resultadoM = num1 * num2;
    return resultadoM;
    }
    
    public static float Divi(int num1, int num2){
    float resultadoD = num1 / num2;
    return resultadoD;
    }
}
=======
/*
 * Crea una aplicación que le pida dos números al usuario 
 * y este pueda elegir entre sumar, restar, multiplicar y dividir. 
 * La aplicación debe tener una función para cada operación matemática 
 * y deben devolver sus resultados para imprimirlos en el main. 
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class elegirOperacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = 0, num2=0;
        
        
        System.out.println("Ingrese 2 numeros, por favor");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        int opc;
        do{
        System.out.println("Ingrese la opcion deseada");
        System.out.println("1)Sumar dichos numeros");
        System.out.println("2)Restar dichos numeros");
        System.out.println("3)Multiplicar dichos numeros");
        System.out.println("4)Dividir dichos numeros");
        System.out.println("5)Finalizar");
        opc = leer.nextInt();
        
        
        int resultadoS = Suma(num1,num2);
        int resultadoR = Resta(num1,num2);
        int resultadoM = Multi(num1,num2);
        float resultadoD = Divi(num1,num2);
        
        switch(opc){
            case 1:
                System.out.println("El resultado es: " + resultadoS);
                break;
            case 2:
                System.out.println("El resultado es:" + resultadoR);
                break;
            case 3:
                System.out.println("El resultado es:" + resultadoM);
                break;
             case 4:
                System.out.println("El resultado es:" + resultadoD);
                break;
             case 5:
                 System.out.println("Saliendo...");
                 break;
            default:
                System.out.println("La opcion no es valida");
                break;
        }
    }
      while(opc<= 4);
    }
    public static int Suma(int num1 , int num2){
        int resultadoS = num1 + num2;
        return resultadoS;
    }
    
    public static int Resta(int num1, int num2){
    int resultadoR = num1 - num2;
    return resultadoR;
    }
    
    public static int Multi(int num1, int num2){
    int resultadoM = num1 * num2;
    return resultadoM;
    }
    
    public static float Divi(int num1, int num2){
    float resultadoD = num1 / num2;
    return resultadoD;
    }
}
>>>>>>> c70357b6a524489a3be1af6de8717370a7b2b176
