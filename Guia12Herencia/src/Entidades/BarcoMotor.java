/*

 */
package Entidades;

import java.util.Date;

public class BarcoMotor extends Barco {
    
    Integer potenciaMotor;

    public BarcoMotor() {
    }

    public BarcoMotor(Integer potenciaMotor, Integer matricula, Integer eslora, Date fechaFabricacion) {
        super(matricula, eslora, fechaFabricacion);
        this.potenciaMotor = potenciaMotor;
    }

    public Integer getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(Integer potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
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
        return "BarcoMotor{" + "potenciaMotor=" + potenciaMotor + '}';
    }

    
    
}
