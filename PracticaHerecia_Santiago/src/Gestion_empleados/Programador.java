package Gestion_empleados;

public class Programador extends Empleado{

    private int horasExtras;
    private  String lenguajePrincipal;

    public Programador(String nombre, String apellido, double salarioBase, String departamento, int horasExtras, String lenguajePrincipal){
    super(nombre, apellido, salarioBase, departamento);

    this.horasExtras = horasExtras;
    this.lenguajePrincipal = lenguajePrincipal;

    }

    public int getHorasExtras(){
        return horasExtras;
    }

    public String getLenguajePrincipal(){
        return lenguajePrincipal;

    }

    @Override
    public String toString() {
        return  " nombre = " + getNombre()+
                " apellido = " + getApellido()+
                " Salario = " + getSalarioBase()+
                " Departamento = "+getDepartamento()+
                " Programador{" +
                " horasExtras=" + horasExtras +
                ", lenguajePrincipal='" + lenguajePrincipal + '\'' +
                '}';
    }
}
