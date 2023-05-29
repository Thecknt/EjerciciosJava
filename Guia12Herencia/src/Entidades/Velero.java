/*

 */
package Entidades;

import java.util.Date;


public class Velero extends Barco {
    
   private Integer numeroMastiles;

    public Velero() {
    }

    public Velero(Integer numeroMastiles, Integer matricula, Integer eslora, Date fechaFabricacion) {
        super(matricula, eslora, fechaFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public Integer getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(Integer numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }
    
    
}
