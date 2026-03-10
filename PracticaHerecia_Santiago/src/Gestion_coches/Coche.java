package Gestion_coches;

public class Coche extends Rueda {

    private String marca;
    private int modelo;
    private double precio;
    private int velocidadMax;
    private String ruedaDelanteraDe;
    private String ruedaDelanteraIz;
    private String ruedaTraseraDe;
    private String ruedaTraseaIz;

    public Coche(String marca, int modelo, double precio,
                 int velocidadMax, String ruedaDelanteraDe, String ruedaDelanteraIz,
                 String ruedaTraseaIz, String ruedaTraseraDe, int desgaste, int estado){

        super(desgaste, estado);

        this.marca = marca;
        this.modelo =  modelo;
        this.precio = precio;
        this.velocidadMax = velocidadMax;
        this.ruedaDelanteraIz = ruedaDelanteraIz;
        this.ruedaDelanteraDe = ruedaDelanteraDe;
        this.ruedaTraseaIz = ruedaTraseaIz;
        this.ruedaTraseraDe = ruedaTraseraDe;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", precio=" + precio +
                ", velocidadMax=" + velocidadMax +
                ", ruedaDelanteraDe='" + ruedaDelanteraDe + '\'' +
                ", ruedaDelanteraIz='" + ruedaDelanteraIz + '\'' +
                ", ruedaTraseraDe='" + ruedaTraseraDe + '\'' +
                ", ruedaTraseaIz='" + ruedaTraseaIz + '\'' +
                '}';
    }
}
