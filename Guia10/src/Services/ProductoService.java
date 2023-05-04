/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.

Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Services;

import Entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductoService {

    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    private Map<String, Double> productos = new HashMap();

    // El iterator permite hasNext y next :  uisar para buscar, modificar, eliminar.
    public void crearProducto(HashMap<String, Producto> productos) {
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = input.next();
        System.out.println("Ingrese el precio del producto: " + nombre);
        double precio = input.nextDouble();

        Producto p = new Producto(precio, nombre);
        productos.put(nombre, p);
    }

    public void cambiarPrecio(HashMap<String, Producto> productos) {
        System.out.println("Ingrese el nombre del producto que desea cambiar: ");
        String nombre = input.next();

        if (productos.containsKey(nombre)) {
            Producto p = productos.get(nombre);
            System.out.println("Ingrese el nuevo valor del producto: ");
            p.setPrecio(input.nextDouble());
            System.out.println("Producto actualizado exitosamente!");
            System.out.println("-----------------------------------------------");
        } else {
            System.out.println("El producto no se encuentra en la lista");
            System.out.println("-----------------------------------------------");
        }
    }

    public void eliminarProducto(HashMap<String, Producto> productos) {
        System.out.println("Ingrese el nombre del producto que desee eliminar: ");
        String nombre = input.next();

        if (productos.containsKey(nombre)) {
            Producto p = productos.get(nombre);
            productos.remove(p.getNombre());
            System.out.println("El producto " + nombre + " ha sido exitosamente eliminado");
            System.out.println("-------------------------------------------");
        } else {
            System.out.println("El producto no se encuentra en la lista");
            System.out.println("-----------------------------------------------");
        }
    }

    public void mostrarProductos(HashMap<String, Producto> productos) {
        for (String aux : productos.keySet()) {
            Producto p = productos.get(aux);
            System.out.println(" El producto " + p.getNombre() + ", tiene un Precio de: " + p.getPrecio());
            System.out.println("----------------------------------------------------------------");
        }
    }
}
