package Personaje_videojuego;

public class Guerrero extends Personaje{

    private int fuerza;
    private int armadura;

    public Guerrero(String nombre, int vida, int ataque, int defensa, int fuerza, int armadura){
        super(nombre, vida, ataque, defensa);

        this.fuerza = fuerza;
        this.armadura = armadura;

    }

    @Override
    public int getAtaque() {
        return super.getAtaque() + fuerza;
    }


    public void defender(int dano){
        int danoReducido = dano - armadura;
        if(danoReducido < 0){
            danoReducido = 0;
        }

        super.defender(danoReducido);
    }


    @Override
    public String toString() {
        return "Guerrero{" +
                "fuerza=" + fuerza +
                ", armadura=" + armadura +
                '}';
    }
}



