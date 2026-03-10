package Gestion_empleados;

public class Main {

    public static void main (String[] args){

        Programador programador1 = new Programador("pepe", "perez",
                1900, "Tecnologia", 5, "C++");

        Programador programador2 = new Programador("pepa", "pig", 1900,
                "Tecnologia", 8, "Python");

        Gerente gerente1 = new Gerente(20, 5, "Firulais",
                "Sanchez", 2500, "Tecnologia" );

        System.out.println(programador1.toString());
        System.out.println(gerente1.toString());
    }
}
