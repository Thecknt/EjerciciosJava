
package Entidades;

public class Ahorcado {
    private String [] palabra;
    private String [] frase;
    private int cantidadDeLetrasEncontradas;
    private int cantJugadasMaximas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, String[] frase, int cantidadDeLetrasEncontradas, int cantJugadasMaximas) {
        this.palabra = palabra;
        this.frase = frase;
        this.cantidadDeLetrasEncontradas = cantidadDeLetrasEncontradas;
        this.cantJugadasMaximas = cantJugadasMaximas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public String[] getFrase() {
        return frase;
    }

    public void setFrase(String[] frase) {
        this.frase = frase;
    }

    public int getCantidadDeLetrasEncontradas() {
        return cantidadDeLetrasEncontradas;
    }

    public void setCantidadDeLetrasEncontradas(int cantidadDeLetrasEncontradas) {
        this.cantidadDeLetrasEncontradas = cantidadDeLetrasEncontradas;
    }

    public int getCantJugadasMaximas() {
        return cantJugadasMaximas;
    }

    public void setCantJugadasMaximas(int cantJugadasMaximas) {
        this.cantJugadasMaximas = cantJugadasMaximas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", frase=" + frase + ", cantidadDeLetrasEncontradas=" + cantidadDeLetrasEncontradas + ", cantJugadasMaximas=" + cantJugadasMaximas + '}';
    }

    
    
}
/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, 
un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad jugadas máximas que puede realizar el usuario. 

Definir los siguientes métodos en AhorcadoService:
Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del usuario, pone la longitud de la palabra, 
como la longitud del vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en un índice del vector. 
Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la palabra o no. 
También informará si la letra estaba o no.
Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han sido encontradas y cuántas le faltan. 
Este método además deberá devolver true si la letra estaba y false si la letra no estaba, 
ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará cuando el usuario descubra 
toda la palabra o se quede sin intentos. Este método se llamará en el main.
*/