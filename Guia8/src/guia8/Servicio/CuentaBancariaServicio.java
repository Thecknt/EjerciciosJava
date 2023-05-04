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
package guia8.Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {

    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    CuentaBancaria cliente1 = new CuentaBancaria();

    public CuentaBancaria crearCuenta() {
        System.out.println("Ingrese su numero de cuenta:");
        int numeroCuenta = input.nextInt();
        System.out.println("Ingrese su numero de DNI,sin puntos: ");
        long dniCliente = input.nextLong();
        System.out.println("Ingrese la cantidad de Dinero que va a ingresar a su cuenta: ");
        double saldoActual = input.nextDouble();

        cliente1 = new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
        return cliente1;
    }

    public double saldoActual(CuentaBancaria cliente1) {
        System.out.println("¿cuanto dinero mas ingresara a su cuenta?");
        double nuevoIngreso = input.nextDouble();
        double saldo = cliente1.getSaldoActual(); // Obtengo el saldo actual de la cuenta
        saldo += nuevoIngreso;
        cliente1.setSaldoActual(saldo); // actualizo el saldo de la cuenta
        return saldo;
    }

    double saldo = cliente1.getSaldoActual();

    public double retirar(CuentaBancaria cliente1) {
        System.out.println("¿cuanto desea Retirar?");
        double retiro = input.nextDouble();
        if (cliente1.getSaldoActual() < retiro) {
            System.out.println("Saldo Insuficiente");
            return cliente1.getSaldoActual();
        } else {
            double saldo = cliente1.getSaldoActual() - retiro;
            cliente1.setSaldoActual(saldo);
            return cliente1.getSaldoActual();
        }
    }

    double rapido;

    public double retiroRapido(CuentaBancaria cliente1){
        rapido = (cliente1.getSaldoActual() * 20)/100;
        System.out.println("este es el maximo dinero para retirar:" + rapido);
        return rapido;
    }
    
    public double consultarSaldo(CuentaBancaria cliente1){
    double saldo = cliente1.getSaldoActual();
    return saldo;
    }
    
   public void consultarDatos(CuentaBancaria cliente1){
    int cuenta = cliente1.getNumeroCuenta();
    long dni = cliente1.getDniCliente();
    double saldo = cliente1.getSaldoActual();
        System.out.println("Sus datos en sistema son: ");
        System.out.println("Numero de cuenta: "+ cuenta);
        System.out.println("Numero de DNI: "+ dni);
        System.out.println("Su saldo en cuenta es: "+ saldo);
    }
}
