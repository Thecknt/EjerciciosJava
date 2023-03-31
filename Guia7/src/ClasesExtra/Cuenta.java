/*
 Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, 
crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta. 
Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 */
package ClasesExtra;

public class Cuenta {
    
    private double saldo;
    private String titular; 
    
    public Cuenta() {
    }
   
    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
    
    public void retirar_dinero(double retiro){
     if(saldo>= retiro){
     saldo -= retiro;
     } else {
         System.out.println("No hay suficiente saldo en la cuenta");
     }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
   
}
