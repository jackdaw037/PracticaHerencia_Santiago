package Personaje_videojuego;

public class Mago extends Personaje{

    private int mana;
    private int poderMagico;

    public Mago(String nombre, int vida, int ataque, int defensa, int mana, int poderMagico){
        super(nombre, vida, ataque, defensa);

        this.mana = mana;
        this.poderMagico = poderMagico;

    }

    @Override
    public int getAtaque() {
        if (mana >= 10){
            mana -= 10;
            return super.getAtaque() + poderMagico;

        }else {
            return super.getAtaque();
        }

    }

    @Override
    public String toString() {
        return "Mago -> " + super.toString() +
                ", Mana: " + mana +
                ", Poder Magico: " + poderMagico;
    }
}
