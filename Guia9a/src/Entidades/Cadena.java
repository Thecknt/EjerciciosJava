
package Entidades;

public class Cadena {
   private String frase;
   private int fraseLongitud;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.fraseLongitud = frase.length(); //seteo la longitud de la frase automaticamente.
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getFraseLongitud() {
        return fraseLongitud;
    }

    public void setFraseLongitud(int fraseLongitud) {
        this.fraseLongitud = fraseLongitud;
    }

    
}
