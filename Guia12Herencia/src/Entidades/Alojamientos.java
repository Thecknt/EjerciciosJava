/*
Una compañía de promociones turísticas desea mantener información sobre la infraestructura 
de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de 
acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección, 
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de 
alojamientos: Hoteles y Alojamientos Extrahoteleros.
 */
package Entidades;

public class Alojamientos {
    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerente;

    public Alojamientos() {
    }

    public Alojamientos(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "Estamos ubicado en: " + direccion + ", en la localidad de: " + localidad + "\n nuestro gerente a cargo es: " + gerente;
    }
    
    
}
