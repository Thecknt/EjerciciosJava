package Entidades;

public class Vehiculo {
   private int marca; 
private String modelo;
private String anio;
private int numeroDeMotor;
private int chasis; 
private String color;
private String tipo;

private Poliza seguro = new Poliza();
private Cliente cliente = new Cliente();

    public Vehiculo() {
    }

    public Vehiculo(int marca, String modelo, String anio, int numeroDeMotor, int chasis, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numeroDeMotor = numeroDeMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public int getNumeroDeMotor() {
        return numeroDeMotor;
    }

    public void setNumeroDeMotor(int numeroDeMotor) {
        this.numeroDeMotor = numeroDeMotor;
    }

    public int getChasis() {
        return chasis;
    }

    public void setChasis(int chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Poliza getSeguro() {
        return seguro;
    }

    public void setSeguro(Poliza seguro) {
        this.seguro = seguro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", numeroDeMotor=" + numeroDeMotor + ", chasis=" + chasis + ", color=" + color + ", tipo=" + tipo + ", seguro=" + seguro + ", cliente=" + cliente + '}';
    }


}
