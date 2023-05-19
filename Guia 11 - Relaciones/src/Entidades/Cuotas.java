
package Entidades;

public class Cuotas {

    private int numeroDeCuota;
    private Double montoTotalDeLaCuota;
    private boolean estadoDeCuota;
    private String fechaDeVencimiento;
    private String formaDePago;
    
private Poliza seguro = new Poliza();

    public Cuotas() {
    }

    public Cuotas(int numeroDeCuota, Double montoTotalDeLaCuota, boolean estadoDeCuota, String fechaDeVencimiento, String formaDePago) {
        this.numeroDeCuota = numeroDeCuota;
        this.montoTotalDeLaCuota = montoTotalDeLaCuota;
        this.estadoDeCuota = estadoDeCuota;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.formaDePago = formaDePago;
    }

    public int getNumeroDeCuota() {
        return numeroDeCuota;
    }

    public void setNumeroDeCuota(int numeroDeCuota) {
        this.numeroDeCuota = numeroDeCuota;
    }

    public Double getMontoTotalDeLaCuota() {
        return montoTotalDeLaCuota;
    }

    public void setMontoTotalDeLaCuota(Double montoTotalDeLaCuota) {
        this.montoTotalDeLaCuota = montoTotalDeLaCuota;
    }

    public boolean isEstadoDeCuota() {
        return estadoDeCuota;
    }

    public void setEstadoDeCuota(boolean estadoDeCuota) {
        this.estadoDeCuota = estadoDeCuota;
    }

    public String getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(String fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public Poliza getSeguro() {
        return seguro;
    }

    public void setSeguro(Poliza seguro) {
        this.seguro = seguro;
    }

    @Override
    public String toString() {
        return "Cuotas{" + "numeroDeCuota=" + numeroDeCuota + ", montoTotalDeLaCuota=" + montoTotalDeLaCuota + ", estadoDeCuota=" + estadoDeCuota + ", fechaDeVencimiento=" + fechaDeVencimiento + ", formaDePago=" + formaDePago + ", seguro=" + seguro + '}';
    }

    
}
