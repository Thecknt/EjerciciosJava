/*
s. Para las residencias se 
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no 
campo deportivo. Realizar un programa en el que se representen todas las relaciones 
descriptas. 
 */
package Entidades;

public class Residencias extends ExtraHoteleros{
    private int cantidadHabitaciones;
    private String descuentosGremios;
    private String campoDeportivo;

    public Residencias() {
    }

    public Residencias(int cantidadHabitaciones, String descuentosGremios, String campoDeportivo, String privado, int cantidadMetros2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, cantidadMetros2, nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentosGremios = descuentosGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public String getDescuentosGremios() {
        return descuentosGremios;
    }

    public void setDescuentosGremios(String descuentosGremios) {
        this.descuentosGremios = descuentosGremios;
    }

    public String getCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(String campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
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
        return "**********************************************************************************"+
                "\n*                      La Residencia "+nombre+ "                                 *"+
                "\n**********************************************************************************"+
                "\n*) Tiene " + cantidadHabitaciones+" habitaciones. " + "\n*) Tiene descuentos a Gremios: " + descuentosGremios + "\n*) Posee campo Deportivo: " + campoDeportivo+
               "\n*) Es de acceso privado: "+ privado+
                "\n*) Posee "+cantidadMetros2 + "mts2 destinados recargar energias."+
                "\n*) Nos podes encontrar en: "+direccion+". "+localidad+
                "\n*) El/La administrador/a es: "+gerente +
                "\n************************************************************************************";
        //     cantidadHabitaciones,descuentosGremios,campoDeportivo,residenciaPrivada,cantidadMetros2,nombre,direccion,localidad,gerente
    }
    
    
}
