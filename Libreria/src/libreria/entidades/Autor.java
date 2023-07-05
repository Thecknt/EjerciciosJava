package libreria.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;

@Entity
public class Autor implements Serializable {

    private boolean alta;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;

    public Autor() {
    }

    public Autor(boolean alta, Integer id, String nombre) {
        this.alta = alta;
        this.id = id;
        this.nombre = nombre;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getAlta() {
        return alta;
    }

    public void setId(boolean alta) {
        this.alta = alta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (alta ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Autor)) {
            return false;
        }
        Autor other = (Autor) object;
        if (this.alta != other.alta) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\n Autor: " + nombre
                + "\n Fecha de alta: " + alta
                + "\n id:" + id;
    }

}
