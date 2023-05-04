
package metodos;

public class Cancion {
  
    String song;
    String author;

    public Cancion() {
    }

    public Cancion(String song, String author) {
        this.song = song;
        this.author = author;
    }

    public String getSong() {
        return song;
    }

    public String getAuthor() {
        return author;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    
}
