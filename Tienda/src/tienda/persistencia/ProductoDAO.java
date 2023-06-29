package tienda.persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import tienda.entidades.Producto;

public final class ProductoDAO extends DAO {

    List<Producto> productos;
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe ingresar un producto completo");
            }

            String sql = " INSERT INTO producto (codigo, nombre, precio, codigo_fabricante) "
                    + " VALUES ( ' " + producto.getCodigo() + " ' ,'" + producto.getNombre() + " ',' "
                    + producto.getPrecio() + " ',' " + producto.getCodigo_fabricante() + " ' );";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarProducto(Producto producto, String nombre) throws Exception {
        producto = new Producto();
        int nombreFabricante;
        try {
            if (producto == null) {
                throw new Exception("Debe indicar un producto que desea Modificar");
            }
            String sql;
            int opcion = 0;
            do {
                System.out.println("¿Que desea modificar?");
                System.out.println("Seleccione una opcion:");
                System.out.println("1) ¿Desea cambiar el Nombre del producto?");
                System.out.println("2) ¿Desea cambiar el precio del Producto?");
                System.out.println("3) Salir");
                opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el nombre del producto");
                        nombre = input.next();
                        System.out.println("Ahora como lo llamara al nuevo producto que desea renombrar");
                        String nombreNuevo = input.next();
                        System.out.println("Indique a que Fabricante pertenece: ");
                        System.out.println("Codigos de fabricantes:");
                        System.out.println("1)Asus - 2)Lenovo - 3)Hewlett-Packard ");
                        System.out.println("4)Samsung - 5)Seagate - 6)Crucial");
                        System.out.println("7) Gigabyte - 8)Huawei - 9)Xiaomi ");
                        System.out.println("De los codigos mostrados ingrese el que corresponda");
                        nombreFabricante = input.nextInt();
                        System.out.println("Modificando nombre del producto...");
                        System.out.println(producto.getNombre());
                        sql = " UPDATE producto SET "
                                + "nombre = '" + nombreNuevo + "' WHERE nombre LiKE '%" + nombre + "%' AND codigo_fabricante = " + nombreFabricante + ";";
                        insertarModificarEliminar(sql);
                        System.out.println("Nombre cambiado exitosamente");
                        break;
                    case 2:
                        try {
                        System.out.println("Ingrese el nombre del producto al cual va a cambiar su precio");
                        String nombreProducto = input.next();
                        System.out.println("Indique a que Fabricante pertenece: ");
                        System.out.println("Codigos de fabricantes:");
                        System.out.println("1)Asus - 2)Lenovo - 3)Hewlett-Packard ");
                        System.out.println("4)Samsung - 5)Seagate - 6)Crucial");
                        System.out.println("7) Gigabyte - 8)Huawei - 9)Xiaomi ");
                        System.out.println("De los codigos mostrados ingrese el que corresponda");
                        nombreFabricante = input.nextInt();
                        System.out.println("Ingrese el precio a cambiar");
                        double precio = input.nextDouble();
                        System.out.println("Cambiando precio del producto . . . .");
                        sql = " UPDATE producto SET "
                                + "precio = '" + precio + "' WHERE nombre LiKE '%" + nombreProducto + "%' AND codigo_fabricante = " + nombreFabricante + ";";
                        insertarModificarEliminar(sql);

                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    System.out.println("Nombre Cambiado exitosamente!");
                    break;
                    case 3:
                        System.out.println("Gracias por utilizar nuestro servicio de consultas y modificaciones");
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida");
                        break;
                }
            } while (opcion != 3);

        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarProducto(Producto producto) {
        System.out.println("Ingrese el nombre del producto que desea eliminar");
        String nombreABorrar = input.next();
        try {
            String sql = "DELETE FROM producto WHERE nombre = ' " + nombreABorrar + " ' ";
            System.out.println("Producto eliminado exitosamente!");
        } catch (Exception e) {
            System.out.println("El producto no pudo ser eliminado lamentablemente");
        }
    }

    public Producto buscarProducto() throws Exception {

        System.out.println("Ingrese el nombre del producto que desea consultar");
        String nombre = input.next();
        Producto producto = null;
        try {
            String sql = "SELECT * FROM producto" + "WHERE nombre =' " + nombre + " ' ";
            /*Con esto estoy expuesto a SQL injection*/
            consultarBase(sql);

            while (resultado.next()) {
                /*Si hay un valor proximo ejecuto lo siguiente*/
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigo_fabricante(resultado.getInt(4));
            }
            desconectarBase();

        } catch (Exception e) {
            System.out.println("No encontramos el producto lamentablemente");
            desconectarBase();
        }
        return producto;
    }

    public List<Producto> mostrarTablaCompleta() throws Exception {
        productos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM producto";
            /*Con esto estoy expuesto a SQL injection*/
            consultarBase(sql);

            while (resultado.next()) {
                /*Si hay un valor proximo ejecuto lo siguiente*/
                Producto producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigo_fabricante(resultado.getInt(4));

                productos.add(producto);
            }
            desconectarBase();

        } catch (Exception e) {
            System.out.println("No encontramos el producto lamentablemente");
            desconectarBase();
        }

        for (Producto producto : productos) {
            System.out.println(producto);
        }
        return productos;
    }

    public List<Producto> mostrarTodosLosPrecios() throws Exception {
        productos = new ArrayList();
        try {
            String sql = "SELECT nombre, precio FROM producto";
            consultarBase(sql);

            while (resultado.next()) {
                /*Si hay un valor proximo ejecuto lo siguiente*/
                Producto producto = new Producto();

                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));

                productos.add(producto);
            }
            desconectarBase();
        } catch (Exception e) {
            System.out.println("Lamentamos no poder procesar tu consulta");
            System.out.println("Error: " + e.getMessage());
            desconectarBase();
        }

        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("----------------------------------");
        }
        return productos;
    }

    public List<Producto> difrenciaEntre120Y202() throws Exception {
        productos = new ArrayList();
        try {
            String sql = "SELECT nombre, precio FROM producto WHERE precio >120 AND precio <202";
            consultarBase(sql);

            while (resultado.next()) {
                /*Si hay un valor proximo ejecuto lo siguiente*/
                Producto producto = new Producto();

                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));

                productos.add(producto);
            }
            desconectarBase();
        } catch (Exception e) {
            System.out.println("Lamentamos no poder procesar tu consulta");
            System.out.println("Error: " + e.getMessage());
            desconectarBase();
        }

        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("----------------------------------");
        }
        return productos;
    }

    public List<Producto> portatiles() throws Exception {
        productos = new ArrayList();
        try {
            String sql = "SELECT nombre FROM producto WHERE nombre LIKE '%Portatil%';";
            consultarBase(sql);

            while (resultado.next()) {
                /*Si hay un valor proximo ejecuto lo siguiente*/
                Producto producto = new Producto();

                producto.setNombre(resultado.getString(1));

                productos.add(producto);
            }
            desconectarBase();
        } catch (Exception e) {
            System.out.println("Lamentamos no poder procesar tu consulta");
            System.out.println("Error: " + e.getMessage());
            desconectarBase();
        }

        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("----------------------------------");
        }
        return productos;
    }

    public List<Producto> productoMasBarato() throws Exception {
        productos = new ArrayList();
        try {
            String sql = "SELECT nombre, precio FROM producto WHERE precio = (SELECT MIN(precio) FROM producto);";
            consultarBase(sql);

            while (resultado.next()) {
                /*Si hay un valor proximo ejecuto lo siguiente*/
                Producto producto = new Producto();

                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));

                productos.add(producto);
            }
            desconectarBase();
        } catch (Exception e) {
            System.out.println("Lamentamos no poder procesar tu consulta");
            System.out.println("Error: " + e.getMessage());
            desconectarBase();
        }

        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: $" + producto.getPrecio());
            System.out.println("----------------------------------");
        }
        return productos;
    }
}
