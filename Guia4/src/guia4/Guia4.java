/*
 * Escribir un programa que procese una secuencia de caracteres 
 * ingresada por teclado y terminada en punto, y luego codifique 
 * la palabra o frase ingresada de la siguiente manera: cada vocal 
 * se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres 
 * (incluyendo a las vocales acentuadas) se mantienen sin cambios.
 * a = @
 * e = #
 * i = $
 * o = %
 * u = *
 * Realice un subprograma que reciba una secuencia de caracteres 
 * y retorne la codificación correspondiente. Utilice la estructura “según” para la transformación. 
 * Por ejemplo, si el usuario ingresa:  Ayer, lunes, salimos a las once y 10.
 * La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase; 
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
     
        String secuencia = fraseCambiada(frase);
        
        System.out.println("La frase codificada es: "+ secuencia);
        
    }
        public static String fraseCambiada(String frase){
        String secuencia = "";
        
        for(char caracter: frase.toCharArray()){ //<- esta línea permite recorrer 
            //cada caracter de la cadena secuencia 
            //en orden y ejecutar una operación en cada uno de ellos, 
            //como la codificación de las vocales.
        switch(Character.toLowerCase(caracter)) { //<- esta pasa todos los caracteres a minuscula
           case 'a':
                    secuencia = secuencia.concat("@");
                    break;
                case 'e':
                    secuencia = secuencia.concat("!");
                    break;
                case 'i':
                    secuencia = secuencia.concat("#");
                    break;
                case 'o':
                    secuencia = secuencia.concat("$");
                    break;
                case 'u':
                    secuencia = secuencia.concat("%");
                    break;
                default:
                    secuencia = secuencia.concat(Character.toString(caracter));
                    break;
                  }
                 }
                      return secuencia;
               }

              } 
     
/*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una secuencia de caracteres: ");
        String secuencia = sc.nextLine();

        // Convertir la secuencia ingresada a minúsculas para simplificar la codificación
        secuencia = secuencia.toLowerCase();

        // Llamar al subprograma para codificar la secuencia y almacenar el resultado
            // "String" se define el tipo de dato 
            // "secuencia_codificada" es el nombre  de la variable que va adevolver el sub programa
            // "codificar_secuencia" es el nombre del sub programa para analizar, se llama.  
            // "(secuencia)" es la variable que se quiere analizar 
        String secuencia_codificada = codificar_secuencia(secuencia);

        // Mostrar por pantalla la secuencia codificada resultante se llama la variable "secuencia_codificada"
        System.out.println("Secuencia codificada: " + secuencia_codificada);
    }
    
    //Sub Programa 
    
            //  "public static" por ahora tiene este formato siempre
            //  String tipo de dato de la variable del retortno de la funcion , se declara siempore como si fuera una nueva variable.
                        // en el caso que diga "void" el programa no devuelve ningun valor 
            // "codificar_secuencia" nombre del programa se llamara desde la pagina principal mediante este nombre
            /* 
               "(String secuencia)" parametros que recibe la funcion  
                "String" tipo del dato que se analiza "secuencia" argumentos hace uso de dichos valores recibidos como sea necesario
            */ 
    
/*    public static String codificar_secuencia(String secuencia) {
        // Crear una variable para almacenar la secuencia codificada
        String secuencia_codificada = "";

        /* Recorrer la secuencia caracter por caracter
        for (int i = 0; i < secuencia.length(); i++) { // "length" Retorna la longitud de la cadena
            char caracter = secuencia.charAt(i); // "charAt" Retorna el carácter especificado en la posición index (i)


            // Verificar si el caracter es una vocal y reemplazarlo por el carácter correspondiente
            switch (caracter) {
                case 'a':
                    secuencia_codificada += "@"; // reemplazar 'a' por '@'
                    break;
                case 'e':
                    secuencia_codificada += "#"; // reemplazar 'e' por '#'
                    break;
                case 'i':
                    secuencia_codificada += "$"; // reemplazar 'i' por '$'
                    break;
                case 'o':
                    secuencia_codificada += "%"; // reemplazar 'o' por '%'
                    break;
                case 'u':
                    secuencia_codificada += "*"; // reemplazar 'u' por '*'
                    break;
                default:
                    // Si el caracter no es una vocal, agregarlo a la secuencia codificada sin cambios
                    secuencia_codificada += caracter;
                    break;
            }
        }

 /       // Devolver la secuencia codificada resultante
        // retorno de la funcion 
 //       return secuencia_codificada;
 //   }
//}
/*
El programa comienza pidiendo al usuario que ingrese una secuencia de caracteres, que se almacena en la variable secuencia. 
Luego se convierte a minúsculas para simplificar la codificación. A continuación, se llama al subprograma codificar_secuencia 
pasando como argumento la secuencia ingresada por el usuario. 
El subprograma recorre la secuencia caracter por caracter, y para cada vocal encontrada, la reemplaza por 
el carácter correspondiente según la tabla dada. Para los caracteres que no son vocales, los agrega a 
la secuencia codificada sin cambios.
Finalmente, el programa muestra por pantalla la secuencia codificada resultante.
*/
    
           
