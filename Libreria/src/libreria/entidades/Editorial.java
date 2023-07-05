package libreria.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Editorial implements Serializable {

    private boolean alta;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;

    public Editorial() {
    }

    public Editorial(boolean alta, Integer id, String nombre) {
        this.alta = alta;
        this.id = id;
        this.nombre = nombre;
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

    public void setAlta(boolean alta) {
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
        if (!(object instanceof Editorial)) {
            return false;
        }
        Editorial other = (Editorial) object;
        if (this.alta != other.alta) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\n "
                + "\n La Editorial: " + nombre
                + "\n ¿Esta dada de alta? -> " + alta
                + "\n Su id es: " + id;
    }

}
