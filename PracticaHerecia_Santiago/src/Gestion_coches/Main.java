package Gestion_coches;

public class Main {

    public static void main(String[] args){

        CocheElectrico electrico1 = new CocheElectrico(true, "1 hora","Tesla",
                2020, 175.000, 280, "SI", "SI",
                "SI", "SI", 50, 50);

        CocheDeportivo deportivo1 = new CocheDeportivo(true, 200,"Ford",
                2020, 175.000, 280, "SI", "SI",
                "SI", "SI", 50, 50);


        System.out.println(electrico1.toString());
        System.out.println(electrico1.toString());
    }

}
