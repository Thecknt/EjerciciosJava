/*
 */
package Entidades;

public class ImplementarInterfaz implements Interfaz {

    @Override
    public void metodo() {
        System.out.println("Esta es una prueba de clase abstracta");
    }

   @Override
   public int sumar() {
      int suma = 2 + 2;
     return suma;
   }
    
}
