/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libroCaracteristicas;

public class Propiedad {

    public int ISBN;
    public String Autor;
    public String Titulo;
    public int paginas;

//Creo el constructor donde recibe estos parametros para asignarlos
// click derecho insert code --> constructor --> Elijo lo que quiero recibir por parametro
    public Propiedad(int ISBN, String Autor, String Titulo, int paginas) {
        this.ISBN = ISBN;
        this.Autor = Autor;
        this.Titulo = Titulo;
        this.paginas = paginas;
    }

    public Propiedad() {
        //constructor vacio
    }

}
