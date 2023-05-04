package EjerciciosGuia9;

import Servicio.FechaServicio;

public class Ejercicio4Fecha {

    public static void main(String[] args) {

        FechaServicio fs = new FechaServicio();

        fs.fechaNacimiento();
        fs.fechaActual();
        System.out.println("La fecha Actual es: " +fs.fechaActual());
        System.out.println("Es mayor de edad? "+ fs.diferencia(fs.fechaNacimiento(), fs.fechaActual()));
        
    }

}
