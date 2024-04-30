/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorempleados;

import java.util.ArrayList;
import java.util.List;


public class GestorEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear algunos empleados
        Empleado empleado1 = new Empleado("Juan", 2500, "Ventas");
        Empleado empleado2 = new Empleado("María", 3000, "Ventas");
        Empleado empleado3 = new Empleado("Carlos", 2800, "Tecnología");

        // Crear algunos departamentos
        Departamento ventas = new Departamento("Ventas");
        Departamento tecnologia = new Departamento("Tecnología");

        // Agregar empleados a los departamentos
        ventas.agregarEmpleado(empleado1);
        ventas.agregarEmpleado(empleado2);
        tecnologia.agregarEmpleado(empleado3);

        // Mostrar los empleados de cada departamento
        ventas.mostrarEmpleados();
        tecnologia.mostrarEmpleados();
    }
    
}

class Departamento {
    private String nombre;
    private List<Empleado> empleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarEmpleados() {
        System.out.println("Empleados del departamento " + nombre + ":");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }
}

class Empleado {
    private String nombre;
    private double salario;
    private String departamento;

    public Empleado(String nombre, double salario, String departamento) {
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}