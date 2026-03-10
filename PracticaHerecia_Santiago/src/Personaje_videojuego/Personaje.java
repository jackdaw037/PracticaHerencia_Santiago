package Personaje_videojuego;

public class Personaje {

    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;

    public Personaje(String nombre, int vida, int ataque, int defensa){
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;

    }

    public String getNombre(){
        return nombre;
    }

    public int getVida(){
        return vida;
    }


    public int getAtaque(){
        return ataque;
    }

    public void defender(int dano){
        int danoVerdadero = dano - defensa;

        if (danoVerdadero < 0){
            danoVerdadero = 0;
        }

        vida -= danoVerdadero;

        if (vida < 0){
            vida = 0;
        }
    }

    public boolean personajeVivo(){
        return vida > 0;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                '}';
    }
}
