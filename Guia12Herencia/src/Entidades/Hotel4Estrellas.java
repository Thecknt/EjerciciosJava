/*
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio, 
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones. 
 */
package Entidades;

public class Hotel4Estrellas extends Hoteles{
    
    protected char gimnasio;
    protected String nombreRestaurant;
    protected int capacidadRestaurant;

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(char gimnasio, String nombreRestaurant, int capacidadRestaurant) {
        this.gimnasio = gimnasio;
        this.nombreRestaurant = nombreRestaurant;
        this.capacidadRestaurant = capacidadRestaurant;
    }

    public Hotel4Estrellas(char gimnasio, String nombreRestaurant, int capacidadRestaurant, int cantHabitaciones, int numeroDeCamas, int cantidadPisos, Double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, numeroDeCamas, cantidadPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurant = nombreRestaurant;
        this.capacidadRestaurant = capacidadRestaurant;
    }

    public char getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(char gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurant() {
        return nombreRestaurant;
    }

    public void setNombreRestaurant(String nombreRestaurant) {
        this.nombreRestaurant = nombreRestaurant;
    }

    public int getCapacidadRestaurant() {
        return capacidadRestaurant;
    }

    public void setCapacidadRestaurant(int capacidadRestaurant) {
        this.capacidadRestaurant = capacidadRestaurant;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNumeroDeCamas() {
        return numeroDeCamas;
    }

    public void setNumeroDeCamas(int numeroDeCamas) {
        this.numeroDeCamas = numeroDeCamas;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public Double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(Double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
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
        return "*************************************************************************************"
              +"\n*                   "  +nombre +" **** Estrellas                                *" + 
                "\n*************************************************************************************"+
                "\n*) posee un gimnasio categoria " + gimnasio +" con equipos adaptados a las rutinas mas utilizadas."+ 
                "\n*) Nuestra capacidad en el Restaurant es de: " + capacidadRestaurant +" personas."
               + "\n*) Estamos ubicados en la ciudad de: " + localidad + "\n*) Nuestra Direccion es: "+ direccion +
                "\n*) En caso de desear hablar con nuestreo gerente " + gerente+ ", no dude en avisarnos.";
    }
    
    
    
}
