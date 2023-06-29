
package tienda.servicios;

import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

public class FabricanteService {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    private FabricanteDAO dao;
    
    
    public FabricanteService() {
        this.dao = new FabricanteDAO();
    }
    
    Fabricante fabricante;
    
    public Fabricante crearFabricante() throws Exception {
        int codigo;
        fabricante = new Fabricante();
        String nombre;

            System.out.println("Ingrese el nombre del Fabricante: ");
            nombre = input.next();
            System.out.println("Codigos de fabricantes ya asociados:");
            System.out.println("1)Asus - 2)Lenovo - 3)Hewlett-Packard ");
            System.out.println("4)Samsung - 5)Seagate - 6)Crucial");
            System.out.println("7) Gigabyte - 8)Huawei - 9)Xiaomi ");
            System.out.println("De los codigos mostrados ingrese el que corresponda o uno nuevo");
            System.out.println("Ingrese un nuevo codigo de fabricante, para poder asociarlo al producto: ");
            codigo = input.nextInt();

            fabricante.setNombre(nombre);
            fabricante.setCodigo(codigo);
        try {
             dao.guardarProducto(fabricante);
            System.out.println("El producto se ha creado exitosamente!");
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        } 
        return fabricante;
    }
    
}
