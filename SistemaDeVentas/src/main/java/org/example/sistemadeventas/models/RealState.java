package org.example.sistemadeventas.models;

import java.util.ArrayList;

public class RealState {

    private ArrayList <Empleado> empleados = new ArrayList<>();
    private ArrayList <Inmueble> inmuebles = new ArrayList<>();
    private ArrayList <Inquilino> inquilinos = new ArrayList<>();

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public ArrayList<Inmueble> getInmuebles() {
        return inmuebles;
    }

    public ArrayList<Inquilino> getInquilinos() {
        return inquilinos;
    }
    public void agregarInquilino(Inquilino inquilino){
        inquilinos.add(inquilino);
    }
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
    public void agregarInmueble(Inmueble inmueble){
        inmuebles.add(inmueble);
    }
    public void eliminarInmueble(String eliminar){
        for (Inmueble i:inmuebles){
            if (eliminar.equals(i.getNombre())){
                inmuebles.remove(i);
            }
        }
    }
}
