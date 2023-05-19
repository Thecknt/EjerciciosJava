/*
 
 */
package Entidades;

public class Poliza {

    private int numeroDePoliza;
    private int fechaDeInicio;
    private int finDePoliza;
    private boolean granizo;
    private String montoMaxGranizo;
    private String tipoDecobertura;
    
    private Cuotas cuota = new Cuotas();
    private Vehiculo auto = new Vehiculo();

    public Poliza() {
    }

    public Poliza(int numeroDePoliza, int fechaDeInicio, int finDePoliza, boolean granizo, String montoMaxGranizo, String tipoDecobertura) {
        this.numeroDePoliza = numeroDePoliza;
        this.fechaDeInicio = fechaDeInicio;
        this.finDePoliza = finDePoliza;
        this.granizo = granizo;
        this.montoMaxGranizo = montoMaxGranizo;
        this.tipoDecobertura = tipoDecobertura;
    }

    public int getNumeroDePoliza() {
        return numeroDePoliza;
    }

    public void setNumeroDePoliza(int numeroDePoliza) {
        this.numeroDePoliza = numeroDePoliza;
    }

    public int getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(int fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public int getFinDePoliza() {
        return finDePoliza;
    }

    public void setFinDePoliza(int finDePoliza) {
        this.finDePoliza = finDePoliza;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public String getMontoMaxGranizo() {
        return montoMaxGranizo;
    }

    public void setMontoMaxGranizo(String montoMaxGranizo) {
        this.montoMaxGranizo = montoMaxGranizo;
    }

    public String getTipoDecobertura() {
        return tipoDecobertura;
    }

    public void setTipoDecobertura(String tipoDecobertura) {
        this.tipoDecobertura = tipoDecobertura;
    }

    public Cuotas getCuota() {
        return cuota;
    }

    public void setCuota(Cuotas cuota) {
        this.cuota = cuota;
    }

    @Override
    public String toString() {
        return "Poliza{" + "numeroDePoliza=" + numeroDePoliza + ", fechaDeInicio=" + fechaDeInicio + ", finDePoliza=" + finDePoliza + ", granizo=" + granizo + ", montoMaxGranizo=" + montoMaxGranizo + ", tipoDecobertura=" + tipoDecobertura + ", cuota=" + cuota + '}';
    }

}
