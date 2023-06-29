package tienda.servicios;

import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

public class ProductoService {
String nombre;
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    FabricanteService fs = new FabricanteService();
    Producto producto;

    private ProductoDAO dao;

    public ProductoService() {
        this.dao = new ProductoDAO();
    }

    public Producto crearProducto() {
        int codigo;
        producto = new Producto();
        String nombre;
        double precio;

        try {
            System.out.println("Ingrese el nombre del Producto: ");
            nombre = input.next();
            System.out.println("Ingrese el precio ($) del Producto: ");
            precio = input.nextDouble();
            System.out.println("Codigos de fabricantes:");
            System.out.println("1)Asus - 2)Lenovo - 3)Hewlett-Packard ");
            System.out.println("4)Samsung - 5)Seagate - 6)Crucial");
            System.out.println("7) Gigabyte - 8)Huawei - 9)Xiaomi ");
            System.out.println("De los codigos mostrados ingrese el que corresponda");
            do {
                System.out.println("Ingrese el codigo del Fabricante");
                codigo = input.nextInt();

                if (codigo > 9) {
                    System.out.println("El codigo debe ser del 1 al 9");
                }
            } while (codigo > 9);
            producto.setNombre(nombre);
            producto.setPrecio(precio);

            producto.setCodigo_fabricante(codigo);

            dao.guardarProducto(producto);
            System.out.println("El producto se ha creado exitosamente!");
        } catch (Exception e) {
            System.out.println("Error al crear el producto");
            System.out.println("error: " + e.getMessage());
        }
        return producto;
    }

    public Producto modificarProducto() throws Exception {
        nombre = null;
        try {
            dao.modificarProducto(producto, nombre);
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }

        return producto;
    }

    public void consultas() throws Exception {
        int opcion;
        do {
            System.out.println("*************************************************************************************");
            System.out.println("*                        Ingrese la opcion deseada                                  *");
            System.out.println("* 1) Lista el nombre de todos los productos que hay en la tabla producto.           *");
            System.out.println("* 2) Lista los nombres y los precios de todos los productos de la tabla producto.   *");
            System.out.println("* 3) Listar aquellos productos que su precio esté entre 120 y 202.                  *");
            System.out.println("* 4) Buscar y listar todos los Portátiles de la tabla producto.                     *");
            System.out.println("* 5) Listar el nombre y el precio del producto más barato.                          *");
            System.out.println("* 6) Ingresar un producto a la base de datos.                                       *");
            System.out.println("* 7) Ingresar un fabricante a la base de datos                                      *");
            System.out.println("* 8) Editar un producto con datos a elección                                        *");
            System.out.println("* 9) Salir                                                                          *");
            System.out.println("*************************************************************************************");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    dao.mostrarTablaCompleta();
                    break;
                case 2:
                    dao.mostrarTodosLosPrecios();
                    break;
                case 3:
                    dao.difrenciaEntre120Y202();
                    break;
                case 4:
                    dao.portatiles();
                    break;
                case 5:
                    dao.productoMasBarato();
                    break;
                case 6:
                    crearProducto();
                    break;
                case 7:
                     fs.crearFabricante();
                    break;
                case 8:
                     dao.modificarProducto(producto, nombre);
                    break;
                case 9:
                    System.out.println("Gracias por utilizar nuestro sistema de consultas");
                    break;
                default:
                    System.out.println("Elija una opcion valida");
                    break;
            }
        } while (opcion != 9);
    }

}
