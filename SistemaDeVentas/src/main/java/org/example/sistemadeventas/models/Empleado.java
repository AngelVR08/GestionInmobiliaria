package org.example.sistemadeventas.models;

public class Empleado extends Persona{
    String cargo;
    double salario;
    public Empleado(String nombre, int edad, String direccion, String cargo, String fechaContrato, double salario) {
        super(nombre, edad, direccion, fechaContrato);
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                ", fechaInicio='" + fechaInicio + '\'' +
                '}';
    }
}
