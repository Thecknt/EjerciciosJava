
package Entidades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    FileReader fr;
     public void leerArchivo() { //throws FileNotFoundException * Puedo arrojar esta excepcion desde el nombre del metodo 
         // ya que en algun momento este metodo puede tener un error en encontrar el archivo
        File archivo = new File("C:\\Users\\santi\\OneDrive\\Documentos\\NetBeansProjects\\Guia13Exceptions\\src\\archivo.txt");
         try {
             fr = new FileReader(archivo);
             
           BufferedReader br = new BufferedReader(fr); //leo el contenido del archivo linea por linea
           String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close(); //Cierro el bufferReader para liberar los recursos asociados y permitir que otros procesos accedan al archivo.
         } catch (FileNotFoundException ex) { 
             Logger.getLogger("Archivo no encontrado"+Test.class.getName()).log(Level.SEVERE, null, ex); //Manejo cada excepcion de manera separada, primero si no escuentra el archivo
         }  catch (IOException ex) {
            Logger.getLogger("Error de lectura" + Test.class.getName()).log(Level.SEVERE, null, ex); // y segundo por si no puede leer el archivo
        }
     }    
     
}
