/*
. Existen dos tipos de alojamientos extrahoteleros: los Camping y las 
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños 
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se 
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no 
campo deportivo. Realizar un programa en el que se representen todas las relaciones 
descriptas. 
 */
package Entidades;

public class Camping extends ExtraHoteleros {
    
    private int capacidadMaximaCarpas;
    private int cantidadBanios;
    private String restaurantCamping;

    public Camping() {
    }

    public Camping(int capacidadMaximaCarpas, int cantidadBanios, String restaurantCamping, String privado, int cantidadMetros2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, cantidadMetros2, nombre, direccion, localidad, gerente);
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
        this.cantidadBanios = cantidadBanios;
        this.restaurantCamping = restaurantCamping;
    }

    public int getCapacidadMaximaCarpas() {
        return capacidadMaximaCarpas;
    }

    public void setCapacidadMaximaCarpas(int capacidadMaximaCarpas) {
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
    }

    public int getCantidadBanios() {
        return cantidadBanios;
    }

    public void setCantidadBanios(int cantidadBanios) {
        this.cantidadBanios = cantidadBanios;
    }

    public String getRestaurantCamping() {
        return restaurantCamping;
    }

    public void setRestaurantCamping(String restaurantCamping) {
        this.restaurantCamping = restaurantCamping;
    }

    public String getPrivado() {
        return privado;
    }

    public void setPrivado(String privado) {
        this.privado = privado;
    }

    public int getCantidadMetros2() {
        return cantidadMetros2;
    }

    public void setCantidadMetros2(int cantidadMetros2) {
        this.cantidadMetros2 = cantidadMetros2;
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
        return"**********************************************************************************"+
                "\n*                           Camping "+nombre+ "                                   *"+
                "\n**********************************************************************************"+
                "\n*) Tiene una capacidad maxima " + capacidadMaximaCarpas+" Carpas. " + "\n*) Tiene: " + cantidadBanios+ " baños. " + "\n*) Posee restaurante dentro del predio: " + restaurantCamping+
               "\n*) Es de acceso privado: "+ privado+
                "\n*) Posee "+cantidadMetros2 + "mts2 de pura conexion a la naturaleza."+
                "\n*) Nos podes encontrar en: "+direccion+". "+localidad+
                "\n*) El/La administrador/a es: "+gerente +
                "\n************************************************************************************";
    }
    
    //capacidadMaximaCarpas,cantidadBanios,restaurantCamping,campingPrivado,cantidadMetros2,nombre,direccion,localidad,gerente
}
