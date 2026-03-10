package Gestion_empleados;

public class Gerente extends Empleado{

    private double bonus;
    public double personaAcargo;

    public Gerente(double bonus, double personaAcargo, String nombre, String apellido, double salarioBase, String departamento){
    super(nombre, apellido, salarioBase, departamento);

    this.bonus = bonus;
    this.personaAcargo =personaAcargo;

    }

    public double getBonus(){
        return bonus;
    }

    public double getPersonaAcargo(){
        return personaAcargo;
    }

    @Override
    public String toString() {
        return  " Nombre = " +getNombre()+
                " Apellido = "+getApellido()+
                " Departamento = "+getDepartamento()+
                " Gerente{" +
                " bonus=" + bonus +
                ", personaAcargo=" + personaAcargo +
                '}';
    }
}

