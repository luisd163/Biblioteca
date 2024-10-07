package model;

public class Bibliotecario extends Persona{

    double salario;

    // Constructor Clase Bibliotecario
    public Bibliotecario(String nombre, String cedula, String telefono, String correo, double salario) {
        super(nombre, cedula, telefono, correo);
        this.salario = salario;
        
    }

    // Setters y Getters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // toString clase Bibliotecario
    @Override
    public String toString() {
        return "Bibliotecario [nombre=" + nombre + ", cedula=" + cedula + ", telefono=" + telefono + ", salario="
                + salario + ", correo=" + correo + "]";
    }

    
    
}
