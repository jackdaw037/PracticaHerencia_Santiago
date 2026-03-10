package Gestion_coches;

public class CocheElectrico extends Coche{

    private boolean autonomia;
    private String tiempoCarga;

    public CocheElectrico(boolean autonomia, String tiempoCargo,
                          String marca, int modelo, double precio, int velocidadMax,
                          String ruedaDelanteraDe, String ruedaDelanteraIz,
                          String ruedaTraseaIz, String ruedaTraseraDe, int desgaste, int estado){

        super(marca, modelo, precio, velocidadMax,
                ruedaDelanteraDe, ruedaDelanteraIz, ruedaTraseaIz, ruedaTraseraDe, desgaste, estado);

        this.autonomia = autonomia;
        this.tiempoCarga = tiempoCargo;
    }

    public boolean isAutonomia(){
        return autonomia;
    }

    public String getTiempoCarga(){
        return tiempoCarga;
    }
}
