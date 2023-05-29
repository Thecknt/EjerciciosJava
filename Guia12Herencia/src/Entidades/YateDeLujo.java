/*

 */
package Entidades;

import java.util.Date;

public class YateDeLujo extends Barco {
    Integer potenciaMotor;
    Integer NumeroCamarotes;

    public YateDeLujo() {
    }

    public YateDeLujo(Integer potenciaMotor, Integer NumeroCamarotes, Integer matricula, Integer eslora, Date fechaFabricacion) {
        super(matricula, eslora, fechaFabricacion);
        this.potenciaMotor = potenciaMotor;
        this.NumeroCamarotes = NumeroCamarotes;
    }

    public Integer getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(Integer potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public Integer getNumeroCamarotes() {
        return NumeroCamarotes;
    }

    public void setNumeroCamarotes(Integer NumeroCamarotes) {
        this.NumeroCamarotes = NumeroCamarotes;
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
        return "YateDeLujo{" + "potenciaMotor=" + potenciaMotor + ", NumeroCamarotes=" + NumeroCamarotes + '}';
    }
    
    
}
