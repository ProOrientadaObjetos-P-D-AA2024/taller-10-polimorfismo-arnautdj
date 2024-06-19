package juego;

public class Arquero extends Personaje {
    private int precision;

    public Arquero(String nombre, int puntosVida, int nivelExperiencia, int precision) {
        super(nombre, puntosVida, nivelExperiencia);
        this.precision = precision;
    }

    @Override
    public void atacar(Personaje oponente) {
        int dano = precision * nivelExperiencia;
        oponente.recibirDano(dano);
        System.out.println(nombre + " dispara una flecha a " + oponente.getNombre()
                + " causando " + dano + " puntos de daño.");
    }

    @Override
    public void defender() {
        System.out.println(nombre + " se defiende esquivando.");
    }
}


