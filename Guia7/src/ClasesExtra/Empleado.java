<<<<<<< HEAD
/*
 * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
 * Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un 
 * empleado en función de su edad y salario actual. El aumento salarial debe ser 
 * del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
package ClasesExtra;

public class Empleado {
    
    private String nombre;
    private int edad;
    double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    public double calcular_aumento(){
    if(edad >= 30){
    return salario = (salario * 10 / 100) + salario;
    } else {
     return salario = (salario * 5 /100) + salario;
    }
    
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
=======
/*
 * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
 * Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un 
 * empleado en función de su edad y salario actual. El aumento salarial debe ser 
 * del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
package ClasesExtra;

public class Empleado {
    
    private String nombre;
    private int edad;
    double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    public double calcular_aumento(){
    if(edad >= 30){
    return salario = (salario * 10 / 100) + salario;
    } else {
     return salario = (salario * 5 /100) + salario;
    }
    
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
>>>>>>> c70357b6a524489a3be1af6de8717370a7b2b176
