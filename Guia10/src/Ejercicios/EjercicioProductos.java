/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Ejercicios;

import Entidades.Producto;
import Services.ProductoService;
import java.util.HashMap;
import java.util.Scanner;

public class EjercicioProductos {

  
    public static void main(String[] args) {
        Producto p = new Producto();
        
        ProductoService ps = new ProductoService();
        Scanner input = new Scanner(System.in);
        HashMap<String, Producto> productos= new HashMap();
        int opcion;
        
     do {   
         System.out.println("----------------------------------------------");
        System.out.println("Bienvenido/a a la tienda online");
        System.out.println("");
        System.out.println("Seleccione la opcion deseada");
        System.out.println("1) Cargar Producto");
        System.out.println("2) Modificar precio de un producto");
        System.out.println("3) Eliminar un producto de la tienda");
        System.out.println("4) Mostrar los productos de la tienda");
        System.out.println("5) Salir");
        System.out.println("----------------------------------------------");
        opcion = input. nextInt();
        
        
        switch(opcion){
            case 1:
                ps.crearProducto(productos);
                break;
            case 2:
                ps.cambiarPrecio(productos);
                break;
            case 3:
                ps.eliminarProducto(productos);
                break;
            case 4:
                ps.mostrarProductos(productos);
                break;
            default:
                System.out.println("Ingrese una opcion valida");
        }
    
     } while( opcion != 5);
    }
}

// crear un constructor es crear un espacio en reserva para el objeto