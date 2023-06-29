
package tienda.persistencia;

import java.util.Scanner;
import tienda.entidades.Fabricante;


public final class FabricanteDAO extends DAO{
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void guardarProducto(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe ingresar un valor correcto");
            }

            String sql = " INSERT INTO fabricante (codigo, nombre) "
                    + " VALUES ( ' " + fabricante.getCodigo() + " ' ,'" + fabricante.getNombre()
                    + " ' );";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminarFabricante(Fabricante fabricante) {
        System.out.println("Ingrese el nombre del Fabricante que desea eliminar");
        String nombreABorrar = input.next();
        try {
            String sql = "DELETE FROM fabricante WHERE nombre = ' " + nombreABorrar + " ' ";
            System.out.println("Fabricante eliminado exitosamente!");
        } catch (Exception e) {
            System.out.println("El Fabricante no pudo ser eliminado lamentablemente");
        }
    }
    
    public Fabricante buscarProducto() throws Exception {

        System.out.println("Ingrese el nombre del fabricante que desea consultar");
        String nombre = input.next();
        Fabricante fabricante = null;
        try {
            String sql = "SELECT * FROM fabricante" + "WHERE nombre =' " + nombre + " ' "; /*Con esto estoy expuesto a SQL injection*/
            consultarBase(sql);

            while (resultado.next()) {
                /*Si hay un valor proximo ejecuto lo siguiente*/
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
                
            }
            desconectarBase();
            
        } catch (Exception e) {
            System.out.println("No encontramos el producto lamentablemente");
            desconectarBase();
        }
      return fabricante;
    }
}
