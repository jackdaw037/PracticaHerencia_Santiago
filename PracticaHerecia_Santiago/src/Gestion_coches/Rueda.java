package Gestion_coches;

public class Rueda {

    private int desgaste;
    private int estado;

    public Rueda(int desgaste, int estado){
        this.desgaste = desgaste;
        this.estado = estado;
    }

    public int getDesgaste(){
        return desgaste;
    }

    public int getEstado(){
        return estado;
    }

    @Override
    public String toString() {
        return "Rueda{" +
                "desgaste=" + desgaste +
                ", estado=" + estado +
                '}';
    }
}
