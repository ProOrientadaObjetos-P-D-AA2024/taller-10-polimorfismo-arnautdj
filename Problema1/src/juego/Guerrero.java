package juego;

public class Guerrero extends Personaje {
    private int fuerza;

    public Guerrero(String nombre, int puntosVida, int nivelExperiencia, int fuerza) {
        super(nombre, puntosVida, nivelExperiencia);
        this.fuerza = fuerza;
    }

    @Override
    public void atacar(Personaje oponente) {
        int dano = fuerza * nivelExperiencia;
        oponente.recibirDano(dano);
        System.out.println(nombre + " ataca a " + oponente.getNombre() + " causando " + dano + " puntos de daño.");
    }

    @Override
    public void defender() {
        System.out.println(nombre + " se defiende con su escudo.");
    }
}


