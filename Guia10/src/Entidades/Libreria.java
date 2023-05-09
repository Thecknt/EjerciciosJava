/*
 Implemente un programa para una Librería haciendo uso de un HashSet para evitar
datos repetidos. Para ello, se debe crear una clase llamada Libreria que guarde la
información de cada uno de los libros de una Biblioteca. La clase Libreria debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libreria que guardará todos los libros
creados.
En el main tendremos un bucle que crea un objeto Libreria pidiéndole al usuario todos
sus datos y los seteandolos en el Libreria. Despues, ese Libreria se guarda en el conjunto y
se le pregunta al usuario si quiere crear otro Libreria o no.
La clase Librería contendrá además los siguientes métodos:
• Constructor por defecto.
• Constructor con parámetros.
• Métodos Setters/getters
• Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libreria al
método. El método se incrementa de a uno, como un carrito de compras, el
atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
que no queden ejemplares disponibles para prestar. Devuelve true si se ha
podido realizar la operación y false en caso contrario.
• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
El método decrementa de a uno, como un carrito de compras, el atributo
ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
vez que se produzca la devolución de un libro. No se podrán devolver libros
donde que no tengan ejemplares prestados. Devuelve true si se ha podido
realizar la operación y false en caso contrario.
• Método toString para mostrar los datos de los libros.
 */
package Entidades;

public class Libreria {

    private String titulo;
    private String autor;
    private int numeroLibros;
    private int librosPrestados;

    public Libreria() {
    }

    public Libreria(String titulo, String autor, int numeroLibros, int librosPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroLibros = numeroLibros;
        this.librosPrestados = librosPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroLibros() {
        return numeroLibros;
    }

    public void setNumeroLibros(int numeroLibros) {
        this.numeroLibros = numeroLibros;
    }

    public int getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(int librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    @Override
    public String toString() {
        return "Los libros en Libreria son: {" + "\n Titulo: " + titulo + "\n Autor: " + autor + "\n Numero de Ejemplares: " + numeroLibros + "\n Cantidad de Libros Prestados: " + librosPrestados + '}';
    }

}
