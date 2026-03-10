package Gestion_coches;

public class CocheDeportivo extends Coche {
    private boolean modoCarrera;
    private int caballosFuerza;

    public CocheDeportivo(boolean modoCarrera, int caballosFuerza,
                          String marca, int modelo, double precio, int velocidadMax,
                          String ruedaDelanteraDe, String ruedaDelanteraIz,
                          String ruedaTraseaIz, String ruedaTraseraDe, int desgaste, int estado){

        super(marca, modelo, precio, velocidadMax, ruedaDelanteraDe, ruedaDelanteraIz,
                ruedaTraseaIz, ruedaTraseraDe, desgaste, estado);

        this.modoCarrera = modoCarrera;
        this.caballosFuerza = caballosFuerza;

    }

    public boolean isModoCarrera(){
        return modoCarrera;
    }

    public int getCaballosFuerza(){
        return caballosFuerza;
    }

    @Override
    public String toString() {
        return "CocheDeportivo{" +
                "modoCarrera=" + modoCarrera +
                ", caballosFuerza=" + caballosFuerza +
                '}';
    }
}
