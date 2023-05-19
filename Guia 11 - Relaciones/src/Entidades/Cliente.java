
package Entidades;

public class Cliente {
    private String nombre;
    private String apellido; 
    private int documento;
    private String email; 
    private String domicilio; 
    private int telefono;

    private Vehiculo auto = new Vehiculo();
    private Cuotas pago = new Cuotas();
    private Poliza seguro = new Poliza();

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, int documento, String email, String domicilio, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.email = email;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Vehiculo getAuto() {
        return auto;
    }

    public void setAuto(Vehiculo auto) {
        this.auto = auto;
    }

    public Cuotas getPago() {
        return pago;
    }

    public void setPago(Cuotas pago) {
        this.pago = pago;
    }

    public Poliza getSeguro() {
        return seguro;
    }

    public void setSeguro(Poliza seguro) {
        this.seguro = seguro;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", email=" + email + ", domicilio=" + domicilio + ", telefono=" + telefono + ", auto=" + auto + ", pago=" + pago + ", seguro=" + seguro + '}';
    }
    
    
    

}
