/*
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los 
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada 
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros 
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las 
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños 
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se 
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no 
campo deportivo. Realizar un programa en el que se representen todas las relaciones 
descriptas. 
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios: 
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
 */
package Entidades;

public class ExtraHoteleros extends Alojamientos{
    
    protected String privado;
    protected int cantidadMetros2;

    public ExtraHoteleros() {
    }

    public ExtraHoteleros(String privado, int cantidadMetros2, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.cantidadMetros2 = cantidadMetros2;
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
    
    
}
