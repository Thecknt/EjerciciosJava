/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: 
numeroCuenta(entero), 

dniCliente(entero largo),

saldoActual. 

Agregar constructor vacío, con parámetros, getters y setters.

Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:

A) Método para crear cuenta pidiéndole los datos al usuario.

B) Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.

C) Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual.

D) Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.

E) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.

F) Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.

G) Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

 */
package guia8;

import Entidad.CuentaBancaria;
import guia8.Servicio.CuentaBancariaServicio;
import java.util.Scanner;

public class Cliente {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CuentaBancariaServicio c1 = new CuentaBancariaServicio();
        System.out.println("Bienvenido al Banco Federal");
        System.out.println("----------------------------");
        System.out.println("vamos a crear su usuario");
        CuentaBancaria cliente1 = c1.crearCuenta();

        int opc;
        do {
            System.out.println("Ingrese la opcion deseada");
            System.out.println("1)¿Desea ingresar Dinero?");
            System.out.println("2)¿Desea retirar Dinero de su cuenta?");
            System.out.println("3)Extraccion Rapida(20% de su cuenta)");
            System.out.println("4)Consultar Saldo");
            System.out.println("5)Consultar sus datos de cuenta");
            System.out.println("0)Cerrar sesion");
            
            opc = input.nextInt();
            
            switch (opc) {
                case 1:
                    c1.saldoActual(cliente1);
                    break;
                case 2:
                    c1.retirar(cliente1);
                    break;
                case 3:
                    c1.retiroRapido(cliente1);
                    break;
                case 4:
                    System.out.println("El saldo actual es de: "+ c1.consultarSaldo(cliente1));
                    break;
                case 5:
                    c1.consultarDatos(cliente1);
                    break;
                case 0:
                    System.out.println("SALIENDO DEL SISTEMA....    ");
                    break;
                default:
                    System.out.println("La opcion no es valida");
                    break;
            }

        } while (opc != 0);
    }
}
