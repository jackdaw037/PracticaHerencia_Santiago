package Personaje_videojuego;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Guerrero guerrero1 = new Guerrero("Arturo", 100, 12,
                30, 20, 15);

        Mago mago1 = new Mago("Merlin", 80, 18,
                20, 40, 40);

        Random random = new Random();

        System.out.println(" BATALLA ");

        int turno = 1;

        while (guerrero1.personajeVivo() && mago1.personajeVivo()) {

            System.out.println("----- Turno " + turno + " -----");


            int danioGuerrero = guerrero1.getAtaque();
            mago1.defender(danioGuerrero);
            System.out.println(guerrero1.getNombre() + " ataca e inflige "
                    + danioGuerrero + " de daño.");

            if (!mago1.personajeVivo()) break;


            int danioMago = mago1.getAtaque();
            guerrero1.defender(danioMago);
            System.out.println(mago1.getNombre() + " lanza un hechizo e inflige "
                    + danioMago + " de daño.");


            System.out.println("Vida restante:");
            System.out.println(guerrero1.getNombre() + ": " + guerrero1.getVida());
            System.out.println(mago1.getNombre() + ": " + mago1.getVida());
            System.out.println();

            turno++;
        }

        System.out.println(" fin ");

        if (guerrero1.personajeVivo()) {
            System.out.println(" Gana " + guerrero1.getNombre());
        } else {
            System.out.println(" Gana " + mago1.getNombre());
        }
    }
}