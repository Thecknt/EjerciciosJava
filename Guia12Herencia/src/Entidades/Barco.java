/*

 */
package Entidades;

import java.util.Date;

public class Barco {
    Integer matricula;
    Integer eslora;
    Date fechaFabricacion;

    public Barco() {
    }

    public Barco(Integer matricula, Integer eslora, Date fechaFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.fechaFabricacion = fechaFabricacion;
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

    @Override
    public String toString() {
        return "\n Los datos del Barco son: " + "\n Matricula: " + matricula + " - eslora: " + eslora + " - fecha de Fabricacion: " + fechaFabricacion;
    }
    
    
    
}
