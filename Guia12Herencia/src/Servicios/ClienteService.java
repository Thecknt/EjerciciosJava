/*

 */
package Servicios;


import Entidades.Barco;
import Entidades.Cliente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ClienteService {
    Cliente cliente;
    Scanner input  = new Scanner(System.in).useDelimiter("\n");
    
    SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy");
    Date fechaAlquiler;
    Date fechaDevolucion;
    Double alquilerBase;
  
    Barco barco = new Barco();
    
    public Cliente ingresarDatosClientes(){  
        
        cliente = new Cliente();
        Date fechaActual= new Date();
        System.out.println("Ingrese sus datos a continuacion para poder guardar su Barco en el muelle");
        System.out.println("Ingrese su nombre:................> ");
        cliente.setNombre(input.next());
        System.out.println("Ingrese su Dni sin puntos.........>");
        cliente.setDNI(input.nextInt());
        System.out.println("Ingrese la fecha de ingreso - dd/MM/yyyy...............>");
        String fechaAlquilerString = input.next();
        try {
        fechaAlquiler = simpleDate.parse(fechaAlquilerString);
        cliente.setFechaAlquiler(fechaAlquiler);
    } catch (ParseException e) {
        System.out.println("Fecha incorrecta de alquiler. Intente nuevamente <...............");
        // Manejo del error o salida del programa si la fecha no se puede analizar correctamente
    }
        
        System.out.println("Ingrese la fecha de retiro del Barco - dd/MM/yyyy......>");
        String fechaRetiro= input.next();
        
        try {
       fechaDevolucion = simpleDate.parse(fechaRetiro);
       cliente.setFechaDevolucion(fechaDevolucion);
    } catch (ParseException e) {
        System.out.println("Fecha incorrecta de Retiro. Intente nuevamente <................");
        // Manejo del error o salida del programa si la fecha no se puede analizar correctamente
    }
        
        System.out.println("En este momento tenemos distintas posiciones disponibles de amarre");
        System.out.println("Ingrese un numero del 1 al 10...............>");
        cliente.setPosicionAmarre(input.nextInt());
        //cliente = new Cliente(nombre,DNI,fechaAlquiler,fechaDevolucion,posicionAmarre);
        //System.out.println("Los datos son" + cliente);
        return cliente; 
    }
    
      public Cliente getCliente() {
        return cliente;
    }
    
    public void alquilerBase(Cliente cliente, Barco barco){
    Date alquiler = cliente.getFechaAlquiler();
    Date devolucion = cliente.getFechaDevolucion();
    Integer eslora = barco.getEslora();
    long diferenciaEnMillis = devolucion.getTime() - alquiler.getTime();
    long diasDiferencia = TimeUnit.MILLISECONDS.toDays(diferenciaEnMillis);
    
    alquilerBase = Double.valueOf(diasDiferencia * eslora); 
// Al utilizar Double.valueOf() con el resultado de la multiplicación, se crea un objeto Double 
        System.out.println("Tarifa base: $"+alquilerBase);
      
    }
}
