package Gestion_empleados;

public class Empleado {

    private String nombre;
    private String apellido;
    private double salarioBase;
    private String departamento;

    public Empleado(String nombre, String apellido, double salarioBase, String departamento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public double getSalarioBase(){
        return salarioBase;
    }

    public String getDepartamento(){
        return departamento;
    }


}