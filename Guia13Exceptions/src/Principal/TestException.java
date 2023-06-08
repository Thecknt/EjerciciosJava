/*
test exception:
Vamos a probar leer un archivo txt, puede suceder a veces que dicho archivo se mueva o borre por el usuario 
y el programa arroje una excepcion de que no encuentra el archivo
 */
package Principal;

import Entidades.Test;

public class TestException {

    public static void main(String[] args) {
  
       Test t = new Test();
  
       t.leerArchivo();
    }
    
}
